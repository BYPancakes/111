package Zad_RazvAlg;

import java.util.Scanner;
public class Zadacha14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ������� ������������");
		var a = scan.nextInt();
		var b = scan.nextInt();
		var c = scan.nextInt();
		if (a == b && a == c && b == c) {
			System.out.println("��� ������� �����: ����������� ��������������");
		} else if (a != b && a != c && b != c) {
			System.out.println("������� �� �����: ����������� �������");
		} else {
			System.out.println("��� ������� �����: ����������� ��������������");
		}
					
		scan.close();	
	}

}