package de.haw_hamburg.inf.control;

import java.util.Observable;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import de.haw_hamburg.inf.environment.GWorld;

public class Target extends Observable implements Runnable {

    private volatile int     targetHopTime  = 2;
    private boolean          randomTarget   = false;
    private boolean          circlingTarget = false;

    private GWorld           world;
    private volatile boolean running        = true;

    public Target(GWorld world) {
        this.world = world;
    }

    @Override
    public void run() {
        running = true;
        Random r = new Random();
        int t = 0;
        while (running) {
            if (randomTarget) {
                randomTarget(t = r.nextInt(5));
            } else if (circlingTarget) {
                cirlceTarget(t++);
                t = t > 4 ? 0 : t;
            }
        }
    }

    public void cirlceTarget(int t) {
        notifyObservers(t);
        setChanged();
        world.setTarget(t);
        System.out.println("T on P" + t + " toggled");
        try {

            TimeUnit.MILLISECONDS.sleep(targetHopTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyObservers(t);
        setChanged();
    }

    public void randomTarget(int t) {
        notifyObservers(t);
        setChanged();
        System.out.println("T on P" + t + " toggled");
        try {

            TimeUnit.MILLISECONDS.sleep(targetHopTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyObservers(t);
        setChanged();
    }

    public int getTargetHopTime() {
        return targetHopTime;
    }

    public void setTargetHopTime(int targetHopTime) {
        this.targetHopTime = targetHopTime;
    }

    public boolean isMoving() {
        return randomTarget;
    }

    public void setMovingTarget(boolean movingTarget) {
        this.randomTarget = movingTarget;
    }

    /**
     * @return the circlingTarget
     */
    public boolean isCircling() {
        return circlingTarget;
    }

    /**
     * @param circlingTarget
     *            the circlingTarget to set
     */
    public void setCirclingTarget(boolean circlingTarget) {
        this.circlingTarget = circlingTarget;
    }

    public synchronized void terminate() {
        running = false;
    }

    public boolean isRunning() {
        return running;
    }

}
