package FormsHeros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Formcategoriahero extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formcategoriahero frame = new Formcategoriahero();
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
	public Formcategoriahero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1316, 653);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOption = new JLabel("Escoja un personaje a continuaci\u00F3n:");
		lblOption.setFont(new Font("Bell MT", Font.BOLD, 35));
		lblOption.setHorizontalAlignment(SwingConstants.CENTER);
		lblOption.setBounds(300, 24, 620, 62);
		contentPane.add(lblOption);
		
		JLabel imgSaiyajin = new JLabel("New label");
		imgSaiyajin.setIcon(new ImageIcon("imagessuperheros\\Saiyajin.png"));
		imgSaiyajin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		imgSaiyajin.setBounds(55, 158, 169, 400);
		contentPane.add(imgSaiyajin);
		
		JLabel imgMago = new JLabel("New label");
		imgMago.setIcon(new ImageIcon("imagessuperheros\\Mago.png"));
		imgMago.setBounds(300, 169, 182, 389);
		contentPane.add(imgMago);
		
		JLabel imgKryptoniano = new JLabel("New label");
		imgKryptoniano.setIcon(new ImageIcon("imagessuperheros\\kryptoniano.png"));
		imgKryptoniano.setBounds(556, 158, 193, 400);
		contentPane.add(imgKryptoniano);
		
		JLabel imgPsiquico = new JLabel("New label");
		imgPsiquico.setIcon(new ImageIcon("imagessuperheros\\psiquico.png"));
		imgPsiquico.setBounds(785, 158, 200, 400);
		contentPane.add(imgPsiquico);
		
		JLabel imgHibridoAtlante = new JLabel("New label");
		imgHibridoAtlante.setIcon(new ImageIcon("imagessuperheros\\HibridoAtlante.png"));
		imgHibridoAtlante.setBounds(1020, 125, 200, 433);
		contentPane.add(imgHibridoAtlante);
		
		JButton btnSaiyajinButton = new JButton("Saiyajin");
		btnSaiyajinButton.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		btnSaiyajinButton.setBounds(79, 568, 120, 38);
		contentPane.add(btnSaiyajinButton);
		
		JButton btnMagoButton = new JButton("Mago");
		btnMagoButton.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		btnMagoButton.setBounds(328, 568, 120, 38);
		contentPane.add(btnMagoButton);
		
		JButton btnKryptonianoButton = new JButton("Kryptoniano");
		btnKryptonianoButton.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		btnKryptonianoButton.setBounds(581, 568, 135, 38);
		contentPane.add(btnKryptonianoButton);
		
		JButton btnPsiquicoButton = new JButton("Psiquico");
		btnPsiquicoButton.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		btnPsiquicoButton.setBounds(817, 568, 120, 38);
		contentPane.add(btnPsiquicoButton);
		
		JButton btnHibridoAtlanteButton = new JButton("Hibrido Atlante");
		btnHibridoAtlanteButton.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		btnHibridoAtlanteButton.setBounds(1049, 568, 158, 38);
		contentPane.add(btnHibridoAtlanteButton);
	}
}