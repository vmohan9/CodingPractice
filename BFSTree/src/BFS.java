import java.util.*;

class Node{
	int data;
	Node left,right;
	Node(int d){
		data = d;
		left = right = null;
	}
}

public class BFS {

	Node root;
	void printBFS()
	{
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			Node temp = q.poll();
			System.out.print(temp.data);
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
		
	}
	
	void kDistance(Node r,int k){
		if(k==0 || r==null)
			return;
		else if(k==1)
		{
			System.out.print(r.data);
		}
		else{
			kDistance(r.left,k-1);
			kDistance(r.right,k-1);
		}
	}
	public static void main(String[] args){
		
		BFS tree = new BFS();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
	    tree.root.right = new Node(3);
	    tree.root.left.left = new Node(4);
	    tree.root.left.right = new Node(5);
	 
	    System.out.println("Level order traversal of binary tree is - ");
	    tree.printBFS();
	    System.out.println("k distance of binary tree is - ");
	    tree.kDistance(tree.root, 3);
	}
	
}
