import java.util.Scanner;
class CheckerPattern{
	public static void main(String[] argh){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1;i<=n;i++){
			for(int j = 1;j<=n;j+=2){
				if(i%2==1){
					System.out.print("# ");
				}
				else{
					System.out.print(" #");
				}
			}
			System.out.println();
		}
	}
}