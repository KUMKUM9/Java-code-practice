import java.util.Scanner;
class SalesTaxDecision{
	public static void main(String[] argh){
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
		final int sentinel = -1;
		double taxpayable=0;
		double total_n1 = 0;
		double total_actual_tax = 0;
		double total_sales_tax = 0;
		while(n1 != sentinel){
			
			double saleswithdeci = n1*0.007;
			int sales_tax = (int) saleswithdeci;
			double actual_tax = n1-sales_tax;
			
			System.out.print("actual tax:%.2f",actual_tax);
			System.out.print("sales_tax:%.2f",sales_tax);
			
			total_actual_tax += actual_tax;
			total_n1 += n1;
			total_sales_tax += sales_tax;
			
			n1 = sc.nextDouble();
			
		}
		System.out.print("exit");
		
	}
	
}