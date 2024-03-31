import java.util.*;

public class Array_1 {
    public static void main(String[] args) {
        // Add numbers to array.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        // Populating the array with the entered number
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing the array elements
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
