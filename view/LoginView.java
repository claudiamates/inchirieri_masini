package view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame{
	
  private JTextField usernameTextField;
  private JPasswordField passwordTextField;
  private JButton inchiriereButton;
  private JButton reparetiiButton;
  private JButton revizieButton;
  private JLabel messageLabel;
  
  
  public LoginView()
  {
	  this.setBounds(100,100,394,300);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  getContentPane().setLayout(null);
	  
	  JLabel usernameLabel = new JLabel("Username");
	  usernameLabel.setBounds(114, 32, 84, 14);
	  getContentPane().add(usernameLabel);
	  
	  JLabel passwordLabel = new JLabel("Password");
	  passwordLabel.setBounds(114, 84, 55, 14);
	  getContentPane().add(passwordLabel);
	  
	  usernameTextField = new JTextField();
	  usernameTextField.setBounds(114, 53, 162, 20);
	  getContentPane().add(usernameTextField);
	  
	  passwordTextField = new JPasswordField();
	  passwordTextField.setBounds(114, 109, 162, 20);
	  getContentPane().add(passwordTextField);
	  
	  inchiriereButton = new JButton("Inchiriere");
	  inchiriereButton.setBounds(114, 157, 162, 23);
	  getContentPane().add(inchiriereButton);
	  
	  reparetiiButton = new JButton("Reparatii");
	  reparetiiButton.setBounds(114, 191, 162, 23);
	  getContentPane().add( reparetiiButton);
	  
	  revizieButton = new JButton("Revizie");
	  revizieButton.setBounds(114, 230, 162, 23);
	  getContentPane().add(revizieButton);
	  
	    messageLabel = new JLabel("New label");
		messageLabel.setBounds(12, 224, 356, 16);
		getContentPane().add(messageLabel);
	  
	  /*togglePasswordButton = new JButton("?");
	  togglePasswordButton.setBounds(288, 107, 39, 22);
		getContentPane().add(togglePasswordButton);*/
  }
  
  public void addInchiriereButtonActionListener(final ActionListener actionListener) {
	  inchiriereButton.addActionListener(actionListener);
	}

	public void addReparatiiButtonActionListener(final ActionListener actionListener) {
		reparetiiButton.addActionListener(actionListener);
	}
	
	public void addRevizieButtonActionListener(final ActionListener actionListener) {
		revizieButton.addActionListener(actionListener);
	}


	public String getUsername() {
		return usernameTextField.getText();
	}

	public String getPassword() {
		return String.valueOf(passwordTextField.getPassword());
	}

	public void displayMessage(String messageText) {
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

	public void hidePassword() {
		passwordTextField.setEchoChar('*');
	}

	public void displayPassword() {
		passwordTextField.setEchoChar((char) 0);
	}

}
