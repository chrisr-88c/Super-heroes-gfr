package FormsHeros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class FormSaiyajin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormSaiyajin frame = new FormSaiyajin();
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
	public FormSaiyajin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 972, 545);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel imgVolar = new JLabel("New label");
		imgVolar.setIcon(new ImageIcon("imagessuperheros\\volar.jpeg"));
		imgVolar.setBounds(59, 53, 120, 120);
		contentPane.add(imgVolar);
		
		JLabel imgSuperFuerza = new JLabel("New label");
		imgSuperFuerza.setIcon(new ImageIcon("imagessuperheros\\fuerza.jpeg"));
		imgSuperFuerza.setBounds(59, 205, 120, 120);
		contentPane.add(imgSuperFuerza);
		
		JLabel imgSuperVelocidad = new JLabel("New label");
		imgSuperVelocidad.setIcon(new ImageIcon("imagessuperheros\\velocidad.jpeg"));
		imgSuperVelocidad.setBounds(29, 382, 140, 120);
		contentPane.add(imgSuperVelocidad);
		
		JLabel imgRespirarEspacial = new JLabel("New label");
		imgRespirarEspacial.setIcon(new ImageIcon("imagessuperheros\\respirar.jpeg"));
		imgRespirarEspacial.setBounds(378, 53, 130, 120);
		contentPane.add(imgRespirarEspacial);
		
		JLabel imgsentirEnergia = new JLabel("New label");
		imgsentirEnergia.setIcon(new ImageIcon("imagessuperheros\\sentirenergia.png"));
		imgsentirEnergia.setBounds(378, 205, 114, 120);
		contentPane.add(imgsentirEnergia);
		
		JLabel imgEvolucionar = new JLabel("New label");
		imgEvolucionar.setIcon(new ImageIcon("imagessuperheros\\evolucionar.png"));
		imgEvolucionar.setBounds(378, 387, 130, 111);
		contentPane.add(imgEvolucionar);
		
		JLabel imgLanzarEnergia = new JLabel("New label");
		imgLanzarEnergia.setIcon(new ImageIcon("imagessuperheros\\lanzarenergia.jpeg"));
		imgLanzarEnergia.setBounds(667, 135, 120, 120);
		contentPane.add(imgLanzarEnergia);
		
		JLabel imgteletransportarse = new JLabel("New label");
		imgteletransportarse.setIcon(new ImageIcon("imagessuperheros\\Teletransportarse.jpeg"));
		imgteletransportarse.setBounds(667, 303, 120, 120);
		contentPane.add(imgteletransportarse);
		
		JLabel lblOptionPoder = new JLabel("Haga clic en alguno de los poderes");
		lblOptionPoder.setFont(new Font("Sitka Subheading", Font.PLAIN, 26));
		lblOptionPoder.setHorizontalAlignment(SwingConstants.CENTER);
		lblOptionPoder.setBounds(167, 28, 740, 33);
		contentPane.add(lblOptionPoder);
		
		JButton btnVolarButton = new JButton("Volar");
		btnVolarButton.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		btnVolarButton.setBounds(189, 98, 140, 33);
		contentPane.add(btnVolarButton);
		
		JButton btnFuerzaButton = new JButton("SuperFuerza");
		btnFuerzaButton.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		btnFuerzaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFuerzaButton.setBounds(189, 275, 140, 33);
		contentPane.add(btnFuerzaButton);
		
		JButton btnVelocidadButton = new JButton("Super Velocidad");
		btnVelocidadButton.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		btnVelocidadButton.setBounds(179, 427, 163, 33);
		contentPane.add(btnVelocidadButton);
		
		JButton btnRespiracionButton = new JButton("Respirar Espacial");
		btnRespiracionButton.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		btnRespiracionButton.setBounds(517, 98, 163, 33);
		contentPane.add(btnRespiracionButton);
		
		JButton btnSentirEnergiaButton = new JButton("Sentir Energia");
		btnSentirEnergiaButton.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		btnSentirEnergiaButton.setBounds(502, 275, 140, 33);
		contentPane.add(btnSentirEnergiaButton);
		
		JButton btnEvolucionarButton = new JButton("Evolucionar");
		btnEvolucionarButton.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		btnEvolucionarButton.setBounds(502, 427, 140, 33);
		contentPane.add(btnEvolucionarButton);
		
		JButton btnLanzarEnergiaButton = new JButton("Lanzar Energia");
		btnLanzarEnergiaButton.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		btnLanzarEnergiaButton.setBounds(797, 188, 149, 33);
		contentPane.add(btnLanzarEnergiaButton);
		
		JButton btnTeletransportarseButton = new JButton("Teletransporte");
		btnTeletransportarseButton.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		btnTeletransportarseButton.setBounds(797, 352, 140, 33);
		contentPane.add(btnTeletransportarseButton);
	}
}
