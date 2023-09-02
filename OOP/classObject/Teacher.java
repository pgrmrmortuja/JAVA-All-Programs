package oop;
// Define a class called "Teacher"
class Teacher {
    // Declare instance variables (fields) for name, gender, and phone
    String name;
    String gender;
    int phone;

    // The main method is the entry point of the program
    public static void main(String[] args) {
        // Create an instance (object) of the Teacher class named "teacher1"
        Teacher teacher1 = new Teacher();

        // Assign values to the fields of the "teacher1" object
        teacher1.name = "Amin";
        teacher1.gender = "Male";
        teacher1.phone = 8801;

        // Access and print the information using the "teacher1" object
        System.out.println("Name: " + teacher1.name);
        System.out.println("Gender: " + teacher1.gender);
        System.out.println("Phone: " + teacher1.phone);

        // Create another instance (object) of the Teacher class named "teacher2"
        Teacher teacher2 = new Teacher();

        // Assign values to the fields of the "teacher2" object
        teacher2.name = "Amina";
        teacher2.gender = "Female";
        teacher2.phone = 88012;

        // Access and print the information using the "teacher2" object
        System.out.println("Name: " + teacher2.name);
        System.out.println("Gender: " + teacher2.gender);
        System.out.println("Phone: " + teacher2.phone);
    }
}
