package Zadachi;

import java.util.Scanner;
public class Zadacha2 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("������� ����� ����");
	var N = scan.nextInt();
	

	if (N % 4 == 0 && ! (N % 100 == 0 && N % 400 == 0)) {
		 System.out.println("���� � ���� 366, ��� �������� ���������� ");
		 	
	} else {
		 System.out.println("���� � ���� 365, ��� �������� ������� ");
		 
	}
	scan.close(); 

	}

}
