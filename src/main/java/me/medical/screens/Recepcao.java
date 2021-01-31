package me.medical.screens;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import me.medical.model.Usuario;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Recepcao extends JFrame {
	private JPanel contentPane;
	private JLabel lblBackground;
	private Usuario usuario;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recepcao window = new Recepcao();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Recepcao() {
		initialize();
	}
	
	public Recepcao(Usuario usuario) {
		this.usuario = usuario;
		initialize();
	}

	private void initializeFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(280, 150, 1388, 759);
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	private void initializeMenubar() {
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.control);
		menuBar.setBounds(0, 0, 1370, 26);
		contentPane.add(menuBar);

		this.initializeItensOfMenu(menuBar);
	}

	private void initializeItensOfMenu(JMenuBar menuBar) {
		this.initializeMenuOfRegisters(menuBar);
	}

	private void initializeMenuOfRegisters(JMenuBar menuBar) {

		JMenu mnMenuRegisters = new JMenu("Cadastros");
		mnMenuRegisters.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnMenuRegisters);

		JMenuItem mnHealthInsurance = new JMenuItem("Conv\u00EAnios");
		mnHealthInsurance.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnMenuRegisters.add(mnHealthInsurance);

		JMenuItem mnProfessionalRegister = new JMenuItem("Profissional");
		mnProfessionalRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(usuario.getNome());
			}
		});
		
		mnProfessionalRegister.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnMenuRegisters.add(mnProfessionalRegister);

		JMenuItem mnHistoryPatient = new JMenuItem("Especialidade");
		mnHistoryPatient.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnMenuRegisters.add(mnHistoryPatient);
	}

	private void initializeFrameBackground() {
		lblBackground = new JLabel();
		lblBackground.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBackground.setBounds(0, 0, 1388, 759);
		lblBackground
				.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/medical/images/sysclinicaimg.png")));
		contentPane.add(lblBackground);
	}

	private void initializeDB() {
	}

	private void initialize() {
		this.initializeFrame();
		this.initializeMenubar();
		this.initializeFrameBackground();
		this.initializeDB();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
