import java.util.Scanner;
class AverageWithInputValidation {
	public static void main(String[] ars){
		Scanner sc = new Scanner(System.in);
		int numberofstudent = sc.nextInt();
		int s1,s2,s3;
		int i = 0;
		while(true){
			s1 = sc.nextInt();
			if(s1>=0 || s1<=100){
				break;
			}
			System.out.println("Invalid try again");
		}
		while(true){
			s2 = sc.nextInt();
			if(s2>=0 || s2<=100){
				break;
			}
			System.out.println("Invalid try again");
		}
		while(true){
			s3 = sc.nextInt();
			if(s3>=0 || s3<=100){
				break;
			}
			System.out.println("Invalid try again");
		}
		
		double average = (s1+s2+s3)/(double)numberofstudent;
		System.out.printf("%.2f",average);
	}
}