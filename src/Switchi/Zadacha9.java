package Switchi;

import java.util.Scanner;
public class Zadacha9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите № месяца 3-5");
		var х = scan.nextInt();
		
		switch(х) {
			case 3:
				System.out.println("Март");
				break;
			case 4:
				System.out.println("Апрель");
				break;
			case 5:
				System.out.println("Май");
				break;
			
			default:
				System.out.println("Неверное число");
		}
		
		
		scan.close();	
	}

}