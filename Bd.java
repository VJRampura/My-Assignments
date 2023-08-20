class Bd {
	public static void main(String args[]){
		int i=0,j=0,k=0 ;
		label1 :
			for(;;) {i++;
		label2 :
			do{

				k = i+j ;
			System.out.println( i + "," + j+ ", " + k);
				switch(k){
				case 0 : continue label2 ;
				case 1 : continue label1 ;
				case 2 : break ;
				case 3 : break label2 ;
				case 4 : break label1 ;
				default : break label1 ;
			}
			}while(++j<5);

			}
			System.out.println(i+","+j);	
	
	}
}