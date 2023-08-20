import java.io.* ;
class ColumnWiseMetrixTotal {
	public static void main(String args[]){
		Console cn = System.console();
		int[][] arr = new int [3][3];
		int i, j, temp= 0;
		cn.printf("Enter Metrix Values: \n");
		for (i=0;i<arr.length;i++)
			for (j=0;j<arr[i].length;j++)
			arr[i][j] = Integer.parseInt(cn.readLine());

		cn.printf("Metrix Values Are: \n");
		for (i=0;i<arr.length;i++){
			for (j=0;j<arr[i].length;j++)
			cn.printf(arr[i][j]+" ");
			cn.printf("\n");
		}
		cn.printf("ColumnWise Total Of The Metrix Values Is:");
		for (i=0;i<arr.length;i++){
			for (j=0;j<arr[i].length;j++)
			temp = arr[i][j] + temp ;
			cn.printf(temp+" ");
			temp = 0 ;	
		}
		
	
	
	}


}