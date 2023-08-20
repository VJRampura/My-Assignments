import java.awt.*;
import java.io.*;
class CalculatorDisplay1
{
	public static void main(String args[]) throws IOException
	{
		Frame f = new Frame("Calculator");
		f.setSize(400,300);
		Color myC = new Color(180,180,205);
		f.setBackground(myC);
		f.setLayout(new GridLayout(5,0,2,2));
		GridLayout gl = new GridLayout(0,4,2,2);
		Panel p = new Panel();
		p.setLayout(new GridLayout(0,1));
		TextField tf = new TextField();
		tf.setSize(p.getSize());
		tf.setFont(new Font("Arial",Font.BOLD+Font.PLAIN,30));
		p.add(tf);
		f.add(p);
		
		Panel p1 = new Panel();
		p1.setLayout(gl);
		Button l1 = new Button("1");
		p1.add(l1);
		Button l2 = new Button("2");
		p1.add(l2);
		Button l3 = new Button("3");
		p1.add(l3);
		Button lA = new Button("+");
		p1.add(lA);
		f.add(p1);
		
		Panel p2 = new Panel();
		p2.setLayout(gl);
		Button l4 = new Button("4");
		p2.add(l4);
		Button l5 = new Button("5");
		p2.add(l5);
		Button l6 = new Button("6");
		p2.add(l6);
		Button lS = new Button("-");
		p2.add(lS);
		f.add(p2);
		
		Panel p3 = new Panel();
		p3.setLayout(gl);
		Button l7 = new Button("7");
		p3.add(l7);
		Button l8 = new Button("8");
		p3.add(l8);
		Button l9 = new Button("9");
		p3.add(l9);
		Button lM = new Button("*");
		p3.add(lM);
		f.add(p3);
		
		Panel p4 = new Panel();
		p4.setLayout(gl);
		Button lC = new Button("C");
		p4.add(lC);
		Button l0 = new Button("0");
		p4.add(l0);
		Button lD = new Button("/");
		p4.add(lD);
		Button lE = new Button("=");
		p4.add(lE);
		f.add(p4);
		
		f.setVisible(true);
	}
}	