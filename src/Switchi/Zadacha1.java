package Switchi;

import java.util.Scanner;
public class Zadacha1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ����� 1-4");
		var � = scan.nextInt();
		
		switch(�) {
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("�����");
				break;
			case 3:
				System.out.println("����");
				break;
			case 4:
				System.out.println("�����");
				break;
			default:
				System.out.println("�� ������ �����");
		}
		
		
		scan.close();	
	}

}