package Switchi;

import java.util.Scanner;
public class Zadacha7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите № месяца 1-12");
		var х = scan.nextInt();
		
		switch(х) {
			case 1:
				System.out.println("Январь");
				break;
			case 2:
				System.out.println("Февраль");
				break;
			case 3:
				System.out.println("Март");
				break;
			case 4:
				System.out.println("Апрель");
				break;
			case 5:
				System.out.println("Май");
				break;
			case 6:
				System.out.println("Июнь");
				break;
			case 7:
				System.out.println("Июль");
				break;
			case 8:
				System.out.println("Август");
				break;
			case 9:
				System.out.println("Сентябрь");
				break;
			case 10:
				System.out.println("Октябрь");
			case 11:
				System.out.println("Ноябрь");
			case 12:
				System.out.println("Декабрь");
				break;
			default:
				System.out.println("Нет такого месяца");
		}
		
		
		scan.close();	
	}

}