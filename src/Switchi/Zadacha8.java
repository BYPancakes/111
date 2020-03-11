package Switchi;

import java.util.Scanner;
public class Zadacha8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число 1-20");
		var х = scan.nextInt();
		
		switch(х) {
			case 1:
				System.out.println("Один");
				break;
			case 2:
				System.out.println("Два");
				break;
			case 3:
				System.out.println("Три");
				break;
			case 4:
				System.out.println("Четыре");
				break;
			case 5:
				System.out.println("Пять");
				break;
			case 6:
				System.out.println("Шесть");
				break;
			case 7:
				System.out.println("Семь");
				break;
			case 8:
				System.out.println("Восемь");
				break;
			case 9:
				System.out.println("Девять");
				break;
			case 10:
				System.out.println("Десять");
				break;
			case 11:
				System.out.println("Одинадцать");
				break;
			case 12:
				System.out.println("Двенадцать");
				break;
			case 13:
				System.out.println("Тренадцать");
				break;
			case 14:
				System.out.println("Четырнадцать");
				break;
			case 15:
				System.out.println("Пятнадцать");
				break;
			case 16:
				System.out.println("Шеснадцать");
				break;
			case 17:
				System.out.println("Семнадцать");
				break;
			case 18:
				System.out.println("Восемнадцать");
				break;
			case 19:
				System.out.println("Девятнадцать");
				break;
			case 20:
				System.out.println("Двадцать");
				break;
			default:
				System.out.println("Неверное число");
		}
		
		
		scan.close();	
	}

}