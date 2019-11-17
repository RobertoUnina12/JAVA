//Piccola CalcolatriceCON DUE VALORI

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame2 {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 window = new Frame2();
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
	public Frame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 355);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(30, 25, 163, 77);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);

		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(203, 25, 163, 77);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);

		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());

					ans = num1 + num2;
					textField.setText(Integer.toString(ans));

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter valid number..");
				}

			}
		});
		btnNewButton.setBounds(30, 113, 163, 77);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans1;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());

					ans1 = num1 - num2;
					textField_1.setText(Integer.toString(ans1));

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter valid number..");
				}
			}
		});
		btnNewButton_1.setBounds(213, 113, 153, 77);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblIlRisultatoE = new JLabel("IL RISULTATO ADD");
		lblIlRisultatoE.setBounds(40, 201, 125, 22);
		frame.getContentPane().add(lblIlRisultatoE);

		textField = new JTextField();
		textField.setBounds(30, 234, 153, 71);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("RISULTATO MINUS");
		lblNewLabel.setBounds(223, 201, 125, 14);
		frame.getContentPane().add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setBounds(213, 234, 153, 71);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
