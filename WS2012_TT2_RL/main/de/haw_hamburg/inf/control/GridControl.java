package de.haw_hamburg.inf.control;

import java.util.Observable;

import de.haw_hamburg.inf.rl.Agent;

public class GridControl extends Observable implements Runnable {

    private volatile boolean running  = true;
    private int              episodes = 1;

    private Agent            agent;
    private Target           target;

    public GridControl(Agent agent, Target target) {
        this.agent = agent;
        this.target = target;
    }

    @Override
    public void run() {
        running = true;
        agent.setGlobalEpisodes(episodes);
        Thread t = new Thread(target);
        t.start();
        while (running) {
            for (int i = 0; i < episodes; i++) {
                if (!running)
                    break;
                agent.qLearn();
                agent.resetAgent();
            }
            target.terminate();
            agent.printQvalues();
            agent.setEpisodes(0);
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
