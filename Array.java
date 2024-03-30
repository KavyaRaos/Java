import java.util.*;
public class Array {
    public static void main(String[] args) {
        
        /* Multiplication table */
        Scanner sc = new Scanner (System.in);
        int [] arr = new int[10];
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        /* Enhanched for loop method */
        for(int i = 1; i <= 10; i++){
            arr[i-1]  = num * i;
        }
        System.out.println("--------------------------");
        for (int n : arr){
            System.out.println(n);
        }
    }
}