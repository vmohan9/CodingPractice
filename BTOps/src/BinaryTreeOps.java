class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data = data;
		left = right = null;
	}
}
public class BinaryTreeOps {
	Node root;
	
	private int calculateCount(Node root){
		if(root==null)return 0;
		return 1+calculateCount(root.left)+calculateCount(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeOps bt = new BinaryTreeOps();
		bt.root = new Node(1);
		bt.root.right = new Node(2);
		bt.root.left = new Node(3);
		bt.root.left.left = new Node(60);
		bt.root.right.right = new Node(4);
		System.out.println("Count:"+bt.calculateCount(bt.root));
	}

}
