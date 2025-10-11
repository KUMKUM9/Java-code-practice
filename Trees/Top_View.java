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
class Top_View{
	static ArrayList<Integer> TopView(Node root){
		ArrayList<Integer> result = new ArrayList<>();
		if(root == null){
			return result;
		}
		//create a TreeMap to store the hd value and root value
		TreeMap<Integer, Integer> map = new TreeMap<>();
		//queue
		Queue<NodewithHD>queue = new LinkedList<>();
		//add root node to the queue
		queue.offer(new NodewithHD(root,0));
		while(!queue.isEmpty()){
			NodewithHD current = queue.poll();
			
			Node node = current.node;
			int hd = current.hd;
			if(!map.containsKey(hd)){
				map.put(hd,node.data);
			}
			if(node.left != null){
				queue.offer(new NodewithHD(node.left,hd-1));
			}
			if(node.right != null){
				queue.offer(new NodewithHD(node.right,hd+1));
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
		result = TopView(root);
		System.out.println("Top view of the tree:");
		for(int i : result){
			System.out.printf("%5d",i);
		}
	}
}