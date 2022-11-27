/**
 * Class to do preorder depth first searches on trees.
 * @author Zac Cowan
 * @version 11/24/2022
 * Fall/2022
 */
public class DepthFirstSearch {       
		private int nodesTraversed;
		private int lTreeHeight;
		private int rTreeHeight;
		
		/**
		 * Initializes searching object with tree details set to zero.
		 */
		public DepthFirstSearch() {   
			lTreeHeight = 0;
			rTreeHeight = 0;
			nodesTraversed = 0;
		}
		
        /**
         * Traverses the tree using preorder depth first search.
         * Visits the nodes accordingly.
         * @param node Root to search from
         */
        public void DFS(Node node){
        	if( node != null ) {
        		nodesTraversed++;
        		visit(node);
        		DFS(node.getlChild());
        		DFS(node.getrChild());
        	}
        }
        
        /**
         * Does depth first search on tree.
         * Prints node data in order of visiting.
         * Prints the height of the tree.
         * Prints the number of nodes traversed.
         * @param node Root to print data of.
         */
        public void printTreeData(Node node) {
        	nodesTraversed = 0;
        	lTreeHeight = 0; 
        	rTreeHeight = 0;
        	System.out.println("\n\nTree Details:");
        	System.out.println("Preorder depth-first search of tree:");
        	DFS(node);
        	System.out.println( "\nNumber Of Nodes Traversed: " + getNumTraversed() );
        	System.out.println("Tree Height: " + treeHeight(node));
        }
        
        /**
         * Calculates tree height
         * @param node Root to calculate height from.
         * @return integer representation of tree height
         */
        public int treeHeight(Node node) {
        	if (node == null) {
        		return 0;
        	}
        	lTreeHeight = treeHeight(node.getlChild());
        	rTreeHeight = treeHeight(node.getrChild());
        	return Math.max(lTreeHeight, rTreeHeight) +1;
        }
        
        /**
         * Operations to perform when a node is visited in DFS.
         * Prints the data of the node and returns it.
         * @param node Node to visit
         * @return data stored in node
         */
        public int visit(Node node) {
        	System.out.print(node.getData() + "  ");
        	return node.getData();
        }
        
		/**
		 * Get the number of nodes traversed during DFS
		 * @return int number of nodes traversed
		 */
		public int getNumTraversed() {
			return nodesTraversed;
		}

}