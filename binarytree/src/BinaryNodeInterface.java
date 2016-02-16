public interface BinaryNodeInterface<T> {
	
/** Retrieves the data portion of this node.
 * @return the object in the data portion of the node */
public T getData();

/** Sets the data portion of this node.
 * @param newData the data object */
public void setData(T newData);

/** Retrieves the left child of this node.
 * @return the node that is the node's left child */
public BinaryNodeInterface<T> getLeftChild();

/** Retrieves the right child of this node.
 * @return the node that is the node's right child */
public BinaryNodeInterface<T> getRightChild();

/** Sets this node's left child to a given node.
 * @param leftChild a node that will be the left child */
public void setLeftChild(BinaryNodeInterface<T> leftChild);

/** Sets this node's right child to a given node.
 * @param rightChild a node that will be the right child */
public void setRightChild(BinaryNodeInterface<T> rightChild);

/** Detects whether this node has a left child.
 * @return true if that node has a left child */
public boolean hasLeftChild();

/** Detects whether this node has right child.
 * @return true if that node has a right child */
public boolean hasRightChild();

/** Detects whether this node is a leaf.
 * @return true if that node is a left. */
public boolean isLeaf();

/**Counts the nodes in the subtree rooted at this node.
   @return the number of nodes in the subtree rooted at this node */
public int getNumberOfNodes();

/** Computes the height of the subtree rooted at this node
   @return the height of the subtree rooted at this node */
public int getHeight();
}
