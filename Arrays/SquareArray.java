import java.util.Scanner;
import java.util.Arrays;
public class SquareArray {
    public static void main(String[] aStrings){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();  
        }
        int[] result = squareArray(arr);
        //as java can't print the arrays directly so it prints it's address location instead of the content in it 
        // so Arrays.toString() converts arrays into a readable string
        System.out.print(Arrays.toString(result));

    }
    public static int[] squareArray(int[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=arr[i]*arr[i];
        }
        return arr1;
    }
}
