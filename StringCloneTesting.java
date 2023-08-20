public class StringCloneTesting implements Cloneable{
	public static void main(String args[]){
		String s = "hi am vijay";
		String s1 = new String("Hello world");
		String s3 ;
		String s4 ;
		Object o = new Object();
		Object o1 = (Object)o.clone();
		s3 = (String)s.clone();
		s4 = (String)s1.clone();
		System.out.println(s3+ s4);
	}
}