package de.haw_hamburg.inf.environment;

import java.util.Observable;
import java.util.Observer;

import de.haw_hamburg.inf.rl.RLWorld;

public class GWorld implements RLWorld, Observer {

    // dimension: { x, y, actions }
    private int[]     dimension     = { 10, 5, 4 };
    private int[]     startingState = { 0, 0 };
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

    @Override
    public int[] getDimension() {
        return dimension;
    }

    @Override
    public int[] getNextState(int action) {

        int[] newState = new int[startingState.length];
        System.arraycopy(state, 0, newState, 0, state.length);

        switch (action) {
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
        }
        return newState;
    }

    private void calculateReward(int[] newState) {
        if (newState == finalState) {
            currentReward += 100;
        } else {
            currentReward += -1;
        }
    }

    @Override
    public double getReward() {
        return currentReward;
    }

    @Override
    public boolean validAction(int action) {
        switch (action) {
            case N:
                if ((state[1] == 0))
                    return false;
            case E:
                if ((state[0] == dimension[0] - 1))
                    return false;
            case S:
                if ((state[1] == dimension[0] - 1))
                    return false;
            case W:
                if ((state[0] == 0))
                    return false;
        }
        return true;
    }

    @Override
    public boolean endState() {
        return (state[0] == dimension[0] - 1 && state[1] == dimension[0] - 1);
    }

    @Override
    public int[] resetState() {
        return state = startingState;
    }

    @Override
    public double getInitValues() {
        // TODO for what values?
        return 0;
    }

    @Override
    public void update(Observable o, Object arg) {
        // TODO Target update method

    }

    public int[] getState() {
        // TODO Auto-generated method stub
        return null;
    }

}
