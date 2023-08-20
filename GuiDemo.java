import java.awt.*;
class GuiDemo{
	public static void main(String args[]){
		Frame f = new Frame();
		f.setSize(1980,1280);
		f.setLayout(new FlowLayout());
		
		Label l = new Label("Enter Name : ",Label.LEFT);
		f.add(l);
		
		TextField t = new TextField("India",20);
		f.add(t);
		
		Button b = new Button("Ok");
		f.add(b);
		Button b1 = new Button("Cancel");
		f.add(b1);
		
		TextArea ta = new TextArea("Hello World",10,40,TextArea.SCROLLBARS_BOTH);
		f.add(ta);
		
		CheckboxGroup cg = new CheckboxGroup();
		Checkbox cb = new Checkbox("A",cg,false);
		Checkbox cb1 = new Checkbox("B",cg,false);
		Checkbox cb2 = new Checkbox("C",cg,false);
		f.add(cb);
		f.add(cb1);
		f.add(cb2);
		
		Choice ch = new Choice();
		ch.add("java");
		ch.add("java");
		ch.add("java");
		ch.add("java");
		ch.add("java");
		ch.add("java");
		ch.add("java");
		ch.add("java");
		ch.add("java");
		ch.add("java");
		ch.add("java");
		f.add(ch);
		
		List lt = new List(6,true);
		lt.add("Jai Shri Ram");
		lt.add("Jai Shri Ram");
		lt.add("Jai Shri Ram");
		lt.add("Jai Shri Ram");
		lt.add("Jai Shri Ram");
		lt.add("Jai Shri Ram");
		lt.add("Jai Shri Ram");
		lt.add("Jai Shri Ram");
		lt.add("Jai Shri Ram");
		lt.add("Jai Shri Ram");
		f.add(lt);
		
		Canvas cv = new Canvas();
		cv.setSize(100,80);
		cv.setBackground(Color.red);
		f.add(cv);
		
		Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL,25,5,0,100);
		f.add(sb);
		
		ScrollPane sp = new ScrollPane();
		Button bn = new Button("i AM Starting java Programing");
		b.setFont(new Font("Arial",Font.BOLD,80));
		sp.add(b);
		f.add(sp);
		
		f.setVisible(true);




		/*String s = t.getText();
		t.setText("Indian");
		int selectionStart = 0 ;
		int selectionEnd = 3;	
		t.select(selectionStart,selectionEnd);
		//t.selectAll();
		s = t.getSelectedText();
		System.out.println(s);	
		System.out.println(t.isEditable());
		t.setEchoChar('*');
		System.out.println(t.getEchoChar());
		System.out.println(t.echoCharIsSet());

		b.setLabel("Open");

		if(l.getAlignment() == Label.CENTER)
			l.setAlignment(Label.LEFT);
		 if(l.getAlignment() == Label.RIGHT)	
			l.setAlignment(Label.LEFT);
		 if(l.getAlignment() == Label.LEFT)	
			l.setAlignment(Label.RIGHT);*/
		
		//TextArea ta = new TextArea("Hello World");
		//TextArea ta = new TextArea("",10,30,TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.selectAll();
		System.out.println(ta.getSelectedText());
		ta.appendText("From Java");
		ta.selectAll();
		System.out.println(ta.getSelectedText());
		ta.insertText(" ",11);
		ta.selectAll();
		System.out.println(ta.getSelectedText());
		System.out.println(ta.getRows());
		System.out.println(ta.getColumns());
		
		System.out.println(cb.getState());
		cb.setLabel("Click Here");
		System.out.println(cb.getLabel());
		
		lt.add("Jai SitaRam",4);
		if(lt.isMultipleMode() == true)
			lt.setMultipleSelections(false);
			lt.replaceItem("Jai Jai SitaRam",5);
			
		
	}
}