package week10;

class MyClass { 
	
	public static void main (String args[]) {
		long time1 = System.currentTimeMillis();
		System.out.println("start time = " + time1);
		
		for(int i = 0; i < 10000; i++) {
			System.out.print(".");
		}
		System.out.println("(���� 10000�� ��µ˴ϴ�.)");
		
		long time2 = System.currentTimeMillis();
		System.out.println("end time = " + time2);
		
		System.out.println("�� �� ���� ����ϴ� �ð� = " + (time2 - time1) + "milli sec");

	}
}