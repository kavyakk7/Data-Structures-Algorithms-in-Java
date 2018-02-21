package Tree;


public class BinaryTree {
	Node root;
	
	private class Node {
		int value;
		Node left;
		Node right;
		
		Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	/*	
		Node(int value, Node left, Node right) {
			
		}	*/
	}
	
	void addNode(int value) {
		root = insertNode(this.root, value);
	}
	
	Node insertNode(Node root, int value) {
		if(root==null) {
			root = new Node(value);
			return root;
		}
		if(value > root.value) {
			root.right = insertNode(root.right, value);
		}
		else if(value < root.value) {
			root.left = insertNode(root.left, value);;
		}
		return root;
	}
	
	void display() {
		Inorder(this.root);
	}
	
	void Inorder(Node root) {
		if(root != null) {
			Inorder(root.left);
			System.out.println(root.value);
			Inorder(root.right);
		}
	}
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.addNode(5);
		bt.addNode(4);
		bt.addNode(6);
		bt.display();
	}
}
