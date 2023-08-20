class TempTest{
	public static void main(String args[]){
			String a = "   " ;
		System.out.println("Length is : "+a.length());													// 3
		
			a = a.replace(" " ,"    ");
		System.out.println("Replaced String Is : "+a);													// "            "            
		System.out.println("Length is : "+a.length());													// 12
		
			a = a.trim() ;
		System.out.println("Length is : "+a.length());													// 0
		
			a = "abab";
			a = a.replace("abab" ,"String Method");
		System.out.println("Replaced String Is : "+a);													// String Method
		
		System.out.println("Starts with String Is : "+a.startsWith("ab"));	  							// true
		System.out.println("Starts with String Is : "+a.endsWith("aba"));						 		// false
		
		System.out.println("charAt String Is : "+a.charAt(2));											// a
		
		System.out.println("Substring Is : "+a.substring(4));											// ng Mathod
		System.out.println("specified Substring Is : "+a.substring(2,7));								// ring
		
		System.out.println("IndexOf Substring Is : "+a.indexOf("ing"));									// 3
		System.out.println("IndexOf Substring Is : "+a.indexOf("th",8));								// 9
		System.out.println("LastIndexOf Substring Is : "+a.lastIndexOf("ing"));							// 3
		System.out.println("LastIndexOf Substring Is : "+a.lastIndexOf("ing",3));						// 3
			String b = new String ("java");
			String c = new String ("java");
			String d = new String ("JAVA");
		System.out.println("Comppared a new string is : "+(b==c));										// False
		System.out.println("equals a new string is : "+(b.equals(c)));									// true
		System.out.println("equals a new string with ignorecase is : "+(b.equalsIgnoreCase(d)));		// true
		System.out.println("Compared to a string is : "+(b.compareTo(d)));								// 32
		System.out.println("Compared to a string is : "+(d.compareTo(b)));								//-32
		System.out.println("Compared to a string is : "+d.toLowerCase());								// java
		System.out.println("Compared to a string is : "+b.toUpperCase());								// JAVA
			char arr[] ;
			arr = b.toCharArray();
		System.out.println("char array string is : "+arr[0]);											// j
		System.out.println("char array string is : "+String.copyValueOf(arr));							// java
			char arr1[] = new char[10] ;
			d.getChars(1,4,arr1,2);
		System.out.println("char array string is : "+String.copyValueOf(arr1));							// AVA
		c.append("d");
		System.out.println(c+"");
		


	}

}