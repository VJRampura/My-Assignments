import java.util.Scanner;

public class LexicographicalString {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String [] arr = new String[s.length()-k+1];
        arr[0] = s.substring(0,k);			
        for(int i = 1;i <= s.length()-k;i++){
            arr[i] = s.substring(i,i+k);
            if(arr[i-1].compareTo(arr[i]) >= 0 ){
                String temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1]= temp ;
            }
                
        }     
            largest = arr[arr.length-1];   
                for(int j = 1;j < arr.length;j++){
                   if(arr[j-1].compareTo(arr[j]) < 0 ){
						String temp = arr[j];
						arr[j] = arr[j-1];
						arr[j-1]= temp ;
				   }
				}
				
			smallest = arr[arr.length-1];
			 
      
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}