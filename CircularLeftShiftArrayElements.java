import java.io.* ;

class CircularLeftShiftArrayElements {

	public static void main(String args[]){

	Console cn = System.console();
	int arr[]=new int[10], i, n, j, k = 0, temp, no, cnt = 1 ;
	cn.printf("Enter 10 Values : \n");
		for(i=0; i < arr.length ; i++)
			arr[i] = Integer.parseInt(cn.readLine());
	cn.printf("Enter Index Value : ");
		no = Integer.parseInt(cn.readLine());		
		while(cnt <= no){
		for(i = 0,j = 1 ; j < arr.length ; i++,j++){
			temp = arr[i] ;
			arr[i] = arr[j] ;
			arr[j] = temp ;
		}
			cnt++;
		}
		cn.printf("\n");
		cn.printf("Circular Formed Array Is: ");
		for(i=0; i < arr.length ; i++)
			cn.printf(arr[i] + " ");



	}

} 