
public class Primitive {

    public static void main(String[] args) {
        // data type example :- 
        /*
        byte age = 21;
        int q = 234;
        long w = 123456789L;

        char grade  = 'A';
        String name = "Priyanshu";
        boolean passed = true;
         */
 /*
        byte n = 128; // they show error because byte are out of range byte range -128 to 127;
        byte n = 122;
        System.out.println(n);
         */
 /*
        Topic 3: Literals in Java
        1. What is a literal ?
        A literal is a fixed value written directly in the source code.
        int age = 19;
        double price = 99.50;
        char grade = 'A';
        boolean passed = true;
        String name = "Java";

        The literals here are 19, 99.50, 'A', true, and "Java".
         */

         // final keyword
        //  they are the use to constant a variable use beacuse the code maintain and clean 
        //  further programming programmer cannot reassigined the value 

          // Variables and primitive data types
        int age = 19;
        double marks = 81.80;
        char grade = 'A';
        boolean passed = true;

        // Reference type
        String name = "Priyanshu";

        // Constant variable
        final int MAX_MARKS = 100;

        // Display the values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + passed);
        System.out.println("Maximum Marks: " + MAX_MARKS);

        // Calculate percentage
        double percentage = (marks / MAX_MARKS) * 100;
        System.out.println("Percentage: " + percentage);
    }
}
