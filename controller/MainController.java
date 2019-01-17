package controller;

import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.UIManager;

import database.Database;
import view.DirectorView;
import view.LogInDirectorView;
import view.LoginView;
import view.RepairView;
import view.RevizieView;
import view.StartView;
import view.VehicleView;

public class MainController {

	private LoginView loginView;
	private VehicleView vehicleView;
	private RepairView repairView;
	private RevizieView revizieView;
	private StartView startView;
	private LogInDirectorView logindirectorView;
	private DirectorView directorView;
	private Database dConnection = null;
	private String nume;
	private String prenume;
	private String cnp;
	private String telefon;
	private String adresa;
	private String id_a = "0";
	private String id_c ="0";
	private String id_m="0";

	public void start() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		loginView = new LoginView();
		vehicleView = new VehicleView();
		repairView = new RepairView();
		revizieView =new RevizieView();
		startView = new StartView();
		logindirectorView = new LogInDirectorView();
		directorView = new DirectorView();

		initializeButtonListeners();

		startView.setVisible(true);
	}

	
	private void initializeButtonListeners() {
		startView.addAngajatButtonActionListener(e ->{
			loginView.setVisible(true);
			startView.setVisible(false);
		});
		
		startView.addDirectorButtonActionListener(e ->{
			logindirectorView.setVisible(true);
			startView.setVisible(false);
		});
		
		logindirectorView.addVizualizareButtonActionListener(e ->{
		   final String username0 = logindirectorView.getUsername();
			final String password0 = logindirectorView.getPassword();
			ResultSet rs0;
			//String salariu="0";
			int c0 = 0;
			dConnection = Database.getInstance();
			
			
			try {
				if (username0 != null && password0 != null)

				{
					
					rs0 = dConnection
							.executeStatement("select nume,prenume from Director where nume='" + username0  + "' and prenume='"+password0+"';");
					while (rs0.next()) {
						if ((username0.equals(rs0.getString("nume"))) && (password0.equals(rs0.getString("prenume")))) {
							c0 = 1;
							//salariu=rs.getString("salariu");
							id_a = password0; 
						}
					}
					

				}
				if (c0 == 1) {
					directorView.setVisible(true);
			        logindirectorView.setVisible(false);
					}
			 else
			    System.out.println("director inexistent");
				//loginView.displayMessage("angajatul nu exista");
		} catch (SQLException e0) {
			// TODO Auto-generated catch block
			e0.printStackTrace();
		}

		});
		
		directorView.addOkActionListener(e ->{
			ResultSet rs9;
			try {
				rs9 = dConnection
						.executeStatement("select incasari_medii,numar_masini_detinute,numar_angajati from Firma;");
				while (rs9.next()) {
					directorView.getIncasariTextField().setText(rs9.getString("incasari_medii"));
					directorView.getMasiniTextField().setText(rs9.getString("numar_masini_detinute"));
					directorView.getAngajatTextField().setText(rs9.getString("numar_angajati"));
				}
				
			}catch (SQLException e9) {
				// TODO Auto-generated catch block
				e9.printStackTrace();
			}
		});
		
		loginView.addInchiriereButtonActionListener(e -> {
			final String username = loginView.getUsername();
			final String password = loginView.getPassword();
			ResultSet rs;
			String prenume="0";
			int c = 0;
			dConnection = Database.getInstance();
			
			// final User user = userService.get(username);
			try {
				if (username != null && password != null)

				{
					// try {
					rs = dConnection
							.executeStatement("select nume,id_agent,prenume from Agent_inchirieri where nume='" + username  + "' and id_agent='"+password+"';");
					while (rs.next()) {
						if ((username.equals(rs.getString("nume"))) && (password.equals(rs.getString("id_agent")))) {
							c = 1;
							prenume=rs.getString("prenume");
							id_a = password; 
						}
					}
					// }catch(SQLException ec)
					// {
					// ec.printStackTrace();
					// }

				}
				if (c == 1) {
					vehicleView.setVisible(true);
					loginView.setVisible(false);
					vehicleView.getNumeagTextField().setText(username);
					vehicleView.getPrenumeagTextField().setText(prenume);
					//vehicleView.initializeButtonListener(e);
					
					/*vehicleView.getNumeTextField().addActionListener(newActionListener(){
						public void actionPerformed(ActionEvent e)
						{
							String s=vehicleView.getNumeTextField().getText().trim;
						}
					});*/
					/*vehicleView.getNumeTextField().addActionListener(new ActionListener()
							{
						
							});*/
				} else
				    //System.out.println("angajatul nu exista");
					loginView.displayMessage("angajatul nu exista");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		
			vehicleView.addOkButtonActionListener(e ->{
				//if(vehicleView.okButton.getModel().isPressed())
				//{
					  String item = (String) vehicleView.marcaComboBox.getSelectedItem();
					  switch (item)
					  {
					  case "Opel":
						  vehicleView.modelComboBox.removeAllItems();
						  vehicleView.modelComboBox.addItem("Corsa");
						  vehicleView.modelComboBox.addItem("Astra");
				      	  break;
					  case "Dacia":
						  vehicleView.modelComboBox.removeAllItems();
						  vehicleView.modelComboBox.addItem("Duster");
						  vehicleView.modelComboBox.addItem("Logan");
						  vehicleView.modelComboBox.addItem("1310");
				      	break;
					  case "Chevrolet":
						  vehicleView.modelComboBox.removeAllItems();
						  vehicleView.modelComboBox.addItem("Impala");
						  vehicleView. modelComboBox.addItem("Malibu");
						  vehicleView.modelComboBox.addItem("Cruze");
				      	break;
					  case "Ford":
						  vehicleView.modelComboBox.removeAllItems();
						  vehicleView.modelComboBox.addItem("Bronco");
						  vehicleView.modelComboBox.addItem("Fiesta");
				          	break;
					  case "Smart":
						  vehicleView.modelComboBox.removeAllItems();
						  vehicleView.modelComboBox.addItem("ForTwo");
				          	break;
					  case "Skoda":
						  vehicleView.modelComboBox.removeAllItems();
						  vehicleView.modelComboBox.addItem("Fabia");
						  vehicleView.modelComboBox.addItem("Octavia");
				          	break;
					  case "Toyota":
						  vehicleView.modelComboBox.removeAllItems();
						  vehicleView.modelComboBox.addItem("RVA4");
						  vehicleView.modelComboBox.addItem("Sequoia");
						  vehicleView.modelComboBox.addItem("C-HR");
				          	break;
					  case "Audi":
						  vehicleView.modelComboBox.removeAllItems();
						  vehicleView.modelComboBox.addItem("Q3");
						  vehicleView.modelComboBox.addItem("A6");
				          	break;
					  case "Volkswagen":
						  vehicleView.modelComboBox.removeAllItems();
						  vehicleView.modelComboBox.addItem("Golf");
						  vehicleView.modelComboBox.addItem("GolfPlus");
				          	break;
				      default: break;
					  }
				//}
					/*  dConnection = Database.getInstance();
					  ResultSet rs4;
					  try {
					  rs4 = dConnection
								.executeStatement("select* from Car where;");
					  if((rs4.getString("marca").equals((String)vehicleView.marcaComboBox.getSelectedItem()))&&(rs4.getString("model").equals((String)vehicleView.marcaComboBox.getSelectedItem())))
					  {
						if(rs4.getString("disponibilitate")=="indisponibil")
						{
							vehicleView.displayMessage1("Vehiculul este indisponibil. Selectati alt vehicul");
						}
					  }
					  }catch(SQLException e4) {
							// TODO Auto-generated catch block
							e4.printStackTrace();
						}*/
			});
			
			vehicleView.addOk2ButtonActionListener(e ->{
				final String i1 = (String)vehicleView.marcaComboBox.getSelectedItem();
				final String i2 = (String)vehicleView.modelComboBox.getSelectedItem();
				final String disponibilitate = "indisponibil";
				ResultSet rs4;
				dConnection = Database.getInstance();
				try {
					if(i1 != null && i2!=null)
					{
						rs4 = dConnection
								.executeStatement("select * from Car where marca='" + i1  + "' and model='"+i2+"';");
						while(rs4.next()) {
						if((i1.equals(rs4.getString("marca")))&&(i2.equals(rs4.getString("model"))))
						{
							if(disponibilitate.equals(rs4.getString("disponibilitate")))
							{
								vehicleView.displayMessage1("Vehiculul este indisponibil. Selectati alt vehicul");
								
							}
							else
							{
								String a = rs4.getString("an_productie");
								String b = rs4.getString("culoare");
								id_c = rs4.getString("id_car");
							    Integer d = rs4.getInt("nr_locuri");
								Integer f = rs4.getInt("pret_per_zi");
								
								vehicleView.getAnTextField().setText(a);
								vehicleView.getCuloareTextField().setText(b);
								vehicleView.getLocuriTextField().setText(d.toString());
								vehicleView.getPretTextField().setText(f.toString());
								//System.out.println(id_c);
							}
						}
						}
						
					}
				}catch(SQLException e4) {
					// TODO Auto-generated catch block
					e4.printStackTrace();
				}
			});
		
		
		loginView.addReparatiiButtonActionListener(e ->{
			final String username1 = loginView.getUsername();
			final String password1 = loginView.getPassword();
			ResultSet rs1;
			int c1 = 0;
			String prenume1 = "0";
			dConnection = Database.getInstance();
			try
			{
				if(username1 != null && password1 != null)
				{
					rs1 = dConnection.executeStatement("select nume,id_mecanic,prenume from Mecanic where nume='"+username1+"' and id_mecanic='"+password1+"';");
						while(rs1.next())
						{
							if((username1.equals(rs1.getString("nume"))) && (password1.equals(rs1.getString("id_mecanic"))))
							{
								c1=1;
								prenume1=rs1.getString("prenume");
								id_m =password1;
							}
						}
						if (c1 == 1) {
							repairView.setVisible(true);
							loginView.setVisible(false);
							repairView.getNumeTextField().setText(username1);
							repairView.getPrenumeTextField().setText(prenume1);
						} 
						else
						    System.out.println("angajatul nu exista");
				}
			}
			catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		});
		
		loginView.addRevizieButtonActionListener(e ->{
			final String username2 = loginView.getUsername();
			final String password2 = loginView.getPassword();
			ResultSet rs2;
			String nume2="0";
			int c2 = 0;
			dConnection = Database.getInstance();
			try
			{
				if(username2 != null && password2 != null)
				{
					rs2 = dConnection.executeStatement("select prenume,id_mecanic,nume from Mecanic where prenume='"+username2+"' and id_mecanic='"+password2+"';");
						while(rs2.next())
						{
							if((username2.equals(rs2.getString("prenume"))) && (password2.equals(rs2.getString("id_mecanic"))))
							{
								c2=1;
								nume2=rs2.getString("nume");
								id_m = password2;
								System.out.println(id_m);
							}
						}
						if (c2 == 1) {
							revizieView.setVisible(true);
							loginView.setVisible(false);
							revizieView.getPrenumeTextField().setText(username2);
							revizieView.getNumeTextField().setText(nume2);
						} 
						else
						    System.out.println("angajatul nu exista");
				}
			}
			catch (SQLException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			
		});
		
		vehicleView.addOk3ButtonActionListener(e->{

			nume = vehicleView.getNumeTextField().getText();
			prenume = vehicleView.getPrenumeTextField().getText();
			adresa = vehicleView.getAdresaTextField().getText();
			cnp = vehicleView.getCnpTextField().getText();
			telefon = vehicleView.getTelefonTextField().getText();
			try {
				Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/managment_inchirieri_masini", "root", "Rdia#98COK");
				CallableStatement mystmt = myConn.prepareCall("{call adaugare_client(?,?,?,?,?,?)}");
				mystmt.setString(1, nume);
				mystmt.setString(2, prenume);
				mystmt.setString(3, cnp);
				mystmt.setString(4, telefon);
				mystmt.setString(5, adresa);
				mystmt.setString(6, id_a);
				mystmt.execute();
				
				
			}catch(SQLException e5)
			{
				e5.printStackTrace();
			}
			
			});
		
		vehicleView.addIncButtonActionListener(e->{
			try {
			Connection myConn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/managment_inchirieri_masini", "root", "Rdia#98COK");
			CallableStatement mystmt1 = myConn1.prepareCall("{call incheiere_inchiriere(?,?)}");
			
			mystmt1.setString(1, id_a);
			System.out.println(id_a);
			mystmt1.setString(2, id_c);
			System.out.println(id_c);
			mystmt1.execute();
			
			
			/*CallableStatement mystmt1_1 = myConn1.prepareCall("{call disponibilitate(?)}");
			mystmt1_1.setString(1, id_c);
			mystmt1_1.execute();
			
			CallableStatement mystmt1_2=myConn1.prepareCall("{call calculare_pret(?,?)}");
			String s = new String();
			
			mystmt1_2.setString(1, s);
			mystmt1_2.setString(2, id_c);
			mystmt1_2.execute();*/
			}catch(SQLException e6)
			{
				e6.printStackTrace();
			}
		});
		
		revizieView.addOkRButtonActionListener(e ->{
			try {
			Connection myConn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/managment_inchirieri_masini", "root", "Rdia#98COK");
			CallableStatement mystmt2 = myConn2.prepareCall("{call revizie(?,?)}");
			
			//String st = new String("5");
			mystmt2.setLong(1, 5);
			//System.out.println(st);
			mystmt2.setString(2, id_m);
			System.out.println(id_m);
			mystmt2.execute();
			}catch(SQLException e7)
			{
				e7.printStackTrace();
			}
		});
		
		repairView.addOkRaButtonActionListener(e ->{
			try {
				Connection myConn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/managment_inchirieri_masini", "root", "Rdia#98COK");
				Statement st = myConn3.createStatement();
				ResultSet rs8;
				String id_d = "0";
				String damage = repairView.getDamageTextField().getText();
				rs8 = st.executeQuery("select id_damage from Damage where damage_tipe='"+damage+"';");
				while(rs8.next())
				{
					id_d = rs8.getString("id_damage");
				}
				
				CallableStatement mystmt3 = myConn3.prepareCall("{call reparatie(?,?,?)}");
				
				String st1 = new String("5");
				mystmt3.setString(1, id_m);
				mystmt3.setString(2, id_d);
				mystmt3.setString(3, st1);
				mystmt3.execute();
			}catch(SQLException e8)
			{
				e8.printStackTrace();
			}
		});
}
}