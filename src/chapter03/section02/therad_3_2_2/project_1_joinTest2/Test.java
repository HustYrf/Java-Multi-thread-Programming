package chapter03.section02.therad_3_2_2.project_1_joinTest2;

public class Test {

	public static void main(String[] args) {
		try {
			MyThread threadTest = new MyThread();
			threadTest.start();
			threadTest.join();
			System.out.println("子线程执行完成,睡10s");
			Thread.sleep(10000);
			for (int i = 0; i < 20; i++) {
				Thread.sleep(1000);
				System.out.println("孙珊，我爱你");
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
