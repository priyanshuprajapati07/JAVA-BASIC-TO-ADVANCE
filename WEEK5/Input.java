
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array :- ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value " + (i + 1) + " :- ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array values are :- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Your values are " + (i + 1) + " :- " + arr[i]);
        }
    }
}