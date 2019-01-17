package view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogInDirectorView extends JFrame{

	 private JTextField usernameTextField;
	  private JPasswordField passwordTextField;
	  private JButton vizualizareButton;
	  
	  
	  public LogInDirectorView()
	  {
		  this.setBounds(100,100,630,300);
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  getContentPane().setLayout(null);
		  
		  JLabel usernameLabel = new JLabel("Username");
		  usernameLabel.setBounds(114, 32, 84, 14);
		  getContentPane().add(usernameLabel);
		  
		  JLabel passwordLabel = new JLabel("Password");
		  passwordLabel.setBounds(114, 84, 55, 14);
		  getContentPane().add(passwordLabel);
		  
		  usernameTextField = new JTextField();
		  usernameTextField.setBounds(210, 32, 162, 20);
		  getContentPane().add(usernameTextField);
		  
		  passwordTextField = new JPasswordField();
		  passwordTextField.setBounds(210, 84, 162, 20);
		  getContentPane().add(passwordTextField);
		  
		  vizualizareButton = new JButton("Vizualizare");
		  vizualizareButton.setBounds(114, 120, 162, 23);
		  getContentPane().add(vizualizareButton);
		  
		  
	  }
	  
	  public void addVizualizareButtonActionListener(final ActionListener actionListener) {
			vizualizareButton.addActionListener(actionListener);
		}
	  
	  public String getUsername() {
			return usernameTextField.getText();
		}

		public String getPassword() {
			return String.valueOf(passwordTextField.getPassword());
		}
}
