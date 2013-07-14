package de.haw_hamburg.inf.environment;

import java.util.Arrays;

/**
 * TODO Muss state aktualisiert werden?
 * 
 * @author Benjamin
 * 
 */
public class GWorld {

	// dimension: { x, y, actions }
	private int[] dimension = { 10, 5, 4 };
	private int[] state = { 0, 0 };
	private int[] finalState = { dimension[0] - 1, dimension[1] - 1 };
	private double currentReward = 0;
	private final int x = 0;
	private final int y = 1;

	// Actions.
	private final int N = 0;
	private final int E = 1;
	private final int S = 2;
	private final int W = 3;
	private int[][] wall;

	public GWorld() {
	}

	public GWorld(int[] dimension) {
		wall = new int[dimension[x]][dimension[y]];
		resetWalls();
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
			newState[y]--;
			calculateReward(newState);
			break;
		case E:
			newState[x]++;
			calculateReward(newState);
			break;
		case S:
			newState[y]++;
			calculateReward(newState);
			break;
		case W:
			newState[x]--;
			calculateReward(newState);
			break;
		case -1:
			calculateReward(newState);
			break;
		default:
			System.err.println("ACTION ERROR!");
			throw new IllegalStateException();
		}
		System.arraycopy(newState, 0, state, 0, state.length);
		return newState;
	}

	private void calculateReward(int[] newState) {
		if (newState == finalState) {
			currentReward = 100;
		} else {
			currentReward = -1;
			for (int i = 0; i < dimension[1]; i++) {
				if (i == newState[y] && newState[x] == dimension[x] - 1) {
					currentReward = -0.5;
				}
			}
		}
		System.out.println("World-REWARD: " + currentReward);
	}

	public double getReward() {
		return currentReward;
	}

	public boolean validAction(int action) {
		// West border
		if (state[x] == 0 && action == W)
			return false;
		// East border
		else if (state[x] == dimension[x] - 1 && action == E)
			return false;
		// North border
		else if (state[y] == 0 && action == N)
			return false;
		// South border
		else if (state[y] == dimension[y] - 1 && action == S)
			return false;
		// Wall
		else if (state[x] != dimension[x] - 1
				&& wall[state[x] + 1][state[y]] == -1 && action == E)
			return false;
		else if (state[y] != dimension[y] - 1
				&& wall[state[x]][state[y] + 1] == -1 && action == S)
			return false;
		else if (state[x] != 0 && wall[state[x] - 1][state[y]] == -1
				&& action == W)
			return false;
		else if (state[y] != 0 && wall[state[x]][state[y] - 1] == -1
				&& action == N)
			return false;
		else
			return true;
	}

	public boolean endState(int[] state) {
		return state[x] == finalState[x] && state[y] == finalState[y];
	}

	public int[] getEndState() {
		return finalState;
	}

	public void resetState() {
		state[x] = 0;
		state[y] = 0;
	}

	public double getInitValues() {
		return 0;
	}

	public synchronized void setTarget(int t) {
		finalState[x] = 9;
		finalState[y] = t;
	}

	public synchronized void setWall(int x, int y) {
		wall[x][y] = -1;
	}

	public synchronized void unSetWall(int x, int y) {
		wall[x][y] = 0;
	}

	public synchronized void resetWalls() {
		printWalls();

		wall = new int[10][dimension[y]];

		printWalls();
		// Arrays.fill(wall[x], 0);
		// Arrays.fill(wall[y], 0);
	}

	public void printWalls() {
		System.out.println(Arrays.deepToString(wall));
	}

}
