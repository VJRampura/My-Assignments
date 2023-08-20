import java.io.* ;
	class StringCircularPattern {
		public static void main(String args[]){
			Console cn = System.console();
			cn.printf("Enter A Word : \n");
			String str = cn.readLine();

			for(int i = 0;i < str.length(); i++){
				str = str.substring(1) + str.charAt(0);
				cn.printf(str + "\n") ;
			}


		}
}