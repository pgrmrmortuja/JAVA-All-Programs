import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Your Gender (M/F): ");
        char gender = scanner.next().charAt(0);
        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your Height (in feet and inches, separated by a space): ");
        double feet = scanner.nextDouble();
        double inches = scanner.nextDouble();
        System.out.print("Enter Your Weight (in kg): ");
        double weight = scanner.nextDouble();

        // Calculate BMI
        double heightInMeters = ((feet * 12) + inches) * 0.0254;
        double bmi;

        // Calculate BMI differently for male and female
        if (gender == 'M' || gender == 'm') {
            bmi = weight / (heightInMeters * heightInMeters);
        } else if (gender == 'F' || gender == 'f') {
            bmi = 0.82 * (weight / (heightInMeters * heightInMeters));
        } else {
            System.out.println("Invalid gender input. Please enter M or F.");
            return;
        }

        // BMI Position
        String bmiPosition;
        if (bmi < 18.5) {
            bmiPosition = "Underweight";
        } else if (bmi <= 24.9) {
            bmiPosition = "Normal weight";
        } else if (bmi <= 29.9) {
            bmiPosition = "Overweight";
        } else {
            bmiPosition = "Obesity";
        }

        // Output
        System.out.println("\nBMI Calculation for " + name + ":");
        System.out.println("\nYour BMI: " + bmi);
        System.out.println("Your Position: " + bmiPosition);
        System.out.println("\nWishing You for Good Health and Happiness. \nThanks! "+name);
    }
}
