class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Main1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // start() invokes run() method in a separate thread
    }
}
