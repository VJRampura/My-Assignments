import java.io.* ;
public class SquarePattern {
	public static void main(String args[]){
		int a , b, c;
		Console cn = System.console();
		cn.printf("Enter ");
		a = Integer.parseInt(cn.readLine());
		for (int i = 1;i <= a ;i++ )
			if(i == 1 | i == a )		
				for(int j = 1 ; j <= a ; j++)
					cn.printf("* ") ;
			else	
				for(int j = 1 ; j <= a ; j++)
					if(j == 1 | j == a )
						cn.printf("* ") ;
					else
						cn.printf("  ") ;
			cn.printf("\n");
	}
}