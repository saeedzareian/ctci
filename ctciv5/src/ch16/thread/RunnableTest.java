package ch16.thread;

import java.util.concurrent.locks.ReentrantLock;

public class RunnableTest {
	public static void main(String[] args){
		myRunnable r = new myRunnable();
		Thread t = new Thread(r);
		t.start();
		myRunnable r1 = new myRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
		
	}
	
	public static class myRunnable implements Runnable{
		public static int v =0;
		public static ReentrantLock lock = new ReentrantLock();
		public static synchronized void add(){
			v++;
		}
		public static void deduct(){
			lock.lock();
			System.out.println(v--);
			lock.unlock();
		}
		public void run() {
			int t= 0;
			while(t<5){
				add();
				System.out.println("v+:"+v);
				try {		
					Thread.sleep(500);
					t++;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			while(t>0){
				deduct();
				System.out.println("v-:"+v);
				try {		
					Thread.sleep(500);
					t--;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
