package Zadachi;

import java.util.Scanner;

public class Zadacha13 {

	public static void main(String[] args) {

		System.out.println("¬ведите числа");
		Scanner scan = new Scanner(System.in);
		var a = scan.nextFloat();
		var b = scan.nextFloat();
		var c = scan.nextFloat();
		
		if (a < b && b < c) {
			var d = (float) a * 2;
			var e = (float) b * 2;
			var f = (float) c * 2;
			System.out.printf("%.0f\n%.0f\n%.0f", d, e, f);
		} else { 
			var d = (-a);
			var e = (-b);
			var f = (-c);
			System.out.printf("%.2f\n%.2f\n%.2f", d, e, f);

		}
				
		scan.close();
	}

}
