package Switchi;

import java.util.Scanner;
public class Zadacha11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ����� 2-10");
		var x = scan.nextInt();
		
		switch(x) {
			case 2: case 4: case 6: case 8: case 10:
				System.out.println(+ x + " - ������ �����");
				break;
			case 3: case 5: case 7: case 9:
				System.out.println(+ x +" - �� ������ �����");
				break;
			
			default:
				System.out.println("�������� �����");
		}
		
		
		scan.close();	
	}

}