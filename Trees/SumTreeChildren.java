class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class SumTreeChildren {
    public boolean isSumProperty(Node root) {
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        
        int leftVal = (root.left != null)? root.left.data: 0;
        int rightVal = (root.right != null)? root.right.data: 0;
        
        return (root.data == leftVal + rightVal) && isSumProperty(root.left) && isSumProperty(root.right);
        
    }
	public static void main(String[] arh){
		Node root = new Node(3);
		root.left = new Node(2);
		root.right = new Node(1);
		Solution s = new Solution();
		boolean b = s.isSumProperty(root);
		System.out.print(b);
		
	}
}