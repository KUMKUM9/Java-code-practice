import java.util.Scanner;
class Fibonacci{
	public static void main(String[] argh){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int fn;
		int f1 = 1;
		int f2 = 1;
		int count = 1;
		while(count<=n2)
		{
			int currentValue;
			if(count == 1 || count ==2){
				currentValue = 1;
			}
			else{
				fn = f1+f2;
			    currentValue = fn;
				f1 = f2;
				f2 = fn;
			}
			
			if(count>=n1){
				System.out.print(currentValue+" ");
			}
			count++;
		}
		
	}
	
}