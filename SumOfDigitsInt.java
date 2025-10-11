import java.util.Scanner;
class SumOfDigitsInt{
	public static void main(String []arh){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;

		while(num>0){
			int res = num%10;
			sum += res;
			num = num/10;
		}
		System.out.print(sum);
	}
}