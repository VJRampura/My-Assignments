class GreatestCommonDivisor {
	public static void main(String args[]){
		int noA, noB, Divisor, j=0, k=0, i=0 ;
		noA = (int)(Math.random() * 100);
		noB = (int)(Math.random() * 100);
		j = (noA > noB)?noB:noA;
		k = (noA > noB)?noA:noB;
		if ((noA > noB) && (noA % noB = 0)){
			System.out.print(noB + "Is The Greatest Divisor Of These Numbers");
		}else if ((noB > noA) && (noB % noA = 0)){ 
			System.out.print(noA + "Is The Greatest Divisor Of These Numbers");
		}else{
			i = j/2 ;
			while(i > 1){
				if ((k % i) = 0){
				   Divisor = i ;
			 	   i = 1;
				}else{
				   i-- ;
				}
			}
				System.out.print("The Greatest Divisor Is :" + Divisor)	;	
		}
	}
}