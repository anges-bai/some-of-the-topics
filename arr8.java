import java.util.Scanner;

class Demo8{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		double[][] matrix=new double[3][4];
		System.out.println("Enter a 3-by-4 matrix row by row:");
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				matrix[i][j]=scanner.nextDouble();
			}
		}
		for(int columnIndex=0;columnIndex<matrix[0].length;columnIndex++){
			System.out.println("col "+columnIndex+"'s "+sumColumn(matrix,columnIndex));
		}
	}
	public static double sumColumn(double[][] m,int columnIndex){
		double sum=0;
		for(int rowIndex=0;rowIndex<m.length;rowIndex++){
			sum+=m[rowIndex][columnIndex];
		}
		return sum;
	}
}
