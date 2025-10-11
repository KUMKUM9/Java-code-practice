class GCD{
	public static void main(String []arh){
		int n1 = 10;
		int n2 = 6;
		System.out.print(gcd(n1,n2));
	}
	public static int gcd(int n1,int n2){
		//normal form
		/*int remainder;
		while(n2>0){
			remainder = n1%n2;
			n1 = n2;
			n2 = remainder;
		}*/
		
		//recursion form 
		if(n2==0){
			return n1;
		}
		
		return gcd(n2,n1%n2);
	}
}