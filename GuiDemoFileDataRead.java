import java.awt.*;
import java.io.*;
class GuiDemoFileDataRead{
	public static void main(String args[]) throws IOException{
		Frame f = new Frame();
		f.setSize(980,720);
		Color myC = new Color(180,180,205);
		f.setBackground(myC);
		f.setLayout(new FlowLayout());
		FileDialog fd = new FileDialog(f,"SELECT",FileDialog.LOAD);
		fd.setVisible(true);
		String path,name;
		name = fd.getFile();
		path = fd.getDirectory();
		File file = new File(path,name);
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis); 
		TextArea ta = new TextArea(name,10,40);
		ta.appendText("\n\n");
		int ch;
		while((ch = bis.read()) != -1){
			char ch1 = (char)ch;
			ta.appendText(ch1+"");
		}
		f.add(ta);
		f.setVisible(true);
		
	}
}	
