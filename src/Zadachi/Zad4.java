package Zadachi;

import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		System.out.println("¬ведите числа");
		Scanner scan = new Scanner(System.in);
		var a = scan.nextFloat();
		var b = scan.nextFloat();
		var c = scan.nextFloat();
		Float x;
		
		if (a > b) {
			x = a; a = b; b = x;
		} else if (b > c) {
			x = b; b = c; c = x;
		}
		System.out.printf("%.1f\n%.1f\n%.1f", a, b, c);
		
		scan.close();

	}

}
