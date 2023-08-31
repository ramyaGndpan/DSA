package javatraining.day10;

class TaskNew implements Runnable  {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() +" :: " + i);
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {

        TaskNew TaskNew1 = new TaskNew();
        TaskNew TaskNew2 = new TaskNew();
        TaskNew TaskNew3 = new TaskNew();
        TaskNew TaskNew4 = new TaskNew();

        Thread thread1 = new Thread(TaskNew1, "Thread 1");
        Thread thread2 = new Thread(TaskNew2, "Thread 2");
        Thread thread3 = new Thread(TaskNew3, "Thread 3");
        Thread thread4 = new Thread(TaskNew4, "Thread 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
