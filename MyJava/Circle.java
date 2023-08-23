package myjava;

import java.util.Scanner;

class Circle {
    public static void main(String[] args) {

        String nam;
        double r, area, parameter;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        nam = input.nextLine();

        System.out.print("Radius of A Circle: ");
        r = input.nextDouble();


        input.close();

        area = 3.1416 * r * r;
        parameter = 2 * 3.1416 * r;

        System.out.println("Area of The Circle: " + area);
        System.out.println("And Parameter: " + parameter);

        System.out.println("Thanks " + nam);
        
    }
}
