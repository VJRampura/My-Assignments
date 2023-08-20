class UseTemp{
	public static void main(String args[]){
		StringBuffer sb = new StringBuffer("java");
		System.out.println(sb.append(10));
		System.out.println(sb);
		System.out.println(sb.append("java"));
		System.out.println(sb.append('c'));
	}
}