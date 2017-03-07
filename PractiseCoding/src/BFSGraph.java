import java.util.Iterator;
import java.util.LinkedList;

	public class BFSGraph{
		private int V;//number of vertices
		private LinkedList<Integer> adj[];
		//int[] n = new int[5];
		//private LinkedList<Integer> n1[];
	
		
		public BFSGraph(int v){
			V=v;
		    adj = new LinkedList[v];
			for(int i=0;i<v;i++){
				adj[i]=new LinkedList();
			}
			
		}
		void addEdge(int v,int m){
			adj[v].add(m);
		}
		
		public void BFS(int s){
			boolean visited[] = new boolean[V];
			LinkedList<Integer> queue = new LinkedList<Integer>();
			queue.add(s);
			visited[s]=true;
			
			while(!queue.isEmpty()){
				s=queue.poll();
				System.out.println(s);
				Iterator<Integer> i = adj[s].listIterator();
				while(i.hasNext()){
					int t=i.next();
					if(!visited[t]){
						queue.add(t);
						visited[t]=true;
					}
				}
			}
		}
		
		
	
	public static void main(String args[]){
		BFSGraph g = new BFSGraph(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.BFS(2);
	}
}
