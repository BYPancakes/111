package Switchi;

import java.util.Scanner;
public class Zadacha9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� � ������ 3-5");
		var � = scan.nextInt();
		
		switch(�) {
			case 3:
				System.out.println("����");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("���");
				break;
			
			default:
				System.out.println("�������� �����");
		}
		
		
		scan.close();	
	}

}