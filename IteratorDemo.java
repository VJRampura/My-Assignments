import java.util.*;
class IteratorDemo{
	public static void main(String args[]){
		String arr[] = {"c++","java","rpg","dfgh"};
		Vector v = new Vector();
		for(int i = 0 ; i< arr.length;i++)
			v.add(arr[i]);
		//for(int i = 0 ; i< v.size();i++)
			//System.out.println(v.get(i));

		/*Iterator iter = v.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());*/
		String s = "python";
		ListIterator liter1 = v.listIterator();
			liter1.add(s);
			System.out.println(liter1.next());
			liter1.add(s);
			System.out.println(liter1.previous());
			System.out.println(liter1.next());
			System.out.println(liter1.next());
			System.out.println(liter1.next());
		/*while(liter1.hasNext()){
			System.out.println(liter1.next());
			System.out.println(liter1.nextIndex());
		}*/
		/*while(liter1.hasPrevious()){
			System.out.println(liter1.previous());
			System.out.println(liter1.previousIndex());
		}*/	
	}
}