import java.util.ArrayList;
class Solution {
	public static void main(String[] argsh){
		int[] a = {3,2,4,4,2};
		int[] b = {2,3,2,7};
		System.out.println(commonElements(a,b));
	}
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // Your code here
        ArrayList<Integer> sortedElement = new ArrayList<>();
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<b.length;j++){
                if(a[i]==b[j]){
                    sortedElement.add(a[i]);
					break;
                }
            }
        }
        for(int i = 0;i<sortedElement.size();i++){
			for(int j = i+1;j<sortedElement.size();j++){
				if(sortedElement.get(i)>sortedElement.get(j)){
					int temp = sortedElement.get(i);
					sortedElement.set(i,sortedElement.get(j));
					sortedElement.set(j,temp);
				}
            }
        }
        return sortedElement;
    }
}