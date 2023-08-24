package myjava;

import java.util.Scanner;

 class IncrementDecrement
 {
   public static void main(String[] args)
   { 
    
    String nam;
    int x,y;
    
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter Your Name: ");
    nam = input.nextLine();
    
    System.out.print("Enter A Value for x: ");
    x = input.nextInt();
    
    input.close();
    
    y = ++x;
    System.out.println("++x = "+y);
    
    y = --x;
    System.out.println("--x = "+y);
    
    y = x++;
    System.out.println("x++ = "+y);
    
    y = x--;
    System.out.println("x-- = "+y);
    
    y = x;
    System.out.println("x = "+y);
    
    
    System.out.println("\n\nThanks "+nam);
    
   }
 }
