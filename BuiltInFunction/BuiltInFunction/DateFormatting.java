package BuiltInFunction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Date in Local Computer
        LocalDate today = LocalDate.now();

        //Define the format of date like 01/01/2025
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //Define the format of date like 2025-01-01
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //Define the format of date like Wed, Jan 01, 2025
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        //Display date like 01/01/2025
        System.out.println("Current date is : "+ formatter1.format(today));

        //Display date like 2025-01-01
        System.out.println("Current date is : "+ formatter2.format(today));

        //Display date like Wed, Jan 01, 2025
        System.out.println("Current date is : "+ formatter3.format(today));

    }
}
