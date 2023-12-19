import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;

public class WelcomeScreen extends JFrame {

	private JPanel contentPane;
	JRadioButton rdbtnNewRadioButton = new JRadioButton("Green");
	JRadioButton rdbtnYellow = new JRadioButton("Yellow");
	JRadioButton rdbtnRed = new JRadioButton("Red");
	JRadioButton rdbtnBlue = new JRadioButton("Blue");
	private final JLabel lblNewLabel_1 = new JLabel("Welcome To Connect 4");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeScreen frame = new WelcomeScreen();
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

	public WelcomeScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 547);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connect4Game window = new Connect4Game();
				if (rdbtnNewRadioButton.isSelected()) {
					window.Red = new ImageIcon("GreenCircle.png");
					
				}
				if (rdbtnYellow.isSelected()) {
					window.Blue = new ImageIcon("YellowCircle.png");
				}
				window.frame.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(228, 262, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Player 1");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(55, 307, 46, 14);
		contentPane.add(lblNewLabel);
		rdbtnNewRadioButton.setBackground(new Color(0, 204, 0));
		
		
		//
		rdbtnNewRadioButton.setBounds(28, 328, 109, 23);
		
		contentPane.add(rdbtnNewRadioButton);
		rdbtnRed.setBackground(new Color(255, 0, 51));
		
		//JRadioButton rdbtnGreen = new JRadioButton("Red");
		rdbtnRed.setBounds(28, 356, 109, 23);
		contentPane.add(rdbtnRed);
		rdbtnBlue.setBackground(new Color(0, 0, 255));
		
		//JRadioButton rdbtnBlue = new JRadioButton("Blue");
		rdbtnBlue.setBounds(434, 328, 109, 23);
		contentPane.add(rdbtnBlue);
		rdbtnYellow.setBackground(new Color(255, 255, 51));
		
		
		rdbtnYellow.setBounds(434, 356, 109, 23);
		contentPane.add(rdbtnYellow);
		
		JLabel lblPlayer = new JLabel("Player 2");
		lblPlayer.setForeground(Color.WHITE);
		lblPlayer.setBounds(456, 307, 46, 14);
		contentPane.add(lblPlayer);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Yu Gothic Light", Font.PLAIN, 46));
		lblNewLabel_1.setBounds(50, 95, 482, 124);
		
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Instructions");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Instructions frame = new Instructions();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(434, 11, 134, 23);
		contentPane.add(btnNewButton_1);
		
		

	}
}
