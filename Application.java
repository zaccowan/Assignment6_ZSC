/**
 * Class to create binary tree and test DepthFirstSearch
 * @author Zac Cowan
 * @author Nathan Johnson, Bellarmine University
 * @version 11/24/2022
 * Fall/2022
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree = new Tree();//Creates a tree with root
		Node root = aTree.generatePracticeTree(4);
		DepthFirstSearch aSearch=new DepthFirstSearch();
		
		
		aSearch.DFS(root);
		aSearch.printTreeData(root);
	}

}