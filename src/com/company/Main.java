package com.company;


import java.text.MessageFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//input

        Scanner scan = new Scanner(System.in);
        boolean result = true;
        double temp;
        double windSpeed;
        double windChill;
        double celsious;
        double average = 0;
        int count = 0;
        double total = 0;
//Printed header from different Method
        System.out.println(header());
//collect user Input


//calculate windchill
        while (result) {


            System.out.println("Enter a Tempreture in Fanreheit :");
            temp = scan.nextDouble();
            scan.nextLine();
            System.out.println("Enter a windSpeed: ");
            windSpeed = scan.nextDouble();
            scan.nextLine();
//user input calculate the windChill
            windChill = 35.74 + 0.6251 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);

            //print out result
            System.out.println("Wind Chill is:" + windChill);
// user input            //
            celsious = (temp - 32) * (5 / 9.0);
//print out result  by formating the tempreture to fanreheit and celciout
            System.out.printf("tem in fanreheitis %f temp in celsious is %f", temp, celsious);
            //calculating total
            total = total + temp;

//getting the number times you enter the tempreture
            count++;
//finding average
            average = total / count;
            // print out result for total count with print formating number of time and average
            System.out.println(total);
            System.out.printf("You have Entered %d Temperatures\n", count);
            System.out.println(average);
//ask yes no question with boolean
            System.out.println("Do you want to know more tempreture? (y/n)");
//letting you answer yes or no
            String answer = scan.nextLine();
//if statement true precess will repeat
            if (answer.equals("y")) {
                result = true;
//in statement is not true exit the process(end the loop)

            } else {
                result = false;
                System.out.println("no");

            }

        }
//printed footer from different method
        System.out.println(footer());

    }
//Header class added

    public static String header() {

        return "Welcome to the wind Chill Calculation";


    }

    //footer class added
    public static String footer() {
        return "Good Bye";


    }
}




