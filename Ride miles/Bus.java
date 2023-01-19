import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Bus extends JFrame implements MouseListener, ActionListener
{	
	JLabel b1Text, l1Text6, b1Text2, b1Text8, b1Text3, b1Text4, b1Text5, b1ImgLabel, b1imgLabel3, b1imgLabel2, b1imgLabel4, b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
	JPanel b1Panel;
	JButton b1LogOut, b1BackBtn, b1ExitBtn, b1BookBtn;
	ImageIcon b1Icon, b1Lout, b1image, b1image2, b1image3, b1image4;
	JComboBox b1Combo, b1Combo2, b1Combo3, l1Combo4;
	JRadioButton b1R1, b1R2;
	ButtonGroup b1Bg1;
	JCheckBox b1, b121, b3, b4;
	JTextField dateTF1;
	protected double am1, am2, am3, am4, amount;

	public Bus()
	{
		this.setTitle("Ridemiles.com");
		this.setSize(1290, 710);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		b1Panel = new JPanel();
		b1Panel.setBackground(Color.WHITE);
		b1Panel.setLayout(null);

		b1Icon = new ImageIcon("img2.jpg");
		setIconImage(b1Icon.getImage());

		b1Lout = new ImageIcon("lout.png");
		b1LogOut = new JButton(b1Lout);
		b1LogOut.setBounds(1220, 50, 34, 30);
		b1LogOut.setBackground(Color.WHITE);
		b1LogOut.addActionListener(this);
		b1Panel.add(b1LogOut);

		b1Text8 = new JLabel("Click to select or deselect.");
		b1Text8.setBounds(900, 30, 200, 30);
		b1Text8.setForeground(new Color(169,0,0));
		b1Panel.add(b1Text8);

		b1Text = new JLabel("                                                                                                                                                                                          You Have Selected Bus Ticket");
		b1Text.setForeground(Color.WHITE);
		b1Text.setBackground(new Color(169,0,0));
		b1Text.setOpaque(true);
		b1Text.setBounds(0, 0, 1300, 30);
		b1Panel.add(b1Text);

		b1Text2 = new JLabel("Select Route :");
		b1Text2.setBounds(100, 100, 200, 30);
		b1Text2.setForeground(new Color(169,0,0));
		b1Panel.add(b1Text2);

		String items[] = {"Dhaka-Gopalganj", "Dhaka-Pirojpur", "Dhaka-Chittagong", "Dhaka-Khulna", "Dhaka-Cox's Bazar", "Dhaka-Rajshahi"};
		b1Combo = new JComboBox<String>(items);
		b1Combo.setBounds(210, 104, 150, 20);
		b1Combo.setForeground(Color.WHITE);
		b1Combo.setBackground(new Color(169,0,0));
		b1Panel.add(b1Combo);

		b1Text3 = new JLabel("Select Your Bus :");
		b1Text3.setBounds(100, 150, 250, 30);
		b1Text3.setForeground(new Color(169,0,0));
		b1Panel.add(b1Text3);

		String items2[] = {"Emad", "Dola", "Tungipara Express", "SaintMartin"};
		b1Combo2 = new JComboBox<String>(items2);
		b1Combo2.setBounds(210, 154, 150, 20);
		b1Combo2.setForeground(Color.WHITE);
		b1Combo2.setBackground(new Color(169,0,0));
		b1Panel.add(b1Combo2);

		b1Text4 = new JLabel("Select Bus Type :");
		b1Text4.setBounds(100, 200, 250, 30);
		b1Text4.setForeground(new Color(169,0,0));
		b1Panel.add(b1Text4);

		b1R1 = new JRadioButton("AC");
		b1R1.setBounds(210, 200, 50, 30);
		b1R1.setForeground(new Color(169,0,0));
		b1R1.setBackground(Color.WHITE);
		b1Panel.add(b1R1);

		b1R2 = new JRadioButton("Non-AC");
		b1R2.setBounds(270, 200, 70, 30);
		b1R2.setForeground(new Color(169,0,0));
		b1R2.setBackground(Color.WHITE);
		b1Panel.add(b1R2);

		b1Bg1 = new ButtonGroup();
		b1Bg1.add(b1R1);
		b1Bg1.add(b1R2);

		b1Text4 = new JLabel("Date of Journey : ");
		b1Text4.setBounds(100, 250, 500, 30);
		b1Text4.setForeground(new Color(169,0,0));
		b1Panel.add(b1Text4);

		dateTF1 = new JTextField();
		dateTF1.setBounds(210, 257, 100, 20);
		b1Panel.add(dateTF1);

		b1Text5 = new JLabel("Departure Times Avilable :");
		b1Text5.setBounds(100, 300, 200, 30);
		b1Text5.setForeground(new Color(169,0,0));
		b1Panel.add(b1Text5);

		String items3[] = {"09:00 AM", "10:30 PM", "11:15 AM", "12:30 PM", "04:00 PM", "09:30 PM"};
		b1Combo3 = new JComboBox<String>(items3);
		b1Combo3.setBounds(260, 304, 100, 20);
		b1Combo3.setForeground(Color.WHITE);
		b1Combo3.setBackground(new Color(169,0,0));
		b1Panel.add(b1Combo3);

		l1Text6 = new JLabel("Choose Boarding Point :");
		l1Text6.setBounds(100, 350, 200, 30);
		l1Text6.setForeground(new Color(169,0,0));
		b1Panel.add(l1Text6);

		String items4[] = {"Gulisthan Bus Point","Gaptoli Terminal","Kaliganj Bus Point","Savar Bus Point"};
		l1Combo4 = new JComboBox<String>(items4);
		l1Combo4.setBounds(260, 354, 150, 20);
		l1Combo4.setForeground(Color.WHITE);
		l1Combo4.setBackground(new Color(169,0,0));
		b1Panel.add(l1Combo4);

		b1 = new JCheckBox("A1");
		b1.setBounds(850, 150, 40, 30);
		b1.setForeground(Color.WHITE);
		b1.setBackground(new Color(0, 171, 65));
		b1Panel.add(b1);
		
		b121 = new JCheckBox("A2");
		b121.setBounds(900, 150, 40, 30);
		b121.setForeground(Color.WHITE);
		b121.setBackground(new Color(0, 171, 65));
		b1Panel.add(b121);
		
		b3 = new JCheckBox("A3");
		b3.setBounds(1000, 150, 40, 30);
		b3.setForeground(Color.WHITE);
		b3.setBackground(new Color(0, 171, 65));
		b1Panel.add(b3);

		b4 = new JCheckBox("A4");
		b4.setBounds(1050, 150, 40, 30);
		b4.setForeground(Color.WHITE);
		b4.setBackground(new Color(0, 171, 65));
		b1Panel.add(b4);

		b5 = new JLabel("    B1");
		b5.setBounds(850, 200, 40, 30);
		b5.setForeground(Color.WHITE);
		b5.setBackground(new Color(169,0,0));
		b5.setOpaque(true);
		b1Panel.add(b5);

		b6 = new JLabel("    B2");
		b6.setBounds(900, 200, 40, 30);
		b6.setForeground(Color.WHITE);
		b6.setBackground(new Color(169,0,0));
		b6.setOpaque(true);
		b1Panel.add(b6);

		b7 = new JLabel("    B3");
		b7.setBounds(1000, 200, 40, 30);
		b7.setForeground(Color.WHITE);
		b7.setBackground(new Color(169,0,0));
		b7.setOpaque(true);
		b1Panel.add(b7);

		b8 = new JLabel("    B4");
		b8.setBounds(1050, 200, 40, 30);
		b8.setForeground(Color.WHITE);
		b8.setBackground(new Color(169,0,0));
		b8.setOpaque(true);
		b1Panel.add(b8);

		b9 = new JLabel("    C1");
		b9.setBounds(850, 250, 40, 30);
		b9.setForeground(Color.WHITE);
		b9.setBackground(new Color(169,0,0));
		b9.setOpaque(true);
		b1Panel.add(b9);

		b10 = new JLabel("    C2");
		b10.setBounds(900, 250, 40, 30);
		b10.setForeground(Color.WHITE);
		b10.setBackground(new Color(169,0,0));
		b10.setOpaque(true);
		b1Panel.add(b10);

		b11 = new JLabel("    C3");
		b11.setBounds(1000, 250, 40, 30);
		b11.setForeground(Color.WHITE);
		b11.setBackground(new Color(169,0,0));
		b11.setOpaque(true);
		b1Panel.add(b11);

		b12 = new JLabel("    C4");
		b12.setBounds(1050, 250, 40, 30);
		b12.setForeground(Color.WHITE);
		b12.setBackground(new Color(169,0,0));
		b12.setOpaque(true);
		b1Panel.add(b12);

		b13 = new JLabel("    D1");
		b13.setBounds(850, 300, 40, 30);
		b13.setForeground(Color.WHITE);
		b13.setBackground(new Color(169,0,0));
		b13.setOpaque(true);
		b1Panel.add(b13);

		b14 = new JLabel("    D2");
		b14.setBounds(900, 300, 40, 30);
		b14.setForeground(Color.WHITE);
		b14.setBackground(new Color(169,0,0));
		b14.setOpaque(true);
		b1Panel.add(b14);

		b15 = new JLabel("    D3");
		b15.setBounds(1000, 300, 40, 30);
		b15.setForeground(Color.WHITE);
		b15.setBackground(new Color(169,0,0));
		b15.setOpaque(true);
		b1Panel.add(b15);

		b16 = new JLabel("    D4");
		b16.setBounds(1050, 300, 40, 30);
		b16.setForeground(Color.WHITE);
		b16.setBackground(new Color(169,0,0));
		b16.setOpaque(true);
		b1Panel.add(b16);

		b17 = new JLabel("    E1");
		b17.setBounds(850, 350, 40, 30);
		b17.setForeground(Color.WHITE);
		b17.setBackground(new Color(169,0,0));
		b17.setOpaque(true);
		b1Panel.add(b17);

		b18 = new JLabel("    E2");
		b18.setBounds(900, 350, 40, 30);
		b18.setForeground(Color.WHITE);
		b18.setBackground(new Color(169,0,0));
		b18.setOpaque(true);
		b1Panel.add(b18);

		b19 = new JLabel("    E3");
		b19.setBounds(1000, 350, 40, 30);
		b19.setForeground(Color.WHITE);
		b19.setBackground(new Color(169,0,0));
		b19.setOpaque(true);
		b1Panel.add(b19);

		b20 = new JLabel("    E4");
		b20.setBounds(1050, 350, 40, 30);
		b20.setForeground(Color.WHITE);
		b20.setBackground(new Color(169,0,0));
		b20.setOpaque(true);
		b1Panel.add(b20);

		b5 = new JLabel("    F1");
		b5.setBounds(850, 400, 40, 30);
		b5.setForeground(Color.WHITE);
		b5.setBackground(new Color(169,0,0));
		b5.setOpaque(true);
		b1Panel.add(b5);

		b6 = new JLabel("    F2");
		b6.setBounds(900, 400, 40, 30);
		b6.setForeground(Color.WHITE);
		b6.setBackground(new Color(169,0,0));
		b6.setOpaque(true);
		b1Panel.add(b6);

		b7 = new JLabel("    F3");
		b7.setBounds(1000, 400, 40, 30);
		b7.setForeground(Color.WHITE);
		b7.setBackground(new Color(169,0,0));
		b7.setOpaque(true);
		b1Panel.add(b7);

		b8 = new JLabel("    F4");
		b8.setBounds(1050, 400, 40, 30);
		b8.setForeground(Color.WHITE);
		b8.setBackground(new Color(169,0,0));
		b8.setOpaque(true);
		b1Panel.add(b8);

		b9 = new JLabel("    G1");
		b9.setBounds(850, 450, 40, 30);
		b9.setForeground(Color.WHITE);
		b9.setBackground(new Color(169,0,0));
		b9.setOpaque(true);
		b1Panel.add(b9);

		b10 = new JLabel("    G2");
		b10.setBounds(900, 450, 40, 30);
		b10.setForeground(Color.WHITE);
		b10.setBackground(new Color(169,0,0));
		b10.setOpaque(true);
		b1Panel.add(b10);

		b11 = new JLabel("    G3");
		b11.setBounds(1000, 450, 40, 30);
		b11.setForeground(Color.WHITE);
		b11.setBackground(new Color(169,0,0));
		b11.setOpaque(true);
		b1Panel.add(b11);

		b12 = new JLabel("    G4");
		b12.setBounds(1050, 450, 40, 30);
		b12.setForeground(Color.WHITE);
		b12.setBackground(new Color(169,0,0));
		b12.setOpaque(true);
		b1Panel.add(b12);

		b13 = new JLabel("    H1");
		b13.setBounds(850, 500, 40, 30);
		b13.setForeground(Color.WHITE);
		b13.setBackground(new Color(169,0,0));
		b13.setOpaque(true);
		b1Panel.add(b13);

		b14 = new JLabel("    H2");
		b14.setBounds(900, 500, 40, 30);
		b14.setForeground(Color.WHITE);
		b14.setBackground(new Color(169,0,0));
		b14.setOpaque(true);
		b1Panel.add(b14);

		b15 = new JLabel("    H3");
		b15.setBounds(1000, 500, 40, 30);
		b15.setForeground(Color.WHITE);
		b15.setBackground(new Color(169,0,0));
		b15.setOpaque(true);
		b1Panel.add(b15);

		b16 = new JLabel("    H4");
		b16.setBounds(1050, 500, 40, 30);
		b16.setForeground(Color.WHITE);
		b16.setBackground(new Color(169,0,0));
		b16.setOpaque(true);
		b1Panel.add(b16);

		b17 = new JLabel("    I1");
		b17.setBounds(850, 550, 40, 30);
		b17.setForeground(Color.WHITE);
		b17.setBackground(new Color(169,0,0));
		b17.setOpaque(true);
		b1Panel.add(b17);

		b18 = new JLabel("    I2");
		b18.setBounds(900, 550, 40, 30);
		b18.setForeground(Color.WHITE);
		b18.setBackground(new Color(169,0,0));
		b18.setOpaque(true);
		b1Panel.add(b18);

		b19 = new JLabel("    I3");
		b19.setBounds(1000, 550, 40, 30);
		b19.setForeground(Color.WHITE);
		b19.setBackground(new Color(169,0,0));
		b19.setOpaque(true);
		b1Panel.add(b19);

		b20 = new JLabel("    I4");
		b20.setBounds(1050, 550, 40, 30);
		b20.setForeground(Color.WHITE);
		b20.setBackground(new Color(169,0,0));
		b20.setOpaque(true);
		b1Panel.add(b20);

		b17 = new JLabel("    J1");
		b17.setBounds(850, 600, 40, 30);
		b17.setForeground(Color.WHITE);
		b17.setBackground(new Color(169,0,0));
		b17.setOpaque(true);
		b1Panel.add(b17);

		b18 = new JLabel("    J2");
		b18.setBounds(900, 600, 40, 30);
		b18.setForeground(Color.WHITE);
		b18.setBackground(new Color(169,0,0));
		b18.setOpaque(true);
		b1Panel.add(b18);

		b19 = new JLabel("    J3");
		b19.setBounds(950, 600, 40, 30);
		b19.setForeground(Color.WHITE);
		b19.setBackground(new Color(169,0,0));
		b19.setOpaque(true);
		b1Panel.add(b19);

		b20 = new JLabel("    J4");
		b20.setBounds(1000, 600, 40, 30);
		b20.setForeground(Color.WHITE);
		b20.setBackground(new Color(169,0,0));
		b20.setOpaque(true);
		b1Panel.add(b20);

		b20 = new JLabel("    J5");
		b20.setBounds(1050, 600, 40, 30);
		b20.setForeground(Color.WHITE);
		b20.setBackground(new Color(169,0,0));
		b20.setOpaque(true);
		b1Panel.add(b20);

		b1Text8 = new JLabel("Booked Seats -");
		b1Text8.setBounds(650, 100, 100, 30);
		b1Text8.setForeground(new Color(169,0,0));
		b1Panel.add(b1Text8);

		b20 = new JLabel();
		b20.setBounds(750, 105, 20, 20);
		b20.setBackground(new Color(169,0,0));
		b20.setOpaque(true);
		b1Panel.add(b20);

		b1Text8 = new JLabel("Available Seats -");
		b1Text8.setBounds(650, 150, 100, 30);
		b1Text8.setForeground(new Color(169,0,0));
		b1Panel.add(b1Text8);

		b20 = new JLabel();
		b20.setBounds(750, 155, 20, 20);
		b20.setBackground(new Color(0, 171, 65));
		b20.setOpaque(true);
		b1Panel.add(b20);

		b1BookBtn = new JButton("Book Ticket");
		b1BookBtn.setBounds(150, 470, 180, 30);
		b1BookBtn.setForeground(Color.WHITE);
		b1BookBtn.setBackground(new Color(169,0,0));
		b1BookBtn.addActionListener(this);
		b1BookBtn.addMouseListener(this);
		b1Panel.add(b1BookBtn);
		
		b1BackBtn = new JButton("Back");
		b1BackBtn.setBounds(150, 510, 80, 30);
		b1BackBtn.setForeground(Color.WHITE);
		b1BackBtn.setBackground(new Color(169,0,0));
		b1BackBtn.addActionListener(this);
		b1BackBtn.addMouseListener(this);
		b1Panel.add(b1BackBtn);

		b1ExitBtn = new JButton("Exit");
		b1ExitBtn.setBounds(250, 510, 80, 30);
		b1ExitBtn.setForeground(Color.WHITE);
		b1ExitBtn.setBackground(new Color(169,0,0));
		b1ExitBtn.addActionListener(this);
		b1ExitBtn.addMouseListener(this);
		b1Panel.add(b1ExitBtn);

		b1image3 = new ImageIcon("steering.png");
		b1imgLabel3 = new JLabel(b1image3);
		b1imgLabel3.setBounds(1015, 70, 64, 64);
		b1Panel.add(b1imgLabel3);

		b1image4 = new ImageIcon("white.png");
		b1imgLabel4 = new JLabel(b1image4);
		b1imgLabel4.setBounds(832, 55, 275, 600);
		b1Panel.add(b1imgLabel4);


		b1image2 = new ImageIcon("busB.png");
		b1imgLabel2 = new JLabel(b1image2);
		b1imgLabel2.setBounds(0, 0, 1270, 840);
		b1Panel.add(b1imgLabel2);

		this.add(b1Panel);

	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == b1BookBtn)
		{
			b1BookBtn.setBackground(Color.WHITE);
			b1BookBtn.setForeground(new Color(169,0,0));
		}
		else if(me.getSource() == b1BackBtn)
		{
			b1BackBtn.setBackground(Color.WHITE);
			b1BackBtn.setForeground(new Color(169,0,0));
		}
		else if(me.getSource() == b1ExitBtn)
		{
			b1ExitBtn.setBackground(Color.WHITE);
			b1ExitBtn.setForeground(new Color(169,0,0));
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == b1BookBtn)
		{
			b1BookBtn.setForeground(Color.WHITE);
			b1BookBtn.setBackground(new Color(169,0,0));
		}
		else if(me.getSource() == b1BackBtn)
		{
			b1BackBtn.setForeground(Color.WHITE);
			b1BackBtn.setBackground(new Color(169,0,0));
		}
		else if(me.getSource() == b1ExitBtn)
		{
			b1ExitBtn.setForeground(Color.WHITE);
			b1ExitBtn.setBackground(new Color(169,0,0));
		}
	}
	public void actionPerformed(ActionEvent e3)
	{
		String command = e3.getActionCommand();

		if(b1BackBtn.getText().equals(command))
		{
			Customar2 c3 = new Customar2();
			c3.setVisible(true);
			this.setVisible(false);
		}
		else if (b1LogOut.getText().equals(command))
		{
			Customar c4 = new Customar();
			c4.setVisible(true);
			this.setVisible(false);
		}
		else if(e3.getSource()==b1BookBtn)
		{
			String s3="", s6="", s7="", s8="", s9="";
			String s5 = dateTF1.getText();

			BusPay1 bp1 = new BusPay1();
			bp1.setVisible(true);
			this.setVisible(false);

			String s1 = b1Combo.getSelectedItem().toString();
			String s2 = b1Combo2.getSelectedItem().toString();
			String s4 = b1Combo3.getSelectedItem().toString();
			String s10 = l1Combo4.getSelectedItem().toString();

			if(b1R1.isSelected())
			{
				s3 = b1R1.getText();
			}
			else if(b1R2.isSelected())
			{
				s3 = b1R2.getText();
			}

			if(b1.isSelected())
			{
				s6 = b1.getText();
				if(b1R1.isSelected())
				{
					am1 = 750;
				}
				else
				{
					am1 = 550;
				}
			}
			if(b121.isSelected())
			{
				s7 = b121.getText();
				if(b1R1.isSelected())
				{
					am2 = 750;
				}
				else
				{
					am2 = 550;
				}
			}
			if(b3.isSelected())
			{
				s8 = b3.getText();
				if(b1R1.isSelected())
				{
					am3 = 750;
				}
				else
				{
					am3 = 550;
				}
			}
			if(b4.isSelected())
			{
				s9 = b4.getText();
				if(b1R1.isSelected())
				{
					am4 = 750;
				}
				else
				{
					am4 = 550;
				}
			}

			amount = am1+am2+am3+am4;

			try
			{
				FileWriter file = new FileWriter("F:\\java fall semester\\Ride miles\\Files\\t2.txt");
				file.write(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5+"\n"+s6+s7+s8+s9+"\n"+amount+"\n"+s10);
				file.close(); 
			}
			catch(IOException io)
			{
				io.printStackTrace();
			}
		}
		else if(b1ExitBtn.getText().equals(command))
		{
			System.exit(0);
		}
	}
}