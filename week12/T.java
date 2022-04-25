package week12;

//
public class T {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		producerThread.start();
		consumerThread.start();
	}
}

class DataBox {
	private String data;

	public synchronized String getData() {
		// �� �޼ҵ�� ����ȭ �Ǿ� �ִ�.
//this.data�� null�̸� �ٸ� �����尡 �˷��� �� ���� ��ٸ���.
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String returnValue = data;
		System.out.println("ConsummerThread�� ���� "
				+ "������: " + returnValue);
		
//this.data�� null�� ����� �ٸ� �����忡�� �˷��ش�. 
		this.data = null;
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {
		// �� �޼ҵ�� ����ȭ �Ǿ� �ִ�.
//this.data�� null�� �ƴϸ� �ٸ� �����尡 �˷��� �� ���� 
		// ��ٸ���.
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("ProducerThread�� ������ "
				+ "������: " + data);
//this.data�� ���޵Ǿ� �� �����͸� �����ϰ� �ٸ� �����忡�� 
//�˷��ش�. 
		this.data = data;
		notify();

	}
}
//

class ProducerThread extends Thread {
	private DataBox dataBox;

	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = "Data-" + i;
			dataBox.setData(data);
		}
	}
}

//
class ConsumerThread extends Thread {
	private DataBox dataBox;

	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = dataBox.getData();
		}
	}
}

//7
//public class T {
//	public static void main(String[] args) {
//		ThreadA threadA = new ThreadA();
//		ThreadB threadB = new ThreadB();
//		threadA.start();
//		threadB.start();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//		}
//		threadA.work = false;
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//		}
//		threadA.work = true;
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//		}
//		threadA.stop = true;
//		threadB.stop = true;
//	}
//}
//
//public class ThreadA extends Thread {
//	public boolean stop = false;
//	public boolean work = true;
//	
//	public void run() {
//		while(!stop) {
////work�ʵ尡 true�̸� ��ThreadA �۾��� ���, 
//			//false�̸� �������� ������ �纸�Ѵ�.
//			if(work) {
//				System.out.println("ThreadA �۾�");
//			}else {
//				Thread.yield();
//			}
//			
//		}
//		System.out.println("ThreadA ����");
//	}
//}
//
//public class ThreadB extends Thread {
//	public boolean stop = false;
//	public boolean work = true;
//	
//	public void run() {
//		while(!stop) {
////work�ʵ尡 true�̸� ��ThreadB �۾��� ���, 
//			//false�̸� �������� ������ �纸�Ѵ�.
//			if(work) {
//				System.out.println("ThreadB �۾�");
//			}else {
//				Thread.yield();
//			}
//		}
//		System.out.println("ThreadB ����");
//	}
//}

//5
//public class T {
//	private int count = 1;
//
//	public synchronized void sub(String n) {
//		for (int i = 0; i < 10; i++)
//			System.out.println(n + ", " + count++);
//	}
//
//	public static void main(String[] args) {
//		T demo = new T();
//		Thread a1 = new A(demo, "a1");
//		Thread a2 = new A(demo, "a2");
//		a1.start();
//		a2.start();
//	}
//}
//
//class A extends Thread {
//	T demo;
//	String name;
//
//	public A(T td, String name) {
//		demo = td;
//		this.name = name;
//	}
//
//	public void run() {
//		demo.sub(name);
//	}
//}

//1
//class A extends Thread {
//	public void run() {
//		int n = 0;
//		while(true) {
//			System.out.println(""+n++);
//			if(n>100) break;
//		}
//	}
//}
//
//class B extends Thread {
//	public void run() {
//		int n = 0;
//		while(true) {
//			System.out.println(""+n++);
//			if(n>100) break;
//		}
//	}
//}
//
//
//public class T {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		 Thread t = new Thread(new A());
//		 Thread tt = new Thread(new B());
//		 t.start();
//		 tt.start();
//	}
//
//}
