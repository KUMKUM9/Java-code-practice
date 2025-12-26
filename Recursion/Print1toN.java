import java.util.Scanner;
public class Print1toN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        print1toN(N);
    }
    public static void print1toN(int N){
        if(N==0) return;
        print1toN(N-1);
        System.out.print(N+" ");
        
    }

    
}
