package view;

import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class RepairView extends JFrame{
	
	private JTextField numeTextField;
	private JTextField prenumeTextField;
	private JTextField damageTextField;
	private JTextField priceTextField;
	private JButton okButton;
	
	public RepairView()
	{
	   this.setBounds(100,100,560,515);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   getContentPane().setLayout(null);
		  
	   JLabel mecanicLabel = new JLabel("Mecanic");
	   mecanicLabel.setBounds(114,32,162,20);
	   getContentPane().add(mecanicLabel);
	   
	   JLabel numeLabel = new JLabel("Nume");
	   numeLabel.setBounds(114,53,162,20);
	   getContentPane().add(numeLabel);
	   
	   JLabel prenumeLabel = new JLabel("Prenume");
	   prenumeLabel.setBounds(114,84,162,20);
	   getContentPane().add(prenumeLabel);
	   
	   JLabel damageLabel = new JLabel("Damage");
	   damageLabel.setBounds(114,135,162,20);
	   getContentPane().add(damageLabel);
	   
	   JLabel priceLabel = new JLabel("Pret");
	   priceLabel.setBounds(114,164,162,20);
	   getContentPane().add(priceLabel);
	   
	   numeTextField = new JTextField();
	   numeTextField.setBounds(210,53,162,20);
	   getContentPane().add(numeTextField);
	   
	   prenumeTextField = new JTextField();
	   prenumeTextField.setBounds(210,84,162,20);
	   getContentPane().add(prenumeTextField);
	   
	   damageTextField = new JTextField();
	   damageTextField.setBounds(210,135,162,20);
	   getContentPane().add(damageTextField);
	   
	   priceTextField = new JTextField();
	   priceTextField.setBounds(210,164,162,20);
	   getContentPane().add(priceTextField);
	   
	   okButton = new JButton("Ok");
	   okButton.setBounds(210, 200, 40, 20);
	   getContentPane().add(okButton);
	}

	public JTextField getNumeTextField() {
	return numeTextField;
}

public void setNumeTextField(JTextField numeTextField) {
	this.numeTextField = numeTextField;
}

public JTextField getPrenumeTextField() {
	return prenumeTextField;
}

public void setPrenumeTextField(JTextField prenumeTextField) {
	this.prenumeTextField = prenumeTextField;
}

public JTextField getDamageTextField() {
	return damageTextField;
}

public void addOkRaButtonActionListener(final ActionListener actionListener) {
	  okButton.addActionListener(actionListener);
	}

}
