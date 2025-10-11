//left view of the bst
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Node{
	int data;
	Node left,right;
	Node(int value){
		this.data = value;
		left = right = null;
	}
}
class Tree_Left_View{
	static ArrayList<Integer> leftView(Node root){
		ArrayList<Integer> result = new ArrayList<>();
		if(root == null){
			return result;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			int size = queue.size();//size = 1
			//traverse all nodes at that level
			for(int i = 0;i<size;i++){
				Node curr = queue.poll();//take out the node
				if(i==0){
					result.add(curr.data);
				}
				if(curr.left != null)queue.add(curr.left);
				if(curr.right != null)queue.add(curr.right);
			}
		}
		return result;
	}
	public static void main(String[] args){
		ArrayList<Integer> result;
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.right = new Node(5);
		result = leftView(root);
		System.out.println("left view of the tree:");
		for(int i : result){
			System.out.println(i);
		}
	}
}