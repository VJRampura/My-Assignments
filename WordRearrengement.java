public class WordRearrengement {
        public static void main(String args[]) {
            String s = "your";
            char arr [] = s.toCharArray();
            String s1 = "";
            while(true){
                
                for (int i = 0; i < arr.length-1; i++) {		
                    char temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp ;
                    s1 = String.copyValueOf(arr);
                    System.out.println(s1);
                } 
                    if(s1.equals(s))
                        break;
            }
    
        }
    	
        
    
}
