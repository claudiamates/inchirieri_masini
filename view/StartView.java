package view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StartView extends JFrame{

	private JButton directorButton;
	private JButton angajatButton;
	
	public StartView()
	{
		 this.setBounds(100,100,200,200);
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  getContentPane().setLayout(null);
		  
		  JLabel massegeLabel = new JLabel("Alegeti utilizatorul");
		  massegeLabel.setBounds(10, 10, 170, 20);
		  getContentPane().add(massegeLabel);
		  
		  directorButton = new JButton("Director");
		  directorButton.setBounds(10, 45, 162, 23);
		  getContentPane().add( directorButton);
		  
		  angajatButton = new JButton("Angajat");
		  angajatButton.setBounds(10, 76, 162, 23);
		  getContentPane().add( angajatButton);
	}
	
	public void addDirectorButtonActionListener(final ActionListener actionListener)
	{
		directorButton.addActionListener(actionListener);
	}
	
	public void addAngajatButtonActionListener(final ActionListener actionListener)
	{
		angajatButton.addActionListener(actionListener);
	}
}
