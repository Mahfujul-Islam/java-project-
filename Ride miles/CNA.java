import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class CNA extends JFrame implements MouseListener, ActionListener
{	
	JLabel login1,userLabel1,passLabel1,imgLabel1,c1ImgLabel,pn,ea,cp;
	JTextField userTF1,pnTF,eaTF,cpTF,passPF1;
	JButton exitBtn1,admin1,loginBtn1,c2BackBtn, cna;
	JPanel panel1;
	ImageIcon icon1, image1, c1image2;
	Font myFont;

	public CNA()
	{
		this.setTitle("Ridemiles.com");
		this.setSize(1290,710);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(Color.white);

		icon1 = new ImageIcon("img2.jpg");
		setIconImage(icon1.getImage());

		login1 = new JLabel("Create a new Ridemiles Account.");
		login1.setBounds(570, 180, 250, 30);
		login1.setForeground(new Color(169,0,0));
		panel1.add(login1);

		userLabel1 = new JLabel("Username : ");
		userLabel1.setBounds(520, 230, 500, 30);
		userLabel1.setForeground(new Color(169,0,0));
		panel1.add(userLabel1);

		userTF1 = new JTextField();
		userTF1.setBounds(640, 237, 150, 20);
		panel1.add(userTF1);

		pn = new JLabel("Phone Number :");
		pn.setBounds(519, 260, 100, 30);
		pn.setForeground(new Color(169,0,0));
		panel1.add(pn);

		pnTF= new JTextField();
		pnTF.setBounds(640, 267, 150, 20);
		panel1.add(pnTF);

		ea = new JLabel("Email Address :");
		ea.setBounds(519, 290, 100, 30);
		ea.setForeground(new Color(169,0,0));
		panel1.add(ea);

		eaTF = new JTextField();
		eaTF.setBounds(640, 297, 150, 20);
		panel1.add(eaTF);

		passLabel1 = new JLabel("Password  : ");
		passLabel1.setBounds(519, 320, 100, 30);
		passLabel1.setForeground(new Color(169,0,0));
		panel1.add(passLabel1);

		passPF1 = new JTextField();
		passPF1.setBounds(640, 327, 150, 20);
		panel1.add(passPF1);

		cp = new JLabel("Confirm Password :");
		cp.setBounds(520, 350, 500, 30);
		cp.setForeground(new Color(169,0,0));
		panel1.add(cp);

		cpTF = new JTextField();
		cpTF.setBounds(640, 357, 150, 20);
		panel1.add(cpTF);

		loginBtn1 = new JButton("Create Account");
		loginBtn1.setBounds(560, 450, 180, 30);
		loginBtn1.setForeground(Color.WHITE);
		loginBtn1.setBackground(new Color(169,0,0));
		loginBtn1.addActionListener(this);
		loginBtn1.addMouseListener(this);
		panel1.add(loginBtn1);

		c2BackBtn = new JButton("Back");
		c2BackBtn.setBounds(560, 500, 80, 30);
		c2BackBtn.setForeground(Color.WHITE);
		c2BackBtn.setBackground(new Color(169,0,0));
		c2BackBtn.addActionListener(this);
		c2BackBtn.addMouseListener(this);
		panel1.add(c2BackBtn);

		exitBtn1 = new JButton("Exit");
		exitBtn1.setBounds(660, 500, 80, 30);
		exitBtn1.setForeground(Color.WHITE);
		exitBtn1.setBackground(new Color(169,0,0));
		exitBtn1.addActionListener(this);
		exitBtn1.addMouseListener(this);
		panel1.add(exitBtn1);

		c1image2 = new ImageIcon("G.gif");
		c1ImgLabel = new JLabel(c1image2);
		c1ImgLabel.setBounds(0, 10, 600, 600);
		panel1.add(c1ImgLabel);

		image1 = new ImageIcon("3.jpg");
		imgLabel1 = new JLabel(image1);
		imgLabel1.setBounds(0, 0, 1270, 710);
		panel1.add(imgLabel1);
		
		this.add(panel1);

	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == c2BackBtn)
		{
			c2BackBtn.setBackground(Color.WHITE);
			c2BackBtn.setForeground(new Color(169,0,0));
		}
		else if(me.getSource() == loginBtn1)
		{
			loginBtn1.setBackground(Color.WHITE);
			loginBtn1.setForeground(new Color(169,0,0));
		}
		else if(me.getSource() == exitBtn1)
		{
			exitBtn1.setBackground(Color.WHITE);
			exitBtn1.setForeground(new Color(169,0,0));
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == c2BackBtn)
		{
			c2BackBtn.setForeground(Color.WHITE);
			c2BackBtn.setBackground(new Color(169,0,0));
		}
		else if(me.getSource() == loginBtn1)
		{
			loginBtn1.setForeground(Color.WHITE);
			loginBtn1.setBackground(new Color(169,0,0));
		}
		else if(me.getSource() == exitBtn1)
		{
			exitBtn1.setForeground(Color.WHITE);
			exitBtn1.setBackground(new Color(169,0,0));
		}
	}
	@Override
	public void actionPerformed(ActionEvent e1)
	{
		
		String command = e1.getActionCommand();

		if(c2BackBtn.getText().equals(command))
		{
			Customar c3 = new Customar();
			c3.setVisible(true);
			this.setVisible(false);
		}

		if(loginBtn1.getText().equals(command))
		{
			String s1 = userTF1.getText();
			String s2 = pnTF.getText();
			String s3 = eaTF.getText();
			String s4 = passPF1.getText();
			String s5 = cpTF.getText();

			try
			{
				if(s4.length() < 8 && s5.length() < 8)
				{
					throw new MyException();
				}
			}
			catch(MyException me)
			{
				showMessageDialog(null, "Password needs to be atleast 8 characters.");
			}

			if(s4.equals(s5))
			{ 
				if(s4.length() >= 8)
				{
					showMessageDialog(null, "successfully created Ridemiles Account.");
					Customar c1 = new Customar();
					c1.setVisible(true);
					this.setVisible(false);

					try
					{
						FileWriter file = new FileWriter("F:\\java fall semester\\Ride miles\\Files\\t1.txt");
						file.write(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5);
						file.close(); 
					}
					catch(IOException io)
					{
						io.printStackTrace();
					}

				}
				
			}
			else
			{
				showMessageDialog(null, "Password and Confirm Password doesn't match.");
			}
	
		}
	
		else if(exitBtn1.getText().equals(command))
		{
			System.exit(0);
		}
		
	}

}