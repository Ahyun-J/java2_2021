package week5;

public class Dog extends Animal{
	
	static int count;
	
	public Dog() {
		name = "Anonymous";
//		count++;
	}

	public Dog(String name) {
		this.name = name;
//		count++;//ī��Ʈ
	}
	
	public String toString() {
		count++;//ī��Ʈ �ѹ���
		return name;
	}
	
	public void sound() {
		System.out.println("�۸�");
	}
	
	public static int getCountDog() {
		return count;
	} // �� ����
}

//	public void reaction(String ani) {
//		ani = "�����_����������";
//	}
//	
//	public String reaction(String r) {
//		return r = "������_�����ø���";
//	}


	
//	public static void setCountDog(int count) {
//		Dog.count = count;
//	}
//	
	
