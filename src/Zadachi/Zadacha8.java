package Zadachi;

import java.util.Scanner;

public class Zadacha8 {


public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("������� ����� �������� ������������ 1 - �����; 2 - �����������; 3 = ������; 4 - �������");
	var N = scan.nextInt();
	if (N > 4 || N <= 0) {
		System.out.printf("������ �� ������ ����� ��������");
	} else {
		System.out.println("������� �������� ��������");
	var x = scan.nextFloat();

	if (N == 1) {
		float a = x;
		float c = (float) Math.sqrt(a * a * 2);
		float h = c / 2;
		float s = c * h / 2;
		System.out.printf("����� ����� %f\n����������� ����� %f\n������ ����� %f\n������� ����� %f", a, c, h, s);

	} else if (N == 2) {
		float c = x;	
		float a = (float) Math.sqrt((x / 2) * (x / 2) * 2);
		float h = x / 2;
		float s = x * h / 2;
		System.out.printf("����� ����� %f\n����������� ����� %f\n������ ����� %f\n������� ����� %f", a, c, h, s);

	} else if (N == 3) {
		float h = x;
		float � = (float) (x * 2);
		float a = (float) Math.sqrt((x / 2) * (x / 2) * 2);
		float s = (float) (� * x / 2);
		System.out.printf("����� ����� %f\n����������� ����� %f\n������ ����� %f\n������� ����� %f", a, �, h, s);

	} else if (N == 4) {
		float s = x;
		float a = (float) Math.sqrt(2 * s);
		float � = (float) Math.sqrt(a * a * 2);
		float h = (float) (� / 2);
		System.out.printf("����� ����� %f\n����������� ����� %f\n������ ����� %f\n������� ����� %f", a, �, h, s);

	}

	scan.close();

	}

}}
