package week2;

import java.util.Scanner;

public class CellPhoneTest {
	 public static void main(String[] args) {
		  
		  CellPhone [] cell = new CellPhone[5];
		  
		  cell[0] = new CellPhone("010-5720-4011",true);
		  cell[1] = new CellPhone("010-4922-2997",true);
		  cell[2] = new CellPhone("010-7741-0446",true);
		  cell[3] = new CellPhone("010-5702-0881",true);
	      cell[4] = new CellPhone("010-9615-5570",true);
	      
	      for(CellPhone c : cell)
	    	  System.out.println(c);
	      
	      Scanner scan = new Scanner(System.in);
	      System.out.print("��ȭ ��ȣ�� �Է��Ͻø� ���� ���¸� �˷��帳�ϴ�.:");
	      String a = scan.next();
	      
	      for(CellPhone c : cell)
	    	  if(c.getTel().contentEquals(a)) {
	    		  System.out.println("���� ���� : "+ c.getPow() );
	    		  
	    	  }
	      
	  }

	 
//
//	    CellPhone p1 = new CellPhone();
//
//	    System.out.println("��ü ���� ����= "+ CellPhone.getCount());
//
//	 
//
//	    CellPhone p2 = new CellPhone("111-111-1111");
//
//	    System.out.println("��ü ���� ����= "+ CellPhone.getCount());
//
//	 
//
//	    System.out.println(p2);
//
//	    p2.powerToggle(); //p2.power <- false
//
//	    System.out.println(p2);
//
//	  }
}
