package Zad_RazvAlg;

import java.util.Scanner;
public class Zadacha15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� 3 �����");
		var a = scan.nextInt();
		var b = scan.nextInt();
		var c = scan.nextInt();
		if (a > b && a > c) {
			System.out.println("������������ �����: " + a);
		} else if (b > a && b > c) {
			System.out.println("������������ �����: " + b);
		} else if (c > b && c > a) {
			System.out.println("������������ �����: " + c);
		}
					
		scan.close();	
	}

}