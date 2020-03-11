package Zad_RazvAlg;

import java.util.Scanner;
public class Zadacha12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите 3 числа");
		var a = scan.nextInt();
		var b = scan.nextInt();
		var c = scan.nextInt();
		if (a != b && a != c && b != c) {
			System.out.println("0");
		} else if (a == b && b == c && b == c) {
			System.out.println("2");
		} else {
			System.out.println("1");
		}
					
		scan.close();	
	}

}