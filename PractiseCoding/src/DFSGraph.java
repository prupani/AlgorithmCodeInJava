import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DFSGraph {

	private int V;
	private LinkedList<Integer> adj[];
	public DFSGraph(int v) {
		V=v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++){
			adj[i]=new LinkedList();
		}
	}
	public void addEdge(int v, int m){
		adj[v].add(m);
	}
	
	public void DFS(int v){
		boolean[] visited = new boolean[V];
		DFSUtil(v,visited);
	}
	
	public void DFSUtil(int v,boolean visited[]){
		visited[v]=true;
		System.out.println(v+" "); 
		Iterator<Integer> itr = adj[v].listIterator();
		while(itr.hasNext()){
			int n = itr.next();
			
			if(!visited[n]){
				DFSUtil(n,visited);
			}
		}
	}
	
public void DFSIterative(int n){
		
		boolean[] visited = new boolean[V];
		
		for (int i = 0; i < V; i++)
        if (!visited[i]){
        	DFSIterativeUTIL(n,visited);
        }
		
		
	}
	
	public void DFSIterativeUTIL(int n, boolean []visited){
		
		 Stack st = new Stack();
		 st.push(n);
		 
		 while(!st.isEmpty()){
			  int v = (int) st.pop();
			  if(!visited[v]){
				  System.out.println(v + " ");
				  visited[v] = true;
			  }
					Iterator<Integer> i = adj[v].listIterator();
					
					while(i.hasNext()){
						 int s = i.next();
						 if (!visited[s]){
							 st.push(s);
						 }
						 
			  }
		 }
	}

	public static void main(String[] args) {
		DFSGraph g = new DFSGraph(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Depth First Traversal "+
                           "(starting from vertex 2)");
 
        g.DFSIterative(2);

	}

}
