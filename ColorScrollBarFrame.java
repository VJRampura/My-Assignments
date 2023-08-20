import java.awt.*;
import java.awt.event.*;


class ColorScrollBarFrame implements AdjustmentListener
{
	Frame f;	Canvas c;	 Scrollbar rSb,gSb,bSb;		Panel p,p1,p2 ;		Label rL,gL,bL ;
	TextField rT,gT,bT ; 	Color myC ;	
	int rValue = 0,gValue = 0,bValue = 0;
		public ColorScrollBarFrame(){
			f = new Frame("RGB Color's ScrollBars");
			f.setSize(400,400);		
			
			Panel p1 = new Panel();
			p1.setLayout(new GridLayout(0,3));		
			rSb = new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
			gSb = new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
			bSb = new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
			rSb.addAdjustmentListener(this);
			gSb.addAdjustmentListener(this);
			bSb.addAdjustmentListener(this);
			p1.add(rSb);
			p1.add(gSb);
			p1.add(bSb);
			f.add(p1,"East");
			
			
			Panel p2 = new Panel();
			p2.setLayout(new GridLayout(0,6));		
			rL = new Label("Red");
			gL = new Label("Green");
			bL = new Label("Blue");
			rT = new TextField();
			gT = new TextField();
			bT = new TextField();
			p2.add(rL);
			p2.add(rT);
			p2.add(gL);
			p2.add(gT);
			p2.add(bL);
			p2.add(bT);
			f.add(p2,"South");
			
			Panel p = new Panel();
			p.setLayout(new GridLayout(1,0));		
			c = new Canvas();
			p.add(c);
			f.add(p,"Center");
			
			f.setVisible(true);
			
			
		}
		
			
		
		public void adjustmentValueChanged(AdjustmentEvent e){
			rValue = rSb.getValue();
			rT.setText(rValue+"");
			gValue = gSb.getValue();
			gT.setText(gValue+"");
			bValue = bSb.getValue();
			bT.setText(bValue+"");
			c.setBackground(new Color(rValue,gValue,bValue));
		}
	
	public static void main(String args[]) 
	{
		ColorScrollBarFrame csbf = new ColorScrollBarFrame();	
		
	}
}	
			