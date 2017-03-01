class Node{
	Node left,right;
	int data;
	Node(int d){
		data = d;
		left = null;
		right = null;
	}
	
}
public class BST {
	private Node root;
	public Node build(int[] a, int s, int e){
		if(s>e)
			return null;
		int mid = (s+e)/2;
		Node node = new Node(a[mid]);
		node.left = build(a,s,mid-1);
		node.right = build(a,mid+1,e);
		return node;
	}
	
	public void preOrder(Node root){
		if(root==null)return;
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		BST ob = new BST();
		ob.root = ob.build(a,0,a.length-1);
		ob.preOrder(ob.root);
	}

}
