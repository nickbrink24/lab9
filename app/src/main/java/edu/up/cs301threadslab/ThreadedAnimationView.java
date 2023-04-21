package edu.up.cs301threadslab;

public class ThreadedAnimationView extends Thread {
    private AnimationView AV = null;

    public ThreadedAnimationView(AnimationView view) {
        this.AV = view;
    }

    @Override
    public void run() {
        while(true) {
            AV.postInvalidate();
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
