import java.util.Scanner;
class IncomeTaxCalculator{
	public static void main(String[] argh){
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextInt();
		double taxpayable;
		if(n1<=20000){
			taxpayable = 20000*0;
		}
		else if(n1<=40000){
			taxpayable = 20000*0+(n1-20000)*0.1;
		}
		else if(1<=60000){
			taxpayable = 20000*0+(20000)*0.1+(n1-40000)*0.2;
		}else{
			taxpayable = 20000*0+(20000)*0.1+(40000)*0.2+(n1-60000)*0.3;
		}
		System.out.print(taxpayable);
		
	}
	
}