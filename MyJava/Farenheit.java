package myjava;

import java.util.Scanner;

class Fahrenheit {
    public static void main(String[] args) {

        String nam;
        double cel, farh;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        nam = input.nextLine();

        System.out.print("Enter Celsius: ");
        cel = input.nextDouble();

        input.close();

        farh = 1.8 * cel + 32;
        System.out.println("Celsius to Fahrenheit is " + farh);

        System.out.println("\n\n Thanks " + nam);
    }
}
