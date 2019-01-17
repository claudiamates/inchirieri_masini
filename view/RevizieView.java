package view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class RevizieView extends JFrame {
	
	private JTextField numeTextField;
	private JTextField prenumeTextField;
	private JTextField data_revizieTextField;
	private JTextField data_expirareTextField;
	private JTextField priceTextField;
	private JButton okButton;
	
	public RevizieView()
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
	   
	   JLabel data_revizieLabel = new JLabel("Data revizie");
	   data_revizieLabel.setBounds(114,143,162,20);
	   getContentPane().add(data_revizieLabel);
	   
	   JLabel data_expirareLabel = new JLabel("Data expirare");
	   data_expirareLabel.setBounds(114,173,162,20);
	   getContentPane().add(data_expirareLabel);
	   
	   JLabel pretLabel = new JLabel("Pret");
	   pretLabel.setBounds(114,202,162,20);
	   getContentPane().add(pretLabel);
	   
	   numeTextField = new JTextField();
	   numeTextField.setBounds(210,53,162,20);
	   getContentPane().add(numeTextField);

	   prenumeTextField = new JTextField();
	   prenumeTextField.setBounds(210,84,162,20);
	   getContentPane().add(prenumeTextField);
	   
	   data_revizieTextField = new JTextField();
	   data_revizieTextField.setBounds(210,143,162,20);
	   getContentPane().add(data_revizieTextField);
	   
	   data_expirareTextField = new JTextField();
	   data_expirareTextField.setBounds(210,173,162,20);
	   getContentPane().add(data_expirareTextField);
	   
	   priceTextField = new JTextField();
	   priceTextField.setBounds(210,202,162,20);
	   getContentPane().add(priceTextField);
	   
	   okButton = new JButton("Ok");
	   okButton.setBounds(210, 300, 40, 20);
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
	
	public void setPreumeTextField(JTextField prenumeTextField) {
		this.prenumeTextField = prenumeTextField;
	}
	
	public void addOkRButtonActionListener(final ActionListener actionListener) {
		  okButton.addActionListener(actionListener);
		}
}
