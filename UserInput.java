import java.util.Scanner;

class UserInput {
  
    public static void main(String[] args) {
      
        String nam;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        nam = input.nextLine();

        input.close();

        System.out.println("\n\nThanks " + nam);
        
    }
}
