import java.util.Scanner;
public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = printSum(N);
        System.out.print(result);
    }
    public static int printSum(int N){
        if(N==1) return 1;
        return N+printSum(N-1);
    }    
}
