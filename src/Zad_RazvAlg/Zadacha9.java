package Zad_RazvAlg;

import java.util.Scanner;
public class Zadacha9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� � ������� ������: 1 - ��������; 2 - ��������; 3 - ����; 4 - ���������; 5 - ���������");
		var n = scan.nextInt();
		if (n < 0 || n > 5) {
			System.out.println("�� ������ ������!\n��������� �������");
		} else 
		System.out.println("������� ������ �������");
		var a = scan.nextFloat();

		if (n == 1) {
			var sum = a * 10;
			System.out.println(+ a + "���������� = " + sum + " ������");
		} else if (n == 2) {
			var sum = a * 10000;
			System.out.println(+ a + "���������� = " + sum + " ������");
		} else if (n == 3) {
			System.out.println(+ a + " ������");
		} else if (n == 4) {
			var sum = a / 100;
			System.out.println(+ a + "����������� = " + sum + " ������");
		} else if (n == 5) {
			var sum = a / 10;
			System.out.println(+ a + "����������� = " + sum + " ������");
		} 
					
		scan.close();	
	}

}
