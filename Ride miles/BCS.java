import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class BCS extends JFrame implements MouseListener, ActionListener
{
	JLabel p1Text, label, passLabeb1, passLabel2, b1imgLabel4;
	JPanel p1Panel;
	ImageIcon p1Icon, b1image4, b1Lout;
	JButton b1ExitBtn, b1LogOut;

	public BCS()
	{
		this.setTitle("Ridemiles.com");
		this.setSize(1290, 710);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		p1Panel = new JPanel();
		p1Panel.setLayout(null);

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

				passLabeb1 = new JLabel("Ticket Holder Name : "+line1);
				passLabeb1.setBounds(300, 150, 200, 30);
				passLabeb1.setForeground(new Color(169,0,0));
				p1Panel.add(passLabeb1);

				passLabeb1 = new JLabel("Phone Number          : "+line2);
				passLabeb1.setBounds(300, 170, 200, 30);
				passLabeb1.setForeground(new Color(169,0,0));
				p1Panel.add(passLabeb1);

				passLabeb1 = new JLabel("Email Address           : "+line3);
				passLabeb1.setBounds(300, 190, 300, 30);
				passLabeb1.setForeground(new Color(169,0,0));
				p1Panel.add(passLabeb1);

				passLabeb1 = new JLabel("Thanks for using Ridemiles.com");
				passLabeb1.setBounds(550, 470, 400, 60);
				passLabeb1.setForeground(new Color(169,0,0));
				p1Panel.add(passLabeb1);

				passLabeb1 = new JLabel("The ticket has been sent to your email : "+line3);
				passLabeb1.setBounds(470, 450, 400, 60);
				passLabeb1.setForeground(new Color(169,0,0));
				p1Panel.add(passLabeb1);

			}

			
			sc.close(); 
		}
		catch(Exception ex)
		{
			return;
		}
		try
		{
			File file2 = new File("F:\\java fall semester\\Ride miles\\Files\\t2.txt");
			Scanner sc2 = new Scanner(file2);

			while(sc2.hasNext())
			{
				String line1 = sc2.nextLine();
				String line2 = sc2.nextLine();
				String line3 = sc2.nextLine();
				String line4 = sc2.nextLine();
				String line5 = sc2.nextLine();
				String line6 = sc2.nextLine();
				String line7 = sc2.nextLine();
				String line8 = sc2.nextLine();

				passLabel2 = new JLabel(line2);
				passLabel2.setBounds(290, 97, 200, 30);
				passLabel2.setForeground(Color.WHITE);
				p1Panel.add(passLabel2);
		
				passLabel2 = new JLabel("Journey Route    : "+line1);
				passLabel2.setBounds(660, 150, 250, 30);
				passLabel2.setForeground(new Color(169,0,0));
				p1Panel.add(passLabel2);

				passLabel2 = new JLabel("Seat Number       : "+line6);
				passLabel2.setBounds(660, 170, 200, 30);
				passLabel2.setForeground(new Color(169,0,0));
				p1Panel.add(passLabel2);

				passLabel2 = new JLabel("Bus Type               : "+line3);
				passLabel2.setBounds(660, 190, 200, 30);
				passLabel2.setForeground(new Color(169,0,0));
				p1Panel.add(passLabel2);

				passLabel2 = new JLabel("Date of Journey  : "+line5);
				passLabel2.setBounds(660, 210, 200, 30);
				passLabel2.setForeground(new Color(169,0,0));
				p1Panel.add(passLabel2);

				passLabel2 = new JLabel("Departure Time   : "+line4);
				passLabel2.setBounds(660, 230, 200, 30);
				passLabel2.setForeground(new Color(169,0,0));
				p1Panel.add(passLabel2);

				passLabel2 = new JLabel("Boarding Point     : "+line8);
				passLabel2.setBounds(660, 250, 250, 30);
				passLabel2.setForeground(new Color(169,0,0));
				p1Panel.add(passLabel2);

				passLabel2 = new JLabel("Ticket Price : "+line7+" TK");
				passLabel2.setBounds(300, 280, 300, 30);
				passLabel2.setForeground(new Color(169,0,0));
				p1Panel.add(passLabel2);


			}

			sc2.close(); 

		}
		catch(Exception ex)
		{
			return;
		}

		b1Lout = new ImageIcon("lout.png");
		b1LogOut = new JButton(b1Lout);
		b1LogOut.setBounds(1220, 50, 34, 30);
		b1LogOut.setBackground(Color.WHITE);
		b1LogOut.addActionListener(this);
		p1Panel.add(b1LogOut);

		b1ExitBtn = new JButton("Exit");
		b1ExitBtn.setBounds(590, 550, 80, 30);
		b1ExitBtn.setForeground(Color.WHITE);
		b1ExitBtn.setBackground(new Color(169,0,0));
		b1ExitBtn.addActionListener(this);
		b1ExitBtn.addMouseListener(this);
		p1Panel.add(b1ExitBtn);

		b1image4 = new ImageIcon("ticket.png");
		b1imgLabel4 = new JLabel(b1image4);
		b1imgLabel4.setBounds(280, 100, 708, 287);
		p1Panel.add(b1imgLabel4);

		p1Icon = new ImageIcon("img2.jpg");
		setIconImage(p1Icon.getImage());

		this.add(p1Panel);

	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == b1ExitBtn)
		{
			b1ExitBtn.setBackground(Color.WHITE);
			b1ExitBtn.setForeground(new Color(169,0,0));
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == b1ExitBtn)
		{
			b1ExitBtn.setForeground(Color.WHITE);
			b1ExitBtn.setBackground(new Color(169,0,0));
		}
	}
	public void actionPerformed(ActionEvent e3)
	{

		if (e3.getSource()==b1LogOut)
		{
			Customar c4 = new Customar();
			c4.setVisible(true);
			this.setVisible(false);
		}

		else if(e3.getSource()==b1ExitBtn)
		{
			System.exit(0);
		}
	}
}