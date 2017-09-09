public class BinarySearchTreeRunner{

	public static void main(String[] args){

		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(10);
		tree.insert(5);
		tree.insert(11);
		System.out.println("Found 10" + tree.search(10));
		System.out.println("Found 11" + tree.search(11));
		System.out.println("Found 5" + tree.search(5));
		System.out.println("Found 6" + tree.search(6));

		// System.out.println("Deleted 14 " + tree.deleteNode(14));
		// System.out.println("Deleted 10 " + tree.deleteNode(10));
		// System.out.println("Deleted 11 " + tree.deleteNode(11));
		// System.out.println("Deleted 5 " + tree.deleteNode(5));

		System.out.println("In Order Traversal :");
		tree.traverseInOrder(tree.getRoot());
		System.out.println("Root Node " + tree.getRoot());
	}
}
