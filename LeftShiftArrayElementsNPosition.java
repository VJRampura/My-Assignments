import java.io.* ;

class LeftShiftArrayElementsNPosition {
	public static void main(String args[]){
		Console cn = System.console();
		int arr[] = new int[10], i, j, no ;
		cn.printf("Enter 10 Values : \n");

		for(i=0;i<arr.length;i++)
			arr[i] = Integer.parseInt(cn.readLine());

		cn.printf("Enter Position Number : ");
			no = Integer.parseInt(cn.readLine());
		cn.printf("Left Shifted Array Is : \n");
		for(i=0,j=no-1;i<arr.length;i++){
			if(j >= arr.length)
				arr[i] = 0 ;
			else
				arr[i] = arr[j] ;
				j++;
		cn.printf(arr[i]+ " " );
		}
				
	}

}