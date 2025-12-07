package test;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("窗口一");
        MyThread t2 = new MyThread("窗口二");
        MyThread t3 = new MyThread("窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
