package de.haw_hamburg.inf.environment;

/**
 * TODO Muss state aktualisiert werden?
 * 
 * @author Benjamin
 * 
 */
public class GWorld {

    // dimension: { x, y, actions }
    private int[]     dimension     = { 10, 5, 4 };
    private int[]     state         = { 0, 0 };
    private int[]     finalState    = { dimension[0] - 1,
            dimension[1] - 1       };
    private int       currentReward = 0;

    // Actions.
    private final int N             = 0;
    private final int E             = 1;
    private final int S             = 2;
    private final int W             = 3;

    public GWorld() {
    }

    public GWorld(int[] dimension) {
        this.dimension = dimension;
    }

    public int[] getDimension() {
        return dimension;
    }

    public int[] getNextState(int action) {

        int a = action;
        int[] newState = new int[state.length];
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
    }

    public boolean endState(int[] state) {
        return state[0] == finalState[0] && state[1] == finalState[1];
    }

    public int[] getEndState() {
        return finalState;
    }

    public void resetState() {
        state[0] = 0;
        state[1] = 0;
    }

    public double getInitValues() {
        return 0;
    }

    public synchronized void setTarget(int t) {
        finalState[0] = 9;
        finalState[1] = t - 1;
    }
}
