import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ATMClient {

	private JFrame frame;
	private JTextField tfMoney;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATMClient window = new ATMClient();
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
	public ATMClient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 698, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("987321");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(284, 49, 178, 51);
		frame.getContentPane().add(lblNewLabel);
		
		tfMoney = new JTextField();
		tfMoney.setBounds(200, 110, 297, 60);
		frame.getContentPane().add(tfMoney);
		tfMoney.setColumns(10);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Business bs = new Business();
				int n = bs.executeDB("Insert into Account values('123','phuong',50000)");
				if(n>0) JOptionPane.showMessageDialog(null, "Sucess");
			}
		});
		btnDeposit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDeposit.setBounds(48, 214, 165, 51);
		frame.getContentPane().add(btnDeposit);
		
		JButton btnNewButton = new JButton("Check balance");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Business bs = new Business();
				ResultSet rs = bs.queryDB("select * from Account");
				try {
					while(rs.next()) {
						System.out.println(rs.getString("AccountID")+" has"+rs.getFloat("Balance"));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(464, 214, 170, 39);
		frame.getContentPane().add(btnNewButton);
	}
}
