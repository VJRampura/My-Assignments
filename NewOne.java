import java.awt.*;
import java.awt.event.*;
public class NewOne{
	 	
		public static void main(String args[]) {
			Frame f = new Frame();
			 Scrollbar rSb = new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
			 Scrollbar gSb = new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
			 Scrollbar bSb = new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
			f.add(rSb);
			f.add(gSb);
			f.add(bSb);
			f.setSize(400,400);
			
			f.setVisible(true);
			
	}
}