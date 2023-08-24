package myjava;

import java.util.Scanner;

 class VowelConsonant
 {
   public static void main(String[] args)
   {
    
    String name;
    char letter;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter Your Name: ");
    name = input.nextLine();
    
    System.out.println("Enter Any Letter: ");
    letter = input.next().charAt(0);
    
    input.close();
    
    if(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
      System.out.println("This is Vowel.");
      
    } else{
      System.out.println("This is Consonant");
    }
    
    
    System.out.println("\n\nThanks "+name);
    
   
   }
 }
