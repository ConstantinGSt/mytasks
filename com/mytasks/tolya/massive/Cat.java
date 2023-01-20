package com.mytasks.tolya.massive;

import java.util.ArrayList;

public class Cat {
	String name;

	Cat(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		ArrayList<Cat> cats = new ArrayList<>();
		Cat thomas = new Cat("Томас");
		Cat behemoth = new Cat("Бегемот");
		Cat philipp = new Cat("Филипп Маркович");
		Cat pushok = new Cat("Пушок");

		cats.add(thomas);
		cats.add(behemoth);
		cats.add(philipp);
		cats.add(pushok);

		Cat secondCat = cats.get(1);

		System.out.println(secondCat);
	}
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        String[] products = {"Молоко", "Хлеб  ", "Пиво  "};
//	        int[] prices = {50, 14, 80};
//	        System.out.println("Список возможных товаров для покупки:");
//	        for (int i = 0; i < products.length; i++){
//	            System.out.println(i+1 + "." + products[i] + " " + prices[i] + " руб/шт");
//	        }
//
//	        int currentPrice = 0;
//	        int sumProducts = 0;
//	        int[] count = new int[3];
//	        int[] sumOfOneProduct = new int[3];
//	        int sumSumOfOneProduct = 0;
//	        while (true) {
//
//	            System.out.println("Введите номер товара и количество через пробел или введите end для выхода");
//
//	            String input = scanner.nextLine();
//	            if ("end".equals(input)) {
//	                break;
//	            }
//	            String[] parts = input.split(" ");
//	            int numb = Integer.parseInt(parts[0]) - 1;
//	            int cost = Integer.parseInt(parts[1]);
//	            currentPrice = prices[numb];
//	            count[numb] += cost;
//	            sumOfOneProduct[numb] += cost*currentPrice;
//	            sumProducts = sumProducts + cost*currentPrice;
//	            sumSumOfOneProduct = sumOfOneProduct[0] + sumOfOneProduct[1] + sumOfOneProduct[2];
//	        }
//
//	        System.out.println("Ваша корзина: ");
//	        System.out.println("Наименование товара  Количество  Цена за ед. Общая стоимость");
//	        for (int i = 0; i<count.length;i++) {
//	            if (count[i] > 0) {
//	                System.out.println(products[i] + 
//	                        "                     " +
//	                        count[i] +
//	                        "        " +
//	                        prices[i] +
//	                        "        " +
//	                        sumOfOneProduct[i] +
//	                        " руб.");
//	            }
//	        }
//	        System.out.println("Итого        " + sumSumOfOneProduct+ " руб.");
//	    }
}
