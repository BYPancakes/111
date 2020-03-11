package Switchi;

import java.util.Scanner;
public class Zadacha12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число от -10 до 10");
		var x = scan.nextInt();
		
		switch(x) {
			case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
				System.out.println(+ x + " - больше 0");
				break;
			case -1: case -2: case -3: case -4: case -5: case -6: case -7: case -8: case -9: case -10:
				System.out.println(+ x +" - меньше 0");
				break;
			case 0:
				System.out.println(+ x +" - равно 0");
				break;
			
			default:
				System.out.println("Неверное число");
		}
		
		
		scan.close();	
	}

}