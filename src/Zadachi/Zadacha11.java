package Zadachi;

import java.util.Scanner;
public class Zadacha11 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Введите сторону света: 1 - север; 2 - запад; 3 - юг; 4 - восток");
	var c = scan.nextInt();
	System.out.println("Введите команду поворота: 1 = поворот на лево; -1 = поворот на право; 2 - поворот на 180");
	
	var N1 = scan.nextInt();
	var N2 = scan.nextInt();
	
	if (N1 > 2 || N1 < -1 || N2 > 2 || N2 < -1) {
		System.out.println("Команды не сущетвует.\nПовторите попытку");
	} else if (N1 == 1 && N2 == -1 || N1 == -1 && N2 == 1 || N1 == 2 && N2 == 2) {
		System.out.println("Вернулись в заданную сторону света");
	
	} else if (c == 1 && N1 == 2 && N2 == 1 || c == 1 && N1 == 1 && N2 == 2) {
		System.out.println("Запад");
	} else if (c == 1 && N1 == 1 && N2 == 1 || c == 1 && N1 == -1 && N2 == -1) {
		System.out.println("Юг");
	} else if (c == 1 && N1 == 2 && N2 == -1 || c == 1 && N1 == -1 && N2 == 2) {
		System.out.println("Восток");
		
		
	} else if (c == 2 && N1 == 2 && N2 == -1 || c == 2 && N1 == -1 && N2 == 2) {
		System.out.println("Север");
	} else if (c == 2 && N1 == 1 && N2 == 2 || c == 2 && N1 == 2 && N2 == 1) {
		System.out.println("Юг");
	} else if (c == 2 && N1 == 1 && N2 == 1 || c == 2 && N1 == -1 && N2 == -1) {
		System.out.println("Восток");
		
	} else if (c == 3 && N1 == 1 && N2 == 1 || c == 3 && N1 == -1 && N2 == -1) {
		System.out.println("Север");
	} else if (c == 3 && N1 == -1 && N2 == 2 || c == 3 && N1 == 2 && N2 == -1) {
		System.out.println("Запад");
	} else if (c == 3 && N1 == 2 && N2 == 1 || c == 3 && N1 == 1 && N2 == 2) {
		System.out.println("Восток");
		
	} else if (c == 4 && N1 == 1 && N2 == 2 || c == 4 && N1 == 2 && N2 == 1) {
		System.out.println("Север");
	} else if (c == 4 && N1 == 1 && N2 == 1 || c == 4 && N1 == -1 && N2 == -1) {
		System.out.println("Запад");
	} else if (c == 4 && N1 == 2 && N2 == -1 || c == 4 && N1 == -1 && N2 == 2) {
		System.out.println("Юг");

}
	scan.close();
}}