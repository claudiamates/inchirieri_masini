package view;
import java.awt.ItemSelectable;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JPasswordField;
import javax.swing.JTextField;
//import java.awt.event.ItemListener;
import javax.swing.text.JTextComponent;

public class VehicleView extends JFrame{
	
  private JTextField numeTextField;
  private JTextField prenumeTextField;
  private JTextField adresaTextField;
  private JTextField cnpTextField;
  private JTextField telefonTextField;
  //private JTextField clientTextField;
  //private JTextField carTextField;
  public JComboBox marcaComboBox;
  public JButton okButton;
  public JButton ok2Button;
  public JButton ok3Button;
  public JButton incButton;
  private JTextField anTextField;
  public JComboBox modelComboBox;
  private JTextField locuriTextField;
  private JTextField culoareTextField;
  private JTextField pretTextField;
  private JTextField numeagTextField;
  private JTextField prenumeagTextField;

 private JLabel messageLabel;
  
  public VehicleView()
  {
	  this.setBounds(100,100,1380,800);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  getContentPane().setLayout(null);
	  
	  JLabel clientLabel = new JLabel("Client");
	  clientLabel.setBounds(114, 32, 84, 14);
	  getContentPane().add(clientLabel);
	  
	  JLabel numeLabel = new JLabel("Nume");
	  numeLabel.setBounds(114, 53, 162, 20);
	  getContentPane().add(numeLabel);
	  
	  JLabel prenumeLabel = new JLabel("Prenume");
	  prenumeLabel.setBounds(114,97, 162, 20);
	  getContentPane().add(prenumeLabel);
	  
	  JLabel adresaLabel = new JLabel("Adresa");
	  adresaLabel.setBounds(114,125, 162, 20);
	  getContentPane().add(adresaLabel);
	  
	  JLabel cnpLabel = new JLabel("CNP");
	  cnpLabel.setBounds(114, 157, 162, 20);
	  getContentPane().add(cnpLabel);
	  
	  JLabel telefonLabel = new JLabel("Telefon");
	  telefonLabel.setBounds(114, 198, 162, 20);
	  getContentPane().add(telefonLabel);
	  
	  JLabel carLabel = new JLabel("Car");
	  carLabel.setBounds(513, 32, 162, 20);
	  getContentPane().add(carLabel);
	  
	  JLabel marcaLabel = new JLabel("Marca");
	  marcaLabel.setBounds(513, 53, 162, 20);
	  getContentPane().add(marcaLabel);
	  
	  JLabel modelLabel = new JLabel("Model");
	  modelLabel.setBounds(513, 97, 162, 20);
	  getContentPane().add(modelLabel);
	  
	  JLabel anLabel = new JLabel("An productie");
	  anLabel.setBounds(513, 125, 162, 20);
	  getContentPane().add(anLabel);
	  
	  JLabel locuriLabel = new JLabel("Numar locuri");
	  locuriLabel.setBounds(513, 157, 162, 20);
	  getContentPane().add(locuriLabel);
	  
	  
	  JLabel culoareLabel = new JLabel("Culoare");
	  culoareLabel.setBounds(513, 198, 162, 20);
	  getContentPane().add(culoareLabel);
	  
	  JLabel pretLabel = new JLabel("Pret");
	  pretLabel.setBounds(513, 223, 162, 20);
	  getContentPane().add(pretLabel);
	  
	  JLabel agentLabel = new JLabel("Agent inchirieri");
	  agentLabel.setBounds(910,32,162,20);
	  getContentPane().add(agentLabel);
	  
	  JLabel numeagLabel = new JLabel("Nume");
	  numeagLabel.setBounds(910,53,162,20);
	  getContentPane().add(numeagLabel);
	  
	  JLabel prenumeagLabel = new JLabel("Prenume");
	  prenumeagLabel.setBounds(910,97,162,20);
	  getContentPane().add(prenumeagLabel);
	  
	  
	  numeTextField = new JTextField();
	  numeTextField.setBounds(210,53, 162, 20);
	  getContentPane().add(numeTextField);
	  
	  prenumeTextField = new JTextField();
	  prenumeTextField.setBounds(210, 97,162,20);
	  getContentPane().add(prenumeTextField);
	  
	  adresaTextField = new JTextField();
	  adresaTextField.setBounds(210,125, 162, 20);
	  getContentPane().add(adresaTextField);
	  
	  cnpTextField = new JTextField();
	  cnpTextField.setBounds(210, 157, 162, 20);
	  getContentPane().add(cnpTextField);
	  
	  telefonTextField = new JTextField();
	  telefonTextField.setBounds(210, 198, 162, 20);
	  getContentPane().add(telefonTextField);
	  
	  ok3Button = new JButton("Ok");
	  ok3Button.setBounds(400,53,40,20);
	  getContentPane().add(ok3Button);
	  
	  marcaComboBox = new JComboBox();
	  marcaComboBox .setBounds(612, 53, 162, 20);
	  marcaComboBox.addItem("Opel");
	  marcaComboBox.addItem("Dacia");
	  marcaComboBox.addItem("Chevrolet");
	  marcaComboBox.addItem("Ford");
	  marcaComboBox.addItem("Smart");
	  marcaComboBox.addItem("Skoda");
	  marcaComboBox.addItem("Toyota");
	  marcaComboBox.addItem("Audi");
	  marcaComboBox.addItem("Volkswagen");
	  getContentPane().add(marcaComboBox);
	  
	  okButton = new JButton("Ok");
	  okButton.setBounds(800,53,40,20);
	  getContentPane().add(okButton);
	  
	  modelComboBox = new JComboBox();
	  modelComboBox.setBounds(612, 97, 162, 20);
	  getContentPane().add(modelComboBox);
	  
	  ok2Button = new JButton("Ok");
	  ok2Button.setBounds(800,97,40,20);
	  getContentPane().add(ok2Button);
	  
	  
	  anTextField = new JTextField();
	  anTextField.setBounds(612, 125, 162, 20);
	  getContentPane().add(anTextField);
	  
	  locuriTextField = new JTextField();
	  locuriTextField.setBounds(612,157, 162, 20);
	  getContentPane().add(locuriTextField);
	  
	  culoareTextField = new JTextField();
	  culoareTextField.setBounds(612, 198, 162, 20);
	  getContentPane().add(culoareTextField);
	  
	  pretTextField = new JTextField();
	  pretTextField.setBounds(612, 223, 162, 20);
	  getContentPane().add(pretTextField);
	  
	  setNumeagTextField(new JTextField());
	  getNumeagTextField().setBounds(1010,53,162,20);
	  getContentPane().add(getNumeagTextField());
	  
	  setPrenumeagTextField(new JTextField());
	  getPrenumeagTextField().setBounds(1010,97,162,20);
	  getContentPane().add(getPrenumeagTextField());
	  
	   messageLabel = new JLabel("New label");
		messageLabel.setBounds(114, 300, 420, 20);
		getContentPane().add(messageLabel);
		
		 incButton = new JButton("Inc");
		  incButton.setBounds(114,400,40,20);
		  getContentPane().add(incButton);
	  
  }
 
  public void displayMessage1(String messageText) {
		final Runnable runnable = new Runnable() {

			@Override
			public void run() {
				messageLabel.setText(messageText);
				messageLabel.setVisible(true);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					messageLabel.setVisible(false);
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}	

public JTextField getNumeagTextField() {
	return numeagTextField;
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

public JTextField getNumeTextField() {
	return numeTextField;
}

public void setNumeagTextField(JTextField numeagTextField) {
	this.numeagTextField = numeagTextField;
}

public JTextField getPrenumeagTextField() {
	return prenumeagTextField;
}

public void setPrenumeagTextField(JTextField prenumeagTextField) {
	this.prenumeagTextField = prenumeagTextField;
}

public JTextField getAdresaTextField() {
	return adresaTextField;
}

public void setAdresaTextField(JTextField adresaTextField) {
	this.adresaTextField = adresaTextField;
}

public JTextField getCnpTextField() {
	return cnpTextField;
}

public void setCnpTextField(JTextField cnpTextField) {
	this.cnpTextField = cnpTextField;
}

public JTextField getTelefonTextField() {
	return telefonTextField;
}

public void setTelefonTextField(JTextField telefonTextField) {
	this.telefonTextField = telefonTextField;
}

public JTextField getAnTextField() {
	return anTextField;
}

public void setAnTextField(JTextField anTextField) {
	this.anTextField = anTextField;
}

public JTextField getCuloareTextField() {
	return culoareTextField;
}

public void setCuloareTextField(JTextField culoareTextField) {
	this.culoareTextField = culoareTextField;
}

public JTextField getLocuriTextField() {
	return locuriTextField;
}

public void setLocuriTextField(JTextField locuriTextField) {
	this.locuriTextField = locuriTextField;
}

public JTextField getPretTextField() {
	return pretTextField;
}

public void setPretTextField(JTextField pretTextField) {
	this.pretTextField = pretTextField;
}

public void addOkButtonActionListener(final ActionListener actionListener) {
	  okButton.addActionListener(actionListener);
	}

public void addOk2ButtonActionListener(final ActionListener actionListener) {
	  ok2Button.addActionListener(actionListener);
	}

public void addOk3ButtonActionListener(final ActionListener actionListener) {
	  ok3Button.addActionListener(actionListener);
	}

public void addIncButtonActionListener(final ActionListener actionListener) {
	  incButton.addActionListener(actionListener);
	}

public void addNumeTextFielActionListener(final ActionListener actionListener) {
	  numeTextField.addActionListener(actionListener);
}

public void addPrenumeTextFielActionListener(final ActionListener actionListener) {
	  prenumeTextField.addActionListener(actionListener);
}

public void addAdresaTextFielActionListener(final ActionListener actionListener) {
	  adresaTextField.addActionListener(actionListener);
}

public void addCnpTextFielActionListener(final ActionListener actionListener) {
	  cnpTextField.addActionListener(actionListener);
}

public void addTelefonTextFielActionListener(final ActionListener actionListener) {
	  telefonTextField.addActionListener(actionListener);
}

}