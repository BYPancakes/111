package Zad_RazvAlg;

import java.util.Scanner;

public class Zadacha6 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("������� ����� �����");
			var x = scan.nextInt();
			if (x < 0 && x % 2 == 0) {
				System.out.println("������� ������������� ������ �����");			
			} else if (x < 0 && x % 2 != 0) {
				System.out.println("������� ������������� �������� �����");
			} else if (x == 0) {
				System.out.println("������� ������� �����");
			} else if (x > 0 && x % 2 != 0) {
				System.out.println("������� ������������� �������� �����");
			} else if (x > 0 && x % 2 == 0) {
				System.out.println("������� ������������� ������ �����");
			}

				scan.close();
		}

	}
