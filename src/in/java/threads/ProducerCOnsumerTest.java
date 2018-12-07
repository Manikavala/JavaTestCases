package in.java.threads;

import java.util.ArrayList;
import java.util.List;

public class ProducerCOnsumerTest {

	public static void main(String[] args) throws InterruptedException {
		ProCon pc = new ProCon();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}

}

class ProCon {
	List<Integer> list = new ArrayList<>();
	int capacity = 2;

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (this) {
				while (list.size() == capacity)
					wait();
				System.out.println("producer prodused" + value);
				list.add(value++);
				
				notify();
				Thread.sleep(1000);
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (list.size() == 0)
					wait();
				int value = list.remove(0);
				System.out.println("Consumer Consumed : "+value);
				notify();
				Thread.sleep(1000);

			}
		}
	}
}
