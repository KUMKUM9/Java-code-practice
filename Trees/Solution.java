class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class Solution {
    public static int checkSumTree(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return root.data;
        }
        int leftSum = checkSumTree(root.left);
        int rightSum = checkSumTree(root.right);
        
        //if either subtree is not a tree, then whole tree fails, return -1
        if(leftSum == -1 || rightSum == -1){
            return -1;
        }
        if(root.data != leftSum + rightSum){
            return -1;
        }
        return root.data + leftSum + rightSum;
    }
    public static boolean isSumTree(Node root) {
        return checkSumTree(root) != -1;
        
    }
	public static void main(String args[]){
		
		int[] arr = {1,2,3,4,5};
		if(isSumTree(root)){
			System.out.print("true");
		}
		else {
			System.out.print("false");
		}
	}
}