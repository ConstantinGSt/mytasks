package tests;

import java.util.ArrayList;

public class Solution {

	 public static ArrayList<Integer> numbers = new ArrayList<Integer>();

	    public static void main(String[] args) {
	        init();
	        print();

	        reverse();
	        print();
	    }

	    public static void init() {
	        for (int i = 0; i < 10; i++) {
	            numbers.add(i, i);
	        }
	    }

	    public static void reverse() {
	        int n = numbers.size() - 1;
	        for (int i = 0; i < numbers.size(); i++) {
	            int temp = numbers.get(i);
	            numbers.add(i, numbers.get(n - i));
	            numbers.set(n - i, temp);
	        }
	    }

	    private static void print() {
	        for (int number : numbers) {
	            System.out.println(number);
	        }
	    }
	}

