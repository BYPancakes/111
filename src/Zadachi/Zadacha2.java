package Zadachi;

import java.util.Scanner;
public class Zadacha2 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("¬ведите номер года");
	var N = scan.nextInt();
	

	if (N % 4 == 0 && ! (N % 100 == 0 && N % 400 == 0)) {
		 System.out.println("ƒней в году 366, год €вл€етс€ высокосным ");
		 	
	} else {
		 System.out.println("ƒней в году 365, год €вл€етс€ обычным ");
		 
	}
	scan.close(); 

	}

}
