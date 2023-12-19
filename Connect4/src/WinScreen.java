import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinScreen extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public WinScreen(String winner) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 530);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Congratulations! " + winner +" won!");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 31));
		lblNewLabel.setBounds(10, 150, 534, 138);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(30, 101, 69, 77);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(100, 264, 69, 77);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		panel_2.setBounds(165, 101, 69, 77);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.GREEN);
		panel_3.setBounds(230, 264, 69, 77);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.YELLOW);
		panel_4.setBounds(312, 101, 69, 77);
		contentPane.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.BLUE);
		panel_5.setBounds(446, 101, 69, 77);
		contentPane.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.RED);
		panel_6.setBounds(375, 264, 69, 77);
		contentPane.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.GREEN);
		panel_7.setBounds(93, 26, 76, 77);
		contentPane.add(panel_7);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(Color.RED);
		panel_7_1.setBounds(230, 26, 82, 77);
		contentPane.add(panel_7_1);
		
		JPanel panel_7_2 = new JPanel();
		panel_7_2.setBackground(Color.GREEN);
		panel_7_2.setBounds(375, 26, 76, 77);
		contentPane.add(panel_7_2);
		
		JPanel panel_7_3 = new JPanel();
		panel_7_3.setBackground(Color.YELLOW);
		panel_7_3.setBounds(165, 333, 76, 77);
		contentPane.add(panel_7_3);
		
		JPanel panel_7_4 = new JPanel();
		panel_7_4.setBackground(Color.BLUE);
		panel_7_4.setBounds(297, 333, 76, 77);
		contentPane.add(panel_7_4);
		
		JButton btnNewButton = new JButton("New Game?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				Connect4Game window = new Connect4Game();
				window.frame.setVisible(true);
				
				
			}
		});
		btnNewButton.setBounds(412, 408, 115, 23);
		contentPane.add(btnNewButton);
	}
}
