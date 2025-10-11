import java.util.Scanner;
class InputValidation{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		boolean isValid = false;
		int number;
		do{
			number = sc.nextInt();
			if((number>=0 && number<=10)||(number>=90 && number<=100)){
				isValid = true;
			}else{
				System.out.println("Invalid try again");
			}
			
		}while(!isValid);
	}
}