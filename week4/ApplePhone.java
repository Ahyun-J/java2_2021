package week4;

public class ApplePhone extends Phone {
	
	public ApplePhone() {
		super();
	}
	
	public ApplePhone(String w) {
		super(w);
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println(super.getWho()+"������ȭ�� �ϸ� ��ȭ������ �����մϴ�.");
		
	}

}
