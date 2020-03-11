package Zad_RazvAlg;

import java.util.Scanner;
public class Zadacha7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите № действия: 1 - сложение; 2 - вычетание; 3 - умножение; 4 - деление");
		var n = scan.nextInt();
		if (n < 0 || n > 4) {
			System.out.println("Действия не существует!\nПовторите попытку");
		} else 
		System.out.println("Введите число A");
		var a = scan.nextFloat();
		System.out.println("Введите число B");
		var b = scan.nextFloat();
		
		if (b == 0) {
			System.out.println("Число В не может быть равным 0.");
		} else if (n == 1) {
			var sum = a + b;
			System.out.println("A + B = " + sum);
		} else if (n == 2) {
			var sum = a - b;
			System.out.println("A - B = " + sum);
		} else if (n == 3) {
			var sum = a * b;
			System.out.println("A * B = " + sum);
		} else if (n == 4) {
			var sum = a / b;
			System.out.println("A / B = " + sum);
		} 
					
		scan.close();	
	}

}
