import java.util.Scanner;
import java.util.ArrayList;
class TwoSum{
	public static void main(String[] argh){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i< n;i++){
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0;i<n;i++){
			for(int j = i+1;j<n;j++){
				if(arr[i]+arr[j]==target){
					list.add(i);
					list.add(j);
					break;
				}
				
			}
	
		}
		System.out.print(list);
		/*for(int i = 0;i<list.length;i++){
			System.out.print(list[i]);
		}*/
	}
}