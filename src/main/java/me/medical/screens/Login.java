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
public class Login extends JFrame {
	private JPanel contentPane;
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
					window.setVisible(true);
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
		textFieldUser = new JTextField();
		textFieldUser.setForeground(new Color(0, 0, 0));
		textFieldUser.setBackground(new Color(192, 192, 192));
		textFieldUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldUser.setBounds(912, 237, 346, 45);
		contentPane.add(textFieldUser);
		textFieldUser.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(0, 0, 0));
		passwordField.setBackground(new Color(192, 192, 192));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(911, 339, 346, 45);
		contentPane.add(passwordField);
	}

	private void initializeButtons() {
		btnLogin = new JButton("Logar");
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogin.setBounds(911, 437, 347, 45);
		this.activeActionButtonBtnLogin(btnLogin);
		contentPane.add(btnLogin);
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
		contentPane.add(lblUser);

		lblPassword = new JLabel("Senha");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(911, 310, 99, 27);
		contentPane.add(lblPassword);
	}

	private void initializeFrameBackground() {
		lblBackground = new JLabel();
		lblBackground.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBackground.setBounds(0, 0, 1382, 759);
		lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/medical/images/LoginMain.png")));
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

	@SuppressWarnings("deprecation")
	public void Signin() {
		Usuario usuario = dao.login(textFieldUser.getText(), passwordField.getText());
		if (Objects.isNull(usuario)) {
			JOptionPane.showMessageDialog(null, "Erro ao logar!");
		} else {
			if (usuario.getPerfil().getPerfil().equals("Recepcao")) {
				Recepcao recepcao = new Recepcao(usuario);
				recepcao.setUsuario(usuario);
				recepcao.setVisible(true);
				dispose();
			}
		}
	}

	private void btnLogin(java.awt.event.ActionEvent evt) {
		Signin();
	}
}
