package Zadachi;

import java.util.Scanner;

public class Zadacha4 {

	public static void main(String[] args) {
		System.out.println("������� ������ ����������� ���������");
		var skan = new Scanner(System.in);
		var a = skan.nextFloat();
		var b = skan.nextFloat();
		var c = skan.nextFloat();
		var D = (float) b * b - 4 * a * c;
		var x1 = (-b + Math.sqrt(D)) / (2 * a);
		var x2 = (-b - Math.sqrt(D)) / (2 * a);

		if (a == 0) {
			System.out.println("� �� ������ ��������� ����, ������� ������ ������");			
		} else if (a != 0 && D > 0) {
						
		System.out.printf("��������� ����� ��� ��������� ������������ �����\nx1 = %.4f\nx2 = %.4f", x1, x2);
	
		} else if (a != 0 && D == 0) {

		System.out.println("��� ����� �����������\nx1 = " + x1 + "\nx2 = " + x2);
		
		} else if (a != 0 && D < 0) {
			System.out.println("��� ����� �������� ������������ �������");
			
		}
		
		skan.close();	

	}

}
