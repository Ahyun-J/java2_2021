package week13;

import java.util.ArrayList;
import java.util.Arrays;

public class Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = { "사과", "배", "바나나" };
		ArrayList list = new ArrayList(Arrays.asList(s));
	
		 list.add("포도"); System.out.println(list);
		 list.add(2, "자몽"); System.out.println(list);
		 System.out.println(list.get(3));
		 list.remove(1); System.out.println(list);
		 System.out.println(list.contains("사과"));
		 System.out.println(list.indexOf("사과"));
	}

}
