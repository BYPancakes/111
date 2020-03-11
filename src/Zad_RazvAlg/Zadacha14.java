package Zad_RazvAlg;

import java.util.Scanner;
public class Zadacha14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите стороны треугольника");
		var a = scan.nextInt();
		var b = scan.nextInt();
		var c = scan.nextInt();
		if (a == b && a == c && b == c) {
			System.out.println("Все стороны равны: треугольник равносторонний");
		} else if (a != b && a != c && b != c) {
			System.out.println("Стороны не равны: треугольник обычный");
		} else {
			System.out.println("Две стороны равны: треугольник равнобедренный");
		}
					
		scan.close();	
	}

}