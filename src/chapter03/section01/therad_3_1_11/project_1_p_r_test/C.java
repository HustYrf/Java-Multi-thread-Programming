package chapter03.section01.therad_3_1_11.project_1_p_r_test;

//消费者
public class C {

	private String lock;

	public C(String lock) {
		super();
		this.lock = lock;
	}

	public void getValue() {
		try {
			synchronized (lock) {
				if (ValueObject.value.equals("yrf")) {
					lock.wait();
				}
				Thread.sleep(1000);
				System.out.println("get的值是" + ValueObject.value);
				ValueObject.value = "yrf";
				lock.notify();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
