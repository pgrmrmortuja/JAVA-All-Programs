package oop;

// Create a class called "Teacher"
class Teacher {
   // Declare instance variables for name, gender, and phone
   String nam, gender;
   int phone;

   // Method to set the information for a teacher
   void setInformation(String n, String gn, int ph){
      // Set the instance variables using the provided values
      nam = n;
      gender = gn;
      phone = ph;
   }

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
      
      // Set the information for teacher1
      teacher1.setInformation("Mahi", "Male", 8801);
      
      // Display the information for teacher1
      teacher1.displayResult();
      
      // Create another instance of Teacher called teacher2
      Teacher teacher2 = new Teacher();
       
      // Set the information for teacher2
      teacher2.setInformation("Maliha", "Female", 88021);
      
      // Display the information for teacher2
      teacher2.displayResult();
   }
}
