import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class ACS extends JFrame implements MouseListener, ActionListener
{
	JLabel p1Text, label, passLabea1, passLabel2, b1imgLabel4;
	JPanel p1Panel;
	ImageIcon p1Icon, b1image4, a1Lout;
	JButton b1ExitBtn, a1LogOut;

	public ACS()
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

				passLabea1 = new JLabel("Ticket Holder Name : "+line1);
				passLabea1.setBounds(300, 150, 200, 30);
				passLabea1.setForeground(new Color(169,0,0));
				p1Panel.add(passLabea1);

				passLabea1 = new JLabel("Phone Number          : "+line2);
				passLabea1.setBounds(300, 170, 200, 30);
				passLabea1.setForeground(new Color(169,0,0));
				p1Panel.add(passLabea1);

				passLabea1 = new JLabel("Email Address           : "+line3);
				passLabea1.setBounds(300, 190, 300, 30);
				passLabea1.setForeground(new Color(169,0,0));
				p1Panel.add(passLabea1);

				passLabea1 = new JLabel("Thanks for using Ridemiles.com");
				passLabea1.setBounds(550, 470, 400, 60);
				passLabea1.setForeground(new Color(169,0,0));
				p1Panel.add(passLabea1);

				passLabea1 = new JLabel("The ticket has been sent to your email : "+line3);
				passLabea1.setBounds(470, 450, 400, 60);
				passLabea1.setForeground(new Color(169,0,0));
				p1Panel.add(passLabea1);

			}

			
			sc.close(); 
		}
		catch(Exception ex)
		{
			return;
		}
		try
		{
			File file2 = new File("F:\\java fall semester\\Ride miles\\Files\\t5.txt");
			Scanner sc2 = new Scanner(file2);

			while(sc2.hasNext())
			{
				String line1 = sc2.nextLine();
				String line2 = sc2.nextLine();
				String line3 = sc2.nextLine();
				String line4 = sc2.nextLine();
				String line5 = sc2.nextLine();

				passLabel2 = new JLabel(line2);
				passLabel2.setBounds(290, 97, 200, 30);
				passLabel2.setForeground(Color.WHITE);
				p1Panel.add(passLabel2);
		
				passLabel2 = new JLabel("Journey Route    : "+line1);
				passLabel2.setBounds(660, 150, 250, 30);
				passLabel2.setForeground(new Color(169,0,0));
				p1Panel.add(passLabel2);

				passLabel2 = new JLabel("Class                     : "+line3);
				passLabel2.setBounds(660, 170, 250, 30);
				passLabel2.setForeground(new Color(169,0,0));
				p1Panel.add(passLabel2);

				passLabel2 = new JLabel("Seat Number       : 32CBA");
				passLabel2.setBounds(660, 190, 250, 30);
				passLabel2.setForeground(new Color(169,0,0));
				p1Panel.add(passLabel2);

				passLabel2 = new JLabel("Date of Journey  : "+line4);
				passLabel2.setBounds(660, 210, 250, 30);
				passLabel2.setForeground(new Color(169,0,0));
				p1Panel.add(passLabel2);

				passLabel2 = new JLabel("Flight Time            : "+line5);
				passLabel2.setBounds(660, 230, 250, 30);
				passLabel2.setForeground(new Color(169,0,0));
				p1Panel.add(passLabel2);

				passLabel2 = new JLabel("Airport                   : Shahjalal International Airport");
				passLabel2.setBounds(660, 250, 300, 30);
				passLabel2.setForeground(new Color(169,0,0));
				p1Panel.add(passLabel2);

				passLabel2 = new JLabel("Ticket Price : 8900 TK");
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

		a1Lout = new ImageIcon("lout.png");
		a1LogOut = new JButton(a1Lout);
		a1LogOut.setBounds(1220, 50, 34, 30);
		a1LogOut.setBackground(Color.WHITE);
		a1LogOut.addActionListener(this);
		p1Panel.add(a1LogOut);

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
		if (e3.getSource()==a1LogOut)
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