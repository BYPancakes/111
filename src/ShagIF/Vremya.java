package ShagIF;

import java.util.Scanner;
public class Vremya {

	public static void main(String[] args) {
		System.out.println("Введите время");
		Scanner scan = new Scanner(System.in);

		var t = scan.nextInt();
String s1 = " часа";
		if (t == 1 || t == 21) {


		if ((t > 21 && t < 25) && (t > 0 && t < 8)) {
			System.out.println("Вы ввели\nДоброй ночи" + t + s1);
		} else if (t > 8 && t < 18) {
			System.out.printf("Вы ввели %.2f часов\nДобрый день", t);
		} else {
			System.out.printf("Вы ввели %.2f часов\nДобрый вечер", t);
		}
		scan.close();
	}

}
