
public class TwoIdenticalMatrices {
	public static void main(String args[]) {
		int flag=0;
		int MatrixA[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int MatrixB[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<MatrixA.length;i++) {
			for(int j=0;j < MatrixA[0].length;j++) {
				if(MatrixA[i][j] != MatrixB[i][j]) {
					flag = 1;
				}
			}
		}
		if(flag == 0) {
			System.out.println("Identical");
		}
		else {
			System.out.println("Not Identical");
		}
	}
}
