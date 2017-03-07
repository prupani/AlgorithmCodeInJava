
public class rotateMatrix {

	public static int[][] rotateMatrixfn(int[][] matrix, int n){
		for(int layer=0;layer<n/2;layer++){
			int first=layer;
			int last=n-1-layer;
			for(int i=first;i<last;++i){
				int offset=i-first;
				int top = matrix[first][i];
				matrix[first][i]=matrix[last-offset][first];
				matrix[last-offset][first]=matrix[last][last-offset];
				matrix[last][last-offset]=matrix[i][last];
				matrix[i][last]=top;
			}
		}
		return matrix;
		
	}
	@SuppressWarnings("null")
	public static void main(String[] args) {
		int[][] matrix=new int[3][3];
		matrix[0][0]=1;
		matrix[0][1]=2;
		matrix[0][2]=3;
		matrix[1][0]=4;
		matrix[1][1]=5;
		matrix[1][2]=6;
		matrix[2][0]=7;
		matrix[2][1]=8;
		matrix[2][2]=9;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println(matrix[i][j]);	
			}
		}
		System.out.println();
		System.out.println();
		int[][] test = rotateMatrixfn(matrix,3);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println(test[i][j]);
			}
		}

	}

}
