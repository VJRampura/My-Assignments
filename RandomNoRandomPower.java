class RandomNoRandomPower {
	public static void main(String args[]){
		int noA, noB, result = 1;
		noA = (int)(Math.random() * 10);
		noB = (int)(Math.random() * 10);
		//result = noA ;
		System.out.println("The Numbers Are :" + noA + " And " + noB);
		while(noB >= 1) {
			result = noA * result ;
			noB--;
		}
		System.out.print("The First Number's Power 2nd Number's Value Is :" + result);
	}

}