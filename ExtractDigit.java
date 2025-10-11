import java.util.Scanner;
class ExtractDigit{
	public static void main(String[] argh){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int rev = 0;
		while(n1>0){
			int rem = n1%10;
			rev = rev*10+rem;
			n1 /=10;
		}
		System.out.print(rev);
		
	}
	
}