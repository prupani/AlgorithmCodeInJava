
public class matrixRowColumnZero {

	
	public static void matrixZero(int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		for(int i =0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					row[i]=true;
					column[j]=true;
				}
				System.out.print(matrix[i][j]);
			}
		}
		System.out.println();
		System.out.println();
		for(int i =0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(row[i] || column[j]){
					matrix[i][j]=0;
				}
				
			}
		}
		for(int i =0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]);
			}
		}
	}
	public static void main(String[] args) {
		int[][] matrix=new int[3][3];
		matrix[0][0]=1;
		matrix[0][1]=2;
		matrix[0][2]=3;
		matrix[1][0]=4;
		matrix[1][1]=0;
		matrix[1][2]=6;
		matrix[2][0]=7;
		matrix[2][1]=8;
		matrix[2][2]=9;
		matrixZero(matrix);

	}

}
