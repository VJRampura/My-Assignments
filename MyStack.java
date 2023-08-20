import java.util.*;
class UnderFlowException extends RuntimeException{
	public UnderFlowException(String s){
		super(s);
	}
}
public class MyStack {
	static Vector v = new Vector();
	
	public void push(Object o){
		v.add(o);
	}
	
	public Object pop() throws UnderFlowException{
		int i = v.size()-1;
		if(i < 0)
			throw new UnderFlowException(" No Data Available To Retrive.");
		else{
		Object a = v.get(i);
		v.remove(i);
		return a;
		}
	}
	
	public boolean empty(){
		int i = v.size()-1;	
		if(i >= 0)
			return false;
		else
			return true;
	}
	
}