package chapter03.section01.therad_3_1_6.project_1_notifyOne;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		Object lock = new Object();

		ThreadA a = new ThreadA(lock);
		a.start();

		ThreadB b = new ThreadB(lock);
		b.start();

		ThreadC c = new ThreadC(lock);
		c.start();

		Thread.sleep(1000);
		Object lock1 = new Object();//不同的同步锁
		NotifyThread notifyThread = new NotifyThread(lock1);//无法唤醒
//		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();

	}

}
