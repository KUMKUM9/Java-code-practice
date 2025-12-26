import java.util.Scanner;
public class PrintNto1 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printNto1(N);
    }
    public static void printNto1(int N){
        if(N==0) return;
        System.out.print(N+" ");
        printNto1(N-1);
    }
    
}
