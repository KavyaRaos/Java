public class Array_3 {
    public static void main(String[] args) {
        int [] [] arr = new int [9][10];
        for(int i = 2; i<= 10; i++){
            for (int j = 1; j<=10; j++){
                arr[i-2] [j-1] = i*j;
            }
        }
        for(int [] x: arr){
            for(int y : x){
                System.out.print(y +" ");
            }
            System.out.print("\n");
        }
    }
    
}
