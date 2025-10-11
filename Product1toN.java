class Product1toN{
	public static void main(String[] args){
		int lowerBound = 1;
		int upperBound = 10;
		float product = 1;
		for(int i = lowerBound;i<=upperBound;i++){
			product *= i;
		}
		
		System.out.print(product);
	}
}