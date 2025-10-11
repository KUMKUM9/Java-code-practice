import java.util.Scanner;
class MinMaxValue{
	public static void main(String[] argh){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		//int maxValue = Math.max(n1,Math.max(n2,n3));
		//int minValue = Math.min(n1,Math.min(n2,n3));
		
		//bigger value
		if(n1>n2 && n1>n3){
			System.out.print(n1);
		}
		else if(n2>n1 && n2>n3){
			System.out.print(n2);
		}
		else{
			System.out.print(n3);
		}
		System.out.print(" ");
		//smaller value
		if(n1<n2 && n1<n3){
			System.out.print(n1);
		}
		else if(n2<n1 && n2<n3){
			System.out.print(n2);
		}
		else{
			System.out.print(n3);
		}
		
		//System.out.print(maxValue+" "+minValue);
		
	}
	
}