package Zadachi;

import java.util.Scanner;

public class Zadacha4 {

	public static void main(String[] args) {
		System.out.println("Введите данные квадратного уравнения");
		var skan = new Scanner(System.in);
		var a = skan.nextFloat();
		var b = skan.nextFloat();
		var c = skan.nextFloat();
		var D = (float) b * b - 4 * a * c;
		var x1 = (-b + Math.sqrt(D)) / (2 * a);
		var x2 = (-b - Math.sqrt(D)) / (2 * a);

		if (a == 0) {
			System.out.println("А не должно равняться нулю, введите другие данные");			
		} else if (a != 0 && D > 0) {
						
		System.out.printf("Уравнение имеет два различных вещественных корня\nx1 = %.4f\nx2 = %.4f", x1, x2);
	
		} else if (a != 0 && D == 0) {

		System.out.println("Оба корня вещественны\nx1 = " + x1 + "\nx2 = " + x2);
		
		} else if (a != 0 && D < 0) {
			System.out.println("Оба корня являются комплексными числами");
			
		}
		
		skan.close();	

	}

}
