package Switchi;

import java.util.Scanner;
public class Zadacha14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� � ��� ������ 1-7");
		var � = scan.nextInt();
		
		switch(�) {
			case 1: case 2: case 3: case 4: case 5:
 				System.out.println( + � + " - ������ ����");
				break;
			case 6:
				System.out.println( + � + " - �������");
				break;
			case 7:
				System.out.println( + � + " - �����������");
				break;
			
			default:
				System.out.println("�������� �����");
		}
		
		
		scan.close();	
	}

}