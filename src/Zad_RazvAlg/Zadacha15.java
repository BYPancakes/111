package Zad_RazvAlg;

import java.util.Scanner;
public class Zadacha15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите 3 числа");
		var a = scan.nextInt();
		var b = scan.nextInt();
		var c = scan.nextInt();
		if (a > b && a > c) {
			System.out.println("Максимальное число: " + a);
		} else if (b > a && b > c) {
			System.out.println("Максимальное число: " + b);
		} else if (c > b && c > a) {
			System.out.println("Максимальное число: " + c);
		}
					
		scan.close();	
	}

}