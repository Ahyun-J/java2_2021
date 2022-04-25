package week12;

public class Job extends Thread{
	
	private Work w;
	
	public Job(Work a) {
		w = a;
	}
	
	public void run() {
		w.threadWork();
		System.out.println( getName() + ", ����");
	}
}


//- �ʵ� : private Work w //Work Ŭ���� Ÿ���� ��ü.
//- ������ : Work Ÿ���� ��ü�� ���� �޾� w��ü �ʵ忡 ����.
//- ������ �޼ҵ� run()
//: w��ü�� threadWork() ȣ��,
//: ���� run() �޼ҵ带 ȣ���ϰ� �ִ� �������� �̸��� �����ᡰ 
//�޽��� ���.