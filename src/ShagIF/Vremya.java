package ShagIF;

import java.util.Scanner;
public class Vremya {

	public static void main(String[] args) {
		System.out.println("������� �����");
		Scanner scan = new Scanner(System.in);

		var t = scan.nextInt();
String s1 = " ����";
		if (t == 1 || t == 21) {


		if ((t > 21 && t < 25) && (t > 0 && t < 8)) {
			System.out.println("�� �����\n������ ����" + t + s1);
		} else if (t > 8 && t < 18) {
			System.out.printf("�� ����� %.2f �����\n������ ����", t);
		} else {
			System.out.printf("�� ����� %.2f �����\n������ �����", t);
		}
		scan.close();
	}

}
