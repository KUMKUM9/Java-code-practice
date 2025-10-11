//Identical Trees
//given two binary trees with their root nodes root1 and root2 return true if both of them are identical otherwise false.
//TWO TREES ARE IDENTICAL WHEN THEY HAVE THE SAME DATA AND ARRANGEMENT OF DATA IS ALSO SAME. eg : [1,2,3,4] = root1 and root2 = [1,2,3,4]

class Node {
	int data;
	Node left,right;
	Node(int value){
		this.data = value;
		left = right = null;
	}
}
class Identical_Trees{
	boolean isIdentical(Node r1,Node r2){
		if(r1 == null && r2 == null){ 
			return true;
		}
	    if(r1 == null || r2 == null){ 
			return false;
		}
		return(r1.data == r2.data) && isIdentical(r1.left,r2.left) && isIdentical(r1.right,r2.right);
	}
    public static void main(String[] args){
		//tree1 = [1,2,3,4]
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		//tree2 = [1,2,3,4]
		Node root2 = new Node(1);
		root2.left = new Node(2);
		root2.right = new Node(3);
		root2.left.left = new Node(4);
		Identical_Trees trr = new Identical_Trees();
		boolean result = trr.isIdentical(root1,root2);
		System.out.println("Are the trees identical? "+result);
    }
}