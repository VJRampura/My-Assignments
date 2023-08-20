import java.awt.*;
class GridBagLayoutFrameTry{
	public static void main(String args[]){
		Frame f = new Frame("Login Screen");
		f.setSize(400,300);
		f.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 1 ;		gbc.gridy = 1 ;
		gbc.ipadx = 6 ;		gbc.ipady = 4 ;
		gbc.gridwidth = 2;  gbc.gridheight = 2 ;
		gbc.weightx = 1.0 ;		gbc.weighty = 1.0;
		gbc.anchor = GridBagConstraints.NORTHEAST;
		Label l = new Label("Name      ");
		f.add(l,gbc);
		
		
		f.setVisible(true);
		
		 
	}
}