import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Queue;
import java.util.LinkedList;
class Node{
	int data;
	Node left,right;
	Node(int value){
		this.data = value;
		left = right = null;
	}
}
class Bottom_View{
	static ArrayList<Integer> BottomView(Node root){
		ArrayList<Integer> result = new ArrayList<>();
		if(root == null){
			return result;
		}
		//create a TreeMap to store the hd value and root value
		TreeMap<Integer, Integer> map = new TreeMap<>();
		//queue
		Queue<Node>queue = new LinkedList<>();
		//add root node to the queue
		root.hd = 0;
		queue.add(root);
		while(!queue.isEmpty()){
			Node curr = queue.poll();
			int hd = curr.hd;
			map.put(hd,curr.data);
			
			if(curr.left != null){
				curr.left.hd = hd-1;
				queue.add(curr.left);
			}
			if(curr.right != null){
				curr.right.hd = hd+1;
				queue.add(curr.right);
			}
			
		}
		for(int val : map.values()){
			result.add(val);
		}
		return result;
	}
	static class NodewithHD{
		Node node;
		int hd;
		NodewithHD(Node node,int val){
			this.node = node;
			this.hd = hd;
		}
	}
	public static void main(String[] args){
		ArrayList<Integer> result;
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(60);
		root.right.left = new Node(90);
		root.right.right = new Node(100);
		
		result = BottomView(root);
		System.out.println("Top view of the tree:");
		for(int i : result){
			System.out.printf("%5d",i);
		}
	}
}