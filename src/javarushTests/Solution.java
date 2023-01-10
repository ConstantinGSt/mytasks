package javarushTests;


import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.LocalDate;
import java.time.LocalDateTime;

/* 
Распаковка исключений
*/

public class Solution {


    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM-dd-yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse("February-23-2019", dtf);
        System.out.println(date);
        
    }
}
