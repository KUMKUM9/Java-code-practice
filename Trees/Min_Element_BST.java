//Minimum cost of tree 
class Node{
	int data;
	Node left,right;
	Node(int value){
		this.data = value;
		left = right = null;
	}
}
class Min_Element_BST{
	int minValue(Node root){
		if(root==null){
			return -1;
		}
		while(root.left != null){
			root = root.left;
		}
		return root.data;
	}
	public static Node insert(Node root,int val){
		if(root == null)
			return new Node(val);
		if(val<root.data)
			root.left = insert(root.left,val);
		else if(val>root.data)
			root.right = insert(root.right,val);
		return root;
	}
	public static void main(String[] args){
		int[] arr1 = {5,4,6,3,7,1};
		Node root = null;
		for(int val:arr1){
			root = insert(root,val);
		}
		Min_Element_BST sol = new Min_Element_BST();
		System.out.print("the minimum value in the tree is :" + sol.minValue(root));
	}
}