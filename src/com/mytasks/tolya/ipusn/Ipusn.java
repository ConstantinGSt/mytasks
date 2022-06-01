package com.mytasks.tolya.ipusn;

import java.util.Scanner;

public class Ipusn {
	static int income;
	static int expense;
	static String end;
	static int variant;
	public static void Menu() {
		System.out.println("Выберите операцию и введие ее номер:");
		System.out.println("1. Добавить новый доход");
		System.out.println("2. Добавить новый расход");
		System.out.println("3. Выбрать систему налогообложения");
		System.out.println("Пример: 1 <Enter>");
		System.out.println("Для прекращения работы в программе введите \"end\"");
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		do {
			Menu();
//			income = scan.nextInt();
//			expense = scan.nextInt();
			if(scan.hasNextInt()) {
				variant = scan.nextInt();
				if(variant == 1) {
					addIncome();
					break; 
				} else if(variant == 2) {
					addExpense();
					break;
				} else if(variant == 3) {
					taxSelection();
					break;
				}
			} else if (scan.hasNextLine()) {
				end = scan.nextLine();
			}
			
		} while ("end".equals(end) == false);
		 scan.close();
	}	
}
