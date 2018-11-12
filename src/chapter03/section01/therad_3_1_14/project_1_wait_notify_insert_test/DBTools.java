package chapter03.section01.therad_3_1_14.project_1_wait_notify_insert_test;

public class DBTools {

	volatile private boolean prevIsA = false;//防止过早通知

	synchronized public void backupA() {
		try {
			while (prevIsA == true) {
				this.wait();
			}
			for (int i = 0; i < 5; i++) {
				System.out.println("★★★★★");
			}
			prevIsA = true;
			notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void backupB() {
		try {
			while (prevIsA == false) {
				this.wait();
			}
			for (int i = 0; i < 5; i++) {
				System.out.println("☆☆☆☆☆");
			}
			prevIsA = false;
			notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
