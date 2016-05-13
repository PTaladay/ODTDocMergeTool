package com.FateTaladayStudios.ODTMerge;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ODTMergeUI {

	private JFrame frame;
	private JTextField primaryDocFileNameTF;
	private JTextField secondaryDocFileNameTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ODTMergeUI window = new ODTMergeUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ODTMergeUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnBrowsePrimaryDoc = new JButton("Browse");
		btnBrowsePrimaryDoc.setBounds(319, 47, 67, 23);
		btnBrowsePrimaryDoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnBrowsePrimaryDoc);
		
		JButton btnBrowseSecondaryDoc = new JButton("Browse");
		btnBrowseSecondaryDoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBrowseSecondaryDoc.setBounds(319, 104, 67, 23);
		frame.getContentPane().add(btnBrowseSecondaryDoc);
		
		primaryDocFileNameTF = new JTextField();
		primaryDocFileNameTF.setBounds(78, 48, 231, 20);
		frame.getContentPane().add(primaryDocFileNameTF);
		primaryDocFileNameTF.setColumns(10);
		
		secondaryDocFileNameTF = new JTextField();
		secondaryDocFileNameTF.setColumns(10);
		secondaryDocFileNameTF.setBounds(78, 105, 231, 20);
		frame.getContentPane().add(secondaryDocFileNameTF);
		
		JButton btnMergeDocuments = new JButton("Merge Documents");
		btnMergeDocuments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ODTMerge.Merge(primaryDocFileNameTF.getText(), secondaryDocFileNameTF.getText());
				System.exit(0);
			}
		});
		btnMergeDocuments.setBounds(259, 149, 127, 23);
		frame.getContentPane().add(btnMergeDocuments);
	}
}
