package tests;

//package com.startjava.lesson_2_3_4.arraybase;

public class ArrayTheme {
    public static void main(String[] args) {
//        System.out.println("1. Реверс значений массива");
//        int[] ar1 = {1, 2, 3, 4, 5, 6, 7};
//        int[] ar2 = new int [7];
//        int z = ar2.length - 1 ;
//        int x = 0;
//        int sum = 1;
//        for(int i = 0; i < ar1.length; i++) {
//            System.out.println("ar1[" + i + "]" + " = " + ar1[i]);
//            ar2[z] = ar1[i];
//            z--;
//        }
//        for(int ar : ar2) {
//            System.out.println("ar2[" + x++ + "]" + " = " + ar);
//        }
//        System.out.println("");
//
//        System.out.println("2. Вывод произведения элементов массива");
//        int[] list = new int [10];
//        for(int i =0; i < list.length; i++) {
//            list[i] = i;
//            if(list[i] > 0 && list[i] < 9) {
//                sum *=list[i];
//            } 
//        } System.out.println("без учета первого и последнего индекса  = " + sum + " \n");
//
//        System.out.println("3. Удаление элементов массива");
//        double[] list3 = new double[15];
//        double[] list3_1 = new double[15];
//        for(int i=0; i < list3.length; i++) {
//            list3[i] = Math.random();
//            System.out.println(list3[i]);
//        }
//        System.out.println("Удаление всех больше индекс 7");
//        for(int i = 0; i < list3.length; i++) {
//            if(list3[i] > list3[7]) {
//                list3_1[i] = 0;
//            } else list3_1[i] = list3[i];
//        }
//        for(double q : list3_1) {
//            System.out.println(q);
//        } System.out.println("");

        System.out.println("4. Вывод элементов массива лесенкой в обратном порядке");
        int chars=0; 
        int arrayIndex=0;
        for(char i = 'A'; i <='Z' ; i++) { 
        	chars++;
        }
        char[] abc = new char[chars];
        for(char i = 'A'; i <='Z' ; i++) { 
            abc[arrayIndex] = i;
           System.out.println("abc[" + arrayIndex + "] = "+ abc[arrayIndex]);
            arrayIndex++;
        }
        System.out.print(abc[25]+"");
        for(int i = abc.length-2; i>=0; i--) {
        	int t = abc.length-1;
        	System.out.println("");
     			while(t >=0 && t > i-1) {
     				System.out.print(abc[t]);
      				t--;
     			} 
        } 
    }         
    
}