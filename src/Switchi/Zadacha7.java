package Switchi;

import java.util.Scanner;
public class Zadacha7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� � ������ 1-12");
		var � = scan.nextInt();
		
		switch(�) {
			case 1:
				System.out.println("������");
				break;
			case 2:
				System.out.println("�������");
				break;
			case 3:
				System.out.println("����");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("���");
				break;
			case 6:
				System.out.println("����");
				break;
			case 7:
				System.out.println("����");
				break;
			case 8:
				System.out.println("������");
				break;
			case 9:
				System.out.println("��������");
				break;
			case 10:
				System.out.println("�������");
			case 11:
				System.out.println("������");
			case 12:
				System.out.println("�������");
				break;
			default:
				System.out.println("��� ������ ������");
		}
		
		
		scan.close();	
	}

}