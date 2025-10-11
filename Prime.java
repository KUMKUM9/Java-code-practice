import java.util.Scanner;
class Prime{
	public static void main(String[] ahg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t;
		for(int i = 1;i<=n;i++){
			t = sc.nextInt();
			int count=0;
			for(int j = 2;j*j<=t;j++){
				/*if(t%j==0){
					System.out.println("Not Prime");
					break;
				}
				else{
					System.out.println("Prime");
					break;
				}*/
				if(t%j==0){
					count++;
					break;
				}
			}
			if(count == 0){
				System.out.println("Prime");
			}
			else{
				System.out.println("Not Prime");
			}
		}
	}
}