import java.io.* ;
class MatrixTranspose {
	public static void main(String args[]){
		Console cn = System.console();
		int arr[][] = new int[3][3];
		int arr1[][] = new int[3][3];
		int i, j, temp;
		cn.printf("Enter Metrix Values : \n ");
		for (i=0;i<arr.length; i++)
			for(j=0;j<arr[i].length; j++)
				arr[i][j] = Integer.parseInt(cn.readLine());

		cn.printf("The Metrix Is : \n ");

		for (i=0;i<arr.length; i++){
			for(j=0;j<arr[i].length; j++)
				cn.printf(arr[i][j]+ " ");
				cn.printf("\n ");
		}
		for (i=0;i<arr.length; i++)
			for(j=0;j<arr[i].length; j++)
				arr1[j][i] = arr[i][j];
		
		cn.printf("The Transpose Metrix Is : \n ");
		
		for (i=0;i<arr.length; i++){
			for(j=0;j<arr[i].length; j++)
				cn.printf(arr1[i][j]+ " ");
				cn.printf("\n ");
		}
	}


}