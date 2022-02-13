import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class displayProgram {
	private JFrame frame;
	private JLabel lblWelcome = new JLabel("The Invetory Manager");
	private JButton btnHome = new JButton("Home");
	private JButton btnManInv = new JButton("Manage");
	private JButton btnDisplay = new JButton("Display");
	private JPanel panelOutermost = new JPanel();
	private JPanel panelMenu = new JPanel();
	private JPanel panelChanging = new JPanel();
	private JPanel panelTopWelcome = new JPanel();
	private JPanel panelHome = new JPanel();
	private JPanel panelManInv = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					displayProgram window = new displayProgram();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the application.
	public displayProgram() {
		initialize();
	}

	// Initialize the contents of the frame.
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 742, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		panelOutermost.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelOutermost.setBackground(new Color(220, 220, 220));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelOutermost, GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelOutermost, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		panelMenu.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelMenu.setBackground(new Color(143, 188, 143));
	
		panelChanging.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelChanging.setBackground(new Color(143, 188, 143));
		
		panelTopWelcome.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelTopWelcome.setBackground(new Color(143, 188, 143));
		GroupLayout gl_panelOutermost = new GroupLayout(panelOutermost);
		gl_panelOutermost.setHorizontalGroup(
			gl_panelOutermost.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelOutermost.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelOutermost.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelTopWelcome, GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panelOutermost.createSequentialGroup()
							.addComponent(panelMenu, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panelChanging, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panelOutermost.setVerticalGroup(
			gl_panelOutermost.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelOutermost.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelTopWelcome, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addGroup(gl_panelOutermost.createParallelGroup(Alignment.LEADING)
						.addComponent(panelChanging, GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
						.addComponent(panelMenu, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		btnHome.addActionListener(new ActionListener() {//Switch to home panel, also the first panel the user sees
			public void actionPerformed(ActionEvent e) {
				panelChanging.removeAll();
				panelChanging.add(panelHome);
				panelChanging.repaint();
				panelChanging.revalidate();
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnHome.setEnabled(true);
		
		btnManInv.addActionListener(new ActionListener() {//Switch to manage inv panel
			public void actionPerformed(ActionEvent e) {
				panelChanging.removeAll();
				panelChanging.add(panelManInv);
				panelChanging.repaint();
				panelChanging.revalidate();
			}
		});

		btnManInv.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		btnDisplay.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GroupLayout gl_panelMenu = new GroupLayout(panelMenu);
		gl_panelMenu.setHorizontalGroup(
			gl_panelMenu.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panelMenu.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelMenu.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnHome, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnDisplay, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnManInv, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		gl_panelMenu.setVerticalGroup(
			gl_panelMenu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMenu.createSequentialGroup()
					.addGap(21)
					.addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnManInv, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnDisplay)
					.addContainerGap(221, Short.MAX_VALUE))
		);
		panelMenu.setLayout(gl_panelMenu);
		panelChanging.setLayout(new CardLayout(0, 0));
		

		panelHome.setBackground(new Color(192, 192, 192));
		panelChanging.add(panelHome, "pHome");

		GroupLayout gl_panelHome = new GroupLayout(panelHome);
		gl_panelHome.setHorizontalGroup(
			gl_panelHome.createParallelGroup(Alignment.LEADING)
				.addGap(0, 574, Short.MAX_VALUE)
		);
		gl_panelHome.setVerticalGroup(
			gl_panelHome.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 347, Short.MAX_VALUE)
		);
		panelHome.setLayout(gl_panelHome);
		panelManInv.setBackground(new Color(192, 192, 192));
		
		panelChanging.add(panelManInv, "pChanging");
		panelManInv.setLayout(new CardLayout(0, 0));
				
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Castellar", Font.PLAIN, 35));
		GroupLayout gl_panelTopWelcome = new GroupLayout(panelTopWelcome);
		gl_panelTopWelcome.setHorizontalGroup(
			gl_panelTopWelcome.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTopWelcome.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblWelcome, GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panelTopWelcome.setVerticalGroup(
			gl_panelTopWelcome.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTopWelcome.createSequentialGroup()
					.addComponent(lblWelcome, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(5))
		);
		panelTopWelcome.setLayout(gl_panelTopWelcome);
		panelOutermost.setLayout(gl_panelOutermost);
		frame.getContentPane().setLayout(groupLayout);
	}
}