import java.util.*;
public class Array_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] arr = new int[5];
        //int [] arr = new int [8];
        int j = arr.length-1;
        int temp = 0;
        System.out.println("Enter the numbers:");
        for (int i = 0; i<=arr.length-1; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i<=arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }

        //Even though if you have odd number of array length the code will not change , only remember to reverse from index 0 to mid index.

        System.out.println("______________________");
        for (int n : arr){
            System.out.println(n);
        }
    }
    
}
