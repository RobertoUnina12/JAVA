import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Frame3 {

	private JFrame frame;
	private JTextField textField;
	double n1;
	double n2;
	double r;
	String op;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3 window = new Frame3();
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
	public Frame3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 259, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(20, 50, 200, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton button = new JButton("1");
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// per far avere la successione di numeri sulla label della calcolatrice
				String EnterNumber = textField.getText() + button.getText();
				textField.setText(EnterNumber);

			}
		});
//		button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//				textField_1.setText(Integer.toString(1));
//
//			}
//		});
		button.setBounds(20, 119, 50, 50);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("2");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_1.getText();
				textField.setText(EnterNumber);

			}
		});
		button_1.setBounds(70, 119, 50, 50);
		frame.getContentPane().add(button_1);

		JButton button_2 = new JButton("3");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_2.getText();
				textField.setText(EnterNumber);
			}
		});
		button_2.setBounds(120, 119, 50, 50);
		frame.getContentPane().add(button_2);

		JButton button_3 = new JButton("4");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_3.getText();
				textField.setText(EnterNumber);
			}
		});
		button_3.setBounds(20, 169, 50, 50);
		frame.getContentPane().add(button_3);

		JButton button_4 = new JButton("5");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_4.getText();
				textField.setText(EnterNumber);
			}
		});
		button_4.setBounds(70, 169, 50, 50);
		frame.getContentPane().add(button_4);

		JButton button_5 = new JButton("6");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_5.getText();
				textField.setText(EnterNumber);
			}
		});
		button_5.setBounds(120, 169, 50, 50);
		frame.getContentPane().add(button_5);

		JButton button_6 = new JButton("7");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_6.getText();
				textField.setText(EnterNumber);
			}
		});
		button_6.setBounds(20, 219, 50, 50);
		frame.getContentPane().add(button_6);

		JButton button_7 = new JButton("8");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_7.getText();
				textField.setText(EnterNumber);
			}
		});
		button_7.setBounds(70, 219, 50, 50);
		frame.getContentPane().add(button_7);

		JButton button_8 = new JButton("9");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_8.getText();
				textField.setText(EnterNumber);
			}
		});
		button_8.setBounds(120, 219, 50, 50);
		frame.getContentPane().add(button_8);

		JButton button_9 = new JButton("0");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_9.getText();
				textField.setText(EnterNumber);
			}
		});
		button_9.setBounds(20, 269, 50, 50);
		frame.getContentPane().add(button_9);

		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "+";
			}
		});
		btnNewButton.setBounds(170, 119, 50, 50);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "-";
			}
		});
		btnNewButton_1.setBounds(170, 169, 50, 50);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("x");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "x";
			}
		});
		btnNewButton_2.setBounds(170, 219, 50, 50);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton(":");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = ":";
			}
		});
		btnNewButton_3.setBounds(170, 269, 50, 50);
		frame.getContentPane().add(btnNewButton_3);

		JButton button_11 = new JButton("=");
		button_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String answer;

				n2 = Double.parseDouble(textField.getText());
				if (op == "+") {
					r = n1 + n2;
					answer = String.format("%.2f", r);
					textField.setText(answer);

				} else if (op == "-") {
					r = n1 - n2;
					answer = String.format("%.2f", r);
					textField.setText(answer);

				} else if (op == "x") {
					r = n1 * n2;
					answer = String.format("%.2f", r);
					textField.setText(answer);
				} else if (op == ":") {
					r = n1 / n2;
					answer = String.format("%.2f", r);
					textField.setText(answer);

				}
			}
		});
		button_11.setBounds(20, 319, 50, 50);
		frame.getContentPane().add(button_11);

		JLabel lblFirstNumber = new JLabel("Calculator");
		lblFirstNumber.setBounds(20, 11, 89, 28);
		frame.getContentPane().add(lblFirstNumber);

		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(70, 269, 50, 50);
		frame.getContentPane().add(btnC);

		JButton button_10 = new JButton("<");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if (textField.getText().length() > 0) {

					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);

				}
			}
		});
		button_10.setBounds(120, 269, 50, 50);
		frame.getContentPane().add(button_10);
	}
}
