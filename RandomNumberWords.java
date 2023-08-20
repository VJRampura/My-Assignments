class RandomNumberWords {
     public static void main(String args[]){
	int no, rem, dv ;
	String noA = " ", noB = " ", noC = " ", noD = " " ;
	no = (int)(Math.random() * 10000) ;
	System.out.println("Generated No Is : " + no);
	rem = no%10 ;
	dv = no/10 ;
	switch(rem){
		case 1:
		noD = " one" ;
		break;
		case 2:
		noD = " two" ;
		break;
		case 3:
		noD = " three" ;
		break;
		case 4:
		noD = " four" ;
		break;
		case 5:
		noD = " five" ;
		break;
		case 6:
		noD = " six" ;
		break;
		case 7:
		noD = " seven" ;
		break;
		case 8:
		noD = " eight" ;
		break;
		case 9:
		noD = " nine" ;
		break;
		case 0:
		noC = " zero" ;
		break;	
	}
	rem = dv%10 ;
	dv = no/100 ;
	switch(rem){
		case 1:
		noC = " one" ;
		break;
		case 2:
		noC = " two" ;
		break;
		case 3:
		noC = " three" ;
		break;
		case 4:
		noC = " four" ;
		break;
		case 5:
		noC = " five" ;
		break;
		case 6:
		noC = " six" ;
		break;
		case 7:
		noC = " seven" ;
		break;
		case 8:
		noC = " eight" ;
		break;
		case 9:
		noC = " nine" ;
		break;
		case 0:
		noC = " zero" ;
		break;
	}
	rem = dv%10 ;
	dv = no/1000 ;
	switch(rem){
		case 1:
		noB = " one" ;
		break;
		case 2:
		noB = " two" ;
		break;
		case 3:
		noB = " three" ;
		break;
		case 4:
		noB = " four" ;
		break;
		case 5:
		noB = " five" ;
		break;
		case 6:
		noB = " six" ;
		break;
		case 7:
		noB = " seven" ;
		break;
		case 8:
		noB = " eight" ;
		break;
		case 9:
		noB = " nine" ;
		break;
		case 0:
		noB = " zero" ;
		break;
	}
	rem = dv ;
	switch(rem){
		case 1:
		noA = " one" ;
		break;
		case 2:
		noA = " two" ;
		break;
		case 3:
		noA = " three" ;
		break;
		case 4:
		noA = " four" ;
		break;
		case 5:
		noA = " five" ;
		break;
		case 6:
		noA = " six" ;
		break;
		case 7:
		noA = " seven" ;
		break;
		case 8:
		noA = " eight" ;
		break;
		case 9:
		noA = " nine" ;
		break;
		case 0:
		noA = " zero" ;
		break;
	}
	
		System.out.println("In Words: "+noA+noB+noC+noD) ;

     }
}