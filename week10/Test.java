package week10;

import java.util.Scanner;

//import java.util.*;
class Rectangle {
	int width, height;
	int area() { return width*height; }
}
public class Test {
	
	public static void main(String[] args) {
				Rectangle myRect = new Rectangle();
				myRect.width = 10;
				myRect.height = 20;
				System.out.println("������ " + myRect.area());
				
//		for(int i = 0; i<args.length; i++) {
//			System.out.println("args[" + i + "]=" + args[i]);}
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�̸� �Է� : ");
//		String a = sc.next();
//		
//		for(String s : args) {
//			if(s.equalsIgnoreCase(a)) {
//				System.out.println("OK");}
//		}
	}

}

//System.out.println("args[" + i + "]=" + args[i]);}


