
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BinaryTree<String> treeB = new BinaryTree<String>("B");
BinaryTree<String> treeD = new BinaryTree<String>("D");
BinaryTree<String> treeE = new BinaryTree<String>("E");
BinaryTree<String> treeC = new BinaryTree<String>("C", treeD, treeE);
BinaryTree<String> treeA = new BinaryTree<String>("A", treeB, treeC);

System.out.println("--- isLeaf testing ---");
System.out.println(treeB.isLeaf());
System.out.println(treeD.isLeaf());
System.out.println(treeE.isLeaf());
System.out.println(treeC.isLeaf());
System.out.println(treeA.isLeaf());
System.out.println();

System.out.println("--- getHeight testing ---");
System.out.println(treeB.getHeight());
System.out.println(treeD.getHeight());
System.out.println(treeE.getHeight());
System.out.println(treeC.getHeight());
System.out.println(treeA.getHeight());
System.out.println();

System.out.println("--- getNumberOfNodes ---");
System.out.println(treeA.getNumberOfNodes());
System.out.println();






	}

}
