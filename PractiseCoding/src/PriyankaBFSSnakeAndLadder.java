import java.util.LinkedList;
import java.util.Queue;

public class PriyankaBFSSnakeAndLadder {
	
	public static void main(String[] args) {
		//Constructing the ladder
		int N=30;
		int[] board=new int[N];
		for(int i=0;i<N;i++){
			board[i]=-1;
		}
		
		// Ladders
				board[2] = 21;
				board[4] = 7;
				board[10] = 25;
				board[19] = 28;

				// Snakes
				board[26] = 0;
				board[20] = 8;
				board[16] = 3;
				board[18] = 6;

				System.out.println("Minimum number of controlled dice throws are: "
						+ MinimumDiceThrows(board, N));
	}
	static class QueueEntry{
		int vertex;
		int distance;
	};
	
	private static int MinimumDiceThrows(int[] board, int n) {
		
		//
		QueueEntry s = new QueueEntry();
		s.vertex=0;
		s.distance=0;
		
		//
		boolean[] visited = new boolean[n];
		visited[0]=true;
		for(int i=0;i<n;i++){
			visited[i]=false;
		}
		
		//
		Queue<QueueEntry> q = new LinkedList<QueueEntry>();
		q.add(s);
		QueueEntry qe = new QueueEntry();
		
		//
		while(!q.isEmpty()){
			qe=q.peek();
			int vertex = qe.vertex;
			if(vertex==n-1){
				break;
			}
			q.remove();
			
			//
			for(int i=vertex+1;i<=(vertex+6) && i < n;++i){
				if(visited[i]==false){
				QueueEntry cell=new QueueEntry();
				cell.distance=qe.distance+1;
				visited[i]=true;
				if(board[i]!=-1){
					cell.vertex=board[i];
				}
				else
					cell.vertex=i;
				
				q.add(cell);
				}
			}
		}
		
		 return qe.distance;
	}

}
