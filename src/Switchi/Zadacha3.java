package Switchi;

import java.util.Scanner;
public class Zadacha3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите одно из чисел: 12, 1, 2");
		var х = scan.nextInt();
		
		switch(х) {
			case 1:
				System.out.println("январь");
				break;
			case 2:
				System.out.println("‘евраль");
				break;
			case 12:
				System.out.println("ƒекабрь");
				break;
			default:
				System.out.println("ќшибка");
		}
		
		
		scan.close();	
	}

}