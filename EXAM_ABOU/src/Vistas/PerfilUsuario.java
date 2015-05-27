package Vistas;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import Controller.CadeteControler;
import Model.Cadete;

public class PerfilUsuario extends JPanel {
	
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	private Principal principal;
	private Cadete cadete;
	private CadeteControler cc;
	private JTextField textField_1;
	
	public PerfilUsuario() {
		setLayout(null);


		
		
		//imagen
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PerfilUsuario.class.getResource("/img/perfil_icono.png")));
		lblNewLabel.setBounds(28, 56, 151, 170);
		add(lblNewLabel);


		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(246, 58, 46, 14);
		add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(246, 74, 86, 20);
		add(textField);
		textField.setText(cc.loadCadete().getNombre());
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(363, 58, 46, 14);
		add(lblId);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(246, 106, 46, 14);
		add(lblApellidos);
		
		textField_2 = new JTextField();
		textField_2.setBounds(246, 125, 86, 20);
		add(textField_2);
		textField_2.setText(cc.loadCadete().getApellidos());
		textField_2.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(246, 156, 46, 14);
		add(lblEdad);
		
		textField_3 = new JTextField();
		textField_3.setBounds(246, 181, 86, 20);
		add(textField_3);
		textField_3.setText(String.valueOf(cc.loadCadete().getEdad()));
		textField_3.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(246, 212, 86, 14);
		add(lblNacionalidad);
		
		textField_4 = new JTextField();
		textField_4.setBounds(246, 237, 86, 20);
		add(textField_4);
		textField_4.setText(cc.loadCadete().getNacionalidad());
		textField_4.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(363, 74, 86, 20);
		add(textField_1);
		textField_1.setText(String.valueOf(cc.loadCadete().getId()));
		textField_1.setColumns(10);
		
	
	
		
		/*boton();
		accionBotonSiguiente();
	}
	private void boton(){
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBotonSiguiente();
			}
		});
		btnSiguiente.setBounds(363, 282, 89, 23);
		add(btnSiguiente);
	}
	private void accionBotonSiguiente(){
		CardLayout layout = (CardLayout) Principal.getContentPane().getLayout();
		layout.show(Principal.getContentPane(), "VistaEquipo");
	
}*/
}	
}
	
	

