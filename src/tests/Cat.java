﻿package tests;

import java.util.ArrayList;
public class Cat{
	String name;
	Cat(String name) {
		this.name=name;
	}
	
	public static void main(String[] args) {
		FileAnalyzer test = new FileAnalyzer(55, 10);
		String path = "D:\\repository\\mytasks";
		test.createReport(path, "log.txt");
		
//		ArrayList<Cat> cats = new ArrayList<>();
//	    Cat thomas = new Cat("Томас");
//	    Cat behemoth = new Cat("Бегемот");
//	    Cat philipp = new Cat("Филипп Маркович");
//	    Cat pushok = new Cat("Пушок");
//	
//	    cats.add(thomas);
//	    cats.add(behemoth);
//	    cats.add(philipp);
//	    cats.add(pushok);
//	
//	    Cat secondCat = cats.get(0);
//	
//	   System.out.println(secondCat);
	
//	String letters = "abcdef";
//	System.out.println(letters.length());
//	System.out.println(letters.charAt(3));
//	System.out.println(letters.charAt(6));
		}

}
