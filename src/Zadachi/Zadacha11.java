package Zadachi;

import java.util.Scanner;
public class Zadacha11 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("������� ������� �����: 1 - �����; 2 - �����; 3 - ��; 4 - ������");
	var c = scan.nextInt();
	System.out.println("������� ������� ��������: 1 = ������� �� ����; -1 = ������� �� �����; 2 - ������� �� 180");
	
	var N1 = scan.nextInt();
	var N2 = scan.nextInt();
	
	if (N1 > 2 || N1 < -1 || N2 > 2 || N2 < -1) {
		System.out.println("������� �� ���������.\n��������� �������");
	} else if (N1 == 1 && N2 == -1 || N1 == -1 && N2 == 1 || N1 == 2 && N2 == 2) {
		System.out.println("��������� � �������� ������� �����");
	
	} else if (c == 1 && N1 == 2 && N2 == 1 || c == 1 && N1 == 1 && N2 == 2) {
		System.out.println("�����");
	} else if (c == 1 && N1 == 1 && N2 == 1 || c == 1 && N1 == -1 && N2 == -1) {
		System.out.println("��");
	} else if (c == 1 && N1 == 2 && N2 == -1 || c == 1 && N1 == -1 && N2 == 2) {
		System.out.println("������");
		
		
	} else if (c == 2 && N1 == 2 && N2 == -1 || c == 2 && N1 == -1 && N2 == 2) {
		System.out.println("�����");
	} else if (c == 2 && N1 == 1 && N2 == 2 || c == 2 && N1 == 2 && N2 == 1) {
		System.out.println("��");
	} else if (c == 2 && N1 == 1 && N2 == 1 || c == 2 && N1 == -1 && N2 == -1) {
		System.out.println("������");
		
	} else if (c == 3 && N1 == 1 && N2 == 1 || c == 3 && N1 == -1 && N2 == -1) {
		System.out.println("�����");
	} else if (c == 3 && N1 == -1 && N2 == 2 || c == 3 && N1 == 2 && N2 == -1) {
		System.out.println("�����");
	} else if (c == 3 && N1 == 2 && N2 == 1 || c == 3 && N1 == 1 && N2 == 2) {
		System.out.println("������");
		
	} else if (c == 4 && N1 == 1 && N2 == 2 || c == 4 && N1 == 2 && N2 == 1) {
		System.out.println("�����");
	} else if (c == 4 && N1 == 1 && N2 == 1 || c == 4 && N1 == -1 && N2 == -1) {
		System.out.println("�����");
	} else if (c == 4 && N1 == 2 && N2 == -1 || c == 4 && N1 == -1 && N2 == 2) {
		System.out.println("��");

}
	scan.close();
}}