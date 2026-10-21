
import java.util.Scanner;


public class example {

    public static void main(String[] args) {
        // Now the concept about loop
        /*
        for (int i = 1; i <= 7; i++) {
            System.out.println("Hello Priyanshu");
        }
         */
 /*
1. for loop

Used when the number of repetitions is known or naturally controlled by a counter.

Example: Print numbers from 1 to 10.




2. while loop

Used when repetition depends on a condition and the number of repetitions may not be known in advance.

Example: Keep asking for a password until it is correct.




3. do-while loop

Executes its body at least once before checking the condition.

Example: Display a menu at least once.
         */

        // to print even natural number 
        /*
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
         */
        // sum of number 
        /*
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
         */
        // use of while loop
        /*
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
         */
        // happy coding
        /* 
         int i = 7;
         while(i>=1){
            System.out.println(i);
            i--;
         }
         System.out.println("Happy Coding");
         */
        // do while loop 
        Scanner sc = new Scanner(System.in);
        /*
        int choice;
        do{
            System.out.println("1. Say Hello");
            System.out.println("2. Exit");
            System.out.print("Enter Your Choice :- ");

            choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Hello");
            }
        }while(choice != 2);{
            System.out.println("Program ended");
            sc.close();
        }
             */

             
    }
}
