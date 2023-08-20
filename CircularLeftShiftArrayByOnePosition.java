import java.io.* ;

class CircularLeftShiftArrayByOnePosition {
	public static void main(String args[]){
		Console cn = System.console();
		int arr[] = new int[10], i, j,temp ;
		cn.printf("Enter 10 Values : \n");

		for(i=0;i<arr.length;i++)
			arr[i] = Integer.parseInt(cn.readLine());
		cn.printf("Left Shifted Array Is : \n");
		for(i=0,j=1;j<arr.length;i++,j++){
			temp = arr[i];
			arr[i] = arr[j] ;
			arr[j] = temp ;
			cn.printf(arr[i]+ " " );
			
		}
			cn.printf(arr[9]+ " " );		
				
	}

}