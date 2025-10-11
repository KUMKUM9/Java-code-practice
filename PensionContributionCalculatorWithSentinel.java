import java.util.Scanner;
class PensionContributionCalculatorWithSentinel{
	public static void main(String[] argh){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the monthly salary:");
		double n1 = sc.nextDouble();
		final int sentinel = -1;
		double contribution=0;
		while(n1 != sentinel){
			
			System.out.print("Enter the age:");
			int age = sc.nextInt();
			
			//System.out.println();
			System.out.print("Enter the emplyContri:");
			double emplyContri = sc.nextDouble();
			
			//System.out.println();
			System.out.print("Enter the emplyContri2:");
			double emplyContri2 = sc.nextDouble();
			
			//System.out.println();
			System.out.print("the total contribution is:");
			double sum = emplyContri+emplyContri2;
			System.out.println(sum);
			
			System.out.print("enter the monthly salary:");
			n1 = sc.nextDouble();
			
		}
		System.out.print("exit");
		
	}
	
}