package Vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Comprobacion extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Comprobacion() {
		setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(53, 41, 46, 14);
		add(lblId);
		
		textField = new JTextField();
		textField.setBounds(53, 65, 46, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblerApellido = new JLabel("1er Apellido");
		lblerApellido.setBounds(194, 41, 80, 14);
		add(lblerApellido);
		
		textField_1 = new JTextField();
		textField_1.setBounds(188, 65, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnComprobat = new JButton("COMPROBAR");
		btnComprobat.setBounds(120, 117, 181, 23);
		add(btnComprobat);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120, 151, 181, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(53, 221, 89, 23);
		add(btnAtras);

	}

}
