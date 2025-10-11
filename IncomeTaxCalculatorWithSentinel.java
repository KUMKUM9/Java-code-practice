import java.util.Scanner;
class IncomeTaxCalculatorWithSentinel{
	public static void main(String[] argh){
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
		final int sentinel = -1;
		double taxpayable=0;
		while(n1 != sentinel){
			
			if(n1<=20000){
			   taxpayable = 20000*0;
		    }
		    else if(n1<=40000){
			   taxpayable = 20000*0+(n1-20000)*0.1;
		    }
		    else if(n1<=60000){
			   taxpayable = 20000*0+(20000)*0.1+(n1-40000)*0.2;
		    }else{
			   taxpayable = 20000*0+(20000)*0.1+(40000)*0.2+(n1-60000)*0.3;
		    }
			
			System.out.printf("%.2f%n",taxpayable);
			
			n1 = sc.nextDouble();
			
		}
		System.out.print("exit");
		
	}
	
}