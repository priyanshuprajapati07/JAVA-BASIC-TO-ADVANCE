
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        try (Scanner hh = new Scanner(System.in)
        /*
         * System.out.print("Enter size of an array :- ");
         * int size = sc.nextInt();
         * int[] arr = new int[size];
         * for (int i = 0; i < arr.length; i++) {
         * System.out.print("Enter value " + (i + 1) + " :- ");
         * arr[i] = sc.nextInt();
         * }
         * System.out.println("Your array values are :- ");
         * for (int i = 0; i < arr.length; i++) {
         * System.out.println("Your values are " + (i + 1) + " :- " + arr[i]);
         * }
         */ ) {
            System.out.print("Enter size of an array :- ");
            int sum = 0;
            int size = hh.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter value " + (i + 1) + " :- ");
                arr[i] = hh.nextInt();
            }
            System.out.println("Now go to sum of an array :- ");
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            System.out.println("Sum of an array value is :- " + sum);
        }
    }
}