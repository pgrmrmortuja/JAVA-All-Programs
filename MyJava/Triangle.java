package myjava;

import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {

        String nam;
        double b, h, a, area, parameter;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        nam = input.nextLine();

        System.out.print("Base: ");
        b = input.nextDouble();

        System.out.print("Height: ");
        h = input.nextDouble();

        System.out.print("And Other Side: ");
        a = input.nextDouble();

        input.close();

        area = 0.5 * b * h;
        parameter = b + h + a;

        System.out.println("Area of The Triangle: " + area);
        System.out.println("And Parameter: " + parameter);

        System.out.println("\n\nThanks " + nam);
        
    }
}
