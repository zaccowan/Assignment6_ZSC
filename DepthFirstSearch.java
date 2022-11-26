public class DepthFirstSearch {       
       Node root;
       public DepthFirstSearch()
       {               
    	   System.out.println("Call DFS with root node to do a Depth First Search.");
       }
        public void DFS(Node node){
        	if( node != null ) {
        		visit(node);
        		DFS(node.getlChild());
        		DFS(node.getrChild());
        	}

        }
        
        public int visit(Node node) {
        	node.setVisited(true);
        	System.out.print(node.getData() + "  ");
        	return node.getData();
        }

}