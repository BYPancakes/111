package Zad_RazvAlg;

import java.util.Scanner;

public class Zadacha6 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("¬ведите целое число");
			var x = scan.nextInt();
			if (x < 0 && x % 2 == 0) {
				System.out.println("¬ведено отрицательное четное число");			
			} else if (x < 0 && x % 2 != 0) {
				System.out.println("¬ведено отрицательное нечетное число");
			} else if (x == 0) {
				System.out.println("¬ведено нулевое число");
			} else if (x > 0 && x % 2 != 0) {
				System.out.println("¬ведено положительное нечетное число");
			} else if (x > 0 && x % 2 == 0) {
				System.out.println("¬ведено положительное четное число");
			}

				scan.close();
		}

	}
