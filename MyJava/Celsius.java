package myjava;

import java.util.Scanner;

class Celsius {
    public static void main(String[] args) {

        String nam;
        double farh, cel;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        nam = input.nextLine();

        System.out.print("Enter Fahrenheit: ");
        farh = input.nextDouble();

        input.close();

        cel = 0.56 * farh - 32;
        System.out.println("Fahrenheit to Celsius is " + cel);

        System.out.println("\n\n Thanks " + nam);
    }
}
