package Zad_RazvAlg;

import java.util.Scanner;

public class Zadacha1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.println("Введите температуту и шкалу: 1 - шкала по Цельсию; 2 - шкала по Фарингейту");
	var t = scan.nextInt();
	var h = scan.nextInt();
	if (h < 1 || h > 2) {
		System.out.println("Введена не верный № шкалы");
	} else if (h == 1) {
		var res = (t * 1.8) + 32;
		System.out.println("Температура по фарингейту = " + res + "f");
	} else if (h == 2) {
		var res = (t - 32) / 1.8;
		System.out.println("Температура по цельсию = " + res + "C");
	}
	scan.close();
	}

}
