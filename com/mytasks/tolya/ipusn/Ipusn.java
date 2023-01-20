package com.mytasks.tolya.ipusn;

import java.util.Scanner;

public class Ipusn {
	static int allIncome;
	static int usn1;
	static int allExpense;
	static int usn2;
	static String end;
	static int variant;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		do {
			Menu();
			if (scan.hasNextInt()) {
				variant = scan.nextInt();
				if (variant == 1) {
					addIncome(scan.nextInt());
				} else if (variant == 2) {
					addExpense(scan.nextInt());
				} else if (variant == 3) {
					taxSelection();
				}
			} else if (scan.hasNextLine()) {
				end = scan.nextLine();
			}

		} while ("end".equals(end) != true);
		scan.close();
	}

	public static void Menu() {
		System.out.println("Выберите операцию и введие ее номер:");
		System.out.println("1. Добавить новый доход");
		System.out.println("2. Добавить новый расход");
		System.out.println("3. Выбрать систему налогообложения");
		System.out.println("Пример: 1 <Enter>");
		System.out.println("Для прекращения работы в программе введите \"end\"");
	}

	public static void addIncome(int income) {
		System.out.print("Добавьте новый доход");
		allIncome += income;
	}

	public static void addExpense(int expense) {
		System.out.print("Добавьте новый расход");
		allExpense += expense;
	}

	public static void taxSelection() {
		if ((allIncome * 6 / 100) >= 0) {
			usn1 = allIncome * 6 / 100;
		} else
			usn1 = 0;
		if ((allIncome - allExpense) * 15 / 100 >= 0) {
			usn2 = (allIncome - allExpense) * 15 / 100;
		} else
			usn2 = 0;
		if (usn1 < usn2) {
			System.out.println("Мы советуем вам УСН доходы");
			System.out.println("Ваш налог составит: " + usn1 + " рублей");
			int economy = usn2 - usn1;
			System.out.println("Налог на другой системе: " + usn2 + " рублей");
			System.out.println("Экономия: " + economy + " рублей");
		} else if (usn2 < usn1) {
			System.out.println("Мы советуем вам УСН доходы минус расходы");
			System.out.println("Ваш налог составит: " + usn2 + " рублей");
			int economy = usn1 - usn2;
			System.out.println("Налог на другой системе: " + usn1 + " рублей");
			System.out.println("Экономия: " + economy + " рублей\n");
		} else if (usn1 == usn2) {
			System.out.println("Налог равен по любой системе налогообложения. Ваш налог составит: " + usn1 + " рублей");
		}
	}
}
