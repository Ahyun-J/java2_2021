package week5;

public class Cat extends Animal{
	
	public Cat() {
		name = "Anonymous";
	}

	public Cat(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public String toString() { 
		return name;
	}
	//�ؽ��ڵ�? ��� ���� �ڲ� ����� �Ǿ��µ� ���ͳ�����
	//ã�ƺ��� �� �κ��� �߰��ߴ��� ������ �� �� ������?

	public void sound() {
		System.out.println("��~��");
	}
	
}

//	public void reaction(String ani) {
//		ani = "�����_����������";
//	}

//	public String reaction(String r) {
//		return r = "�����_����������";
//	}