package de.haw_hamburg.inf.rl;

import java.util.Arrays;
import java.util.Observable;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import de.haw_hamburg.inf.environment.GWorld;

public class Agent extends Observable {

    private GWorld       world;
    private int          dimension[];
    private int[]        state           = { 0, 0 };
    private double       alpha, gamma;
    private double[][][] q;

    private int          explorationRate = 15;
    private long         learningSpeed   = 0;
    private boolean      episodeEnded;
    private boolean      running = false;

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
        episodeEnded = false; running = true;
        do {
            action = selectAction(state);
            nextState = world.getNextState(action);
            actualQ = getQValueOf(state, action);
            maxQ = getMaxQValueOf(nextState);
            // Q-LEARNING ALGORITHM
            newQ = actualQ + alpha
                    * (world.getReward() + gamma * maxQ - actualQ);
            System.out.println("In state " + Arrays.toString(state)
                    + " took action " + action + " going to state "
                    + Arrays.toString(nextState));
            setQValue(state, action, newQ);
            state = nextState;
            try {
                TimeUnit.MILLISECONDS.sleep(learningSpeed);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            notifyObservers(state);
            setChanged();
        } while (!world.endState(state) && running);
        episodeEnded = true;
        System.out.println("######### ENDED LEARNING #########");
    }

    private int selectAction(int[] state) {
        double maxQ = -Double.MAX_VALUE;
        int[] dupes = new int[q[state[0]][state[1]].length];
        int selectedAction = -1;
        Random r = new Random();
        int exploration = r.nextInt(100) + 1;
        int dupeIdx = 0;
        System.out.printf("State[%d][%d]: %s",state[0],state[1], Arrays.toString(q[state[0]][state[1]]));
        for (int action = 0; action < q[state[0]][state[1]].length; action++) {
            if (q[state[0]][state[1]][action] > maxQ) {
                selectedAction = action;
                maxQ = q[state[0]][state[1]][action];
                dupeIdx = 0;
                dupes[dupeIdx] = action;
            } else if (q[state[0]][state[1]][action] == maxQ) {
                dupes[++dupeIdx] = action;
            }
        }

        if (dupeIdx > 0) {
            System.out.print(" - dupes: " + dupeIdx + " -");
            selectedAction = dupes[r.nextInt(dupeIdx)];
        }

        if (exploration > (100 - explorationRate)) {
            System.out.print(" - WITH EXPLORATION -");
            int exploreAction;
            do {
                exploreAction = r
                        .nextInt(q[state[0]][state[1]].length);
            } while (exploreAction == selectedAction);
            selectedAction = exploreAction;
        }
        System.out.println(" took action: " + selectedAction);
        return selectedAction;
    }

    private double getQValueOf(int[] state, int action) {
        return q[state[0]][state[1]][action];
    }

    private double getMaxQValueOf(int[] nextState) {
        double qVal = -Double.MAX_VALUE;
        for (int i = 0; i < q[nextState[0]][nextState[1]].length; i++) {
            qVal = q[nextState[0]][nextState[1]][i] > qVal ? q[nextState[0]][nextState[1]][i]
                    : qVal;

        }
        return qVal;
    }

    private void setQValue(int[] state2, int action, double newQ) {
        q[state[0]][state[1]][action] = newQ;
    }

    public void resetAgent() {
        state[0] = 0;
        state[1] = 0;
        world.resetState();
        notifyObservers(state);
        setChanged();
    }

    public void resetLearning() {
        q = new double[dimension[0]][dimension[1]][dimension[2]];
    }

    public void printQvalues() {
        for (int y = 0; y < dimension[1]; y++) {
            for (int x = 0; x < dimension[0]; x++) {
                System.out.printf("[%d][%d]:%s\n", x, y, Arrays
                        .toString(q[x][y]));
            }
        }
    }

    /**
     * @return the learningSpeed
     */
    public long getLearningSpeed() {
        return learningSpeed;
    }

    /**
     * @param learningSpeed
     *            the learningSpeed to set
     */
    public void setLearningSpeed(long learningSpeed) {
        this.learningSpeed = learningSpeed;
    }

    public boolean episodeEnded() {
        return episodeEnded;
    }

    public void setExplorationRate(int exploration) {
        this.explorationRate = exploration;
    }

    /**
     * @return the running
     */
    public boolean isRunning() {
        return running;
    }

    /**
     * @param running the running to set
     */
    public void setRunning(boolean running) {
        this.running = running;
    }

	public double[] getQValues(int[] agentPos) {
		return q[agentPos[0]][agentPos[1]];
	}

}
