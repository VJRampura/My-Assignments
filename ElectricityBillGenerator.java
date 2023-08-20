import java.io.* ; 
class ElectricityBillGenerator {
	public static void main(String args[]) {
		Console cn = System.console();
		int unit ;
		float unitBill = 0.0f; 
		cn.printf("Enter Unit Value: \n");
		unit = Integer.parseInt(cn.readLine());
			while(unit > 0 ){
				if(unit < 50){
					cn.printf("Not Consumed Electricity \n");
					unitBill = 0.0f ;
					unit = 0 ;
				}else if(unit > 250){
					unitBill = (unit-250) * 1.5f ;
					unit = 250 ;
				}
				switch(unit){
					case 250 :
						unitBill = unitBill + (100 * 1.2f) ;
						unit = unit-100 ;
						continue;
					case 150 :
						unitBill = unitBill + (100 * .75f) ;
						unit = unit-100 ;
						continue;
					case 50 :
						unitBill = unitBill + (50 * .5f) ;
						unit = 0 ;
				}		

			}
			unitBill = (unitBill * 120)/100 ;
			cn.printf("Your Electricity Bill Value Is: "+ unitBill);

	}

}
