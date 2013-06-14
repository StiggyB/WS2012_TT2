package de.haw_hamburg.inf.environment;

import de.haw_hamburg.inf.rl.RLWorld;

public class CliffWorld implements RLWorld {

    // Actions.
    final int   N       = 0;
    final int   E       = 1;
    final int   S       = 2;
    final int   W       = 3;

    // dimension: { x, y, actions }
    final int[] dimSize = { 12, 4, 4 };

    public int[] getDimension() {

        return dimSize;
    }

    public int[] getNextState(int[] state, int action) {

        int[] newstate = new int[state.length];
        System.arraycopy(state, 0, newstate, 0, state.length);

        // N-W corner in coordinates 0,0
        if (action == N)
            newstate[1]--;
        else if (action == E)
            newstate[0]++;
        else if (action == S)
            newstate[1]++;
        else if (action == W)
            newstate[0]--;
        return newstate;
    }

    public boolean validAction(int[] state, int action) {

        // West border
        if (state[0] == 0 && action == W)
            return false;
        // East border
        else if (state[0] == 11 && action == E)
            return false;
        // North border
        else if (state[1] == 0 && action == N)
            return false;
        // South border
        else if (state[1] == 3 && action == S)
            return false;
        else
            return true;
    }

    public boolean endState(int[] state) {

        // Absorbing state in north-east corner.
        if ((state[0] > 0 && state[0] < 12) && state[1] == 3) {
            return true;
        } else
            return false;
    }

    public double getReward(int[] state, int action) {

        if ((state[1] == 2) && (state[0] > 0 && state[0] < 11)) {
            if (action == S)
                return -100;
            else
                return -1;
        }
        if (state[1] == 3 && state[0] == 0) {
            if (action == E)
                return -100;
            else
                return -1;
        }
        if (state[1] == 2 && state[0] == 11) {
            if (action == S)
                return 0;
            else
                return -1;
        } else
            return -1;

    }

    public void resetState(int[] state) {

        state[0] = 0;
        state[1] = 2 + (int) (Math.random() * 2);
    }

    public double getInitValues() {
        return -1.5;
    }

    @Override
    public int[] getNextState(int action) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double getReward() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean validAction(int action) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean endState() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int[] resetState() {
        // TODO Auto-generated method stub
        return null;
    }

}
