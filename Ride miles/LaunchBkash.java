import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class LaunchBkash extends JFrame implements ActionListener
{
	JLabel p1Text, p1imglbl1, p1userLabel1;
	JPanel p1Panel;
	ImageIcon p1Icon, p1b1;
	JTextField userTF1;
	JButton p1BackBtn, p1ExitBtn;
	JPasswordField userPF1;
	CustomerAccount1 ca1;
	CustomerAccount2 ca2;
	CustomerAccount3 ca3;

	public LaunchBkash()
	{
		this.setTitle("Ridemiles.com");
		this.setSize(1290, 710);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		p1Panel = new JPanel();
		p1Panel.setBackground(Color.WHITE);
		p1Panel.setLayout(null);

		p1Icon = new ImageIcon("img2.jpg");
		setIconImage(p1Icon.getImage());

		p1Text = new JLabel("                                                                                                                                                                                            Ridemiles Bkash Payment");
		p1Text.setForeground(Color.WHITE);
		p1Text.setBackground(new Color(169,0,0));
		p1Text.setOpaque(true);
		p1Text.setBounds(0, 0, 1300, 30);
		p1Panel.add(p1Text);

		p1userLabel1 = new JLabel("Amount : 1250 TK");
		p1userLabel1.setBounds(550, 270, 500, 20);
		p1userLabel1.setForeground(Color.WHITE);
		p1Panel.add(p1userLabel1);

		p1userLabel1 = new JLabel("Enter BKash Number.");
		p1userLabel1.setBounds(500, 350, 500, 20);
		p1userLabel1.setForeground(Color.WHITE);
		p1Panel.add(p1userLabel1);

		userTF1 = new JTextField();
		userTF1.setBounds(500, 375, 270, 30);
		p1Panel.add(userTF1);

		p1userLabel1 = new JLabel("Enter Your BKash Pin.");
		p1userLabel1.setBounds(500, 410, 500, 20);
		p1userLabel1.setForeground(Color.WHITE);
		p1Panel.add(p1userLabel1);

		userPF1 = new JPasswordField();
		userPF1.setBounds(500, 435, 270, 30);
		userPF1.setEchoChar('*');
		p1Panel.add(userPF1);

		p1BackBtn = new JButton("PROCEED");
		p1BackBtn.setBounds(535, 490, 90, 20);
		p1BackBtn.setForeground(Color.WHITE);
		p1BackBtn.setBackground(new Color(170, 51, 106));
		p1BackBtn.addActionListener(this);
		p1Panel.add(p1BackBtn);

		p1ExitBtn = new JButton("CLOSE");
		p1ExitBtn.setBounds(655, 490, 90, 20);
		p1ExitBtn.setForeground(Color.WHITE);
		p1ExitBtn.setBackground(new Color(170, 51, 106));
		p1ExitBtn.addActionListener(this);
		p1Panel.add(p1ExitBtn);

		p1b1 = new ImageIcon("bkash.png");
		p1imglbl1 = new JLabel(p1b1);
		p1imglbl1.setBounds(440, 100, 400, 469);
		p1imglbl1.setBackground(Color.WHITE);
		p1Panel.add(p1imglbl1);

		this.add(p1Panel);

	}
	public void actionPerformed(ActionEvent e3)
	{
		String command = e3.getActionCommand();

		if(e3.getSource()==p1ExitBtn)
		{
			LaunchPay1 l2 = new LaunchPay1();
			l2.setVisible(true);
			this.setVisible(false);
		}
		else if(p1BackBtn.getText().equals(command))
		{
			String s1 = userTF1.getText();
			String s2 = userPF1.getText();
			ca1 = new CustomerAccount1();
			ca2 = new CustomerAccount2();
			ca3 = new CustomerAccount3();

			if(s1.equals(ca1.accountNumber) && s2.equals(ca1.password))
			{ 

					try
					{
						if(ca1.balance1<1250)
						{
										
							throw new MyException();
						}
					}
					catch(MyException me)
					{
						showMessageDialog(null, "Insufficient Balance!");
					}

					if(s1.equals(ca1.accountNumber) && s2.equals(ca1.password) && ca1.balance1>=1250)
					{
						showMessageDialog(null, "Payment Successful.");
						LCS c1 = new LCS();
						c1.setVisible(true);
						this.setVisible(false);
					}
										
			}

			else if(s1.equals(ca2.accountNumber) && s2.equals(ca2.password))
			{ 

					try
					{
						if(ca2.balance2<1250)
						{
										
							throw new MyException();
						}
					}
					catch(MyException me)
					{
						showMessageDialog(null, "Insufficient Balance!");
					}

					if(s1.equals(ca2.accountNumber) && s2.equals(ca2.password) && ca2.balance2>=1250)
					{
						showMessageDialog(null, "Payment Successful.");
						LCS c1 = new LCS();
						c1.setVisible(true);
						this.setVisible(false);
					}						
				
			}

			else if(s1.equals(ca3.accountNumber) && s2.equals(ca3.password))
			{ 

					try
					{
						if(ca3.balance3<1250)
						{
										
							throw new MyException();
						}
					}
					catch(MyException me)
					{
						showMessageDialog(null, "Insufficient Balance!");
					}

					if(s1.equals(ca3.accountNumber) && s2.equals(ca3.password) && ca3.balance3>=1250)
					{
						showMessageDialog(null, "Payment Successful.");
						LCS c1 = new LCS();
						c1.setVisible(true);
						this.setVisible(false);
					}
					
			}

			else
			{
				showMessageDialog(null, "Incorrect PIN.");
			}

		}

	}
}