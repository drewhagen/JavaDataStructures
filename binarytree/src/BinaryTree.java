
public class BinaryTree <T> extends BinaryNode <T> {

private BinaryNode <T> root;
private BinaryTree leftTree, rightTree;

public BinaryTree() {
	root = null;
}

public BinaryTree(T rootData) {
	root = new BinaryNode<T>(rootData);
}

public BinaryTree(T rootData, BinaryTree leftChild, BinaryTree rightChild) {
	privateSetTree(rootData, leftTree, rightTree);
}
	
public void setTree(T rootData)
{
	root = new BinaryNode<T>(rootData);
}

public void setTree(T rootData, BinaryTree leftTree, BinaryTree rightTree) {
	privateSetTree(rootData, (BinaryTree)leftTree, (BinaryTree)rightTree);
}

public void setRoot(BinaryNode<T> root) {
	this.root = root;
}

private void privateSetTree(T rootData, BinaryTree leftOak, BinaryTree rightOak)
{
	root = new BinaryNode<T>(rootData);
	if ((leftOak != null) && !leftOak.isEmpty())
		leftTree = new BinaryTree(leftOak);
	if ((rightTree != null) && !rightTree.isEmpty())
		rightTree = new BinaryTree(rightOak);
}
private boolean isEmpty() {
	boolean result = false;
	if (root == null)
		result = true;
	return result;
}

public boolean isLeaf()
{
	return root.isLeaf();
}

public int getHeight() {
	return root.getHeight();
}

public int getNumberOfNodes() {
	return root.getNumberOfNodes();
}

public static void preOrderPrint(BinaryTree tree)
{
	if (tree != null)
	{
		System.out.print(tree.root + " ");
		preOrderPrint(tree.leftTree);
		preOrderPrint(tree.rightTree);
		
	}
}

/*public static void inOrderPrint(BinaryTree tree)
{
	if (tree != null)
	{
		inOrderPrint(tree.leftTree);
		System.out.print(tree.root + " ");
		inOrderPrint(tree.rightTree);
	}
}*/

public static void postOrderPrint(BinaryTree tree)
{
	if (tree != null)
	{
		postOrderPrint(tree.leftTree);
		postOrderPrint(tree.rightTree);
		System.out.print(tree.getRoot() + " ");
	}
}

@Override
public String toString() {
	return "(" + root.getLeftChild() + "), " + root + ", (" + root.getRightChild()
			+ ")";
	}
	 
}



