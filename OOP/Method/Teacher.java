package oop;

// Create a class called "Teacher"
class Teacher {
   // Declare instance variables for name, gender, and phone
   String nam, gender;
   int phone;

   // Method to display the information for a teacher
   void displayResult(){
      System.out.println("Name: " + nam);
      System.out.println("Gender: " + gender);
      System.out.println("Phone: " + phone);
      System.out.println("\n");
   }

   // The main method where execution starts
   public static void main(String[] args) { 
      // Create an instance of Teacher called teacher1
      Teacher teacher1 = new Teacher();
      
      // Set the name, gender, and phone for teacher1
      teacher1.nam = "Mahi";
      teacher1.gender = "Male";
      teacher1.phone = 8801;
      
      // Display the information for teacher1
      teacher1.displayResult();
      
      // Create another instance of Teacher called teacher2
      Teacher teacher2 = new Teacher();
       
      // Set the name, gender, and phone for teacher2
      teacher2.nam = "Maliha";
      teacher2.gender = "Female";
      teacher2.phone = 88021;
      
      // Display the information for teacher2
      teacher2.displayResult();
   }
}
