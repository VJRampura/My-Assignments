import java.io.* ;
class MetrixMultiply {
	public static void main(String args[]){
		Console cn = System.console();
		int[][] arr = new int[3][3], arr1 = new int[3][3], arr2 = new int[3][3];
		int i, j, k, temp=0 ;
		cn.printf("Enter Metrix One Values : \n");
		for(i = 0; i < arr.length ; i++ )
			for(j = 0; j < arr[i].length ; j++ ){
				arr[i][j] = Integer.parseInt(cn.readLine());
				arr1[i][j] = arr[i][j];
			}
		cn.printf("1st Metrix Values Are : \n");
		for(i = 0; i < arr.length ; i++ ){
			for(j = 0; j < arr[i].length ; j++ )
			cn.printf(arr[i][j]+ "  ");
			cn.printf("\n\n");
		}

		cn.printf("\n2nd Metrix Values Are : \n");
		for(i = 0; i < arr1.length ; i++ ){
			for(j = 0; j < arr1[i].length ; j++ )
			cn.printf(arr[i][j]+ "  ");
			cn.printf("\n\n");
		}		
			
		for(i = 0; i < arr.length ; i++ )
			for(j = 0; j < arr[i].length ; j++ ){
				for(k = 0; k < arr1.length; k++ ){
					temp += arr[i][j]*arr1[k][j] ;
					arr2[i][j] = temp ;
				}
				temp = 0 ;
			}
		
		cn.printf("Result Metrix Values Are : \n");
		for(i = 0; i < arr.length ; i++ ){
			for(j = 0; j < arr[i].length ; j++ )
			cn.printf(arr2[i][j]+ "  ");
			cn.printf("\n\n");
		}
	
	}

}