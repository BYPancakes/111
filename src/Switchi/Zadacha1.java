package Switchi;

import java.util.Scanner;
public class Zadacha1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число 1-4");
		var х = scan.nextInt();
		
		switch(х) {
			case 1:
				System.out.println("Зима");
				break;
			case 2:
				System.out.println("Весна");
				break;
			case 3:
				System.out.println("Лето");
				break;
			case 4:
				System.out.println("Осень");
				break;
			default:
				System.out.println("Не верное число");
		}
		
		
		scan.close();	
	}

}