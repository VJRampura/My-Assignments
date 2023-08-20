import java.io.*;
class ConsoleTest{
    public static void main(String[] args) {
        Console con = System.console();
        int arr[] = new int[10];
        System.out.println("enter value");    
        for(int i = 0; i < arr.length;i++)
            arr[i] = Integer.parseInt(con.readLine());
            
         for (int i : arr) {
             System.out.println(i);
            
         }  
    }
}