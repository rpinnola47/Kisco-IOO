package Vista;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearProductoV10 extends JFrame {

	private JPanel contentPane;
	private JTextField NombreCliente;
	private JTextField CodigoBarra;
	private JTextField Precio;
	private JTextField StockProd;
	private JTextField StockMinProd;
	private JTextField CatProd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearProductoV10 frame = new CrearProductoV10();
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
	public CrearProductoV10() {
		setResizable(false);
		setTitle("Crear Producto");
		
		setBounds(100, 100, 421, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNombreProducto = new JLabel("Nombre Producto:");
		lbNombreProducto.setBounds(10, 11, 120, 27);
		contentPane.add(lbNombreProducto);
		
		NombreCliente = new JTextField();
		NombreCliente.setBounds(124, 11, 275, 20);
		contentPane.add(NombreCliente);
		NombreCliente.setColumns(10);
		
		JLabel lbCodigoBarra = new JLabel("Codigo de Barra:");
		lbCodigoBarra.setBounds(10, 50, 120, 28);
		contentPane.add(lbCodigoBarra);
		
		CodigoBarra = new JTextField();
		CodigoBarra.setBounds(124, 54, 232, 20);
		contentPane.add(CodigoBarra);
		CodigoBarra.setColumns(10);
		
		JLabel lbPrecioProd = new JLabel("Precio:");
		lbPrecioProd.setBounds(10, 97, 46, 14);
		contentPane.add(lbPrecioProd);
		
		Precio = new JTextField();
		Precio.setBounds(124, 94, 156, 20);
		contentPane.add(Precio);
		Precio.setColumns(10);
		
		JLabel lbStockProd = new JLabel("Stock:");
		lbStockProd.setBounds(10, 131, 46, 14);
		contentPane.add(lbStockProd);
		
		StockProd = new JTextField();
		StockProd.setBounds(124, 128, 156, 20);
		contentPane.add(StockProd);
		StockProd.setColumns(10);
		
		JLabel lbStockMin = new JLabel("Stock Minimo:");
		lbStockMin.setBounds(10, 167, 90, 14);
		contentPane.add(lbStockMin);
		
		StockMinProd = new JTextField();
		StockMinProd.setBounds(124, 164, 132, 20);
		contentPane.add(StockMinProd);
		StockMinProd.setColumns(10);
		
		JLabel lbCatProd = new JLabel("Categor\u00EDa:");
		lbCatProd.setBounds(10, 205, 58, 14);
		contentPane.add(lbCatProd);
		
		CatProd = new JTextField();
		CatProd.setBounds(124, 205, 216, 20);
		contentPane.add(CatProd);
		CatProd.setColumns(10);
		
		JButton btnCrearCliente = new JButton("Crear Cliente");
		btnCrearCliente.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				
			}	
		});
		btnCrearCliente.setBounds(156, 237, 124, 23);
		contentPane.add(btnCrearCliente);
	}
}
