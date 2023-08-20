import java.io.* ;

class LeftShiftArrayByOnePosition {
	public static void main(String args[]){
		Console cn = System.console() ;
		int arr[] = new int[10], i, j, temp ;
		cn.printf("Enter 10 Values :\n");
		for(i=0;i< arr.length;i++)
		arr[i] = Integer.parseInt(cn.readLine());
		for(i=0,j=1;i< arr.length;i++,j++)
			if(j >= arr.length)
				arr[i] = 0 ;
			else
			arr[i] = arr[j] ;
		cn.printf("Left Shifted Array Is : \n");
		for(i=0;i< arr.length;i++)
			cn.printf(arr[i] + " ");
	}

}