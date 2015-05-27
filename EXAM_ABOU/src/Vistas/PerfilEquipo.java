package Vistas;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import Controller.CadeteControler;
import Model.Cadete;


public class PerfilEquipo extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	private Cadete cadeteSeleccionado;

	
	private Principal principal;
	private CadeteControler cc;
	
	
	
	public PerfilEquipo() {
		setLayout(null);

		
		
		Cadete cd = new Cadete();
		ArrayList<String> cadetes = cd.load();
	
		
		//ponemos un deplegable 
		//comboBox = new JComboBox(nombresUsuario.toArray());
		JComboBox comboBox = new JComboBox();
		comboBox = new JComboBox(cadetes.toArray());
		comboBox.setBounds(44, 55, 73, 20);
		add(comboBox);
		
		
		JLabel lblEquipo = new JLabel("Equipo");
		lblEquipo.setBounds(59, 30, 61, 14);
		add(lblEquipo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(193, 30, 46, 14);
		add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(191, 48, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblerApellido = new JLabel("1er Apellido");
		lblerApellido.setBounds(193, 79, 84, 14);
		add(lblerApellido);
		
		textField_1 = new JTextField();
		textField_1.setBounds(191, 104, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblerApellido_1 = new JLabel("2er Apellido");
		lblerApellido_1.setBounds(193, 135, 84, 14);
		add(lblerApellido_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(191, 150, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(193, 181, 84, 14);
		add(lblNacionalidad);
		
		textField_3 = new JTextField();
		textField_3.setBounds(191, 199, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(333, 30, 46, 14);
		add(lblId);
		
		textField_4 = new JTextField();
		textField_4.setBounds(333, 48, 86, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
	
		
	
		
		
		
	}

	
	
	private void volcadoDatos(){
		
		textField.setText(this.cadeteSeleccionado.getNombre());
		textField_3.setText(String.valueOf(this.cadeteSeleccionado.getId()));
	
		textField_4.setText(this.cadeteSeleccionado.getNacionalidad());
	}
	
	private void boton(){
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBotonAtras();
			}
		});
		btnAtras.setBounds(59, 252, 89, 23);
		add(btnAtras);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBotonSiguiente();
			}
		});
		btnSiguiente.setBounds(316, 252, 89, 23);
		add(btnSiguiente);
	}
	
private void accionBotonAtras(){
	//CAMBIO DE PANEL RECOGIENDO EL CONTENEDOR DEL FRAME (CARDLAYOUT)
	CardLayout layout = (CardLayout) principal.getContentPane().getLayout();
	layout.show(principal.getContentPane(), "PanelUsuario");
}

private void accionBotonSiguiente(){
	CardLayout layout = (CardLayout) principal.getContentPane().getLayout();
	layout.show(principal.getContentPane(), "PanelComprobacion");
}
}
	
	
	/*private void volcadoDatos(){
		textField.setText(CadeteSeleccionado.getNombre());
		textField_1.setText(CadeteSeleccionado.getApellidos());
		textField_2.setText(CadeteSeleccionado.getApellidos());
		textField_3.setText(CadeteSeleccionado.getNacionalidad());
		textField_3.setText(String.valueOf(CadeteSeleccionado.getId()));
	
		
		
	}*/

