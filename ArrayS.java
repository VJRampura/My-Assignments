public class ArrayS{
	private int i, j;

	public void sortA(int arr[]){
		for(i = 0; i < arr.length-1; i++)
			for(j = i+1; j < arr.length; j++)
				if(arr[i] > arr[j]){
					int temp = arr[i] ;
					arr[i] = arr[j] ;
					arr[j] = temp ;
				}
	}

	public void sortD(int arr[]){
		for(i = 0; i < arr.length-1; i++)
			for(j = i+1; j < arr.length; j++)
				if(arr[i] < arr[j]){
					int temp = arr[i] ;
					arr[i] = arr[j] ;
					arr[j] = temp ;
				}
		
			
		
	}

}