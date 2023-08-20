import java.io.* ;
class AbvAvgValueInArray {
	public static void main(String args[]){
		Console con = System.console() ;
		int arr[] = new int[4] ;
		int i, sum = 0, avg ;
		System.out.println("Enter value");
		for (i = 0,sum = 0 ; i < arr.length ; i++){
			arr[i] = Integer.parseInt(con.readLine());
			sum += arr[i] ;
		}
		

		avg = sum / arr.length ;
		con.printf(" Avg Is: " + avg + "\n") ;
		System.out.println("Values Above Avg Are: ");
		for(int value : arr){
			if (value > avg)
				con.printf(value + " ");
}
	}
}