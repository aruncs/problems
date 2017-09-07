public class BinarySearchTree{
	private Node root = null;

	public void insert(int value){
		this.root = this.insert(this.root,value);
	}

	private Node insert(Node node,int value){
		if(node == null){
			node = new Node(value);
		}else{
			if(value <= node.value){
				node.left = this.insert(node.left,value);
			}else{
				node.right = this.insert(node.right,value);
			}
		}
		return node;
	}
	public boolean search(int value){
		Node node = root;
		while(node != null){
			if(value == node.value){
				return true;
			}else if(value < node.value){
				node = node.left;
			}else{
				node = node.right;
			}
		}
		return false;
	}
	public boolean delete(){
		return false;
	}
	public Node getRoot(){
		return this.root;
	}
}
