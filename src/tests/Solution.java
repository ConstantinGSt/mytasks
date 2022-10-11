package tests;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	
	public static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(56, 45, 89, 1, 45, 13, 4, 69, 11, -89));

    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nОтсортированные числа в натуральном порядке:");
        print();
    }

    public static void sort() {
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
    }

    public static void print() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }
}


//	 public static ArrayList<Integer> numbers = new ArrayList<Integer>();
//
//	    public static void main(String[] args) {
//	        init();
//	        print();
//
//	        reverse();
//	        print();
//	    }
//
//	    public static void init() {
//	        for (int i = 0; i < 10; i++) {
//	            numbers.add(i, i);
//	        }
//	    }
//
//	    public static void reverse() {
//	        int n = numbers.size() - 1;
//	        for (int i = 0; i < numbers.size() / 2; i++) {
//	            int temp = numbers.get(i);
//	            numbers.set(i, numbers.get(n - i));
//	            numbers.set(n - i, temp);
//	        }
//	    }
//
//	    private static void print() {
//	        for (int number : numbers) {
//	            System.out.println(number);
//	        }
//	    }
//	}

