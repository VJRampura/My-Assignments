import java.io.* ;

class AscendingArrayElements {

	public static void main(String args[]){
		Console cn = System.console();
		int arr[]= new int[10], i, j, temp;
		cn.printf("Enter 10 Values: \n");
		for (i = 0; i < arr.length ; i++){
			arr[i] = Integer.parseInt(cn.readLine());
			
		}

		for(i = 0 ; i < arr.length-1 ; i++)
			for(j = i+1 ; j < arr.length ; j++)
				if(arr[i] > arr[j]){
					temp = arr[j];
					arr[j] = arr[i] ;
					arr[i] = temp ;
				}
		cn.printf("Ascending Order Array Is: ");
		for (i = 0; i < arr.length ; i++)
			cn.printf(arr[i] + " " );
	}

}