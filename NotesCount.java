import java.io.* ;
class NotesCount {
	public static void main (String args[]) {
		Console cn = System.console() ;
		int amount, divi=0,cnt = 0 ;
		cn.printf("Enter Your Amount Value: \n");
			amount = Integer.parseInt(cn.readLine());
			while(amount > 0)
				if(amount >= 500){
					divi = amount / 500 ;
					cnt = divi;
					cn.printf("500 Rupees Notes Are : " + divi+ "\n");
					amount = amount % 500 ;
				}else if(amount >= 200){
					divi = amount / 200 ;
					cnt += divi;
					cn.printf("200 Rupees Notes Are : " + divi+ "\n");
					amount = amount % 200 ;
				}else if(amount >= 100){
					divi = amount / 100 ;
					cnt += divi;
					cn.printf("100 Rupees Notes Are : " + divi+ "\n");
					amount = amount % 100 ;
				}else if(amount >= 50){
					divi = amount / 50 ;
					cnt += divi;
					cn.printf("50 Rupees Notes Are : " + divi+ "\n");
					amount = amount % 50 ;
				}else if(amount >= 10){
					divi = amount / 10 ;
					cnt += divi;
					cn.printf("10 Rupees Notes Are : " + divi+ "\n");
					amount = amount % 10 ;
				}else if(amount >= 5){
					divi = amount / 5 ;
					cnt += divi;
					cn.printf("5 Rupees Notes Are : " + divi+ "\n");
					amount = amount % 5 ;
				}else if(amount >= 2){
					divi = amount / 2 ;
					cnt += divi;
					cn.printf("2 Rupees Notes Are : " + divi+ "\n");
					amount = amount % 2 ;
				}else {
					cn.printf("1 Rupee Notes Are : " + amount+ "\n");
					cnt += amount;
					amount = 0 ;
				}

				cn.printf("Total Notes Are : " + cnt);

	
	}


}