import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Train extends JFrame implements MouseListener, ActionListener
{	
	JLabel t1Text,t1Text6,t1Text5, t1Text2, t1Text3, t1Text4, t1ImgLabel, t1imgLabel2;
	JPanel t1Panel;
	JButton t1LogOut, t1BackBtn, t1ExitBtn, t1BookBtn;
	ImageIcon t1Icon, t1Lout, t1image, t1image2;
	JComboBox t1Combo, t1Combo2, t1Combo3, t1Combo4;
	JRadioButton t1R1, t1R2;
	JTextField dateTF1;

	public Train()
	{
		this.setTitle("Ridemiles.com");
		this.setSize(1290, 710);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		t1Panel = new JPanel();
		t1Panel.setBackground(Color.WHITE);
		t1Panel.setLayout(null);

		t1Icon = new ImageIcon("img2.jpg");
		setIconImage(t1Icon.getImage());

		t1Lout = new ImageIcon("lout.png");
		t1LogOut = new JButton(t1Lout);
		t1LogOut.setBounds(1220, 50, 34, 30);
		t1LogOut.setBackground(Color.WHITE);
		t1LogOut.addActionListener(this);
		t1Panel.add(t1LogOut);

		t1Text = new JLabel("                                                                                                                                                                                          You Have Selected Train Ticket");
		t1Text.setForeground(Color.WHITE);
		t1Text.setBackground(new Color(169,0,0));
		t1Text.setOpaque(true);
		t1Text.setBounds(0, 0, 1300, 30);
		t1Panel.add(t1Text);

		t1Text2 = new JLabel("Select Route :");
		t1Text2.setBounds(100, 100, 200, 30);
		t1Text2.setForeground(new Color(169,0,0));
		t1Panel.add(t1Text2);

		String items[] = {"Dhaka-Gopalganj", "Dhaka-Pirojpur", "Dhaka-Chittagong", "Dhaka-Khulna", "Dhaka-Cox's Bazar", "Dhaka-Rajshahi"};
		t1Combo = new JComboBox<String>(items);
		t1Combo.setBounds(250, 104, 200, 20);
		t1Combo.setForeground(Color.WHITE);
		t1Combo.setBackground(new Color(169,0,0));
		t1Panel.add(t1Combo);

		t1Text3 = new JLabel("Select Your Train :");
		t1Text3.setBounds(100, 150, 250, 30);
		t1Text3.setForeground(new Color(169,0,0));
		t1Panel.add(t1Text3);

		String items2[] = {"SONAR BANGLA EXPRESS", "MAHANAGAR PROVATI", "CHATTALA EXPRESS", "SUBORNO EXPRESS"};
		t1Combo2 = new JComboBox<String>(items2);
		t1Combo2.setBounds(250, 154, 200, 20);
		t1Combo2.setForeground(Color.WHITE);
		t1Combo2.setBackground(new Color(169,0,0));
		t1Panel.add(t1Combo2);

		t1Text4 = new JLabel("Select Class :");
		t1Text4.setBounds(100, 200, 250, 30);
		t1Text4.setForeground(new Color(169,0,0));
		t1Panel.add(t1Text4);

		String items3[] = {"AC_B", "AC_S", "F_SEAT", "F_CHAIR"};
		t1Combo3 = new JComboBox<String>(items3);
		t1Combo3.setBounds(250, 204, 200, 20);
		t1Combo3.setForeground(Color.WHITE);
		t1Combo3.setBackground(new Color(169,0,0));
		t1Panel.add(t1Combo3);

		t1Text5 = new JLabel("Date of Journey : ");
		t1Text5.setBounds(100, 250, 500, 30);
		t1Text5.setForeground(new Color(169,0,0));
		t1Panel.add(t1Text5);

		dateTF1 = new JTextField();
		dateTF1.setBounds(250, 254, 100, 20);
		t1Panel.add(dateTF1);

		t1Text6 = new JLabel("Departure Times Avilable :");
		t1Text6.setBounds(100, 300, 200, 30);
		t1Text6.setForeground(new Color(169,0,0));
		t1Panel.add(t1Text6);

		String items4[] = {"09:00 AM", "10:30 PM", "11:15 AM", "12:30 PM", "04:00 PM", "09:30 PM"};
		t1Combo4 = new JComboBox<String>(items4);
		t1Combo4.setBounds(250, 304, 100, 20);
		t1Combo4.setForeground(Color.WHITE);
		t1Combo4.setBackground(new Color(169,0,0));
		t1Panel.add(t1Combo4);

		t1BookBtn = new JButton("Book Ticket");
		t1BookBtn.setBounds(553, 480, 180, 30);
		t1BookBtn.setForeground(Color.WHITE);
		t1BookBtn.setBackground(new Color(169,0,0));
		t1BookBtn.addActionListener(this);
		t1BookBtn.addMouseListener(this);
		t1Panel.add(t1BookBtn);

		t1BackBtn = new JButton("Back");
		t1BackBtn.setBounds(553, 520, 80, 30);
		t1BackBtn.setForeground(Color.WHITE);
		t1BackBtn.setBackground(new Color(169,0,0));
		t1BackBtn.addActionListener(this);
		t1BackBtn.addMouseListener(this);
		t1Panel.add(t1BackBtn);

		t1ExitBtn = new JButton("Exit");
		t1ExitBtn.setBounds(653, 520, 80, 30);
		t1ExitBtn.setForeground(Color.WHITE);
		t1ExitBtn.setBackground(new Color(169,0,0));
		t1ExitBtn.addActionListener(this);
		t1ExitBtn.addMouseListener(this);
		t1Panel.add(t1ExitBtn);

		t1image2 = new ImageIcon("trainB.jpg");
		t1imgLabel2 = new JLabel(t1image2);
		t1imgLabel2.setBounds(0, 0, 1270, 710);
		t1Panel.add(t1imgLabel2);

		this.add(t1Panel);

	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == t1BookBtn)
		{
			t1BookBtn.setBackground(Color.WHITE);
			t1BookBtn.setForeground(new Color(169,0,0));
		}
		else if(me.getSource() == t1BackBtn)
		{
			t1BackBtn.setBackground(Color.WHITE);
			t1BackBtn.setForeground(new Color(169,0,0));
		}
		else if(me.getSource() == t1ExitBtn)
		{
			t1ExitBtn.setBackground(Color.WHITE);
			t1ExitBtn.setForeground(new Color(169,0,0));
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == t1BookBtn)
		{
			t1BookBtn.setForeground(Color.WHITE);
			t1BookBtn.setBackground(new Color(169,0,0));
		}
		else if(me.getSource() == t1BackBtn)
		{
			t1BackBtn.setForeground(Color.WHITE);
			t1BackBtn.setBackground(new Color(169,0,0));
		}
		else if(me.getSource() == t1ExitBtn)
		{
			t1ExitBtn.setForeground(Color.WHITE);
			t1ExitBtn.setBackground(new Color(169,0,0));
		}
	}
	public void actionPerformed(ActionEvent e3)
	{
		String command = e3.getActionCommand();

		if(t1BackBtn.getText().equals(command))
		{
			Customar2 c3 = new Customar2();
			c3.setVisible(true);
			this.setVisible(false);
		}
		else if (t1LogOut.getText().equals(command))
		{
			Customar c4 = new Customar();
			c4.setVisible(true);
			this.setVisible(false);
		}
		else if(e3.getSource()==t1BookBtn)
		{
			String s4 = dateTF1.getText();

			TrainPay1 lp1 = new TrainPay1();
			lp1.setVisible(true);
			this.setVisible(false);

			String s1 = t1Combo.getSelectedItem().toString();
			String s2 = t1Combo2.getSelectedItem().toString();
			String s3 = t1Combo3.getSelectedItem().toString();
			String s5 = t1Combo4.getSelectedItem().toString();

			try
			{
				FileWriter file = new FileWriter("F:\\java fall semester\\Ride miles\\Files\\t4.txt");
				file.write(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5);
				file.close(); 
			}
			catch(IOException io)
			{
				io.printStackTrace();
			}
		}
		else if(t1ExitBtn.getText().equals(command))
		{
			System.exit(0);
		}
	}
}