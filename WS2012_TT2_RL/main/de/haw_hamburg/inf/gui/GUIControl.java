package de.haw_hamburg.inf.gui;

import java.util.Observable;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class GUIControl extends Observable implements Runnable {

    private volatile int targetHopTime = 2;
    private volatile boolean running;

    public GUIControl() {
        this.running = true;
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
        System.out.println("Time Passed: " + (t2 - t1)/1000 + "s");
        // gg.togglePanel(t*10);
    }

    @Override
    public void run() {
        Random r = new Random();
        while (running) {
            moveTarget(r.nextInt(5) + 1);
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
}
