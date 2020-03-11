package Switchi;

import java.util.Scanner;
public class Zadacha5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите сумму");
		var res = scan.nextInt();
		
		switch(res) {
			case 1:
				System.out.printf(+ res + " рубль");
				break;
				
			case 2: 
			case 3: 
			case 4: 
			case 5: 
			case 6: 
			case 7: 
			case 8: 
			case 9: 
				System.out.printf(+ res + " рубля");
				break;
				
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
				System.out.printf(+ res + " рублей");
				break;
		
				default:
					System.out.printf("Не верная сумма");
					
		}
		
		scan.close();	
	}

}