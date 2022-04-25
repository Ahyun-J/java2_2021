package week4;

public class Family {
	Phone [] p = {new Phone ("dad"),
			new Phone("mom"),
			new Phone("boy"),
			new Phone("girl")};
	

	public void operation() {
	
		for (int i = 0; i < p.length; i++) {
			p[i].call();
		}
	}

	public boolean change(String w, String what) {
		
		System.out.println(w+"�� �ڵ����� ��ȯ�Ѵ�.");
		boolean s = false;
		
		for (int i = 0; i < p.length; i++) {
			if (p[i].getWho().equals(w)) {
				switch(what) {
				case "andrphone":
					p[i] = new AndrPhone(w);
					s = true;
					break;
				case "applephone":
					p[i] = new ApplePhone(w);
					s = true;
					break;
				default:
				}
			}
		}
		
		return s;
	}
}
