package oop;
// Define a class called "Teacher"
class Teacher {
    // Declare instance variables (fields) for name, gender, and phone
    String nam;
    String gender;
    int phone;

    // Constructor to initialize the object with provided values
    Teacher(String n, String gn, int ph) {
        // Assign the provided values to the fields
        nam = n;
        gender = gn;
        phone = ph;
    }

    // Method to display the information of the teacher
    void displayResult() {
        // Print the name, gender, and phone of the teacher
        System.out.println("Name: " + nam);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        // Create an instance (object) of the Teacher class named "teacher1"
        // Initialize it with provided values using the constructor
        Teacher teacher1 = new Teacher("Mahi", "Male", 8801);

        // Call the "displayResult" method to display the information of "teacher1"
        teacher1.displayResult();

        // Create another instance (object) of the Teacher class named "teacher2"
        // Initialize it with provided values using the constructor
        Teacher teacher2 = new Teacher("Maliha", "Female", 88021);

        // Call the "displayResult" method to display the information of "teacher2"
        teacher2.displayResult();
    }
}
