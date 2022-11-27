/**
 * Node with two left and right pointer.
 * Stores integer data.
 * Used in binary tree.
 * @author Nathan Johnson, Bellarmine University
 *
 */
public class Node {
	private int data;
	private Node lChild;
	private Node rChild;
	
	/**
	 * Initializes a default node.
	 * @param data Data to store in node
	 */
	public Node(int data)
	{
		lChild=null;
		rChild=null;
		this.data=data;
	}
	
	/**
	 * Get the data stored in the node
	 * @return data in the node
	 */
	public int getData() {
		return data;
	}
	/**
	 * Set the data in the node
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * Get the left node child
	 * @return the lChild of current node
	 */
	public Node getlChild() {
		return lChild;
	}
	/**
	 * Set the left node child
	 * @param lChild value to set as left child
	 */
	public void setlChild(Node lChild) {
		this.lChild = lChild;
	}
	/**
	 * Get the right node child
	 * @return the rChild of current node
	 */
	public Node getrChild() {
		return rChild;
	}
	/**
	 * Set the right node child
	 * @param rChild value to set as right child
	 */
	public void setrChild(Node rChild) {
		this.rChild = rChild;
	}
	
}