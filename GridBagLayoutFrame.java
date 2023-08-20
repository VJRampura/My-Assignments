import java.awt.*;
class GridBagLayoutFrame{
	public static void main(String args[]){
		Frame f = new Frame("Login Screen");
		f.setSize(400,300);
		f.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.weightx = 1.0 ;		gbc.weighty = 1.0;
		gbc.gridx = 0 ;		gbc.gridy = 0 ;
		Label l = new Label("Name      ");
		f.add(l,gbc);
		
		TextField tf = new TextField();
		gbc.gridx = 1;  
		gbc.ipadx = 100; gbc.ipady = 2;
		f.add(tf,gbc);
		
		Label l1 = new Label("Password");
		gbc.ipadx = 2; gbc.ipady = 2;
		gbc.gridx = 0 ;		gbc.gridy = 1 ;
		f.add(l1,gbc);
		
		TextField tf1 = new TextField();
		gbc.gridx = 1 ;
		gbc.ipadx = 100; gbc.ipady = 2;
		f.add(tf1,gbc);
		
		Button b = new Button("Ok");
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.ipadx = 16; gbc.ipady = 4;
		gbc.gridx = 0 ; 	gbc.gridy = 2 ;
		gbc.gridwidth = 2 ; gbc.gridheight = 1 ;
		f.add(b,gbc);
		f.setVisible(true);
		
		 
	}
}