import java.io.*;
class Test2{
	public static void main(String args[]){
		/*File f = new File("C:\\Users\\vijay\\OneDrive\\Desktop\\Java\\TempTests\\Test2.java");
		File f1 = new File("C:\\Users\\vijay\\OneDrive\\Desktop\\Java\\TempTests","Test2.java");
		File f2 = new File("C:\\Users\\vijay\\OneDrive\\Desktop\\Java\\TempTests");
		File f3 = new File(f2,"Test2.java");
		File f4 = new File("Test2.java");
		
		if (f4.exists()){
			String s2 = f4.getPath();			//returns Pathname(name + directory)
			System.out.println("This File Pathname is : "+s2);	
			
		}
		
		if (f2.exists()){
			//we can use all file type methods on this array's indexs bcs this is a file type array
		
			File arr1[];
			arr1 = f2.listFiles();
			for(File frr : arr1)
				if(frr.isFile())
					System.out.println(frr.getName()+" <File> ");		
				else
					System.out.println(frr.getName()+" <Folder> ");
					
				
			//we can not use file type methods on this(arr) array's indexs bcs this is a string type array
			
			String arr[] ;
			arr = f2.list();
				System.out.println("Total Files, The Folder Contains Is : "+ arr.length);
				System.out.println("This Files Name Of This Folder Is : ");
			for(String a : arr)
				System.out.println(a);													
		}
		
		

		if (f.exists()){
			long l = f.length() ;
			System.out.println("This File Size is "+l +"Byte");
			
			String s = f.getName();				//returns File Name
			String s1 = f.getParent();			//returns Directory Name
			
			
			if(f.isFile()){
				System.out.println("it's a file");
				System.out.println("And This File Name is : "+s);	
			}else{
				System.out.println("it not a file");
			}
			
			if(f.isDirectory()){
				System.out.println("it's a Directory");
				System.out.println("And This Directory Name is : "+s1);	
			}else{
				System.out.println("it's not a Directory");
			}
			
			if(f.canRead())
				System.out.println("Yes! You Can Read");
			else
				System.out.println("No! You Can't Read");


			if(f.canWrite())
				System.out.println("Yes! You Can Write");
			else
				System.out.println("No! You Can't Write");


			if(f.canExecute())
				System.out.println("Yes! You Can Execute");
			else
				System.out.println("No! You Can't Execute");	
		}
		


		// CREATING A NEW DIRECTORY/FOLDER IN TEMPTESTS FOLDER...
		
		File ff1 = new File ("C:\\Users\\vijay\\OneDrive\\Desktop\\Java\\TempTests\\NewFolder");
		if(!ff1.exists()){
			ff1.mkdir();
			System.out.println("Successfully Created The Folder");
		}else
			System.out.println("Folder Already Exists In This Folder");


		// CREATING A NEW DIRECTORY/FOLDER HIERARCHY IN TEMPTESTS FOLDER...
		
		File ff2 = new File ("C:\\Users\\vijay\\OneDrive\\Desktop\\Java\\TempTests\\NewFolder\\A\\B\\C");
		if(!ff2.exists()){
			ff2.mkdirs();
			System.out.println("Successfully Created The Folder's Hierarchy");
		}else
			System.out.println("Folders Already Exists In This Folder");
		
		

		// CREATING A NEW TXT FILE IN TEMPTESTS FOLDER...
		
		File ff = new File ("C:/Users/vijay/OneDrive/Desktop/Java/TempTests\\NewFolder\\A\\B\\C/File.txt");
		
		if(!ff.exists()){
			try{
			 ff.createNewFile();
			System.out.println("Successfully Created This File In Folder");
			}
			catch(IOException e1){
				System.out.println(e1.getMessage());
			}
		}else{
			System.out.println("File Already Exists In This Folder");
		}
		
		
		
		
		// RENAMING/MOVING A NEW TXT FILE/DIRECTORY IN TEMPTESTS FOLDER...
		
		File ff4 = new File ("C:/Users/vijay/OneDrive/Desktop/Java/TempTests\\NewFolder\\A\\B\\C/File.txt");
		File ff6 = new File ("C:/Users/vijay/OneDrive/Desktop/Java/TempTests\\NewFolder\\A\\B\\File1.txt");
		File ff7 = new File ("C:/Users/vijay/OneDrive/Desktop/Java/TempTests\\NewFolder\\A\\B");
		File ff8 = new File ("C:/Users/vijay/OneDrive/Desktop/Java/TempTests\\NewFolder\\A\\B\\C");
		File ff5 = new File ("C:/Users/vijay/OneDrive/Desktop/Java/TempTests\\NewFolder\\A");
		
		//moving at another folder and renaming the file..........
		
		if(ff4.exists())
			if(ff4.renameTo(ff6))
				System.out.println("Successfully Moved/Renamed This File In Folder");
			else
				System.out.println("No File Exists/Already Exist The File In This Folder");
		
		//Moving a file from a folder to another folder without changing its name ....

		if(ff4.renameTo(ff7))
				System.out.println("Successfully Moved/Renamed This File In Folder");
			else
				System.out.println("No File Exists/Already Exist The File In This Folder");
		
		
		if(ff8.exists())
			if(ff8.renameTo(ff5))
				System.out.println("Successfully Moved/Renamed This File In Folder");
			else
				System.out.println("No File Exists/Already Exist The File In This Folder");
			*/
		
			
		
		// DELETING A NEW TXT FILE/DIRECTORY IN TEMPTESTS FOLDER...
		
		/*File ff3 = new File ("C:/Users/vijay/OneDrive/Desktop/Java/TempTests\\NewFolder\\A\\B\\C/File.txt");
		
		if(ff3.exists()){
			ff3.delete();
			System.out.println("Successfully Deleted This File In Folder");
		}else{
			System.out.println("No File Exists In This Folder");
		}*/
		
		
		File ff3 = new File ("File.txt");
		
	}
}