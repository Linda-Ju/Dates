package com.company;

import java.time.LocalDate;
import java.util.Date;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Date date = new Date(); // Date includes all the data surrounding that date.
        // including the day, month, year, timezone
        // while the localdate and localtime classes only show what is needed.


//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.of(8, 2, 9));
//        System.out.println(LocalTime.parse("10:15"));
//        System.out.println(LocalTime.now());
//        System.out.println(date);

//        System.out.println();
//
//        System.out.println("David went out at " + LocalTime.parse("10:15"));
//        System.out.println("David went out at " + date);
//
//        System.out.println();


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        System.out.println("The name entered by the user is " + name);

    }
}
