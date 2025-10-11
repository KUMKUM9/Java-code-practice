import java.util.Scanner;
class PrimePrint{
	public static void main(String[] ahg){
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		/*for(int i = start;i<=end;i++){
			int count=0;
			if(i<2)continue;
			for(int j = 2;j*j<=i;j++){
				
				if(i%j==0){
					count++;
					break;
				}
			}
			if(count == 0){
				System.out.print(i);
			}
			 
		}*/
		//using true and false while solving the problem
		
		for(int i = start;i<=end;i++){
			
			if(i<2)continue;
			boolean isPrime = true;
			for(int j = 2;j*j<=i;j++){
				
				if(i%j==0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				System.out.print(i);
			}
			 
		}
	}
}