package tests;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
    	String readPath = "Cat.txt";
    	String writePath = "Cat2.txt";
    	try (Scanner scan = new Scanner(System.in); FileInputStream inStream = new FileInputStream(readPath); 
    			FileOutputStream outStream = new FileOutputStream(writePath)) {
    		byte[] byteIn = inStream.readAllBytes();
    		byte[] byteOut = new byte[byteIn.length];
    		for(int i = 0; i < byteIn.length; i+=2) {
    			if(i <byteIn.length) {
    				byteOut[i] = byteIn[i+1];
    				byteOut[i+1] = byteIn[i];
    			} else byteOut[i] = byteIn[i];
    		}
    		outStream.write(byteOut);
    	} catch(IOException e) {
    		System.out.println("все упало");
    	}
    }
}

