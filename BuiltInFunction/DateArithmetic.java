package BuiltInFunction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date in format day month year");
        //taking input for date from user
        String date = sc.nextLine();

        //Define the format of date for the input and output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        //To parse user input in desired format
        LocalDate localDate = LocalDate.parse(date, formatter);

        //Adding 2 years and 1 month and 7 days and then subtracts 3 weeks from user input date
        localDate = localDate.plusYears(2).plusMonths(1).plusDays(7).minusWeeks(3);

        //Displaying the date after performing operation
        System.out.println(formatter.format(localDate));

    }

}
