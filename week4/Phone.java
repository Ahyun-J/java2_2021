package week4;

public class Phone {
private String who;
	
	public Phone() {
		this("������");
	}
	
	public Phone(String w) {
		this.who = w;
	}
	
	public void call(){
		System.out.println(this.who+"��ȭ�� �մϴ�.");
		return;
		
	}

	public String getWho() {
		return this.who;
	}

}
