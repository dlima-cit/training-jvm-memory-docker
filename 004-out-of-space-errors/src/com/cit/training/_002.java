package com.cit.training;

public class _002 {

    public static void main(String[] args) {
        while (true) {
            new MyThread().start();
        }
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            //while (true) {
                Thread.yield();
                try {
                    Thread.sleep(300);
                    // Thread.sleep(3000);
                } catch (InterruptedException e) {
                }
            //}
        }
    }

}
