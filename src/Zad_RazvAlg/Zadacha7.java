package Zad_RazvAlg;

import java.util.Scanner;
public class Zadacha7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� � ��������: 1 - ��������; 2 - ���������; 3 - ���������; 4 - �������");
		var n = scan.nextInt();
		if (n < 0 || n > 4) {
			System.out.println("�������� �� ����������!\n��������� �������");
		} else 
		System.out.println("������� ����� A");
		var a = scan.nextFloat();
		System.out.println("������� ����� B");
		var b = scan.nextFloat();
		
		if (b == 0) {
			System.out.println("����� � �� ����� ���� ������ 0.");
		} else if (n == 1) {
			var sum = a + b;
			System.out.println("A + B = " + sum);
		} else if (n == 2) {
			var sum = a - b;
			System.out.println("A - B = " + sum);
		} else if (n == 3) {
			var sum = a * b;
			System.out.println("A * B = " + sum);
		} else if (n == 4) {
			var sum = a / b;
			System.out.println("A / B = " + sum);
		} 
					
		scan.close();	
	}

}
