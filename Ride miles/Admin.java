import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Admin extends JFrame implements MouseListener, ActionListener
{	
	JLabel text2,login2,userLabel2,passLabel2,a1ImgLabel1,a1ImgLabel2,a1Text;
	JTextField userTF2;
	JPasswordField passPF2;
	JButton exitBtn2, backBtn2, loginBtn2;
	JPanel panel2;
	ImageIcon icon2, a1image, a1image2;

	public Admin()
	{
		this.setTitle("Ridemiles.com");
		this.setSize(1290, 710);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		
		panel2 = new JPanel();
		panel2.setLayout(null);

		icon2 = new ImageIcon("img2.jpg");
		setIconImage(icon2.getImage());

		a1Text = new JLabel("                                                                                                                                                                                                  Admin panel");
		a1Text.setForeground(Color.WHITE);
		a1Text.setBackground(new Color(169,0,0));
		a1Text.setOpaque(true);
		a1Text.setBounds(0, 0, 1300, 30);
		panel2.add(a1Text);

		

		userLabel2 = new JLabel("Username : ");
		userLabel2.setBounds(120, 130, 500, 30);
		userLabel2.setForeground(new Color(169,0,0));
		panel2.add(userLabel2);

		userTF2 = new JTextField();
		userTF2.setBounds(190, 137, 150, 20);
		panel2.add(userTF2);

		passLabel2 = new JLabel("Password  : ");
		passLabel2.setBounds(119, 160, 100, 30);
		passLabel2.setForeground(new Color(169,0,0));
		panel2.add(passLabel2);

		passPF2 = new JPasswordField();
		passPF2.setBounds(190, 167, 150, 20);
		passPF2.setEchoChar('*');
		panel2.add(passPF2);

		loginBtn2 = new JButton("Login");
		loginBtn2.setBounds(100, 225, 80, 30);
		loginBtn2.setForeground(Color.WHITE);
		loginBtn2.setBackground(new Color(169,0,0));
		loginBtn2.addActionListener(this);
		panel2.add(loginBtn2);

		backBtn2 = new JButton("Back");
		backBtn2.setBounds(200, 225, 80, 30);
		backBtn2.setForeground(Color.WHITE);
		backBtn2.setBackground(new Color(169,0,0));
		backBtn2.addActionListener(this);
		panel2.add(backBtn2);

		exitBtn2 = new JButton("Exit");
		exitBtn2.setBounds(300, 225, 80, 30);
		exitBtn2.setForeground(Color.WHITE);
		exitBtn2.setBackground(new Color(169,0,0));
		exitBtn2.addActionListener(this);
		panel2.add(exitBtn2);


		a1image = new ImageIcon("adminB1.jpg");
		a1ImgLabel1 = new JLabel(a1image);
		a1ImgLabel1.setBounds(0, 0, 1270, 710);
		panel2.add(a1ImgLabel1);

		exitBtn2.addMouseListener(this);
		backBtn2.addMouseListener(this);
		loginBtn2.addMouseListener(this);

		this.add(panel2);

	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == loginBtn2)
		{
			loginBtn2.setBackground(Color.WHITE);
			loginBtn2.setForeground(new Color(169,0,0));
		}
		if(me.getSource() == backBtn2)
		{
			backBtn2.setBackground(Color.WHITE);
			backBtn2.setForeground(new Color(169,0,0));
		}
		if(me.getSource() == exitBtn2)
		{
			exitBtn2.setBackground(Color.WHITE);
			exitBtn2.setForeground(new Color(169,0,0));
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == loginBtn2)
		{
			loginBtn2.setForeground(Color.WHITE);
			loginBtn2.setBackground(new Color(169,0,0));
		}
		if(me.getSource() == backBtn2)
		{
			backBtn2.setForeground(Color.WHITE);
			backBtn2.setBackground(new Color(169,0,0));
		}
		if(me.getSource() == exitBtn2)
		{
			exitBtn2.setForeground(Color.WHITE);
			exitBtn2.setBackground(new Color(169,0,0));
		}
	}
	@Override
	public void actionPerformed(ActionEvent e4)
	{
		String command = e4.getActionCommand();

		if(backBtn2.getText().equals(command))
		{
			Customar c1 = new Customar();
			c1.setVisible(true);
			this.setVisible(false);
		}

		else if(loginBtn2.getText().equals(command))
		{
			String as1 = userTF2.getText();
			String as2 = passPF2.getText();

			try
			{
				if(as2.length() < 8)
				{
					throw new MyException();
				}
			}
			catch(MyException me)
			{
				showMessageDialog(null, "Password needs to be atleast 8 characters.");
			}

			if(as1.equals("01752776045") && as2.equals("11111111") || as1.equals("01739288378") && as2.equals("11111111") || as1.equals("01580546811") && as2.equals("11111111"))
			{	
				showMessageDialog(null, "Login Successful :)");
				Admin2 a1 = new Admin2();
				a1.setVisible(true);
				this.setVisible(false);
			}
			else
			{
				showMessageDialog(null, "Invalid Username or password!\nPlease try again.");
			}
			
		}
	
		else if(exitBtn2.getText().equals(command))
		{
			System.exit(0);
		}
	}
}