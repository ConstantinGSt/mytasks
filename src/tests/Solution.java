package tests;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
    	String readPath = "Cat.txt";
    	File file = new File("Cat2.txt");
        file.createNewFile();
    	String writePath = "Cat2.txt";
    	try (Scanner scan = new Scanner(System.in); FileInputStream inStream = new FileInputStream(readPath); 
    			FileOutputStream outStream = new FileOutputStream(writePath)) {
    		//StringBuilder str;
    		byte[] byteIn = inStream.readAllBytes();
    		int[] byteOut = new int[byteIn.length];
    		StringBuilder str = null;
    		for(int i = 0; i < byteIn.length; i++) {
    			byteOut[i] = (int) byteIn[i];
    		}
    		outStream.write(byteOut).getBytes(StandardCharsets.UTF_8);
    	} catch(IOException e) {
    		System.out.println("все упало");
    	}
    }
}

