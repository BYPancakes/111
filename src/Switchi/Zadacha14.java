package Switchi;

import java.util.Scanner;
public class Zadacha14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите № дня недели 1-7");
		var х = scan.nextInt();
		
		switch(х) {
			case 1: case 2: case 3: case 4: case 5:
 				System.out.println( + х + " - рабочй день");
				break;
			case 6:
				System.out.println( + х + " - суббота");
				break;
			case 7:
				System.out.println( + х + " - воскресенье");
				break;
			
			default:
				System.out.println("Неверное число");
		}
		
		
		scan.close();	
	}

}