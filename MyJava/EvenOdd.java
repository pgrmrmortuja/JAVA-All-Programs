package myjava;

import java.util.Scanner;

 class EvenOdd
 {
   public static void main(String[] args)
   {
    
    String name;
    int num;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter Your Name: ");
    name = input.nextLine();
    
    System.out.println("Enter Any Number: ");
    num = input.nextInt();
    
    input.close();
    
    if(num % 2 == 0){
      System.out.println("This Number is Even.");
      
    } else{
      System.out.println("This Number is Odd");
    }
    
    
    System.out.println("\n\nThanks "+name);
    
   
   }
 }
