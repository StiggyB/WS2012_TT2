package de.haw_hamburg.inf.gui;

import java.awt.EventQueue;
import java.util.Observable;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class GUIControl extends Observable implements Runnable {

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
        // gg.togglePanel(t*10);
        System.out.println("T on P" + t * 10 + " toggled");
        try {

            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        setChanged();
        notifyObservers(t * 10);
        // gg.togglePanel(t*10);
    }

    @Override
    public void run() {
        Random r = new Random();
        while (running) {
            moveTarget(r.nextInt(5) + 1);
        }
    }
}
