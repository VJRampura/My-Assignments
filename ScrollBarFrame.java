import java.awt.*;
import java.io.*;
class ScrollBarFrame
{
	public static void main(String args[]) throws IOException
	{
		Frame f = new Frame("ScrollBars");
		f.setSize(400,300);
		Color myC = new Color(180,180,205);
		f.setBackground(myC);
		f.setLayout(new GridLayout(0,3));
		Panel p = new Panel();
		Panel p2 = new Panel();
		//TextArea ta = new TextArea("");
		f.add(p);
		f.add(p2);
		Scrollbar sb = new Scrollbar(Scrollbar.VERTICAL);
		Scrollbar sb1 = new Scrollbar(Scrollbar.VERTICAL);
		Scrollbar sb2 = new Scrollbar(Scrollbar.VERTICAL);
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(0,3));
		p1.add(sb);
		p1.add(sb1);
		p1.add(sb2);
		f.add(p1);
		/*f.add(ta);
		f.add(sb);
		f.add(sb1);
		f.add(sb2);*/
		f.setVisible(true);
		
	}
}	