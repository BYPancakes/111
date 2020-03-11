package Zad_RazvAlg;

import java.util.Scanner;
public class Zadacha9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите № единицы длинны: 1 - децеметр; 2 - километр; 3 - метр; 4 - миллиметр; 5 - сантиметр");
		var n = scan.nextInt();
		if (n < 0 || n > 5) {
			System.out.println("не верная длинна!\nПовторите попытку");
		} else 
		System.out.println("Введите длинну отрезка");
		var a = scan.nextFloat();

		if (n == 1) {
			var sum = a * 10;
			System.out.println(+ a + "дециметров = " + sum + " метров");
		} else if (n == 2) {
			var sum = a * 10000;
			System.out.println(+ a + "километров = " + sum + " метров");
		} else if (n == 3) {
			System.out.println(+ a + " метров");
		} else if (n == 4) {
			var sum = a / 100;
			System.out.println(+ a + "миллиметров = " + sum + " метров");
		} else if (n == 5) {
			var sum = a / 10;
			System.out.println(+ a + "сантиметров = " + sum + " метров");
		} 
					
		scan.close();	
	}

}
