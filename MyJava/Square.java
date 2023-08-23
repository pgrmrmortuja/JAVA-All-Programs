Package myjaba;

import java.util.Scanner;

class Square {
    public static void main(String[] args) {

        String nam;
        double s, area, parameter;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        nam = input.nextLine();

        System.out.print("Length of One Side: ");
        s = input.nextDouble();

        input.close();

        area = s * s;
        parameter = 4 * s;

        System.out.println("Area of The Square: " + area);
        System.out.println("And Parameter: " + parameter);

        System.out.println("Thanks " + nam);
        
    }
}
