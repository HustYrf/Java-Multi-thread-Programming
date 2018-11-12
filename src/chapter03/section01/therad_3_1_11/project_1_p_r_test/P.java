package chapter03.section01.therad_3_1_11.project_1_p_r_test;

//生产者
public class P {

	private String lock;

	public P(String lock) {
		super();
		this.lock = lock;
	}

	public void setValue() {
		try {
			synchronized (lock) {
				if (!ValueObject.value.equals("yrf")) {
					lock.wait();
				}
				Thread.sleep(1000);
				String value = ":孙珊,我爱你";
				System.out.println("set的值是" + value);
				ValueObject.value = value;
				lock.notify();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
