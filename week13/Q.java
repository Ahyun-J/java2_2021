package week13;

import java.util.ArrayList;
import java.util.Arrays;

public class Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = { "���", "��", "�ٳ���" };
		ArrayList list = new ArrayList(Arrays.asList(s));
	
		 list.add("����"); System.out.println(list);
		 list.add(2, "�ڸ�"); System.out.println(list);
		 System.out.println(list.get(3));
		 list.remove(1); System.out.println(list);
		 System.out.println(list.contains("���"));
		 System.out.println(list.indexOf("���"));
	}

}
