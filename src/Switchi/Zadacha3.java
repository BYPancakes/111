package Switchi;

import java.util.Scanner;
public class Zadacha3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ���� �� �����: 12, 1, 2");
		var � = scan.nextInt();
		
		switch(�) {
			case 1:
				System.out.println("������");
				break;
			case 2:
				System.out.println("�������");
				break;
			case 12:
				System.out.println("�������");
				break;
			default:
				System.out.println("������");
		}
		
		
		scan.close();	
	}

}