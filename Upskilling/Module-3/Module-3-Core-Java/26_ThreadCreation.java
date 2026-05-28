/* 26. Thread Creation
• Objective: Implement multithreading.
• Task: Create and run two threads that print messages.
• Instructions:
o Define a class that extends Thread or implements Runnable.
o In the run() method, print a message multiple times.
o Start both threads and observe the output. */

class MyThread extends Thread {

    private String message;

    public MyThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(message + " - Count: " + i);

        }
    }
}

class ThreadCreation {

    public static void main(String[] args) {

        MyThread thread1 = new MyThread("Thread 1 Running");
        MyThread thread2 = new MyThread("Thread 2 Running");

        thread1.start();
        thread2.start();
    }
}