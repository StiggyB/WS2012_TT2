package de.haw_hamburg.inf.gui;

import java.util.Observable;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import de.haw_hamburg.inf.environment.GWorld;
import de.haw_hamburg.inf.rl.RLPolicy;

public class GridControl extends Observable implements Runnable {

    private volatile boolean running       = false;
    private volatile int     targetHopTime = 2;
    private boolean          movingTarget  = false;
    private RLPolicy         policy;
    private GWorld           world;

    public GridControl(GWorld world, RLPolicy policy) {
        this.world = world;
        this.policy = policy;
    }

    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }

    private void moveTarget(int t) {
        notifyObservers(t * 10);
        long t1 = System.currentTimeMillis();
        setChanged();
        // gg.togglePanel(t*10);
        System.out.println("T on P" + t * 10 + " toggled");
        try {

            TimeUnit.SECONDS.sleep(targetHopTime);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        notifyObservers(t * 10);
        long t2 = System.currentTimeMillis();
        setChanged();
        System.out.println("Time Passed: " + (t2 - t1) / 1000 + "s");
        // gg.togglePanel(t*10);
    }

    @Override
    public void run() {
        running = true;
        Random r = new Random();
        while (running) {
            runGridGame();
            if (movingTarget) {
                moveTarget(r.nextInt(5) + 1);
            }
        }
    }

    private void runGridGame() {
        int action = -1;
        while(!world.endState()) {
            action = policy.getBestAction(world.getState());
            
            notifyObservers(world.getNextState(action));
            
            
        }
        
    }

    public void reset() {
        running = true;
    }

    public void terminate() {
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
}
