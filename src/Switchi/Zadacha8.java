package Switchi;

import java.util.Scanner;
public class Zadacha8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ����� 1-20");
		var � = scan.nextInt();
		
		switch(�) {
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("���");
				break;
			case 3:
				System.out.println("���");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("����");
				break;
			case 6:
				System.out.println("�����");
				break;
			case 7:
				System.out.println("����");
				break;
			case 8:
				System.out.println("������");
				break;
			case 9:
				System.out.println("������");
				break;
			case 10:
				System.out.println("������");
				break;
			case 11:
				System.out.println("����������");
				break;
			case 12:
				System.out.println("����������");
				break;
			case 13:
				System.out.println("����������");
				break;
			case 14:
				System.out.println("������������");
				break;
			case 15:
				System.out.println("����������");
				break;
			case 16:
				System.out.println("����������");
				break;
			case 17:
				System.out.println("����������");
				break;
			case 18:
				System.out.println("������������");
				break;
			case 19:
				System.out.println("������������");
				break;
			case 20:
				System.out.println("��������");
				break;
			default:
				System.out.println("�������� �����");
		}
		
		
		scan.close();	
	}

}