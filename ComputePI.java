class ComputePI{
	public static void main(String[] arh){
		double sum = 0.0;
		int MAX_DENOMINATOR = 1000;
		for(int deno = 1;deno<=1000;deno+=2){
			if(deno%4==1){
				sum += 1/deno;
		    }
		   else if(deno%4 == 3){
				sum -= 1/deno;
			}
			else{
				System.out.print("Impossible!!");
			}
		}
		System.out.print(4*sum);
		
	}
}