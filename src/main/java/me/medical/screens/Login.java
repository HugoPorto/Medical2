package me.medical.screens;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Objects;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import me.medical.dao.DAOFactory;
import me.medical.model.Usuario;
import me.medical.services.interfaces.LoginServicoDAO;

public class Login {
	private JFrame frame;
	
	private JTextField textFieldUser;
	private JPasswordField passwordField;
	
	private JLabel lblBackground;
	private JLabel lblPassword;
	private JLabel lblUser;
	
	private JButton btnLogin;
	
	private LoginServicoDAO dao;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		initialize();
	}

	private void initializeFrame() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 600, 400);
		frame.setSize(new java.awt.Dimension(1388, 759));
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}

	private void initializeTextFields() {
		textFieldUser = new JTextField();
		textFieldUser.setForeground(new Color(0, 0, 0));
		textFieldUser.setBackground(new Color(192, 192, 192));
		textFieldUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldUser.setBounds(912, 237, 346, 45);
		frame.getContentPane().add(textFieldUser);
		textFieldUser.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(0, 0, 0));
		passwordField.setBackground(new Color(192, 192, 192));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(911, 339, 346, 45);
		frame.getContentPane().add(passwordField);
	}

	private void initializeButtons() {
		btnLogin = new JButton("Logar");
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogin.setBounds(911, 437, 347, 45);
		this.activeActionButtonBtnLogin(btnLogin);
		frame.getContentPane().add(btnLogin);
	}

	private void activeActionButtonBtnLogin(JButton btnLogin) {
		btnLogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnLogin(evt);
			}
		});
	}

	private void initializeLabels() {
		lblUser = new JLabel("Usu\u00E1rio");
		lblUser.setForeground(Color.WHITE);
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUser.setBounds(911, 207, 99, 32);
		frame.getContentPane().add(lblUser);

		lblPassword = new JLabel("Senha");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(911, 310, 99, 27);
		frame.getContentPane().add(lblPassword);
	}

	private void initializeFrameBackground() {
		lblBackground = new JLabel();
		lblBackground.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBackground.setBounds(0, 0, 1382, 724);
		lblBackground
				.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/medical/images/LoginMain.png")));
		frame.getContentPane().add(lblBackground);
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

	@SuppressWarnings("deprecation")
	public void Signin() {
		Usuario usuario = dao.login(textFieldUser.getText(), passwordField.getText());
		
		if (Objects.isNull(usuario)) {
			JOptionPane.showMessageDialog(null, "Erro ao logar!");		
		}else {
			System.out.println(usuario.getNome() + " - " + usuario.getPerfil().getPerfil());
		}
	}

	private void btnLogin(java.awt.event.ActionEvent evt) {
		Signin();
	}
}
