package com.peak;

public class Task implements Runnable {

    private static int ticket = 200;

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 1000; i++) {
                synchronized (Task.class) {
                    if (ticket > 0) {
                        ticket--;
                        System.out.println("抢到咯================还剩：" + ticket + "票");
                        Thread.sleep(10);
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
