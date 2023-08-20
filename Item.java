import java.io.* ;
interface Item {
	void read();
	void show();
}
class Book implements Item{
	Console cn = System.console();
	public String title, author, publication ;
	public void read(){
		title();
		author();
		publication();
		
	}
	
	public void show() {
		cn.printf("Book : "+title+" || Author : "+author+" || Publication : "+publication+ "\n");
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
	public void read(){
		title();
		director();
		category();
	}
	
	public void show() {
		
			cn.printf("Dvd  : "+title+" || Director : "+director+" || Category : "+category+"\n");
		
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