import java.io.* ;
class HorizontalHistogram {
	public static void main(String args[]){
		Console cn = System.console();
		int arr[] = new int[10], i, j, no;
		cn.printf ("Enter 10 Values: \n");
		for(i = 0; i< arr.length ; i++)
		arr[i] = Integer.parseInt(cn.readLine());
		for(i = 0; i< arr.length ; i++){
			for(j = 0; j< arr[i];j++)
			cn.printf("* ");
			cn.printf("\n");
		}
	}

}