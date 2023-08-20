import java.awt.*;
import java.io.*;
class GridFrame
{
	public static void main(String args[]) throws IOException
	{
		Frame f = new Frame("Calculator");
		f.setSize(400,400);
		Color myC = new Color(180,180,205);
		f.setBackground(myC);
		f.setLayout(new GridLayout(2,2));
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		Panel p4 = new Panel();
		Panel p3A = new Panel();
		Panel p3B = new Panel();
		Panel p4A = new Panel();
		Panel p4B = new Panel();
		GridLayout gl1 = new GridLayout(2,0);
		GridLayout gl2 = new GridLayout(3,0);
		GridLayout gl3 = new GridLayout(0,2);
		GridLayout gl4 = new GridLayout(0,3);
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		Button b6 = new Button("6");
		Button b7 = new Button("7");
		Button b8 = new Button("8");
		Button b9 = new Button("9");
		Button b10 = new Button("10");
		Button b11 = new Button("11");
		Button b12 = new Button("12");
		Button b13 = new Button("13");
		Button b14 = new Button("14");
		Button b15 = new Button("15");
		
		p1.setLayout(gl1);
		p1.add(b1);
		p1.add(b2);
		f.add(p1);
		
		p2.setLayout(gl4);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		f.add(p2);
		
		p3.setLayout(gl3);
		p3A.setLayout(gl1);
		p3A.add(b6);
		p3A.add(b7);
		p3.add(p3A);
		p3B.setLayout(gl2);
		p3B.add(b8);
		p3B.add(b9);
		p3B.add(b10);
		p3.add(p3B);
		f.add(p3);
		
		p4.setLayout(gl1);
		p4A.setLayout(gl3);
		p4A.add(b11);
		p4A.add(b12);
		p4.add(p4A);
		p4B.setLayout(gl4);
		p4B.add(b13);
		p4B.add(b14);
		p4B.add(b15);
		p4.add(p4B);
		f.add(p4);
		
		f.setVisible(true);
		
	}
}	