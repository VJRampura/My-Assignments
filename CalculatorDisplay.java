import java.awt.*;
import java.io.*;
class CalculatorDisplay
{
	public static void main(String args[]) throws IOException
	{
		Frame f = new Frame("Calculator");
		f.setSize(400,300);
		Color myC = new Color(180,180,205);
		f.setBackground(myC);
		f.setLayout(new BorderLayout(1,1));
		TextField tf = new TextField();
		f.add(tf,"North");
		Panel p1 = new Panel();
		GridLayout gl = new GridLayout(4,4,2,2);
		p1.setLayout(gl);
		Button l1 = new Button("1");
		p1.add(l1);
		Button l2 = new Button("2");
		p1.add(l2);
		Button l3 = new Button("3");
		p1.add(l3);
		Button lA = new Button("+");
		p1.add(lA);
		Button l4 = new Button("4");
		p1.add(l4);
		Button l5 = new Button("5");
		p1.add(l5);
		Button l6 = new Button("6");
		p1.add(l6);
		Button lS = new Button("-");
		p1.add(lS);
		Button l7 = new Button("7");
		p1.add(l7);
		Button l8 = new Button("8");
		p1.add(l8);
		Button l9 = new Button("9");
		p1.add(l9);
		Button lM = new Button("*");
		p1.add(lM);
		Button lC = new Button("C");
		p1.add(lC);
		Button l0 = new Button("0");
		p1.add(l0);
		Button lD = new Button("/");
		p1.add(lD);
		Button lE = new Button("=");
		p1.add(lE);
		f.add(p1,"Center");
		
		f.setVisible(true);
	}
}	