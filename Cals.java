    import java.util.regex.*;
class Cals {
	String pattern,g,gA,gB,gC,gD,nPad,str1,temp;   	static String str,updateStr,sL;
	Double d,d1,x;                                    boolean ad,su,mu,de,a1,a2,a3,a4 ;
	
	public Cals(){
		str = "+20-20*20*20*20*30";
		updateStr = str ;
		outer :
			for(int i = 1;i < 10 ; i++)
			devidation();
			
			for(int i = 1;i < 10 ; i++)
			multiplication();
			
			for(int i = 1;i < 10 ; i++)
			addition();
			
			for(int i = 1;i < 10 ; i++)
			subtraction();
			
			System.out.println("Updated is : "+updateStr);
	}
	
	
	
	public static void main(String args[]) {
			Cals c = new Cals();
							
							
							
							
							
				/*pattern = "((\\-)?\\d+(\\.\\d+)?)\\+(\\d+(\\.\\d+)?)";
				Pattern p = Pattern.compile(pattern);
				Matcher m = p.matcher(str);
				while(m.find()){
					g = m.group(0);
					gA = m.group(1);
					gB = m.group(4);
					System.out.println(g);
					System.out.println(gA);
					System.out.println(gB);
					System.out.println();
					
					
					d = Double.parseDouble(gA);
					d1 = Double.parseDouble(gB);
				System.out.println("addition val1 is " +d);
				System.out.println("addition val2 is " +d1);
				
				x = (d+d1);	
				String sL = x+"";
				if(sL.indexOf('-') == -1 )
					sL = "+"+sL ;
				System.out.println("addition is " +x);
				
				str = str.replace(g,sL);
				System.out.println("addition update str is " + str);
				str = str.replace("++","+");
				str = str.replace("*+","*");
				str = str.replace("/+","/");
				
				//str = str;
				}*/		
				
				
	}
	
	
	
	public void devidation(){
				pattern = "((\\-)?\\d+(\\.\\d+)?)\\/(\\d+(\\.\\d+)?)";
				Pattern p = Pattern.compile(pattern);
				Matcher m = p.matcher(updateStr);
				while(m.find()){
					g = m.group(0);
					gA = m.group(1);
					gB = m.group(4);
					d = Double.parseDouble(gA);
					d1 = Double.parseDouble(gB);
					Double x = (d/d1);	
					sL = x+"";
					if(sL.indexOf('-') == -1 )
						sL = "+"+sL ;
					updateSr();
				}
			}
			
			public void multiplication(){
				pattern = "((\\-)?\\d+(\\.\\d+)?)\\*(\\d+(\\.\\d+)?)";
				Pattern p = Pattern.compile(pattern);
				Matcher m = p.matcher(updateStr);
				while(m.find()){
					g = m.group(0);
					gA = m.group(1);
					gB = m.group(4);
					d = Double.parseDouble(gA);
					d1 = Double.parseDouble(gB);
				Double x = (d*d1);	
				sL = x+"";
				if(sL.indexOf('-') == -1 )
					sL = "+"+sL ;
				updateSr();	
				}
			}
			
			public void addition(){
				pattern = "((\\-)?\\d+(\\.\\d+)?)\\+(\\d+(\\.\\d+)?)";
				Pattern p = Pattern.compile(pattern);
				Matcher m = p.matcher(updateStr);
				while(m.find()){
					g = m.group(0);
					gA = m.group(1);
					gB = m.group(4);
					d = Double.parseDouble(gA);
					d1 = Double.parseDouble(gB);
					
				Double x = (d+d1);	
				sL = x+"";
				if(sL.indexOf('-') == -1 )
					sL = "+"+sL ;
				updateSr();	
				}
			}
			
			public void subtraction(){
				pattern = "((\\-)?\\d+(\\.\\d+)?)\\-(\\d+(\\.\\d+)?)";
				Pattern p = Pattern.compile(pattern);
				Matcher m = p.matcher(updateStr);
				while(m.find()){
					g = m.group(0);
					gA = m.group(1);
					gB = m.group(4);
						d = Double.parseDouble(gA);
						d1 = Double.parseDouble(gB);
					Double x = (d-d1);	
					sL = x+"";
					if(sL.indexOf('-') == -1 )
					sL = "+"+sL ;
					updateSr();	
				}
			}	
				public void updateSr(){
					updateStr = updateStr.replace(g,sL);
					updateStr = updateStr.replace("++","+");
					updateStr = updateStr.replace("+-","-");
					updateStr = updateStr.replace("*+","*");
					updateStr = updateStr.replace("/+","/");
				}
				
				
}