package week12;

public class Work {
	
	private int num = 0;
	
	public synchronized int getNum() {
		num += 1;
		return num;
	}

	public void threadWork() {
		while(true) {
			System.out.println( Thread.currentThread().getName() + ", " +getNum());
				if(num < 10) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					continue;
				}
				else if(num >= 10) {
					System.out.println(Thread.currentThread().getName() + ", �ݺ��� Ż��");
					break;
				}
		}
	}
}

//	- �޼ҵ� getNum()
//	 : �� ������ �ϳ��� �����常 ������ �� �ִ� �޼ҵ�
//	 : num���� 1���� ��Ų �� ������ num ���� ����.
//	 - �޼ҵ� threadWork()
//	 : ���� �ݺ��� �̿��Ͽ� ���� threadWork() �޼ҵ带 ����ϰ� �ִ� �������� ��
//	���� getNum()���� ���� ���� �� num ���� ���.
//	 : getNum()���� ���� ���� ���� 10 �̻��̸� �������� �̸��� ���ݺ��� Ż�⡰ �޽�
//	�� ��� �� �ݺ� Ż��
//	 : getNum()���� ���� ���� ���� 10 �̸��̸� 0.5�� sleep �� �ݺ��� ó������ ��
//	��.
	
