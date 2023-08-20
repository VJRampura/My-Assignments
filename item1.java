import java.io.* ;
interface Item {
	void read();
	void show();
}
class Book implements Item{
	Console cn = System.console();
	public String title, author, publication ;
	static String arr[][] = new String[10][3] ;
	static int a = 0;
	static int b = 0;
	public void read(){
		title();
		author();
		publication();
		arr[a][0] = title ;
		arr[a][1] = author ;
		arr[a][2] = publication;
		a++ ;
	}
	
	public void show() {
			cn.printf("Book : "+arr[b][0]+" || Author : "+arr[b][1]+" || Publication : "+arr[b][2]+ "\n");
			b++ ;
	}
	
	public void title(){
		System.out.print("Enter Title of Book : ");
		title =  cn.readLine();
	}
	
	public void author(){
		System.out.print("Enter Author of Book : ");
		author = cn.readLine();
	}
	public void publication(){
		System.out.print("Enter Publication of Book : ");
		publication = cn.readLine();
	}
} 
class Dvd implements Item{
	Console cn = System.console();
	public String title, director, category ;
	static String arr[][] = new String[10][3] ;
	static int a = 0;
	static int b = 0;
	public void read(){
		title();
		director();
		category();
		arr[a][0] = title ;
		arr[a][1] = director ;
		arr[a][2] = category;
		a++ ;
	}
	
	public void show() {
		
			cn.printf("Dvd  : "+arr[b][0]+" || Director : "+arr[b][1]+" || Category : "+arr[b][2]+"\n");
			b++ ;
	}
	
	public void title(){
		System.out.print("Enter Title of Dvd : ");
		this.title =  cn.readLine();
	}
	
	public void director(){
		System.out.print("Enter director of Dvd : ");
		this.director = cn.readLine();
	}
	public void category(){
		System.out.print("Enter category of Dvd : ");
		this.category = cn.readLine();
	}
} 