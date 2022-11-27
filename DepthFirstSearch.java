public class DepthFirstSearch {       
		private int nodesTraversed;
		private int lTreeHeight;
		private int rTreeHeight;
		
		public DepthFirstSearch() {   
			lTreeHeight = 0;
			rTreeHeight = 0;
			nodesTraversed = 0;
			System.out.println("Call DFS with root node to do a Depth First Search.");
		}
		
        public void DFS(Node node){
        	if( node != null ) {
        		nodesTraversed++;
        		visit(node);
        		DFS(node.getlChild());
        		DFS(node.getrChild());
        	}
        }
        
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
        
        public int treeHeight(Node node) {
        	if (node == null) {
        		return 0;
        	}
        	lTreeHeight = treeHeight(node.getlChild());
        	rTreeHeight = treeHeight(node.getrChild());
        	return Math.max(lTreeHeight, rTreeHeight) +1;
        }
        
        public int visit(Node node) {
        	node.setVisited(true);
        	System.out.print(node.getData() + "  ");
        	return node.getData();
        }
        
		public int getNumTraversed() {
			return nodesTraversed;
		}
		public void setNumTraversed(int nodesTraversed) {
			this.nodesTraversed = nodesTraversed;
		}

}