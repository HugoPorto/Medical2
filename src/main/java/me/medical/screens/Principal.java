package me.medical.screens;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Objects;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import me.medical.dao.DAOFactory;
import me.medical.model.Usuario;
import me.medical.services.interfaces.LoginServicoDAO;

@SuppressWarnings("serial")
public class Principal extends JFrame {
	private JPanel contentPane;
	private JLabel lblBackground;
	private JButton btnLogin;

	private LoginServicoDAO dao;
	private JButton button;
	private JButton button_1;
	private JButton button_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {
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

	private void initializeTextFields() {
	}

	private void initializeButtons() {
		
		button = new JButton("Logar");
		button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button.setBackground(Color.WHITE);
		button.setBounds(724, 585, 248, 45);
		contentPane.add(button);
		
		button_2 = new JButton("Logar");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(134, 585, 248, 45);
		contentPane.add(button_2);
		
		button_1 = new JButton("Logar");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(429, 585, 248, 45);
		contentPane.add(button_1);
		btnLogin = new JButton("Logar");
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogin.setBounds(1019, 585, 248, 45);
		this.activeActionButtonBtnLogin(btnLogin);
		contentPane.add(btnLogin);
	}

	private void activeActionButtonBtnLogin(JButton btnLogin) {
		btnLogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
//				btnLogin(evt);
			}
		});
	}

	private void initializeLabels() {
	}

	private void initializeFrameBackground() {
		lblBackground = new JLabel();
		lblBackground.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBackground.setBounds(0, 0, 1382, 759);
		lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/medical/images/Principal.png")));
		contentPane.add(lblBackground);
	}

	private void initializeDB() {
		String nameDao = "login.class";
		dao = (LoginServicoDAO) DAOFactory.createDAO(nameDao);
	}

	private void initialize() {
		this.initializeFrame();
		this.initializeButtons();
		this.initializeLabels();
		this.initializeTextFields();
		this.initializeFrameBackground();
		this.initializeDB();
	}

//	@SuppressWarnings("deprecation")
//	public void Signin() {
//		Usuario usuario = dao.login(textFieldUser.getText(), passwordField.getText());
//		if (Objects.isNull(usuario)) {
//			JOptionPane.showMessageDialog(null, "Erro ao logar!");
//		} else {
//			if (usuario.getPerfil().getPerfil().equals("Recepcao")) {
//				Recepcao recepcao = new Recepcao(usuario);
//				recepcao.setUsuario(usuario);
//				recepcao.setVisible(true);
//				dispose();
//			}
//		}
//	}

//	private void btnLogin(java.awt.event.ActionEvent evt) {
//		Signin();
//	}
}
