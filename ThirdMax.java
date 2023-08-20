class ThirdMax {
	public static void main(String args[]){
		int a, b, c, d, max, min ;
		a = (int)(Math.random() * 100);
		b = (int)(Math.random() * 100);
		c = (int)(Math.random() * 100);
		d = (int)(Math.random() * 100);
		System.out.println("a="+a+" b="+b+" c="+c+" d="+d);
		if (a < b) {
		   min = a ;
		   max = b ;
		}else {
		   min = b ;
		   max = a ;
		}
		if (min > c) {
		   max = min ;
		   min = c ;
		}else if (min > d){
		   max = min ;
		   min = d ;
		}
		if (min == a){
		   a = max + 1 ;
		} else if (min == b){
		   b = max + 1 ;
		}else if (min ==c){
		   c = max + 1 ;
		} else if (min == d){
		   d = max + 1 ;
		}
		if (a < b) {
		   min = a ;
		}else {
		   min = b ;
		}
		if (min > c) {
		   min = c ;
		}else if (min > d){
		   min = d ;
		}
		System.out.print("The Third Max Value Is : " + min) ;
	}

}