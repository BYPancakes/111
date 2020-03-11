package Zadachi;

import java.util.Scanner;

public class Zadacha8 {


public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Введите номер элемента треугольника 1 - катет; 2 - гиппотинуза; 3 = высота; 4 - площадь");
	var N = scan.nextInt();
	if (N > 4 || N <= 0) {
		System.out.printf("Введен не верный номер элемента");
	} else {
		System.out.println("Введите значение элемента");
	var x = scan.nextFloat();

	if (N == 1) {
		float a = x;
		float c = (float) Math.sqrt(a * a * 2);
		float h = c / 2;
		float s = c * h / 2;
		System.out.printf("Катет равен %f\nГиппотенуза равна %f\nВысота равна %f\nПлощадь равна %f", a, c, h, s);

	} else if (N == 2) {
		float c = x;	
		float a = (float) Math.sqrt((x / 2) * (x / 2) * 2);
		float h = x / 2;
		float s = x * h / 2;
		System.out.printf("Катет равен %f\nГиппотенуза равна %f\nВысота равна %f\nПлощадь равна %f", a, c, h, s);

	} else if (N == 3) {
		float h = x;
		float с = (float) (x * 2);
		float a = (float) Math.sqrt((x / 2) * (x / 2) * 2);
		float s = (float) (с * x / 2);
		System.out.printf("Катет равен %f\nГиппотенуза равна %f\nВысота равна %f\nПлощадь равна %f", a, с, h, s);

	} else if (N == 4) {
		float s = x;
		float a = (float) Math.sqrt(2 * s);
		float с = (float) Math.sqrt(a * a * 2);
		float h = (float) (с / 2);
		System.out.printf("Катет равен %f\nГиппотенуза равна %f\nВысота равна %f\nПлощадь равна %f", a, с, h, s);

	}

	scan.close();

	}

}}
