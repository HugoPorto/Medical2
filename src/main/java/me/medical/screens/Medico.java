package me.medical.screens;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Medico {
	private JFrame frame;

	private JLabel lblBackground;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Medico window = new Medico();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Medico() {
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

	private void initializeMenubar() {
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		this.initializeItensOfMenu(menuBar);
	}
	
	private void initializeItensOfMenu(JMenuBar menuBar) {
		this.initializeMenuOfPatients(menuBar);
		this.initializeMenuEvolutionPatients(menuBar);
		this.initializeMenuPrescription(menuBar);
		this.initializeMenuCertificates(menuBar);
		this.initializeMenuReports(menuBar);
	}
	
	private void initializeMenuOfPatients(JMenuBar menuBar) {
		JMenu mnMenuPatient = new JMenu("Pacientes");
		mnMenuPatient.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnMenuPatient);

		JMenu mnMenuPatientCare = new JMenu("Atendimentos dos Pacientes");
		mnMenuPatientCare.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnMenuPatient.add(mnMenuPatientCare);

		JMenuItem mnPatientsList = new JMenuItem("Listar Atendimentos");
		mnPatientsList.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnMenuPatientCare.add(mnPatientsList);

		JMenuItem mnPatientRegister = new JMenuItem("Cadastrar Atendimento");
		mnPatientRegister.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnMenuPatientCare.add(mnPatientRegister);

		JMenuItem mnHistoryPatient = new JMenuItem("Hist\u00F3riocos");
		mnHistoryPatient.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnMenuPatient.add(mnHistoryPatient);
	}
	
	private void initializeMenuPrescription(JMenuBar menuBar) {
		JMenu mnMenuPrescription = new JMenu("Receituário");
		mnMenuPrescription.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnMenuPrescription);
	}
	
	private void initializeMenuCertificates(JMenuBar menuBar) {
		JMenu mnMenuCertificates= new JMenu("Atestados");
		mnMenuCertificates.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnMenuCertificates);
	}
	
	private void initializeMenuReports(JMenuBar menuBar) {
		JMenu mnMenuReports = new JMenu("Laudos");
		mnMenuReports.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnMenuReports);
	}
	
	private void initializeMenuEvolutionPatients(JMenuBar menuBar) {
		JMenu mnMenuEvolution = new JMenu("Evolu\u00E7\u00E3o do Paciente");
		mnMenuEvolution.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnMenuEvolution);
		
		JMenuItem mnMenuEvolutionRegister = new JMenuItem("Cadastrar Evolução do Paciente");
		mnMenuEvolutionRegister.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnMenuEvolution.add(mnMenuEvolutionRegister);
		
		JMenuItem mnEvolutionPatientsList = new JMenuItem("Ver Evolução dos Pacientes");
		mnEvolutionPatientsList.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnMenuEvolution.add(mnEvolutionPatientsList);
	}

	private void initializeTextFields() {
	}

	private void initializeButtons() {
	}

	private void initializeLabels() {
	}

	private void initializeFrameBackground() {
		lblBackground = new JLabel();
		lblBackground.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBackground.setBounds(0, 0, 1382, 724);
		lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/medical/images/FUNDO_MEDICO.png")));
		frame.getContentPane().add(lblBackground);
	}

	private void initializeDB() {
	}

	private void initialize() {
		this.initializeFrame();
		this.initializeMenubar();
		this.initializeButtons();
		this.initializeLabels();
		this.initializeTextFields();
		this.initializeFrameBackground();
		this.initializeDB();
	}
}
