class StringToNumeric {
	public static void main(String args[]){
		String str = "25";
		int no = Integer.parseInt(str);
		double dd = Double.parseDouble(str);
		float ft = Float.parseFloat(str);
		long lg = Long.parseLong(str);
		System.out.print("int is "+ no +" double is " + dd + " float is " + ft + " long is  " + lg);
	}
}
