package de.haw_hamburg.inf.environment;

import java.util.Observable;
import java.util.Observer;

import de.haw_hamburg.inf.rl.RLWorld;

/**
 * TODO Muss state aktualisiert werden?
 * 
 * @author Benjamin
 * 
 */
public class GWorld implements Observer {

    // dimension: { x, y, actions }
    private int[]     dimension     = { 10, 5, 4 };
    private int[]     startingState = { 0, 0 };
    private int[]     endingState   = { 9, 4 };
    private int[]     state;
    private int[]     finalState    = { dimension[0] - 1,
            dimension[1] - 1       };
    private int       currentReward = 0;

    // Actions.
    private final int N             = 0;
    private final int E             = 1;
    private final int S             = 2;
    private final int W             = 3;

    public GWorld() {
        this.state = startingState;
    }

    public GWorld(int[] dimension) {
        this.state = startingState;
        this.dimension = dimension;
    }

    public int[] getDimension() {
        return dimension;
    }

    public int[] getNextState(int action) {

        int a = action;
        int[] newState = new int[startingState.length];
        System.arraycopy(state, 0, newState, 0, state.length);

        if (!validAction(action))
            a = -1;

        switch (a) {
            case N:
                newState[1]--;
                calculateReward(newState);
                break;
            case E:
                newState[0]++;
                calculateReward(newState);
                break;
            case S:
                newState[1]++;
                calculateReward(newState);
                break;
            case W:
                newState[0]--;
                calculateReward(newState);
                break;
            default:
                // no change
                break;
        }
        System.arraycopy(newState, 0, state, 0, state.length);
        return newState;
    }

    private void calculateReward(int[] newState) {
        if (newState == finalState) {
            currentReward = 100;
        } else {
            currentReward = -1;
        }
    }

    public double getReward() {
        return currentReward;
    }

    public boolean validAction(int action) {
        // West border
        if (state[0] == 0 && action == W)
            return false;
        // East border
        else if (state[0] == dimension[0] - 1 && action == E)
            return false;
        // North border
        else if (state[1] == 0 && action == N)
            return false;
        // South border
        else if (state[1] == dimension[1] - 1 && action == S)
            return false;
        else
            return true;
        // switch (action) {
        // case N:
        // if ((state[1] == 0))
        // System.out.println("North not valid in state " +
        // Arrays.toString(state) + ", because y=" + state[1]);
        // return false;
        // case E:
        // if ((state[0] == dimension[0] - 1))
        // System.out.println("East not valid in state " +
        // Arrays.toString(state) + ", because x=" + state[0]);
        // return false;
        // case S:
        // if ((state[1] == dimension[0] - 1))
        // System.out.println("South not valid in state " +
        // Arrays.toString(state) + ", because y=" + state[1]);
        // return false;
        // case W:
        // if ((state[0] == 0))
        // System.out.println("West not valid in state " +
        // Arrays.toString(state) + ", because x=" + state[0]);
        // return false;
        // }
        // System.out.println("VALID ACTION: " + action);
        // return true;
    }

    public boolean endState(int[] state) {
        return state == endingState;
    }

    public int[] getEndState() {
        return endingState;
    }

    public int[] resetState() {
        return state = startingState;
    }

    public double getInitValues() {
        return 0;
    }

    public int[] getState() {
        return state;
    }

    public void setState(int[] state) {
        this.state = state;
    }

    @Override
    public void update(Observable o, Object arg) {
        // TODO Target update method

    }
}
