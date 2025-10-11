class ReverseInt{
	public static void main(String []arh){
		int n = 123;
		System.out.print(reverse(n));
	}
	public static int reverse(int n){
		int rem;
		int rev = 0;
		while(n>0){
			rem = n%10;
			rev = (rev*10) + rem;
			n = n/10;
		}
		return rev;
	}
}