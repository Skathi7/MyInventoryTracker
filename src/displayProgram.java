import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class displayProgram {
	private JFrame frame;
	private JLabel lblWelcome = new JLabel("The Invetory Manager");
	private JButton btnHome = new JButton("Home");
	private JButton btnManInv = new JButton("Manage");
	private JButton btnDisplay = new JButton("Display");
	private JPanel panOutermost = new JPanel();
	private JPanel panMenu = new JPanel();
	private JPanel panChanging = new JPanel();
	private JPanel panTopWelc = new JPanel();
	private JPanel panHome = new JPanel();
	private JPanel panDisplay = new JPanel();
	private JTabbedPane tabManInv = new JTabbedPane(JTabbedPane.TOP);
	private JPanel tabAddInv = new JPanel();

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
				
		panOutermost.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panOutermost.setBackground(new Color(220, 220, 220));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panOutermost, GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panOutermost, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		panMenu.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panMenu.setBackground(new Color(143, 188, 143));
	
		panChanging.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panChanging.setBackground(new Color(143, 188, 143));
		
		panTopWelc.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panTopWelc.setBackground(new Color(143, 188, 143));
		GroupLayout gl_panOutermost = new GroupLayout(panOutermost);
		gl_panOutermost.setHorizontalGroup(
			gl_panOutermost.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panOutermost.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panOutermost.createParallelGroup(Alignment.TRAILING)
						.addComponent(panTopWelc, GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panOutermost.createSequentialGroup()
							.addComponent(panMenu, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panChanging, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panOutermost.setVerticalGroup(
			gl_panOutermost.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panOutermost.createSequentialGroup()
					.addContainerGap()
					.addComponent(panTopWelc, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addGroup(gl_panOutermost.createParallelGroup(Alignment.LEADING)
						.addComponent(panChanging, GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
						.addComponent(panMenu, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		btnHome.addActionListener(new ActionListener() {//Switch to home panel, also the first panel the user sees
			public void actionPerformed(ActionEvent e) {
				panChanging.removeAll();
				panChanging.add(panHome);
				panChanging.repaint();
				panChanging.revalidate();
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnHome.setEnabled(true);
		
		btnManInv.addActionListener(new ActionListener() {//Switch to manage inv panel
			public void actionPerformed(ActionEvent e) {
				panChanging.removeAll();
				panChanging.add(tabManInv);
				panChanging.repaint();
				panChanging.revalidate();
			}
		});

		btnManInv.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDisplay.addActionListener(new ActionListener() {//switch to display panel
			public void actionPerformed(ActionEvent e) {
				panChanging.removeAll();
				panChanging.add(panDisplay);
				panChanging.repaint();
				panChanging.revalidate();
			}
		});
		
		btnDisplay.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GroupLayout gl_panMenu = new GroupLayout(panMenu);
		gl_panMenu.setHorizontalGroup(
			gl_panMenu.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panMenu.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panMenu.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnHome, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnDisplay, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnManInv, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		gl_panMenu.setVerticalGroup(
			gl_panMenu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panMenu.createSequentialGroup()
					.addGap(21)
					.addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnManInv, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnDisplay)
					.addContainerGap(221, Short.MAX_VALUE))
		);
		panMenu.setLayout(gl_panMenu);
		panChanging.setLayout(new CardLayout(0, 0));
		

		panHome.setBackground(new Color(192, 192, 192));
		panChanging.add(panHome, "pHome");

		GroupLayout gl_panHome = new GroupLayout(panHome);
		gl_panHome.setHorizontalGroup(
			gl_panHome.createParallelGroup(Alignment.LEADING)
				.addGap(0, 574, Short.MAX_VALUE)
		);
		gl_panHome.setVerticalGroup(
			gl_panHome.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 347, Short.MAX_VALUE)
		);
		panHome.setLayout(gl_panHome);
		panDisplay.setBackground(Color.CYAN);//Setting the color of the display panel's background
		
		panChanging.add(panDisplay, "panDisplayCons");
		
		panChanging.add(tabManInv, "tabManInvCons");
		tabAddInv.setBackground(Color.GREEN);//Setting the color of the tab's background
		
		tabManInv.addTab("Add Inventory", null, tabAddInv, null);//Setting the name of the tab
				
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Castellar", Font.PLAIN, 35));
		GroupLayout gl_panTopWelc = new GroupLayout(panTopWelc);
		gl_panTopWelc.setHorizontalGroup(
			gl_panTopWelc.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panTopWelc.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblWelcome, GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panTopWelc.setVerticalGroup(
			gl_panTopWelc.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panTopWelc.createSequentialGroup()
					.addComponent(lblWelcome, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(5))
		);
		panTopWelc.setLayout(gl_panTopWelc);
		panOutermost.setLayout(gl_panOutermost);
		frame.getContentPane().setLayout(groupLayout);
	}
}