package edu.up.cs301threadslab;

import java.util.Random;

public class ThreadedStarAnimation extends Thread {
    private StarAnimation SA = null;

    public ThreadedStarAnimation(StarAnimation animation) {
        this.SA = animation;
    }

    @Override
    public void run() {
        Random rand = new Random();
        while(true) {
            try {
                sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(rand.nextBoolean()) {
                SA.addStar();
            } else {
                SA.removeStar();
            }
        }
    }
}
