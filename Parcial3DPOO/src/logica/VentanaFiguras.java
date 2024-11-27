package logica;
import java.awt.color.*;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaFiguras extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel etiquetaNombre;
	private JButton BCuadrado;
	private JButton BCirculo;
	private JTextField txtRed;
	private JTextField txtGreen;
	private JTextField txtBlue;
	private JPanel pBotones;
	
	//private JLabel campoRed;
	//private JLabel campoGreen;
	//private JLabel campoBlue;
	
	
	
	public VentanaFiguras() {
		
		
		setTitle("Parcial María José Rodríguez");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 519);
		
		setLayout(new BorderLayout());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(new Color(180, 157, 225));
		panelBotones.setBounds(0, 11, 325, 468);
		contentPane.add(panelBotones);
		
		panelBotones.setLayout(BorderLayout.WEST);
		this.BCirculo = new JButton("Círculo");
		this.BCirculo.setBounds(100, 150, 120, 40);
		this.BCuadrado = new JButton("Cuadrado");
		this.BCuadrado.setBounds(100, 100, 120, 40);
		
		panelBotones.add(BCuadrado);
		panelBotones.add(BCirculo);
		
		
		this.setSize(500, 500);
		getContentPane().setLayout(new BorderLayout());
		this.etiquetaNombre = new JLabel("Parcial María José Rodríguez");
		this.etiquetaNombre.setLayout(BorderLayout.NORTH);
		
		this.etiquetaNombre.setBounds(150, 20, 150, 40);
		
		BCirculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		this.BCirculo.setBounds(100, 150, 120, 40);
		this.BCuadrado = new JButton("Cuadrado");
		this.BCuadrado.setBounds(100, 100, 120, 40);
		this.txtRed = new JTextField();
		txtRed.setBounds(66, 48, 96, 20);
		this.txtGreen = new JTextField();
		txtGreen.setBounds(66, 76, 96, 20);
		this.txtBlue = new JTextField();
		txtGreen.setBounds(66, 101, 96, 20);
		
		
		getContentPane().add(BCirculo, BorderLayout.WEST);
		getContentPane().add(BCuadrado, BorderLayout.WEST);
		getContentPane().add(txtRed);
		getContentPane().add(new JLabel("R"));
		getContentPane().add(this.txtRed);
		this.txtRed.setBounds(31, 51, 49, 14);
		getContentPane().add(new JLabel("G"));
		getContentPane().add(this.txtGreen);
		this.txtGreen.setBounds(31, 76, 49, 14);
		getContentPane().add(new JLabel("B"));
		getContentPane().add(this.txtBlue);
		this.txtGreen.setBounds(31, 101, 49, 14);
		
		
		

	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int R = 0;
		int G = 0;
		int B = 0;
		
		R = Integer.parseInt(txtRed.getText());
		G = Integer.parseInt(txtGreen.getText());
		B = Integer.parseInt(txtBlue.getText());
		if (e.getSource() == BCirculo) {
			if () {
				
		
			
		}
		
	}
		
}
	}
	

	
	
	
	
	
	
	



}
