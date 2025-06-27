package BuiltInFunction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input for the date
        System.out.println("Enter first date : ");
        String firstDate = sc.nextLine();
        System.out.println("Enter second date : ");
        String secondDate = sc.nextLine();

        //Defining the format of date as dd/MM/yyyy
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        //To change user input in format
        LocalDate first = LocalDate.parse(firstDate, formatter);
        LocalDate second = LocalDate.parse(secondDate, formatter);

        //Checking is first date is comes before after or equal to the second date
        if(first.isBefore(second)) {
            System.out.println(formatter.format(first)+" is before "+formatter.format(second));
        }
        else if(first.isAfter(second)) {
            System.out.println(formatter.format(first)+" is after "+formatter.format(second));
        }
        else {
            System.out.println(formatter.format(first)+" is equal to "+formatter.format(second));
        }
    }
}
