class RandomNoInWords {
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
			
	}
	rem = no%100 ;
	if (rem > 9 && rem <20 ) {
	dv = no/100 ;
	   noD = "" ;
	   switch(rem){
		case 10:
		noC = " ten" ;
		break;
		case 11:
		noC = " eleven" ;
		break;
		case 12:
		noC = " Twelve" ;
		break;
		case 13:
		noC = " Thirteen" ;
		break;
		case 14:
		noC = " Fourteen" ;
		break;
		case 15:
		noC = " Fifteen" ;
		break;
		case 16:
		noC = " Sixteen" ;
		break;
		case 17:
		noC = " Seventeen" ;
		break;
		case 18:
		noC = " Eighteen" ;
		break;
		case 19:
		noC = " nineteen" ;
		break;
	   }
	}else {
	rem = dv%10 ;
	dv = no/100 ;
	switch(rem){
		case 2:
		noC = " twenty" ;
		break;
		case 3:
		noC = " thirty" ;
		break;
		case 4:
		noC = " fourty" ;
		break;
		case 5:
		noC = " fifty" ;
		break;
		case 6:
		noC = " sixty" ;
		break;
		case 7:
		noC = " seventy" ;
		break;
		case 8:
		noC = " eighty" ;
		break;
		case 9:
		noC = " ninety" ;
		break;
		case 0:
		noC = "" ;
		break;
	}
	}
	rem = dv%10 ;
	dv = no/1000 ;
	switch(rem){
		case 1:
		noB = " one Hundred" ;
		break;
		case 2:
		noB = " two Hundred" ;
		break;
		case 3:
		noB = " three Hundred" ;
		break;
		case 4:
		noB = " four Hundred" ;
		break;
		case 5:
		noB = " five Hundred" ;
		break;
		case 6:
		noB = " six Hundred" ;
		break;
		case 7:
		noB = " seven Hundred" ;
		break;
		case 8:
		noB = " eight Hundred" ;
		break;
		case 9:
		noB = " nine Hundred" ;
		break;
		case 0:
		noB = "" ;
		break;
	}
	rem = dv ;
	switch(rem){
		case 1:
		noA = " one Thousand" ;
		break;
		case 2:
		noA = " two Thousand" ;
		break;
		case 3:
		noA = " three Thousand" ;
		break;
		case 4:
		noA = " four Thousand" ;
		break;
		case 5:
		noA = " five Thousand" ;
		break;
		case 6:
		noA = " six Thousand" ;
		break;
		case 7:
		noA = " seven Thousand" ;
		break;
		case 8:
		noA = " eight Thousand" ;
		break;
		case 9:
		noA = " nine Thousand" ;
		break;
		
	}
	
		System.out.println("In Words: "+noA+noB+noC+noD) ;

     }
}