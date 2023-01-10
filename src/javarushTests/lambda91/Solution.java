package javarushTests.lambda91;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {

	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");

//        Comparator<String> comparator = new Comparator<String>() {        	
//            public int compare (String obj1, String obj2) {
//                return obj1.length() - obj2.length();
//            }
//        };
        
        Comparator<String> comparator = (String obj1, String obj2) -> {
        	return obj2.length() - obj1.length();
        }; // ; - не обходима тк тут не только анонимный класс но и создание переменной
        
        Collections.sort(list, comparator);
        for(String sort: list) {
        System.out.println(sort);
        }
    }
}


