import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.util.*;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Connect4Game {

	Random random = new Random();
	boolean playerBlue;

	JFrame frame;
	// Variables Assigned for all types of winning pairs.
	private int w1 = 50;
	private int w2 = 50;
	private int w3 = 50;
	private int w4 = 50;
	private int w5 = 50;
	private int w6 = 50;
	private int w7 = 50;
	private int w8 = 50;
	private int w9 = 50;
	private int w10 = 50;
	private int w11 = 50;
	private int w12 = 50;
	private int w13 = 50;
	private int w14 = 50;
	private int w15 = 50;
	private int w16 = 50;
	private int w17 = 50;
	private int w18 = 50;
	private int w19 = 50;
	private int w20 = 50;
	private int w21 = 50;
	private int w22 = 50;
	private int w23 = 50;
	private int w24 = 50;
	private int w25 = 50;
	private int w26 = 50;
	private int w27 = 50;
	private int w28 = 50;
	private int w29 = 50;
	private int w30 = 50;
	private int w31 = 50;
	private int w32 = 50;
	private int w33 = 50;
	private int w34 = 50;
	private int w35 = 50;
	private int w36 = 50;
	private int w37 = 50;
	private int w38 = 50;
	private int w39 = 50;
	private int w40 = 50;
	private int w41 = 50;
	private int w42 = 50;

	ImageIcon Empty = new ImageIcon("Empty.png");
	ImageIcon Red;
	ImageIcon Blue;

	JButton Button1 = new JButton(Empty);
	JButton Button2 = new JButton(Empty);
	JButton Button3 = new JButton(Empty);
	JButton Button4 = new JButton(Empty);
	JButton Button5 = new JButton(Empty);
	JButton Button6 = new JButton(Empty);
	JButton Button7 = new JButton(Empty);
	JButton Button8 = new JButton(Empty);
	JButton Button9 = new JButton(Empty);
	JButton Button10 = new JButton(Empty);
	JButton Button11 = new JButton(Empty);
	JButton Button12 = new JButton(Empty);
	JButton Button13 = new JButton(Empty);
	JButton Button14 = new JButton(Empty);
	JButton Button15 = new JButton(Empty);
	JButton Button16 = new JButton(Empty);
	JButton Button17 = new JButton(Empty);
	JButton Button18 = new JButton(Empty);
	JButton Button19 = new JButton(Empty);
	JButton Button20 = new JButton(Empty);
	JButton Button21 = new JButton(Empty);
	JButton Button22 = new JButton(Empty);
	JButton Button23 = new JButton(Empty);
	JButton Button24 = new JButton(Empty);
	JButton Button25 = new JButton(Empty);
	JButton Button26 = new JButton(Empty);
	JButton Button27 = new JButton(Empty);
	JButton Button28 = new JButton(Empty);
	JButton Button29 = new JButton(Empty);
	JButton Button30 = new JButton(Empty);
	JButton Button31 = new JButton(Empty);
	JButton Button32 = new JButton(Empty);
	JButton Button33 = new JButton(Empty);
	JButton Button34 = new JButton(Empty);
	JButton Button35 = new JButton(Empty);
	JButton Button39 = new JButton(Empty);
	JButton Button40 = new JButton(Empty);
	JButton Button38 = new JButton(Empty);
	JButton Button37 = new JButton(Empty);
	JButton Button36 = new JButton(Empty);
	JButton Button41 = new JButton(Empty);
	JButton Button42 = new JButton(Empty);


	/**
	 * Create the application.
	 */
	public Connect4Game() {

		// to have a global variable effect on the rest of the code
		Red = new ImageIcon("RedCircle.png");
		Blue = new ImageIcon("BlueCircle.png");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 726, 726);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(6, 7, 2, 2));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		// JButton Button42 = new JButton(Empty);
		Button42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button35.getIcon() != Empty) {
					if (e.getSource() == Button42) {
						if (playerBlue) {
							if (Button42.getIcon() == Empty) {
								Button42.setIcon(Blue);
								playerBlue = false;
								w42 = 1;
								WhenWin();
							}
						} else {
							if (Button42.getIcon() == Empty) {
								Button42.setIcon(Red);
								playerBlue = true;
								w42 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_1.add(Button42, BorderLayout.CENTER);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		// JButton Button41 = new JButton(Empty);
		Button41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button34.getIcon() != Empty) {
					if (e.getSource() == Button41) {
						if (playerBlue) {
							if (Button41.getIcon() == Empty) {
								Button41.setIcon(Blue);
								playerBlue = false;
								w41 = 1;
								WhenWin();
							}
						} else {
							if (Button41.getIcon() == Empty) {
								Button41.setIcon(Red);
								playerBlue = true;
								w41 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_2.add(Button41, BorderLayout.CENTER);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		// JButton Button40 = new JButton(Empty);
		Button40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button33.getIcon() != Empty) {
					if (e.getSource() == Button40) {
						if (playerBlue) {
							if (Button40.getIcon() == Empty) {
								Button40.setIcon(Blue);
								playerBlue = false;
								w40 = 1;
								WhenWin();
							}
						} else {
							if (Button40.getIcon() == Empty) {
								Button40.setIcon(Red);
								playerBlue = true;
								w40 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_3.add(Button40, BorderLayout.CENTER);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));

		// JButton Button39 = new JButton(Empty);
		Button39.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (Button32.getIcon() != Empty) {
					if (e.getSource() == Button39) {
						if (playerBlue) {
							if (Button39.getIcon() == Empty) {
								Button39.setIcon(Blue);
								playerBlue = false;
								w39 = 1;
								WhenWin();
							}
						} else {
							if (Button39.getIcon() == Empty) {
								Button39.setIcon(Red);
								playerBlue = true;
								w39 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_4.add(Button39, BorderLayout.CENTER);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));

		// JButton Button38 = new JButton(Empty);
		Button38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button31.getIcon() != Empty) {
					if (e.getSource() == Button38) {
						if (playerBlue) {
							if (Button38.getIcon() == Empty) {
								Button38.setIcon(Blue);
								playerBlue = false;
								w38 = 1;
								WhenWin();
							}
						} else {
							if (Button38.getIcon() == Empty) {
								Button38.setIcon(Red);
								playerBlue = true;
								w38 = 0;
								WhenWin();
							}
						}
					}

				}
			}
		});
		panel_5.add(Button38, BorderLayout.CENTER);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));

		// JButton Button37 = new JButton(Empty);
		Button37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button30.getIcon() != Empty) {
					if (e.getSource() == Button37) {
						if (playerBlue) {
							if (Button37.getIcon() == Empty) {
								Button37.setIcon(Blue);
								playerBlue = false;
								w37 = 1;
								WhenWin();
							}
						} else {
							if (Button37.getIcon() == Empty) {
								Button37.setIcon(Red);
								playerBlue = true;
								w37 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_6.add(Button37, BorderLayout.CENTER);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));

		// JButton Button36 = new JButton(Empty);
		Button36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button29.getIcon() != Empty) {
					if (e.getSource() == Button36) {
						if (playerBlue) {
							if (Button36.getIcon() == Empty) {
								Button36.setIcon(Blue);
								playerBlue = false;
								w36 = 1;
								WhenWin();
							}
						} else {
							if (Button36.getIcon() == Empty) {
								Button36.setIcon(Red);
								playerBlue = true;
								w36 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_7.add(Button36, BorderLayout.CENTER);

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));

		// 35 Listener
		Button35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button28.getIcon() != Empty) {
					if (e.getSource() == Button35) {
						if (playerBlue) {
							if (Button35.getIcon() == Empty) {
								Button35.setIcon(Blue);
								playerBlue = false;
								w35 = 1;
								WhenWin();
							}
						} else {
							if (Button35.getIcon() == Empty) {
								Button35.setIcon(Red);
								playerBlue = true;
								w35 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_8.add(Button35, BorderLayout.CENTER);

		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));

		// 34 Listener
		Button34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button27.getIcon() != Empty) {
					if (e.getSource() == Button34) {
						if (playerBlue) {
							if (Button34.getIcon() == Empty) {
								Button34.setIcon(Blue);
								playerBlue = false;
								w34 = 1;
								WhenWin();
							}
						} else {
							if (Button34.getIcon() == Empty) {
								Button34.setIcon(Red);
								playerBlue = true;
								w34 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_9.add(Button34, BorderLayout.CENTER);

		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));

		// 33 Listener
		Button33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button26.getIcon() != Empty) {
					if (e.getSource() == Button33) {
						if (playerBlue) {
							if (Button33.getIcon() == Empty) {
								Button33.setIcon(Blue);
								playerBlue = false;
								w33 = 1;
								WhenWin();
							}
						} else {
							if (Button33.getIcon() == Empty) {
								Button33.setIcon(Red);
								playerBlue = true;
								w33 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_10.add(Button33, BorderLayout.CENTER);

		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));

		// 32 Listener
		Button32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button25.getIcon() != Empty) {
					if (e.getSource() == Button32) {
						if (playerBlue) {
							if (Button32.getIcon() == Empty) {
								Button32.setIcon(Blue);
								playerBlue = false;
								w32 = 1;
								WhenWin();
							}
						} else {
							if (Button32.getIcon() == Empty) {
								Button32.setIcon(Red);
								playerBlue = true;
								w32 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_11.add(Button32, BorderLayout.CENTER);

		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));

		// 31 Listener
		Button31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button24.getIcon() != Empty) {
					if (e.getSource() == Button31) {
						if (playerBlue) {
							if (Button31.getIcon() == Empty) {
								Button31.setIcon(Blue);
								playerBlue = false;
								w31 = 1;
								WhenWin();
							}
						} else {
							if (Button31.getIcon() == Empty) {
								Button31.setIcon(Red);
								playerBlue = true;
								w31 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_12.add(Button31, BorderLayout.CENTER);

		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));

		// 30 Listener
		Button30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button23.getIcon() != Empty) {
					if (e.getSource() == Button30) {
						if (playerBlue) {
							if (Button30.getIcon() == Empty) {
								Button30.setIcon(Blue);
								playerBlue = false;
								w30 = 1;
								WhenWin();
							}
						} else {
							if (Button30.getIcon() == Empty) {
								Button30.setIcon(Red);
								playerBlue = true;
								w30 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_13.add(Button30, BorderLayout.CENTER);

		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));

		// 29 Listener
		Button29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button22.getIcon() != Empty) {
					if (e.getSource() == Button29) {
						if (playerBlue) {
							if (Button29.getIcon() == Empty) {
								Button29.setIcon(Blue);
								playerBlue = false;
								w29 = 1;
								WhenWin();
							}
						} else {
							if (Button29.getIcon() == Empty) {
								Button29.setIcon(Red);
								playerBlue = true;
								w29 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_14.add(Button29, BorderLayout.CENTER);

		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));

		// 28 Listener
		Button28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button21.getIcon() != Empty) {
					if (e.getSource() == Button28) {
						if (playerBlue) {
							if (Button28.getIcon() == Empty) {
								Button28.setIcon(Blue);
								playerBlue = false;
								w28 = 1;
								WhenWin();
							}
						} else {
							if (Button28.getIcon() == Empty) {
								Button28.setIcon(Red);
								playerBlue = true;
								w28 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_15.add(Button28, BorderLayout.CENTER);

		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));

		// 27 Listener
		Button27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button20.getIcon() != Empty) {
					if (e.getSource() == Button27) {
						if (playerBlue) {
							if (Button27.getIcon() == Empty) {
								Button27.setIcon(Blue);
								playerBlue = false;
								w27 = 1;
								WhenWin();
							}
						} else {
							if (Button27.getIcon() == Empty) {
								Button27.setIcon(Red);
								playerBlue = true;
								w27 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_16.add(Button27, BorderLayout.CENTER);

		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_17);
		panel_17.setLayout(new BorderLayout(0, 0));

		// 26 Listener
		Button26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button19.getIcon() != Empty) {
					if (e.getSource() == Button26) {
						if (playerBlue) {
							if (Button26.getIcon() == Empty) {
								Button26.setIcon(Blue);
								playerBlue = false;
								w26 = 1;
								WhenWin();
							}
						} else {
							if (Button26.getIcon() == Empty) {
								Button26.setIcon(Red);
								playerBlue = true;
								w26 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_17.add(Button26, BorderLayout.CENTER);

		JPanel panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_18);
		panel_18.setLayout(new BorderLayout(0, 0));

		// 25 listener
		Button25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button18.getIcon() != Empty) {
					if (e.getSource() == Button25) {
						if (playerBlue) {
							if (Button25.getIcon() == Empty) {
								Button25.setIcon(Blue);
								playerBlue = false;
								w25 = 1;
								WhenWin();
							}
						} else {
							if (Button25.getIcon() == Empty) {
								Button25.setIcon(Red);
								playerBlue = true;
								w25 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_18.add(Button25, BorderLayout.CENTER);

		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_19);
		panel_19.setLayout(new BorderLayout(0, 0));

		// 24 listener
		Button24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button17.getIcon() != Empty) {
					if (e.getSource() == Button24) {
						if (playerBlue) {
							if (Button24.getIcon() == Empty) {
								Button24.setIcon(Blue);
								playerBlue = false;
								w24 = 1;
								WhenWin();
							}
						} else {
							if (Button24.getIcon() == Empty) {
								Button24.setIcon(Red);
								playerBlue = true;
								w24 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_19.add(Button24, BorderLayout.CENTER);

		JPanel panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_20);
		panel_20.setLayout(new BorderLayout(0, 0));

		// 23 listener
		Button23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button16.getIcon() != Empty) {
					if (e.getSource() == Button23) {
						if (playerBlue) {
							if (Button23.getIcon() == Empty) {
								Button23.setIcon(Blue);
								playerBlue = false;
								w23 = 1;
								WhenWin();
							}
						} else {
							if (Button23.getIcon() == Empty) {
								Button23.setIcon(Red);
								playerBlue = true;
								w23 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_20.add(Button23, BorderLayout.CENTER);

		JPanel panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_21);
		panel_21.setLayout(new BorderLayout(0, 0));

		// JButton Button22 = new JButton(Empty);
		Button22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button15.getIcon() != Empty) {
					if (e.getSource() == Button22) {
						if (playerBlue) {
							if (Button22.getIcon() == Empty) {
								Button22.setIcon(Blue);
								playerBlue = false;
								w22 = 1;
								WhenWin();
							}
						} else {
							if (Button22.getIcon() == Empty) {
								Button22.setIcon(Red);
								playerBlue = true;
								w22 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_21.add(Button22, BorderLayout.CENTER);

		JPanel panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_22);
		panel_22.setLayout(new BorderLayout(0, 0));

		// JButton Button21 = new JButton(Empty);
		Button21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button14.getIcon() != Empty) {
					if (e.getSource() == Button21) {
						if (playerBlue) {
							if (Button21.getIcon() == Empty) {
								Button21.setIcon(Blue);
								playerBlue = false;
								w21 = 1;
								WhenWin();
							}
						} else {
							if (Button21.getIcon() == Empty) {
								Button21.setIcon(Red);
								playerBlue = true;
								w21 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_22.add(Button21, BorderLayout.CENTER);

		JPanel panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_23);
		panel_23.setLayout(new BorderLayout(0, 0));

		// JButton Button20 = new JButton(Empty);
		Button20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button13.getIcon() != Empty) {
					if (e.getSource() == Button20) {
						if (playerBlue) {
							if (Button20.getIcon() == Empty) {
								Button20.setIcon(Blue);
								playerBlue = false;
								w20 = 1;
								WhenWin();
							}
						} else {
							if (Button20.getIcon() == Empty) {
								Button20.setIcon(Red);
								playerBlue = true;
								w20 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_23.add(Button20, BorderLayout.CENTER);

		JPanel panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_24);
		panel_24.setLayout(new BorderLayout(0, 0));

		// JButton Button19 = new JButton(Empty);
		Button19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button12.getIcon() != Empty) {
					if (e.getSource() == Button19) {
						if (playerBlue) {
							if (Button19.getIcon() == Empty) {
								Button19.setIcon(Blue);
								playerBlue = false;
								w19 = 1;
								WhenWin();
							}
						} else {
							if (Button19.getIcon() == Empty) {
								Button19.setIcon(Red);
								playerBlue = true;
								w19 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_24.add(Button19, BorderLayout.CENTER);

		JPanel panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_25);
		panel_25.setLayout(new BorderLayout(0, 0));

		// JButton Button18 = new JButton(Empty);
		Button18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button11.getIcon() != Empty) {
					if (e.getSource() == Button18) {
						if (playerBlue) {
							if (Button18.getIcon() == Empty) {
								Button18.setIcon(Blue);
								playerBlue = false;
								w18 = 1;
								WhenWin();
							}
						} else {
							if (Button18.getIcon() == Empty) {
								Button18.setIcon(Red);
								playerBlue = true;
								w18 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_25.add(Button18, BorderLayout.CENTER);

		JPanel panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_26);
		panel_26.setLayout(new BorderLayout(0, 0));

		// JButton Button17 = new JButton(Empty);
		Button17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button10.getIcon() != Empty) {
					if (e.getSource() == Button17) {
						if (playerBlue) {
							if (Button17.getIcon() == Empty) {
								Button17.setIcon(Blue);
								playerBlue = false;
								w17 = 1;
								WhenWin();
							}
						} else {
							if (Button17.getIcon() == Empty) {
								Button17.setIcon(Red);
								playerBlue = true;
								w17 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_26.add(Button17, BorderLayout.CENTER);

		JPanel panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_27);
		panel_27.setLayout(new BorderLayout(0, 0));

		// JButton Button16 = new JButton(Empty);
		Button16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button9.getIcon() != Empty) {
					if (e.getSource() == Button16) {
						if (playerBlue) {
							if (Button16.getIcon() == Empty) {
								Button16.setIcon(Blue);
								playerBlue = false;
								w16 = 1;
								WhenWin();
							}
						} else {
							if (Button16.getIcon() == Empty) {
								Button16.setIcon(Red);
								playerBlue = true;
								w16 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_27.add(Button16, BorderLayout.CENTER);

		JPanel panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_28);
		panel_28.setLayout(new BorderLayout(0, 0));

		// JButton Button15 = new JButton(Empty);
		Button15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button8.getIcon() != Empty) {
					if (e.getSource() == Button15) {
						if (playerBlue) {
							if (Button15.getIcon() == Empty) {
								Button15.setIcon(Blue);
								playerBlue = false;
								w15 = 1;
								WhenWin();
							}
						} else {
							if (Button15.getIcon() == Empty) {
								Button15.setIcon(Red);
								playerBlue = true;
								w15 = 0;
								WhenWin();
							}
						}
					}

				}
			}
		});
		panel_28.add(Button15, BorderLayout.CENTER);

		JPanel panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_29);
		panel_29.setLayout(new BorderLayout(0, 0));

		// JButton Button14 = new JButton(Empty);
		Button14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button7.getIcon() != Empty) {

					if (playerBlue) {
						if (Button14.getIcon() == Empty) {
							Button14.setIcon(Blue);
							playerBlue = false;
							w14 = 1;
							WhenWin();
						}
					} else {
						if (Button14.getIcon() == Empty) {
							Button14.setIcon(Red);
							playerBlue = true;
							w14 = 0;
							WhenWin();
						}
					}
				}
			}
		});
		panel_29.add(Button14, BorderLayout.CENTER);

		JPanel panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_30);
		panel_30.setLayout(new BorderLayout(0, 0));

		// JButton Button13 = new JButton(Empty);
		Button13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button6.getIcon() != Empty) {
					if (e.getSource() == Button13) {
						if (playerBlue) {
							if (Button13.getIcon() == Empty) {
								Button13.setIcon(Blue);
								playerBlue = false;
								w13 = 1;
								WhenWin();
							}
						} else {
							if (Button13.getIcon() == Empty) {
								Button13.setIcon(Red);
								playerBlue = true;
								w13 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_30.add(Button13, BorderLayout.CENTER);

		JPanel panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_31);
		panel_31.setLayout(new BorderLayout(0, 0));

		// JButton Button12 = new JButton(Empty);
		Button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button5.getIcon() != Empty) {
					if (e.getSource() == Button12) {
						if (playerBlue) {
							if (Button12.getIcon() == Empty) {
								Button12.setIcon(Blue);
								playerBlue = false;
								w12 = 1;
								WhenWin();
							}
						} else {
							if (Button12.getIcon() == Empty) {
								Button12.setIcon(Red);
								playerBlue = true;
								w12 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_31.add(Button12, BorderLayout.CENTER);

		JPanel panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_32);
		panel_32.setLayout(new BorderLayout(0, 0));

		// JButton Button11 = new JButton(Empty);
		Button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button4.getIcon() != Empty) {
					if (e.getSource() == Button11) {
						if (playerBlue) {
							if (Button11.getIcon() == Empty) {
								Button11.setIcon(Blue);
								playerBlue = false;
								w11 = 1;
								WhenWin();
							}
						} else {
							if (Button11.getIcon() == Empty) {
								Button11.setIcon(Red);
								playerBlue = true;
								w11 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_32.add(Button11, BorderLayout.CENTER);

		JPanel panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_33);
		panel_33.setLayout(new BorderLayout(0, 0));

		// JButton Button10 = new JButton(Empty);
		Button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button3.getIcon() != Empty) {
					if (e.getSource() == Button10) {
						if (playerBlue) {
							if (Button10.getIcon() == Empty) {
								Button10.setIcon(Blue);
								playerBlue = false;
								w10 = 1;
								WhenWin();
							}
						} else {
							if (Button10.getIcon() == Empty) {
								Button10.setIcon(Red);
								playerBlue = true;
								w10 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_33.add(Button10, BorderLayout.CENTER);

		JPanel panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_34);
		panel_34.setLayout(new BorderLayout(0, 0));

		// JButton Button9 = new JButton(Empty);
		Button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button2.getIcon() != Empty) {
					if (e.getSource() == Button9) {
						if (playerBlue) {
							if (Button9.getIcon() == Empty) {
								Button9.setIcon(Blue);
								playerBlue = false;
								w9 = 1;
								WhenWin();
							}
						} else {
							if (Button9.getIcon() == Empty) {
								Button9.setIcon(Red);
								playerBlue = true;
								w9 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_34.add(Button9, BorderLayout.CENTER);

		JPanel panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_35);
		panel_35.setLayout(new BorderLayout(0, 0));

		// 8 Listener
		Button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button1.getIcon() != Empty) {
					if (e.getSource() == Button8) {
						if (playerBlue) {
							if (Button8.getIcon() == Empty) {
								Button8.setIcon(Blue);
								playerBlue = false;
								w8 = 1;
								WhenWin();
							}
						} else {
							if (Button8.getIcon() == Empty) {
								Button8.setIcon(Red);
								playerBlue = true;
								w8 = 0;
								WhenWin();
							}
						}

					}
				}
			}
		});
		panel_35.add(Button8, BorderLayout.CENTER);

		JPanel panel_36 = new JPanel();
		panel_36.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_36);
		panel_36.setLayout(new BorderLayout(0, 0));

		// Button 7 Listener
		Button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Button7) {
					if (playerBlue) {
						if (Button7.getIcon() == Empty) {
							Button7.setIcon(Blue);
							playerBlue = false;
							w7 = 1;
							WhenWin();
						}
					} else {
						if (Button7.getIcon() == Empty) {
							Button7.setIcon(Red);
							playerBlue = true;
							w7 = 0;
							WhenWin();
						}
					}

				}
			}
		});
		panel_36.add(Button7, BorderLayout.CENTER);

		JPanel panel_37 = new JPanel();
		panel_37.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_37);
		panel_37.setLayout(new BorderLayout(0, 0));

		// JButton Button6 = new JButton(Empty);
		Button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Button6) {
					if (playerBlue) {
						if (Button6.getIcon() == Empty) {
							Button6.setIcon(Blue);
							playerBlue = false;
							w6 = 1;
							WhenWin();
						}
					} else {
						if (Button6.getIcon() == Empty) {
							Button6.setIcon(Red);
							playerBlue = true;
							w6 = 0;
							WhenWin();

						}
					}

				}
			}
		});
		panel_37.add(Button6, BorderLayout.CENTER);

		JPanel panel_38 = new JPanel();
		panel_38.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_38);
		panel_38.setLayout(new BorderLayout(0, 0));

		// JButton Button5 = new JButton(Empty);
		Button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Button5) {
					if (playerBlue) {
						if (Button5.getIcon() == Empty) {
							Button5.setIcon(Blue);
							playerBlue = false;
							w5 = 1;
							WhenWin();
						}
					} else {
						if (Button5.getIcon() == Empty) {
							Button5.setIcon(Red);
							playerBlue = true;
							w5 = 0;
							WhenWin();
						}
					}

				}
			}
		});
		panel_38.add(Button5, BorderLayout.CENTER);

		JPanel panel_39 = new JPanel();
		panel_39.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_39);
		panel_39.setLayout(new BorderLayout(0, 0));

		// JButton Button4 = new JButton(Empty);
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (playerBlue) {
					if (Button4.getIcon() == Empty) {
						Button4.setIcon(Blue);
						playerBlue = false;
						w4 = 1;
						WhenWin();
					}
				} else {
					if (Button4.getIcon() == Empty) {
						Button4.setIcon(Red);
						playerBlue = true;
						w4 = 0;
						WhenWin();
					}

				}

			}
		});
		panel_39.add(Button4, BorderLayout.CENTER);

		JPanel panel_40 = new JPanel();
		panel_40.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_40);
		panel_40.setLayout(new BorderLayout(0, 0));

		// JButton Button3 = new JButton(Empty);
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (playerBlue) {
					if (Button3.getIcon() == Empty) {
						Button3.setIcon(Blue);
						playerBlue = false;
						w3 = 1;
						WhenWin();
					}
				} else {
					if (Button3.getIcon() == Empty) {
						Button3.setIcon(Red);
						playerBlue = true;
						w3 = 0;
						WhenWin();
					}

				}

			}
		});
		panel_40.add(Button3, BorderLayout.CENTER);

		JPanel panel_41 = new JPanel();
		panel_41.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_41);
		panel_41.setLayout(new BorderLayout(0, 0));

		// JButton Button2 = new JButton(Empty);
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Button2) {
					if (playerBlue) {
						if (Button2.getIcon() == Empty) {
							Button2.setIcon(Blue);
							playerBlue = false;
							w2 = 1;
							WhenWin();
						}
					} else {
						if (Button2.getIcon() == Empty) {
							Button2.setIcon(Red);
							playerBlue = true;
							w2 = 0;
							WhenWin();
						}

					}

				}
			}
		});
		panel_41.add(Button2, BorderLayout.CENTER);

		JPanel panel_42 = new JPanel();
		panel_42.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_42);
		panel_42.setLayout(new BorderLayout(0, 0));

		// JButton Button1 = new JButton(Empty);
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Button1) {
					if (playerBlue) {
						if (Button1.getIcon() == Empty) {
							Button1.setIcon(Blue);
							playerBlue = false;
							w1 = 1;
							WhenWin();
						}
					} else {
						if (Button1.getIcon() == Empty) {
							Button1.setIcon(Red);
							playerBlue = true;
							w1 = 0;
							WhenWin();

						}

					}

				}
			}
		});
		panel_42.add(Button1, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Reset");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == mntmNewMenuItem) {
					reset();

				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Exit");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);

	}

	private void reset() {
		Button1.setIcon(Empty);
		Button2.setIcon(Empty);
		Button3.setIcon(Empty);
		Button4.setIcon(Empty);
		Button5.setIcon(Empty);
		Button6.setIcon(Empty);
		Button7.setIcon(Empty);
		Button8.setIcon(Empty);
		Button9.setIcon(Empty);
		Button10.setIcon(Empty);
		Button11.setIcon(Empty);
		Button12.setIcon(Empty);
		Button13.setIcon(Empty);
		Button14.setIcon(Empty);
		Button15.setIcon(Empty);
		Button16.setIcon(Empty);
		Button17.setIcon(Empty);
		Button18.setIcon(Empty);
		Button19.setIcon(Empty);
		Button20.setIcon(Empty);
		Button21.setIcon(Empty);
		Button22.setIcon(Empty);
		Button23.setIcon(Empty);
		Button24.setIcon(Empty);
		Button25.setIcon(Empty);
		Button26.setIcon(Empty);
		Button27.setIcon(Empty);
		Button28.setIcon(Empty);
		Button29.setIcon(Empty);
		Button30.setIcon(Empty);
		Button31.setIcon(Empty);
		Button32.setIcon(Empty);
		Button33.setIcon(Empty);
		Button34.setIcon(Empty);
		Button35.setIcon(Empty);
		Button36.setIcon(Empty);
		Button37.setIcon(Empty);
		Button38.setIcon(Empty);
		Button39.setIcon(Empty);
		Button40.setIcon(Empty);
		Button41.setIcon(Empty);
		Button42.setIcon(Empty);
		w1 = 50;
		w2 = 50;
		w3 = 50;
		w4 = 50;
		w5 = 50;
		w6 = 50;
		w7 = 50;
		w8 = 50;
		w9 = 50;
		w10 = 50;
		w11 = 50;
		w12 = 50;
		w13 = 50;
		w14 = 50;
		w15 = 50;
		w16 = 50;
		w17 = 50;
		w18 = 50;
		w19 = 50;
		w20 = 50;
		w21 = 50;
		w22 = 50;
		w23 = 50;
		w24 = 50;
		w25 = 50;
		w26 = 50;
		w27 = 50;
		w28 = 50;
		w29 = 50;
		w30 = 50;
		w31 = 50;
		w32 = 50;
		w33 = 50;
		w34 = 50;
		w35 = 50;
		w36 = 50;
		w37 = 50;
		w38 = 50;
		w39 = 50;
		w40 = 50;
		w41 = 50;
		w42 = 50;

	}

	private void WhenWin() {
		// Red winning

		// row Wins
		if (w1 == 0 && w2 == 0 && w3 == 0 && w4 == 0) {
			playerRedWins();

		}
		if (w2 == 0 && w3 == 0 && w4 == 0 && w5 == 0) {
			playerRedWins();

		}
		if (w3 == 0 && w4 == 0 && w5 == 0 && w6 == 0) {
			playerRedWins();

		}
		if (w4 == 0 && w5 == 0 && w6 == 0 && w7 == 0) {
			playerRedWins();

		}
		if (w8 == 0 && w9 == 0 && w10 == 0 && w11 == 0) {
			playerRedWins();

		}
		if (w9 == 0 && w10 == 0 && w11 == 0 && w12 == 0) {
			playerRedWins();

		}
		if (w10 == 0 && w11 == 0 && w12 == 0 && w13 == 0) {
			playerRedWins();

		}
		if (w11 == 0 && w12 == 0 && w13 == 0 && w14 == 0) {
			playerRedWins();

		}
		if (w15 == 0 && w16 == 0 && w17 == 0 && w18 == 0) {
			playerRedWins();

		}
		if (w16 == 0 && w17 == 0 && w18 == 0 && w19 == 0) {
			playerRedWins();

		}
		if (w17 == 0 && w18 == 0 && w19 == 0 && w20 == 0) {
			playerRedWins();

		}
		if (w18 == 0 && w19 == 0 && w20 == 0 && w21 == 0) {
			playerRedWins();

		}
		if (w22 == 0 && w23 == 0 && w24 == 0 && w25 == 0) {
			playerRedWins();

		}
		if (w23 == 0 && w24 == 0 && w25 == 0 && w26 == 0) {
			playerRedWins();

		}
		if (w24 == 0 && w25 == 0 && w26 == 0 && w27 == 0) {
			playerRedWins();

		}
		if (w25 == 0 && w26 == 0 && w27 == 0 && w28 == 0) {
			playerRedWins();

		}
		if (w29 == 0 && w30 == 0 && w31 == 0 && w32 == 0) {
			playerRedWins();

		}
		if (w30 == 0 && w31 == 0 && w32 == 0 && w33 == 0) {
			playerRedWins();

		}
		if (w31 == 0 && w32 == 0 && w33 == 0 && w34 == 0) {
			playerRedWins();

		}
		if (w32 == 0 && w33 == 0 && w34 == 0 && w35 == 0) {
			playerRedWins();

		}
		if (w36 == 0 && w37 == 0 && w38 == 0 && w39 == 0) {
			playerRedWins();

		}
		if (w37 == 0 && w38 == 0 && w39 == 0 && w40 == 0) {
			playerRedWins();

		}
		if (w38 == 0 && w39 == 0 && w40 == 0 && w41 == 0) {
			playerRedWins();

		}
		if (w39 == 0 && w40 == 0 && w41 == 0 && w42 == 0) {
			playerRedWins();

		}

		// Columns
		if (w1 == 0 && w8 == 0 && w15 == 0 && w22 == 0) {
			playerRedWins();

		}
		if (w8 == 0 && w15 == 0 && w22 == 0 && w29 == 0) {
			playerRedWins();

		}
		if (w15 == 0 && w22 == 0 && w29 == 0 && w36 == 0) {
			playerRedWins();

		}
		if (w2 == 0 && w9 == 0 && w16 == 0 && w23 == 0) {
			playerRedWins();

		}
		if (w9 == 0 && w16 == 0 && w23 == 0 && w30 == 0) {
			playerRedWins();

		}
		if (w16 == 0 && w23 == 0 && w30 == 0 && w37 == 0) {
			playerRedWins();

		}
		if (w3 == 0 && w10 == 0 && w17 == 0 && w24 == 0) {
			playerRedWins();

		}
		if (w10 == 0 && w17 == 0 && w24 == 0 && w31 == 0) {
			playerRedWins();

		}
		if (w17 == 0 && w24 == 0 && w31 == 0 && w38 == 0) {
			playerRedWins();

		}
		if (w4 == 0 && w11 == 0 && w18 == 0 && w25 == 0) {
			playerRedWins();

		}
		if (w11 == 0 && w18 == 0 && w25 == 0 && w32 == 0) {
			playerRedWins();

		}
		if (w18 == 0 && w25 == 0 && w32 == 0 && w39 == 0) {
			playerRedWins();

		}
		if (w5 == 0 && w12 == 0 && w19 == 0 && w26 == 0) {
			playerRedWins();

		}
		if (w12 == 0 && w19 == 0 && w26 == 0 && w33 == 0) {
			playerRedWins();

		}
		if (w19 == 0 && w26 == 0 && w33 == 0 && w40 == 0) {
			playerRedWins();

		}
		if (w6 == 0 && w13 == 0 && w20 == 0 && w27 == 0) {
			playerRedWins();

		}
		if (w13 == 0 && w20 == 0 && w27 == 0 && w34 == 0) {
			playerRedWins();

		}
		if (w20 == 0 && w27 == 0 && w34 == 0 && w41 == 0) {
			playerRedWins();

		}
		if (w7 == 0 && w14 == 0 && w21 == 0 && w28 == 0) {
			playerRedWins();

		}
		if (w14 == 0 && w21 == 0 && w28 == 0 && w35 == 0) {
			playerRedWins();

		}
		if (w14 == 0 && w21 == 0 && w28 == 0 && w35 == 0) {
			playerRedWins();

		}
		if (w21 == 0 && w28 == 0 && w35 == 0 && w42 == 0) {
			playerRedWins();

		}

		// Diagonals (Left to Right)

		if (w21 == 0 && w27 == 0 && w33 == 0 && w39 == 0) {
			playerRedWins();

		}
		if (w14 == 0 && w20 == 0 && w26 == 0 && w32 == 0) {
			playerRedWins();

		}
		if (w20 == 0 && w26 == 0 && w32 == 0 && w38 == 0) {
			playerRedWins();

		}
		if (w7 == 0 && w13 == 0 && w19 == 0 && w25 == 0) {
			playerRedWins();

		}
		if (w13 == 0 && w19 == 0 && w25 == 0 && w31 == 0) {
			playerRedWins();

		}
		if (w19 == 0 && w25 == 0 && w31 == 0 && w37 == 0) {
			playerRedWins();

		}
		if (w6 == 0 && w12 == 0 && w18 == 0 && w24 == 0) {
			playerRedWins();

		}
		if (w12 == 0 && w18 == 0 && w24 == 0 && w30 == 0) {
			playerRedWins();

		}
		if (w18 == 0 && w24 == 0 && w30 == 0 && w36 == 0) {
			playerRedWins();

		}
		if (w5 == 0 && w11 == 0 && w17 == 0 && w23 == 0) {
			playerRedWins();

		}
		if (w11 == 0 && w17 == 0 && w23 == 0 && w29 == 0) {
			playerRedWins();

		}
		if (w4 == 0 && w10 == 0 && w16 == 0 && w22 == 0) {
			playerRedWins();

		}

		// Diagonals (Right to Left)
		if (w15 == 0 && w23 == 0 && w31 == 0 && w39 == 0) {
			playerRedWins();

		}
		if (w16 == 0 && w24 == 0 && w32 == 0 && w40 == 0) {
			playerRedWins();

		}
		if (w8 == 0 && w16 == 0 && w24 == 0 && w32 == 0) {
			playerRedWins();

		}
		if (w17 == 0 && w25 == 0 && w33 == 0 && w41 == 0) {
			playerRedWins();

		}
		if (w9 == 0 && w17 == 0 && w25 == 0 && w33 == 0) {
			playerRedWins();

		}
		if (w1 == 0 && w9 == 0 && w17 == 0 && w25 == 0) {
			playerRedWins();

		}
		if (w18 == 0 && w26 == 0 && w34 == 0 && w42 == 0) {
			playerRedWins();

		}
		if (w10 == 0 && w18 == 0 && w26 == 0 && w34 == 0) {
			playerRedWins();

		}
		if (w2 == 0 && w10 == 0 && w18 == 0 && w26 == 0) {
			playerRedWins();

		}
		if (w11 == 0 && w19 == 0 && w27 == 0 && w35 == 0) {
			playerRedWins();

		}
		if (w3 == 0 && w11 == 0 && w19 == 0 && w27 == 0) {
			playerRedWins();

		}
		if (w4 == 0 && w12 == 0 && w20 == 0 && w28 == 0) {
			playerRedWins();

		}

		// Blue wins
		// row Wins
		if (w1 == 1 && w2 == 1 && w3 == 1 && w4 == 1) {
			playerBlueWins();

		}
		if (w2 == 1 && w3 == 1 && w4 == 1 && w5 == 1) {
			playerBlueWins();

		}
		if (w3 == 1 && w4 == 1 && w5 == 1 && w6 == 1) {
			playerBlueWins();

		}
		if (w4 == 1 && w5 == 1 && w6 == 1 && w7 == 1) {
			playerBlueWins();

		}
		if (w8 == 1 && w9 == 1 && w10 == 1 && w11 == 1) {
			playerBlueWins();

		}
		if (w9 == 1 && w10 == 1 && w11 == 1 && w12 == 1) {
			playerBlueWins();

		}
		if (w10 == 1 && w11 == 1 && w12 == 1 && w13 == 1) {
			playerBlueWins();

		}
		if (w11 == 1 && w12 == 1 && w13 == 1 && w14 == 1) {
			playerBlueWins();

		}
		if (w15 == 1 && w16 == 1 && w17 == 1 && w18 == 1) {
			playerBlueWins();

		}
		if (w16 == 1 && w17 == 1 && w18 == 1 && w19 == 1) {
			playerBlueWins();

		}
		if (w17 == 1 && w18 == 1 && w19 == 1 && w20 == 1) {
			playerBlueWins();

		}
		if (w18 == 1 && w19 == 1 && w20 == 1 && w21 == 1) {
			playerBlueWins();

		}
		if (w22 == 1 && w23 == 1 && w24 == 1 && w25 == 1) {
			playerBlueWins();

		}
		if (w23 == 1 && w24 == 1 && w25 == 1 && w26 == 1) {
			playerBlueWins();

		}
		if (w24 == 1 && w25 == 1 && w26 == 1 && w27 == 1) {
			playerBlueWins();

		}
		if (w25 == 1 && w26 == 1 && w27 == 1 && w28 == 1) {
			playerBlueWins();

		}
		if (w29 == 1 && w30 == 1 && w31 == 1 && w32 == 1) {
			playerBlueWins();

		}
		if (w30 == 1 && w31 == 1 && w32 == 1 && w33 == 1) {
			playerBlueWins();

		}
		if (w31 == 1 && w32 == 1 && w33 == 1 && w34 == 1) {
			playerBlueWins();

		}
		if (w32 == 1 && w33 == 1 && w34 == 1 && w35 == 1) {
			playerBlueWins();

		}
		if (w36 == 1 && w37 == 1 && w38 == 1 && w39 == 1) {
			playerBlueWins();

		}
		if (w37 == 1 && w38 == 1 && w39 == 1 && w40 == 1) {
			playerBlueWins();

		}
		if (w38 == 1 && w39 == 1 && w40 == 1 && w41 == 1) {
			playerBlueWins();

		}
		if (w39 == 1 && w40 == 1 && w41 == 1 && w42 == 1) {
			playerBlueWins();

		}

		// Columns
		if (w1 == 1 && w8 == 1 && w15 == 1 && w22 == 1) {
			playerBlueWins();

		}
		if (w8 == 1 && w15 == 1 && w22 == 1 && w29 == 1) {
			playerBlueWins();

		}
		if (w15 == 1 && w22 == 1 && w29 == 1 && w36 == 1) {
			playerBlueWins();

		}
		if (w2 == 1 && w9 == 1 && w16 == 1 && w23 == 1) {
			playerBlueWins();

		}
		if (w9 == 1 && w16 == 1 && w23 == 1 && w30 == 1) {
			playerBlueWins();

		}
		if (w16 == 1 && w23 == 1 && w30 == 1 && w37 == 1) {
			playerBlueWins();

		}
		if (w3 == 1 && w10 == 1 && w17 == 1 && w24 == 1) {
			playerBlueWins();

		}
		if (w10 == 1 && w17 == 1 && w24 == 1 && w31 == 1) {
			playerBlueWins();

		}
		if (w17 == 1 && w24 == 1 && w31 == 1 && w38 == 1) {
			playerBlueWins();

		}
		if (w4 == 1 && w11 == 1 && w18 == 1 && w25 == 1) {
			playerBlueWins();

		}
		if (w11 == 1 && w18 == 1 && w25 == 1 && w32 == 1) {
			playerBlueWins();

		}
		if (w18 == 1 && w25 == 1 && w32 == 1 && w39 == 1) {
			playerBlueWins();

		}
		if (w5 == 1 && w12 == 0 && w19 == 1 && w26 == 1) {
			playerBlueWins();

		}
		if (w12 == 1 && w19 == 1 && w26 == 1 && w33 == 1) {
			playerBlueWins();

		}
		if (w19 == 1 && w26 == 1 && w33 == 1 && w40 == 1) {
			playerBlueWins();

		}
		if (w6 == 1 && w13 == 1 && w20 == 1 && w27 == 1) {
			playerBlueWins();

		}
		if (w13 == 1 && w20 == 1 && w27 == 1 && w34 == 1) {
			playerBlueWins();

		}
		if (w20 == 1 && w27 == 1 && w34 == 1 && w41 == 1) {
			playerBlueWins();

		}
		if (w7 == 1 && w14 == 1 && w21 == 1 && w28 == 1) {
			playerBlueWins();

		}
		if (w14 == 1 && w21 == 1 && w28 == 1 && w35 == 1) {
			playerBlueWins();

		}
		if (w14 == 1 && w21 == 1 && w28 == 1 && w35 == 1) {
			playerBlueWins();

		}
		if (w21 == 1 && w28 == 1 && w35 == 1 && w42 == 1) {
			playerBlueWins();

		}

		// Diagonals (Left to Right)

		if (w21 == 1 && w27 == 1 && w33 == 1 && w39 == 1) {
			playerBlueWins();

		}
		if (w14 == 1 && w20 == 1 && w26 == 1 && w32 == 1) {
			playerBlueWins();

		}
		if (w20 == 1 && w26 == 1 && w32 == 1 && w38 == 1) {
			playerBlueWins();

		}
		if (w7 == 1 && w13 == 1 && w19 == 1 && w25 == 1) {
			playerBlueWins();

		}
		if (w13 == 1 && w19 == 1 && w25 == 1 && w31 == 1) {
			playerBlueWins();

		}
		if (w19 == 1 && w25 == 1 && w31 == 1 && w37 == 1) {
			playerBlueWins();

		}
		if (w6 == 1 && w12 == 1 && w18 == 1 && w24 == 1) {
			playerBlueWins();

		}
		if (w12 == 1 && w18 == 1 && w24 == 1 && w30 == 1) {
			playerBlueWins();

		}
		if (w18 == 1 && w24 == 1 && w30 == 1 && w36 == 1) {
			playerBlueWins();

		}
		if (w5 == 1 && w11 == 1 && w17 == 1 && w23 == 1) {
			playerBlueWins();

		}
		if (w11 == 1 && w17 == 1 && w23 == 1 && w29 == 1) {
			playerBlueWins();

		}
		if (w4 == 1 && w10 == 1 && w16 == 1 && w22 == 1) {
			playerBlueWins();

		}

		// Diagonals (Right to Left)
		if (w15 == 1 && w23 == 1 && w31 == 1 && w39 == 1) {
			playerBlueWins();

		}
		if (w16 == 1 && w24 == 1 && w32 == 1 && w40 == 1) {
			playerBlueWins();

		}
		if (w8 == 1 && w16 == 1 && w24 == 1 && w32 == 1) {
			playerBlueWins();

		}
		if (w17 == 1 && w25 == 1 && w33 == 1 && w41 == 1) {
			playerBlueWins();

		}
		if (w9 == 1 && w17 == 1 && w25 == 1 && w33 == 1) {
			playerBlueWins();

		}
		if (w1 == 1 && w9 == 1 && w17 == 1 && w25 == 1) {
			playerBlueWins();

		}
		if (w18 == 1 && w26 == 1 && w34 == 1 && w42 == 1) {
			playerBlueWins();

		}
		if (w10 == 1 && w18 == 1 && w26 == 1 && w34 == 1) {
			playerBlueWins();

		}
		if (w2 == 1 && w10 == 1 && w18 == 1 && w26 == 1) {
			playerBlueWins();

		}
		if (w11 == 1 && w19 == 1 && w27 == 1 && w35 == 1) {
			playerBlueWins();

		}
		if (w3 == 1 && w11 == 1 && w19 == 1 && w27 == 1) {
			playerBlueWins();

		}
		if (w4 == 1 && w12 == 1 && w20 == 1 && w28 == 1) {
			playerBlueWins();

		}

	}

	public void playerBlueWins() {
		// JOptionPane.showMessageDialog(frame, "Player blue Wins", "connect four", JOptionPane.INFORMATION_MESSAGE);
		WinScreen frame = new WinScreen("Player 2");
		frame.setVisible(true);

		reset();

	}

	public void playerRedWins() {
		//JOptionPane.showMessageDialog(frame, "Player red Wins", "connect four", JOptionPane.INFORMATION_MESSAGE);
		WinScreen frame = new WinScreen("Player 1");
		frame.setVisible(true);
		
		reset();
	}

	public void firstTurn() {
		if (random.nextInt(2) == 0) {
			playerBlue = true;

		} else {
			playerBlue = false;
		}
	}

}
