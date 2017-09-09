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

	public boolean deleteNode(int value){
		Node node = this.root;
		Node previousNode = null;
		boolean found = false;
		boolean isLeft = false;
		while(node != null){
			previousNode = node;
			if(node.value == value){
				found = true;
				break;
			}else if(value <= node.value){
				node = node.left;
				isLeft = true;
			}else{
				node = node.right;
				isLeft = false;
			}
		}
		if(found){
			//Deleting the root node
			if(previousNode == node){
				if(node.right != null){
					Node temp = node.right;
					while(temp.left != null){
						temp = temp.left;
					}
					temp.left = node.left;
				}else{
					this.root = node.left;
				}
			}else{
			//Delete any other node.
				//There exists a Right subtree for the node to be deleted.
				Node leftSubtree = node.left;
				Node rightSubtree = node.right;
				if(rightSubtree != null){
					while(rightSubtree.left != null){
						rightSubtree = rightSubtree.left;
					}
					rightSubtree.left = leftSubtree;
					if(isLeft){
						previousNode.left = rightSubtree;
					}else{
						previousNode.right = rightSubtree;
					}
				}else{
					if(isLeft){
						previousNode.left = leftSubtree;
					}else{
						previousNode.right = leftSubtree;
					}
				}
			}
			return true;
		}
		return false;
	}

	public void traverseInOrder(Node root){
		if(root.left != null){
			traverseInOrder(root.left);
		}
		System.out.println(root.value);
		if(root.right != null){
			traverseInOrder(root.right);
		}
	}

	public void traversePreOrder(Node root){
		System.out.println(root.value);
		if(root.left != null){
			traverseInOrder(root.left);
		}
		if(root.right != null){
			traverseInOrder(root.right);
		}
	}

	public void traversePostOrder(Node root){
		if(root.left != null){
			traverseInOrder(root.left);
		}
		if(root.right != null){
			traverseInOrder(root.right);
		}
		System.out.println(root.value);
	}
}
