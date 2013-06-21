package de.haw_hamburg.inf.gui;

import java.util.Observable;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import de.haw_hamburg.inf.environment.GWorld;
import de.haw_hamburg.inf.rl.Agent;

public class GridControl extends Observable implements Runnable {

    private volatile boolean running        = false;
    private volatile int     targetHopTime  = 2;
    private boolean          movingTarget   = false;
    private boolean          circlingTarget = false;
    private int              episodes       = 1;

    private Agent            agent;
    private GWorld           world;

    public GridControl(GWorld world, Agent agent) {
        this.world = world;
        this.agent = agent;
    }

    @Override
    public void run() {
        running = true;
        Random r = new Random();
        int t = 0;
        while (running) {
            for (int i = 0; i < episodes; i++) {
                if (!running)
                    break;
                if (movingTarget) {
                    randomTarget(r.nextInt(5) + 1);
                } else if (circlingTarget) {
                    circlingTarget(++t);
                    t = t >= 5 ? 0 : t;
                }
                agent.qLearn();
                agent.resetAgent();
            }
            agent.printQvalues();
            running = false;
            notifyObservers(-1);
            setChanged();
        }
    }

    private void randomTarget(int t) {
        notifyObservers(t * 10);
        long t1 = System.currentTimeMillis();
        setChanged();
        // gg.togglePanel(t*10);
        System.out.println("T on P" + t * 10 + " toggled");
        try {

            TimeUnit.SECONDS.sleep(targetHopTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyObservers(t * 10);
        long t2 = System.currentTimeMillis();
        setChanged();
        System.out.println("Time Passed: " + (t2 - t1) / 1000 + "s");
        // gg.togglePanel(t*10);
    }

    /**
     * TODO t in range from 0 to 4 not 10 to 50...
     * @param t
     */
    private void circlingTarget(int t) {
        notifyObservers(t * 10);
        world.setTarget(t);
        long t1 = System.currentTimeMillis();
        setChanged();
        // gg.togglePanel(t*10);
        System.out.println("T on P" + t * 10 + " toggled");
        try {

            TimeUnit.SECONDS.sleep(targetHopTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyObservers(t * 10);
        long t2 = System.currentTimeMillis();
        setChanged();
        System.out.println("Time Passed: " + (t2 - t1) / 1000 + "s");
        // gg.togglePanel(t*10);
    }


    public synchronized void terminate() {
        running = false;
    }

    public int getTargetHopTime() {
        return targetHopTime;
    }

    public void setTargetHopTime(int targetHopTime) {
        this.targetHopTime = targetHopTime;
    }

    public boolean isRunning() {
        return running;
    }

    public boolean hasMovingTarget() {
        return movingTarget;
    }

    public void setMovingTarget(boolean movingTarget) {
        this.movingTarget = movingTarget;
    }

    /**
     * @return the circlingTarget
     */
    protected boolean hasCirclingTarget() {
        return circlingTarget;
    }

    /**
     * @param circlingTarget
     *            the circlingTarget to set
     */
    protected void setCirclingTarget(boolean circlingTarget) {
        this.circlingTarget = circlingTarget;
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
    protected void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
