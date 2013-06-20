package de.haw_hamburg.inf.rl;

import java.util.Arrays;
import java.util.Observable;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import de.haw_hamburg.inf.environment.GWorld;

public class Agent extends Observable {

    private GWorld      world;
    private int          dimension[];
    private int[]        state           = { 0, 0 };
    private double       alpha, gamma;
    private double[][][] q;

    private int          explorationRate = 15;

    public Agent(GWorld gw) {
        this.world = gw;
        this.dimension = gw.getDimension();

        q = new double[dimension[0]][dimension[1]][dimension[2]];
        alpha = 1;
        gamma = 0.9;
    }

    // Q(s,a)=
    // Q(s,a) + alpha * (R(s,a) + gamma * Max(next state, all actions) - Q(s,a)
    // newQ = actualQ + alpha * (reward + gamma * maxQ - actualQ);
    public void qLearn() {
        int[] nextState;
        double actualQ, maxQ, newQ;
        int action;
        do {
            action = selectAction(state);
            nextState = world.getNextState(action);
            actualQ = getQValueOf(state, action);
            maxQ = getMaxQValueOf(nextState);
            newQ = actualQ + alpha
                    * (world.getReward() + gamma * maxQ - actualQ);
            System.out.println("In state " + Arrays.toString(state)
                    + " took action " + action + " going to state "
                    + Arrays.toString(nextState)
                    + "\nMY QValue-Table is:\n"
                    + Arrays.deepToString(q));
            state = nextState;
            System.out.println("WORLD STATE: "
                    + Arrays.toString(((GWorld) world).getState())
                    + " - AGENT STATE: " + Arrays.toString(state));
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            notifyObservers(state);
            setChanged();
            setQValue(state, action, newQ);
        } while (!world.endState(state));
        System.out.println("#########ENDED LEARNING");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private int selectAction(int[] state) {
        double maxQ = -Double.MAX_VALUE;
        int[] dupes = new int[q[state[0]][state[1]].length];
        int selectedAction = -1;
        Random r = new Random();
        int exploration = r.nextInt(100) + 1;
        int dupeIdx = 0;
        for (int action = 0; action < q[state[0]][state[1]].length; action++) {
            if (q[state[0]][state[1]][action] > maxQ) {
                selectedAction = action;
                maxQ = q[state[0]][state[1]][action];
                dupes[dupeIdx++] = action;
            } else if (q[state[0]][state[1]][action] == maxQ) {
                dupes[dupeIdx++] = action;
            }
        }

        if (dupeIdx > 0) {
            selectedAction = r.nextInt(q[state[0]][state[1]].length);
        }

        if (exploration > (100 - explorationRate)) {
            int exploreAction;
            do {
                exploreAction = r
                        .nextInt(q[state[0]][state[1]].length);
            } while (exploreAction == selectedAction);
            selectedAction = exploreAction;
        }

        return selectedAction;
    }

    private double getQValueOf(int[] state, int action) {
        return q[state[0]][state[1]][action];
    }

    private double getMaxQValueOf(int[] nextState) {
        double qVal = -Double.MAX_VALUE;
        System.out.println(q[nextState[0]][nextState[1]].length);
        for (int i = 0; i < q[nextState[0]][nextState[1]].length; i++) {
            qVal = q[nextState[0]][nextState[1]][i] > qVal ? q[nextState[0]][nextState[1]][i]
                    : qVal;

        }
        return qVal;
    }

    private void setQValue(int[] state2, int action, double newQ) {
        q[state[0]][state[1]][action] = newQ;
    }

}
