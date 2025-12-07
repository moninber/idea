package test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    static int tickets = 0;
    static Lock lock = new ReentrantLock();
    public MyThread(String name) {
        super(name);
    }

    public void run(){
        while(true){
         lock.lock();
            try {
                if(tickets<100){
                    try{
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    tickets++;
                    System.out.println(getName()+"正在卖第"+tickets+"张票");
                }else{
                    break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
