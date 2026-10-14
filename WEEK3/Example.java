
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        // scanner function importants
        Scanner sc = new Scanner(System.in);
        /*
        System.out.print("Enter your name :- ");
        String name = sc.nextLine();
        System.out.print("Enter your age :- ");
        int age = sc.nextInt();
        System.out.print("Enter your Course :- ");
        sc.nextLine();
        String course = sc.nextLine();

        System.out.println("-----This is Your Information-------");
        System.out.println("Your Name :- " + name);
        System.out.println("Your Age :- " + age);
        System.out.println("Your Course :- " + course);
         */
        // Enter Your marks 
        /*
        System.out.print("Enter Your Marks (0-100):- ");
        int marks = sc.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Input");
        } else if (marks >= 90) {
            System.out.println("Grade - A");
        } else if (marks >= 80) {
            System.out.println("Grade - B+");
        } else if (marks >= 70) {
            System.out.println("Grade - B");
        } else if (marks >= 60) {
            System.out.println("Grade - C");
        } else if (marks > 50) {
            System.out.println("Need to Improve");
        } else {
            System.out.println("Fail");
        }
        sc.close();
         */
        // to check driving licence
        /*
        System.out.print("Enter your Age :- ");
        int age = sc.nextInt();
        System.out.print("Enter Your DL Present or not (YES or NO) :- ");
        sc.nextLine();
        String dl = sc.nextLine();
        if(dl == "YES" && age >=18){
            System.out.println("You can Drive");
        }else{
            System.out.println("You cannot Drive");
        }
        sc.close();;
         */
        // password check 
        /*
        System.out.print("Enter your username :- ");
        String username = sc.nextLine();
        System.out.print("Enter Your password :- ");
        int password = sc.nextInt();
        String username1 = "priyanshu";
        int password1 = 12345;
        if (username.equals(username1) && password == password1) {
            System.out.println("User Logged Successfully");
        } else if (password != password1 && !username.equals(username1)) {
            System.out.println("User:- password and username is Wrong");
        } else if (password != password1 && username.equals(username1)) {
            System.out.println("Password is Wrong");
        } else {
            System.out.println("Username is Wrong");
        }
        sc.close();
         */
    }
}
