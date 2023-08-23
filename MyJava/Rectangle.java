package myjava;

import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {

        String nam;
        double l,w,area,parameter;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        nam = input.nextLine();

        System.out.print("Length: ");
        l = input.nextDouble();

        System.out.print("Width: ");
        w = input.nextDouble();


        input.close();

        area = l * w;
        parameter = 2 * (l + w);

        System.out.println("Area of The Rectangle: " + area);
        System.out.println("And Parameter: " + parameter);

        System.out.println("\n\nThanks " + nam);
      
    }
}
