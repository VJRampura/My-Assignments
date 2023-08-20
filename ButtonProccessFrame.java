import java.awt.*;
import java.awt.event.*;
class ButtonProccessFrame implements ActionListener
{
	Frame f; 	Button back,nxt ; 	Panel p1,p2,p3,p4,p5,p6 ;	CardLayout cl ;
	TextField nameT,sNameT,ageT,qualificationT,houseNoT,areaT,cityT,stateT,pinT,mobileT,phT,emailT,salaryT,hraT,taT,daT;
	Label nameL,sNameL,ageL,qualificationL,houseNoL,areaL,cityL,stateL,pinL,mobileL,phL,emailL,salaryL,hraL,taL,daL;
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc,gbc1 ;
	
	public ButtonProccessFrame(){
		f = new Frame("Multiple Pages ");
			f.setSize(400,300);	
			cl = new CardLayout();
			p1 = new Panel();
			p1.setLayout(cl);
			
			f.add(p1,"Center");
			
			p2 = new Panel();
			back = new Button("Back");
			nxt = new Button("Next");
			back.addActionListener(this);
			nxt.addActionListener(this);
			p2.add(back);
			p2.add(nxt);
			f.add(p2,"South");
			
				
			
			p3 = new Panel();
			p3.setLayout(gbl);
			gbc = new GridBagConstraints();
			gbc.weightx = 1.0 ;		gbc.weighty = 1.0;
			gbc.gridx = 0 ;		gbc.gridy = 0 ;
			gbc.ipadx = 200; gbc.ipady = 2;
			nameL = new Label("Name");
			nameT = new TextField();
			p3.add(nameL,gbc);
			gbc.gridx = 1;  
			p3.add(nameT,gbc);
			
			
			sNameL = new Label("SurName");
			sNameT = new TextField();
			sNameT.setSize(40,10);
			gbc.gridx = 0 ;		gbc.gridy = 1 ;
			p3.add(sNameL,gbc);
			gbc.gridx = 1 ;
			p3.add(sNameT,gbc);
			
			ageL = new Label("Age");
			ageT = new TextField();
			gbc.gridx = 0 ;		gbc.gridy = 2 ;
			p3.add(ageL,gbc);
			gbc.gridx = 1 ;
			p3.add(ageT,gbc);
			
			qualificationL = new Label("Qualification");
			qualificationT = new TextField();
			gbc.gridx = 0 ;		gbc.gridy = 3 ;
			p3.add(qualificationL,gbc);
			gbc.gridx = 1 ;	
			p3.add(qualificationT,gbc);
			
			
			
			p4 = new Panel();
			p4.setLayout(gbl);
			houseNoL = new Label("House No");
			houseNoT = new TextField();
			gbc.ipadx = 200; gbc.ipady = 2;
			gbc.gridx = 0 ;		gbc.gridy = 0 ;
			p4.add(houseNoL,gbc);
			gbc.gridx = 1 ;	
			p4.add(houseNoT,gbc);
			
			areaL = new Label("Area");
			areaT = new TextField();
			gbc.gridx = 0 ;		gbc.gridy = 1 ;
			p4.add(areaL,gbc);
			gbc.gridx = 1 ;	
			p4.add(areaT,gbc);
			
			cityL = new Label("City");
			cityT = new TextField();
			gbc.gridx = 0 ;		gbc.gridy = 2 ;
			p4.add(cityL,gbc);
			gbc.gridx = 1 ;	
			p4.add(cityT,gbc);
			
			stateL = new Label("State");
			stateT = new TextField();
			gbc.gridx = 0 ;		gbc.gridy = 3 ;
			p4.add(stateL,gbc);
			gbc.gridx = 1 ;	
			p4.add(stateT,gbc);
			
			
			
			p5 = new Panel();
			p5.setLayout(gbl);
			gbc.ipadx = 200; gbc.ipady = 2;
			pinL = new Label("Pin Code");
			pinT = new TextField();
			gbc.gridx = 0 ;		gbc.gridy = 0 ;
			p5.add(pinL,gbc);
			gbc.gridx = 1 ;
			p5.add(pinT,gbc);
			
			mobileL = new Label("Mobile");
			mobileT = new TextField();
			gbc.gridx = 0 ;		gbc.gridy = 1 ;
			p5.add(mobileL,gbc);
			gbc.gridx = 1 ;
			p5.add(mobileT,gbc);
			
			phL = new Label("Phone");
			phT = new TextField();
			gbc.gridx = 0 ;		gbc.gridy = 2 ;
			p5.add(phL,gbc);
			gbc.gridx = 1 ;
			p5.add(phT,gbc);
			
			emailL = new Label("Email");
			emailT = new TextField();
			gbc.gridx = 0 ;		gbc.gridy = 3 ;
			p5.add(emailL,gbc);
			gbc.gridx = 1 ;
			p5.add(emailT,gbc);
			
			
			p6 = new Panel();
			p6.setLayout(gbl);
			salaryL = new Label("Salary");
			salaryT = new TextField();
			gbc.gridx = 0 ;		gbc.gridy = 0 ;
			p6.add(salaryL,gbc);
			gbc.gridx = 1 ;
			p6.add(salaryT,gbc);
			
			hraL = new Label("H.R.A.");
			hraT = new TextField();
			gbc.gridx = 0 ;		gbc.gridy = 1 ;
			p6.add(hraL,gbc);
			gbc.gridx = 1 ;
			p6.add(hraT,gbc);
			
			taL = new Label("T.A.");
			taT = new TextField();
			gbc.gridx = 0 ;		gbc.gridy = 2 ;
			p6.add(taL,gbc);
			gbc.gridx = 1 ;
			p6.add(taT,gbc);
			
			daL = new Label("D.A.");
			daT = new TextField();
			gbc.gridx = 0 ;		gbc.gridy = 3 ;
			p6.add(daL,gbc);
			gbc.gridx = 1 ;
			p6.add(daT,gbc);
			
			p1.add(p3);
			p1.add(p4);
			p1.add(p5);
			p1.add(p6);
			f.setVisible(true);
									
	}
	
	
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource()== back){
				cl.previous(p1);
			}
			else
			if(e.getSource()== nxt){
				cl.next(p1);
			}		
				
		}
	
	public static void main(String args[])
	{
		ButtonProccessFrame bpf = new ButtonProccessFrame();
		
	}
}	




