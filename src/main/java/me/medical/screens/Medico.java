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
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Home");
		mnNewMenu.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("HOme2");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Home3");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Save");
		mnNewMenu.add(mntmNewMenuItem_2);
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
		lblBackground
				.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/medical/images/FUNDO_MEDICO.png")));
		frame.getContentPane().add(lblBackground);
	}
	
	private void initializeDB() {
	}

	private void initialize() {
		this.initializeFrame();
		this.initializeButtons();
		this.initializeLabels();
		this.initializeTextFields();
		this.initializeFrameBackground();
		this.initializeDB();
	}
}
