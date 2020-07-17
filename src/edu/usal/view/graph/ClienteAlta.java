package edu.usal.view.graph;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;

public class ClienteAlta extends JFrame {


	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDni;
	private JTextField textCuit;
	private JTextField textEmail;
	private JTextField textCalle;
	private JTextField textAltura;
	private JTextField textCiudad;
	private JTextField textFieldNumPasaporte;
	private JTextField textAutoridadEmision;
	private JTextField textPersonal;
	private JTextField textLaboral;
	private JTextField textField;
	private JTextField textAlianza;
	private JTextField textCategoria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteAlta frame = new ClienteAlta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClienteAlta() {
		setType(Type.UTILITY);
		getContentPane().setForeground(Color.GRAY);
		getContentPane().setBackground(Color.WHITE);
		setFont(new Font("Arial", Font.PLAIN, 12));
		setTitle("AltaCliente");

		JLabel lblNombre = new JLabel("Nombre");

		JLabel lblApellido = new JLabel("Apellido");

		txtNombre = new JTextField();
		txtNombre.setColumns(10);

		txtApellido = new JTextField();
		txtApellido.setColumns(10);

		JLabel lblDni = new JLabel("DNI");

		txtDni = new JTextField();
		txtDni.setColumns(10);

		JLabel lblCuit = new JLabel("CUIT");

		textCuit = new JTextField();
		textCuit.setColumns(10);

		JLabel lblEmail = new JLabel("Email");

		textEmail = new JTextField();
		textEmail.setColumns(10);

		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");

		JDateChooser dateChooserCliente = new JDateChooser();

		JLabel lblCalle = new JLabel("Calle");

		textCalle = new JTextField();
		textCalle.setColumns(10);

		JLabel lblAltura = new JLabel("Altura");

		textAltura = new JTextField();
		textAltura.setColumns(10);

		JLabel lblCiudad = new JLabel("Ciudad");

		textCiudad = new JTextField();
		textCiudad.setColumns(10);

		JLabel lblCp = new JLabel("CP");

		JTextArea textCP = new JTextArea();

		JLabel lblPais = new JLabel("Pais");

		JComboBox comboBoxPais = new JComboBox();

		JLabel lblProvincia = new JLabel("Provincia");

		JComboBox comboBoxProvincia = new JComboBox();

		JLabel lblNPasaporte = new JLabel("N\u00B0 Pasaporte");

		textFieldNumPasaporte = new JTextField();
		textFieldNumPasaporte.setColumns(10);

		JLabel lblEmitido = new JLabel("Emitido");

		textAutoridadEmision = new JTextField();
		textAutoridadEmision.setColumns(10);

		JLabel lblFechaEmision = new JLabel("Fecha Emision");

		JDateChooser dateChooserEmisionP = new JDateChooser();

		JLabel lblFechaVencimiento = new JLabel("Fecha Vencimiento");

		JDateChooser dateChooser = new JDateChooser();

		JLabel lblOrigen = new JLabel("Origen");

		JComboBox comboBoxOrigenP = new JComboBox();

		JLabel lblNpersonal = new JLabel("N\u00B0Personal");

		textPersonal = new JTextField();
		textPersonal.setColumns(10);

		JLabel lblNlaboral = new JLabel("N\u00B0Laboral");

		textLaboral = new JTextField();
		textLaboral.setColumns(10);

		JLabel lblNcelular = new JLabel("N\u00B0Celular");

		textField = new JTextField();
		textField.setColumns(10);

		JLabel lblAlianza = new JLabel("Alianza");

		textAlianza = new JTextField();
		textAlianza.setColumns(10);

		JLabel lblCategoria = new JLabel("Categoria");

		textCategoria = new JTextField();
		textCategoria.setColumns(10);

		JLabel lblAerolinea = new JLabel("Aerolinea");

		JComboBox comboBox = new JComboBox();

		JButton btnAltaCliente = new JButton("Alta Cliente");

		JButton btnCancelar = new JButton("Cancelar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setAutoCreateContainerGaps(true);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblDni)
														.addComponent(lblCalle)
														.addComponent(lblPais)
														.addComponent(lblEmitido)
														.addComponent(lblOrigen)
														.addComponent(lblAlianza))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(textAlianza, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
														.addComponent(comboBoxOrigenP, 0, 49, Short.MAX_VALUE)
														.addComponent(textAutoridadEmision, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
														.addComponent(comboBoxPais, 0, 49, Short.MAX_VALUE)
														.addComponent(textCalle, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
														.addComponent(txtDni, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
														.addComponent(txtNombre, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(lblCategoria)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(textCategoria, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(lblNpersonal)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textPersonal, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(lblNlaboral))
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(lblFechaEmision)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(dateChooserEmisionP, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(lblProvincia)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(comboBoxProvincia, 0, 120, Short.MAX_VALUE))
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(lblAltura)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textAltura, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(lblApellido)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(txtApellido, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(lblEmail)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(textEmail, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(lblAerolinea, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(comboBox, 0, 123, Short.MAX_VALUE))
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(lblCuit)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textCuit, 139, 139, 139))
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(lblFechaNacimiento)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(dateChooserCliente, 0, 0, Short.MAX_VALUE))
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(lblCiudad)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textCiudad, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(lblCp)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(textCP, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
														.addGroup(groupLayout.createSequentialGroup()
																.addGap(4)
																.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																		.addGroup(groupLayout.createSequentialGroup()
																				.addComponent(lblFechaVencimiento)
																				.addPreferredGap(ComponentPlacement.RELATED)
																				.addComponent(dateChooser, 0, 0, Short.MAX_VALUE))
																		.addGroup(groupLayout.createSequentialGroup()
																				.addComponent(lblNPasaporte)
																				.addPreferredGap(ComponentPlacement.RELATED)
																				.addComponent(textFieldNumPasaporte, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))))
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(textLaboral, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(lblNcelular)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(textField, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)))
												.addContainerGap())
										.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
												.addComponent(btnAltaCliente, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
												.addGap(26)
												.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
												.addGap(41))))
		);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnAltaCliente, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblApellido)
										.addComponent(lblCuit)
										.addComponent(textCuit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(dateChooserCliente, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblFechaNacimiento)
												.addComponent(lblEmail)
												.addComponent(lblDni)
												.addComponent(txtDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textEmail, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)))
								.addGap(18)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblCalle)
										.addComponent(textCalle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblAltura)
										.addComponent(textAltura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCiudad)
										.addComponent(textCiudad, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCp)
										.addComponent(textCP, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblPais)
										.addComponent(comboBoxPais, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblProvincia)
										.addComponent(comboBoxProvincia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldNumPasaporte, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNPasaporte))
								.addGap(18)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblEmitido)
										.addComponent(lblFechaEmision)
										.addComponent(textAutoridadEmision, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblFechaVencimiento, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(dateChooserEmisionP, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(dateChooser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(18)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblOrigen)
										.addComponent(comboBoxOrigenP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNpersonal)
										.addComponent(textLaboral, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNcelular)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNlaboral)
										.addComponent(textPersonal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblAlianza)
										.addComponent(textAlianza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCategoria)
										.addComponent(textCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblAerolinea)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(15))
		);
		getContentPane().setLayout(groupLayout);
		setMinimumSize(new Dimension(600, 360));

	}
}
