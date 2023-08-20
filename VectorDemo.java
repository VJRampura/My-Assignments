import java.util.*;
class VectorDemo{
	public static void main(String args[]){
		String arr[] = {"c++","java","rpg"};
		Vector v = new Vector();
		for(int i = 0 ; i< arr.length;i++)
			v.add(arr[i]);
		for(int i = 0 ; i< v.size();i++)
			System.out.println(v.get(i));	
	}
}