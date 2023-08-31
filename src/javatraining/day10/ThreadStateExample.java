package javatraining.day10;

class TaskNew1 implements  Runnable {

    public void run(){
        System.out.println("Thread is running...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread has finished.");
    }
}


public class ThreadStateExample {
    public static void main(String[] args) {
        TaskNew1 task = new TaskNew1();
        Thread thread = new Thread( task); // new State

        System.out.println("Thread State: " + thread.getState()); // New

        thread.start(); // Runnable
        System.out.println("Thread State: " + thread.getState()); // Runnable

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread State: " + thread.getState()); // Possibly Runnable or Timed Waiting

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread State: " + thread.getState()); // Terminated
    }
}
