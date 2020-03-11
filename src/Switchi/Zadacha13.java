package Switchi;

import java.util.Scanner;
public class Zadacha13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число № месяца 1-12");
		var х = scan.nextInt();
		
		switch(х) {
			case 1:
				System.out.println("В январе 31 день");
				break;
			case 2:
				System.out.println("В феврале 29 или 31 день");
				break;
			case 3:
				System.out.println("В марте 31 день");
				break;
			case 4:
				System.out.println("В апреле 30 дней");
				break;
			case 5:
				System.out.println("В мае 31 день");
				break;
			case 6:
				System.out.println("В июне 30 дней");
				break;
			case 7:
				System.out.println("В июле 31 день");
				break;
			case 8:
				System.out.println("В августе 31 день");
				break;
			case 9:
				System.out.println("В сентябре 30 дней");
				break;
			case 10:
				System.out.println("В октябре 31 день");
				break;
			case 11:
				System.out.println("В ноябре 30 дней");
				break;
			case 12:
				System.out.println("В декабре 31 день");
				break;
			
			default:
				System.out.println("Ошибка ввода");
		}
		
		
		scan.close();	
	}

}