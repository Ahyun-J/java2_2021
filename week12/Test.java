package week12;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("20215247_������\n");

		Work w = new Work();
		
		Job tha = new Job(w); //w ������ ��ü ����
		tha.setName("ThreadA");
		tha.start(); // ������ ����
		
		Job thb = new Job(w);
		thb.setName("ThreadB");
		thb.start(); // ������ ����
		
	}

}
