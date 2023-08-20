import java.awt.*;
import java.io.*;
class QuestionFrame1
{
	public static void main(String args[]) throws IOException
	{
		Frame f = new Frame("Calculator");
		f.setSize(400,300);
		Color myC = new Color(180,180,205);
		f.setBackground(myC);
		f.setLayout(new GridLayout(2,0));
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
		FlowLayout fl1 = new FlowLayout(FlowLayout.CENTER);
		GridLayout gl = new GridLayout(4,0);
		BorderLayout bl = new BorderLayout();
		
		p1.setLayout(bl);
		Panel que_Panel = new Panel();
		Label que_Label = new Label("Q. Capital Of Rajasthan ?");
		que_Panel.add(que_Label);
		que_Panel.setLayout(fl);
		p1.add(que_Panel,"North");
		
		Panel A = new Panel();
		A.setLayout(gl);
		p1.add(A,"West");
		
		Panel B = new Panel();
		B.setLayout(gl);
		p1.add(B,"Center");
		
		Label l1 = new Label("A.");
		Label l2 = new Label("B.");
		Label l3 = new Label("C.");
		Label l4 = new Label("D.");
		CheckboxGroup opt = new CheckboxGroup();
		Checkbox c1 = new Checkbox("Jodhpur",opt,false); 
		Checkbox c2 = new Checkbox("Jaipur",opt,false); 
		Checkbox c3 = new Checkbox("Sikar",opt,false); 
		Checkbox c4 = new Checkbox("Udaypur",opt,false);
		A.add(l1);
		A.add(l2);
		A.add(l3);
		A.add(l4);
		B.add(c1);
		B.add(c2);
		B.add(c3);
		B.add(c4);
		
		p2.setLayout(fl1);
		Button b1 = new Button("Previous");
		Button b2 = new Button("Next");
		p2.add(b1);
		p2.add(b2);
		
		f.add(p1);
		f.add(p2);
		f.setVisible(true);
		
	}
}	