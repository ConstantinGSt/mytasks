package com.mytasks.tolya.ipusn;

import java.util.Scanner;

public class Ipusn {
	static int allIncome;
	//static int income;
	static int allExpense;
	//static int expense;
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
	public static void addIncome(int income) {
		allIncome = + income;
	}
	public static void addExpense(int expense) {
		allExpense = + expense;
	}
	public static void taxSelection(int allEncome, int allExpense) {
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		public static int addIncome(int income) {
//			income = scan.nextInt();
//			return allIncome = allIncome + income;
//		}		
		do {
			Menu();
//			income = scan.nextInt();
//			expense = scan.nextInt();
			if(scan.hasNextInt()) {
				variant = scan.nextInt();
				if(variant == 1) {
					addIncome(scan.nextInt());
					break; 
				} else if(variant == 2) {
					addExpense(scan.nextInt());
					break;
				} else if(variant == 3) {
					
					break;
				}
			} else if (scan.hasNextLine()) {
				end = scan.nextLine();
			}
			
		} while ("end".equals(end) != true);
		 scan.close();
	}	
	
}
