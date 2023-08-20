import java.awt.*;
import java.awt.event.*;
import java.io.*;							//,TextListener
import java.util.regex.*;
import java.util.*;

class Notepad2 extends WindowAdapter implements ActionListener,FocusListener{
Frame f, saveF,findF ;							TextArea tA ;
		Panel pnl1 ;
		Button prev, nxt;						TextField tf1, tf2,tf3 ;
		String pattern1 ,pattern2 = "java";						static int strt,endd,i,j;
		HashMap<Integer,Integer> mp = new HashMap<>();
		public Notepad2(){
		
			f = new Frame("Notepad1");				f.setSize(980,980);
			f.addWindowListener(this);
			tA = new TextArea("i love java java java");
			tA.addFocusListener(this);
			//tA.addTextListener(this);
			f.add(tA);		
			nxt = new Button("NEXT");
			nxt.addFocusListener(this);
			nxt.addActionListener(this);
			f.add(nxt,"South");
			tA.setFont(new Font("Arial",Font.PLAIN+Font.BOLD,23));
			
		
			f.setVisible(true);
			
			
		}
		
		
		public void actionPerformed(ActionEvent e){
				
				if(e.getSource() == nxt){
						pattern1 = tA.getText();
						strt = pattern1.indexOf(pattern2,tA.getCaretPosition());
						endd = strt+pattern2.length();
					System.out.println("s = "+ strt+ "e = "+endd);
						
						tA.select(strt,endd);
						tA.requestFocus();

						
				}
		}


		public void focusGained(FocusEvent e){
					if(e.getSource() == nxt){
						tA.setCaretPosition(endd);
						nxt.requestFocus();
					}
		}
		
		public void focusLost(FocusEvent e1){
			
		}
		
		

		public void windowClosing(WindowEvent e){
			Window w = e.getWindow();
			w.setVisible(false);
			w.dispose();
		}		
		
		public static void main(String args[]){
			Notepad2 np = new Notepad2();
		}
}		