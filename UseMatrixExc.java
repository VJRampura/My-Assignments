import java.io.*;
class UseMatrixExc{
	public static void main(String args[]){
		Console cn = System.console();
		cn.printf("Give Matrix Row And Column Size \n");
		int a  = Integer.parseInt(cn.readLine()) ;
		int b  = Integer.parseInt(cn.readLine()) ;
		MatrixExc me = null ;
		try {
		me = new MatrixExc(a,b);
		}
		catch(InvalidConstructorException e){
			cn.printf(e.getMessage());
		}
		if (me != null){
			me.read();
			me.show();
		}
	}
}