import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class Customar extends JFrame implements MouseListener, ActionListener
{	
	JLabel login1,userLabel1,passLabel1,imgLabel1,c1ImgLabel;
	JTextField userTF1;
	JPasswordField passPF1;
	JButton exitBtn1,admin1,loginBtn1, cna;
	JPanel panel1;
	ImageIcon icon1, image1, c1image2;
	Font myFont;

	public Customar()
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

		login1 = new JLabel("Log in with username and password.");
		login1.setBounds(530, 180, 250, 30);
		login1.setForeground(new Color(169,0,0));
		panel1.add(login1);

		userLabel1 = new JLabel("Username : ");
		userLabel1.setBounds(520, 230, 500, 30);
		userLabel1.setForeground(new Color(169,0,0));
		panel1.add(userLabel1);

		userTF1 = new JTextField();
		userTF1.setBounds(590, 237, 150, 20);
		panel1.add(userTF1);

		passLabel1 = new JLabel("Password  : ");
		passLabel1.setBounds(519, 260, 100, 30);
		passLabel1.setForeground(new Color(169,0,0));
		panel1.add(passLabel1);

		passPF1 = new JPasswordField();
		passPF1.setBounds(590, 267, 150, 20);
		passPF1.setEchoChar('*');
		panel1.add(passPF1);

		admin1 = new JButton("Admin Log In");
		admin1.setBounds(1100, 180,120, 20);
		admin1.setForeground(Color.WHITE);
		admin1.setBackground(new Color(169,0,0));
		admin1.addActionListener(this);
		admin1.addMouseListener(this);
		panel1.add(admin1);

		loginBtn1 = new JButton("Log In");
		loginBtn1.setBounds(550, 325, 80, 30);
		loginBtn1.setForeground(Color.WHITE);
		loginBtn1.setBackground(new Color(169,0,0));
		loginBtn1.addActionListener(this);
		loginBtn1.addMouseListener(this);
		panel1.add(loginBtn1);

		exitBtn1 = new JButton("Exit");
		exitBtn1.setBounds(650, 325, 80, 30);
		exitBtn1.setForeground(Color.WHITE);
		exitBtn1.setBackground(new Color(169,0,0));
		exitBtn1.addActionListener(this);
		exitBtn1.addMouseListener(this);
		panel1.add(exitBtn1);

		login1 = new JLabel("--Or--");
		login1.setBounds(625, 360, 250, 30);
		login1.setForeground(new Color(169,0,0));
		panel1.add(login1);

		cna = new JButton("Create New Account");
		cna.setBounds(550, 395, 180, 20);
		cna.setForeground(Color.WHITE);
		cna.setBackground(new Color(169,0,0));
		cna.addActionListener(this);
		cna.addMouseListener(this);
		panel1.add(cna);

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
		if(me.getSource() == admin1)
		{
			admin1.setBackground(Color.WHITE);
			admin1.setForeground(new Color(169,0,0));
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
		else if(me.getSource() == cna)
		{
			cna.setBackground(Color.WHITE);
			cna.setForeground(new Color(169,0,0));
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == admin1)
		{
			admin1.setForeground(Color.WHITE);
			admin1.setBackground(new Color(169,0,0));
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
		else if(me.getSource() == cna)
		{
			cna.setForeground(Color.WHITE);
			cna.setBackground(new Color(169,0,0));
		}
	}
	@Override
	public void actionPerformed(ActionEvent e1)
	{
		
		String command = e1.getActionCommand();
		
		if(admin1.getText().equals(command))
		{
			Admin a1 = new Admin();
			a1.setVisible(true);
			this.setVisible(false);
		}

		else if(loginBtn1.getText().equals(command))
		{
			String s1 = userTF1.getText();
			String s2 = passPF1.getText();

		try
		{
			File file = new File("F:\\java fall semester\\Ride miles\\Files\\t1.txt");
			Scanner sc = new Scanner(file);

			while(sc.hasNext())
			{
				String line1 = sc.nextLine();
				String line2 = sc.nextLine();
				String line3 = sc.nextLine();
				String line4 = sc.nextLine();
				String line5 = sc.nextLine();

				if(s1.equals(line1) && s2.equals(line5))
				{ 
					showMessageDialog(null, "successful Login :)");
					Customar2 c1 = new Customar2();
					c1.setVisible(true);
					this.setVisible(false);
				}
				else
				{
					showMessageDialog(null, "Invalid Username or password! \n Please try again.");
				}
			}

			sc.close(); 
		}
		catch(Exception ex)
		{
			showMessageDialog(null, "Invalid Username or password! \n Please try again.");
			return;
		}
	
		}
		if(cna.getText().equals(command))
		{
			CNA cna = new CNA();
			cna.setVisible(true);
			this.setVisible(false);
		}
	
		else if(exitBtn1.getText().equals(command))
		{
			System.exit(0);
		}
		
	}

}