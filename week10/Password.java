package week10;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		
		 String id="abcdef";
		 //userid�� �Է� �޾� ����� id�� ��ġ�ϴ��� ���Ͽ� ����� ���(��ҹ��� ����)
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("���̵� �Է��ϼ��� : ");
		 String userid = sc.next();
		 
		 if(userid.equals(id)) {
			 System.out.println("userid�� ��ġ�մϴ�.");
		 } else {
			 System.out.println("userid�� ��ġ���� �ʽ��ϴ�.");
		 }
		 System.out.println("\n20215247_������");
		}
}
