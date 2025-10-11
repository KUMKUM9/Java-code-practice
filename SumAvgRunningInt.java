class SumAvgRunningInt{
	public static void main(String[] args){
		int lowerBound = 1;
		int upperBound = 100;
		float sum = 0;
		for(int i = lowerBound;i<=upperBound;i++){
			sum += i;
		}
		float average = sum/(upperBound-lowerBound+1);
		System.out.print(sum + "\n" + average);
	}
}