package de.haw_hamburg.inf.control;

import java.util.Observable;

import de.haw_hamburg.inf.rl.Agent;

public class GridControl extends Observable implements Runnable {

    private volatile boolean running        = false;
    private int              episodes       = 1;

    private Agent            agent;
    private Grid             grid;

    public GridControl(Agent agent, Grid grid) {
        this.agent = agent;
        this.grid = grid;
    }

    @Override
    public void run() {
        running = true;
        while (running) {
            for (int i = 0; i < episodes; i++) {
                if (!running)
                    break;
                new Thread(grid).start();
                agent.qLearn();
                agent.resetAgent();
            }
            agent.printQvalues();
            grid.terminate();
            notifyObservers(-1);
            setChanged();
            this.terminate();
        }
    }

    public synchronized void terminate() {
        running = false;
    }

    public boolean isRunning() {
        return running;
    }

    /**
     * @return the episodes
     */
    protected int getEpisodes() {
        return episodes;
    }

    /**
     * @param episodes
     *            the episodes to set
     */
    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
