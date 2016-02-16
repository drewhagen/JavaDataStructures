public class BinaryNode<T>{

private T root;
private BinaryNode<T> left;
private BinaryNode<T> right;
	
public BinaryNode() {
	this(null);
}

public BinaryNode(T dataPortion)
{
	this(dataPortion, null, null);
}

public BinaryNode(T dataPortion, BinaryNode<T> leftChild, BinaryNode<T> rightChild)
{
	root = dataPortion;
	left = leftChild;
	right = rightChild;
}
/** Retrieves the data portion of this node.
 * @return the object in the data portion of the node */
public T getRoot() {
	return root;
}

/** Sets the data portion of this node.
 * @param newData the data object */
public void setData(T newRoot) {
	root = newRoot;
}

/** Retrieves the left child of this node.
 * @return the node that is the node's left child */
public BinaryNode <T> getLeftChild() {
	return left;
}

/** Retrieves the right child of this node.
 * @return the node that is the node's right child */
public BinaryNode<T> getRightChild() {
	return right;
}

/** Sets this node's left child to a given node.
 * @param leftChild a node that will be the left child */
public void setLeftChild(BinaryNode<T> leftChild) {
	left = (BinaryNode<T>)leftChild;
}

/** Sets this node's right child to a given node.
 * @param rightChild a node that will be the right child */
public void setRightChild(BinaryNode<T> rightChild){
	right = (BinaryNode<T>)rightChild;
}

/** Detects whether this node has a left child.
 * @return true if that node has a left child */
public boolean hasLeftChild() {
	return left != null;
}

/** Detects whether this node has right child.
 * @return true if that node has a right child */
public boolean hasRightChild() {
	return right != null;
}

/** Detects whether this node is a leaf.
 * @return true if that node is a left. */
public boolean isLeaf() {
	boolean result = false;
	if (left == null && right == null)
		result = true;
	return result;
}

/**Counts the nodes in the subtree rooted at this node.
   @return the number of nodes in the subtree rooted at this node */
public int getNumberOfNodes() {
	int leftNumber = 0;
	int rightNumber = 0;
	if (left != null)
		leftNumber = left.getNumberOfNodes();
	if (right != null)
		rightNumber = right.getNumberOfNodes();
	return 1 + leftNumber + rightNumber;
}

/** Computes the height of the subtree rooted at this node
   @return the height of the subtree rooted at this node */
public int getHeight() {
	return getHeight(this);
}

public int getHeight(BinaryNode<T> node) {
	int height = 0;
	if (node != null)
		height = 1 + Math.max(getHeight(node.left),
							  getHeight(node.right));
	return height;
}

}

