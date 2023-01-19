import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Air extends JFrame implements MouseListener, ActionListener
{	
	JLabel a1Text, a1Text6, a1Text5, a1Text2, a1Text3, a1Text4, a1ImgLabel, a1imgLabel2;
	JPanel a1Panel;
	JButton a1LogOut, a1BackBtn, a1ExitBtn, a1BookBtn;
	ImageIcon a1Icon, a1Lout, a1image, a1image2;
	JComboBox a1Combo, a1Combo2, a1Combo3, a1Combo4;
	JTextField dateTF1;


	public Air()
	{
		this.setTitle("Ridemiles.com");
		this.setSize(1290, 710);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		a1Panel = new JPanel();
		a1Panel.setBackground(Color.WHITE);
		a1Panel.setLayout(null);

		a1Icon = new ImageIcon("img2.jpg");
		setIconImage(a1Icon.getImage());


		a1Lout = new ImageIcon("lout.png");
		a1LogOut = new JButton(a1Lout);
		a1LogOut.setBounds(1220, 50, 34, 30);
		a1LogOut.setBackground(Color.WHITE);
		a1LogOut.addActionListener(this);
		a1Panel.add(a1LogOut);


		a1Text = new JLabel("                                                                                                                                                                                          You Have Selected Air Ticket");
		a1Text.setForeground(Color.WHITE);
		a1Text.setBackground(new Color(169,0,0));
		a1Text.setOpaque(true);
		a1Text.setBounds(0, 0, 1300, 30);
		a1Panel.add(a1Text);

		a1Text2 = new JLabel("Select Route :");
		a1Text2.setBounds(100, 100, 200, 30);
		a1Text2.setForeground(new Color(169,0,0));
		a1Panel.add(a1Text2);

		String items[] = {"Dhaka-Gopalganj", "Dhaka-Pirojpur", "Dhaka-Chittagong", "Dhaka-Khulna", "Dhaka-Cox's Bazar", "Dhaka-Rajshahi"};
		a1Combo = new JComboBox<String>(items);
		a1Combo.setBounds(250, 104, 150, 20);
		a1Combo.setForeground(Color.WHITE);
		a1Combo.setBackground(new Color(169,0,0));
		a1Panel.add(a1Combo);

		a1Text3 = new JLabel("Select Plane :");
		a1Text3.setBounds(100, 150, 250, 30);
		a1Text3.setForeground(new Color(169,0,0));
		a1Panel.add(a1Text3);

		String items2[] = {"Fly Dhaka", "Biman Bangladesh", "Air Astra", "Novoair"};
		a1Combo2 = new JComboBox<String>(items2);
		a1Combo2.setBounds(250, 154, 150, 20);
		a1Combo2.setForeground(Color.WHITE);
		a1Combo2.setBackground(new Color(169,0,0));
		a1Panel.add(a1Combo2);

		a1Text4 = new JLabel("Select Class :");
		a1Text4.setBounds(100, 200, 250, 30);
		a1Text4.setForeground(new Color(169,0,0));
		a1Panel.add(a1Text4);

		String items3[] = {"Business Class", "Economics Class"};
		a1Combo3 = new JComboBox<String>(items3);
		a1Combo3.setBounds(250, 204, 150, 20);
		a1Combo3.setForeground(Color.WHITE);
		a1Combo3.setBackground(new Color(169,0,0));
		a1Panel.add(a1Combo3);

		a1Text5 = new JLabel("Date of Journey : ");
		a1Text5.setBounds(100, 250, 500, 30);
		a1Text5.setForeground(new Color(169,0,0));
		a1Panel.add(a1Text5);

		dateTF1 = new JTextField();
		dateTF1.setBounds(250, 254, 100, 20);
		a1Panel.add(dateTF1);

		a1Text6 = new JLabel("Flight Times Avilable :");
		a1Text6.setBounds(100, 300, 200, 30);
		a1Text6.setForeground(new Color(169,0,0));
		a1Panel.add(a1Text6);

		String items4[] = {"09:00 AM", "10:30 PM", "11:15 AM", "12:30 PM", "04:00 PM", "09:30 PM"};
		a1Combo4 = new JComboBox<String>(items4);
		a1Combo4.setBounds(250, 304, 100, 20);
		a1Combo4.setForeground(Color.WHITE);
		a1Combo4.setBackground(new Color(169,0,0));
		a1Panel.add(a1Combo4);

		a1BookBtn = new JButton("Book Ticket");
		a1BookBtn.setBounds(553, 480, 180, 30);
		a1BookBtn.setForeground(Color.WHITE);
		a1BookBtn.setBackground(new Color(169,0,0));
		a1BookBtn.addActionListener(this);
		a1BookBtn.addMouseListener(this);
		a1Panel.add(a1BookBtn);

		a1BackBtn = new JButton("Back");
		a1BackBtn.setBounds(553, 520, 80, 30);
		a1BackBtn.setForeground(Color.WHITE);
		a1BackBtn.setBackground(new Color(169,0,0));
		a1BackBtn.addActionListener(this);
		a1BookBtn.addMouseListener(this);
		a1Panel.add(a1BackBtn);

		a1ExitBtn = new JButton("Exit");
		a1ExitBtn.setBounds(653, 520, 80, 30);
		a1ExitBtn.setForeground(Color.WHITE);
		a1ExitBtn.setBackground(new Color(169,0,0));
		a1ExitBtn.addActionListener(this);
		a1BookBtn.addMouseListener(this);
		a1Panel.add(a1ExitBtn);

		a1image2 = new ImageIcon("biman2.png");
		a1imgLabel2 = new JLabel(a1image2);
		a1imgLabel2.setBounds(0, 0, 1270, 620);
		a1Panel.add(a1imgLabel2);

		this.add(a1Panel);

	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == a1BookBtn)
		{
			a1BookBtn.setBackground(Color.WHITE);
			a1BookBtn.setForeground(new Color(169,0,0));
		}
		else if(me.getSource() == a1BackBtn)
		{
			a1BackBtn.setBackground(Color.WHITE);
			a1BackBtn.setForeground(new Color(169,0,0));
		}
		else if(me.getSource() == a1ExitBtn)
		{
			a1ExitBtn.setBackground(Color.WHITE);
			a1ExitBtn.setForeground(new Color(169,0,0));
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == a1BookBtn)
		{
			a1BookBtn.setForeground(Color.WHITE);
			a1BookBtn.setBackground(new Color(169,0,0));
		}
		else if(me.getSource() == a1BackBtn)
		{
			a1BackBtn.setForeground(Color.WHITE);
			a1BackBtn.setBackground(new Color(169,0,0));
		}
		else if(me.getSource() == a1ExitBtn)
		{
			a1ExitBtn.setForeground(Color.WHITE);
			a1ExitBtn.setBackground(new Color(169,0,0));
		}
	}
	public void actionPerformed(ActionEvent e3)
	{
		String command = e3.getActionCommand();

		if(a1BackBtn.getText().equals(command))
		{
			Customar2 c3 = new Customar2();
			c3.setVisible(true);
			this.setVisible(false);
		}
		else if (a1LogOut.getText().equals(command))
		{
			Customar c4 = new Customar();
			c4.setVisible(true);
			this.setVisible(false);
		}
		else if(e3.getSource()==a1BookBtn)
		{
			String s4 = dateTF1.getText();

			AirPay1 a1 = new AirPay1();
			a1.setVisible(true);
			this.setVisible(false);

			String s1 = a1Combo.getSelectedItem().toString();
			String s2 = a1Combo2.getSelectedItem().toString();
			String s3 = a1Combo3.getSelectedItem().toString();
			String s5 = a1Combo4.getSelectedItem().toString();

			try
			{
				FileWriter file = new FileWriter("F:\\java fall semester\\Ride miles\\Files\\t5.txt");
				file.write(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5);
				file.close(); 
			}
			catch(IOException io)
			{
				io.printStackTrace();
			}
		}
		else if(a1ExitBtn.getText().equals(command))
		{
			System.exit(0);
		}
	}
}