
public class weekendPractice {

    public static void main(String[] args) {
        // Declares variables for a student's name, age, marks, and grade.
        /*
        String name = "Priyanshu";
        int age = 20;
        final int marks = 99;
        char grade = 'A';
        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);
        System.out.println(grade);
         */
        // Declares a constant named MAX_MARKS using final.
        /*
        final int MAX_MARKS = 99;
        System.out.println(MAX_MARKS);
         */
        //  Calculates the student's percentage.
        /*
        int marks1 = 34;
        int marks2 = 35;
        int marks3 = 45;
        int summarks = (marks1+marks2+marks3);
        System.out.println("Sum of marks :- " + summarks);
        int percentage = (summarks)/3;
        System.out.println(percentage);
         */
        //  Prints whether the student passed, assuming passing marks are 40 out of 100.

        /*
        int marks = 60;
        if(marks>40){
            System.out.println("Passed");
        }else{
            System.out.println("Fail");
        }
         */
        //  Prints the last digit of the student's age using %.
        /*
        int age = 20;
        System.out.println(age%10);
         */
        //  Demonstrates one widening conversion and one explicit narrowing conversion.

        // widening conversion implicit typecatsing

        int age = 56;
        double n = age;
        System.out.println(n);

        // narrowing conversion / explicit typecasting

        double m = 34.367;
        int h = (int) m;
        System.out.println(m);
        System.out.println(h);
    }
}
