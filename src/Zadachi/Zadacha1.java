package Zadachi;

import java.util.Scanner;
public class Zadacha1 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("������� ����� �������� ���������� 1 - ������; 2 - �������; 3 = ������; 4 - ������� �����");
	var N = scan.nextInt();
	if (N > 4 || N <= 0) {
		System.out.printf("������ �� ������ ����� ��������");
	
	}	else if (N > 0 && N < 5) {
	System.out.println("������� �������� ��������");
	var x = scan.nextFloat();
	
	 if (N == 1) {
		 float r = x;
		 float d = 2 * r;
		 double l = 2 * Math.PI * r; 
		 double s = Math.PI * (r * 2);
		System.out.printf("������ ����� %f\n������� ����� %f\n������ ����� %f\n������� ����� ����� %f", r, d, l, s);
	
	} else if (N == 2) {
		 float d = x;
	  	 float r = d / 2; 
		 var l = 2 * Math.PI * r ;
		 var s = Math.PI * (r * 2);
		 System.out.printf("������ ����� %f\n������� ����� %f\n������ ����� %f\n������� ����� ����� %f", r, d, l, s);
		 
	} else if (N == 3) {
		 double l = x;
		 float r = (float) (l / (Math.PI * 2));
		 float d = 2 * r; 
		double s = Math.PI * (r * 2);
		 System.out.printf("������ ����� %f\n������� ����� %f\n������ ����� %f\n������� ����� ����� %f", r, d, l, s);
		
	} else if (N == 4) {
		 float s = x;
		 double r = Math.sqrt(s / Math.PI); 
		 float d = (float) (2 * r);
		 double l = 2 * Math.PI * r;
		 System.out.printf("������ ����� %f\n������� ����� %f\n������ ����� %f\n������� ����� ����� %f", r, d, l, s);
		
	} }
	
	scan.close(); 

	}

}
