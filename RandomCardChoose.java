import java.io.*;
class RandomCardChoose {
	public static void main(String args[]){
		Console cn = System.console();
		int no,a =1, b =1, c=1,d ;
		System.out.println("Random Card Picker Game. just Try To Win If You Can... \n");
		System.out.println("Rule 1 : You And Me Can Choose Maximum 4 cards At A Time.\n\t If You Pick Wrong Cards You Lose.");
		System.out.println("Rule 2 : Total Cards Must Be Greater Than 5 .  \n");
		System.out.print("let's Start With Giving Total Number Of Cards : ");
		no = Integer.parseInt(cn.readLine());
		if (no == 5){
			System.out.print("\nInvalid Number... ");
			System.exit(0);
		}
		else	
			while(no > 5){
				c = no-a ;
					if(c-b != 5  && b <= 4){
						b++;
					}else if ((c-b == 5 && c-b == 10)&& b <= 4){
						a++ ;
						b = 1 ;
					}else if(b ==5 && a <= 4){
						System.out.println("\nCards Picked By Me Is : "+ a);
						System.out.print("Now Pick Your Random Cards : ");
						d = Integer.parseInt(cn.readLine());
						if (d <= 4){
							no -= (a + d) ;
							a = 1 ;
							b = a ;
						}else{ 
							System.out.print("Game Over You Lose.");
							System.exit(0);
						}
					}
			}
							System.out.print("Game Over. Last Picked By Me "+ no );
			
	}
}