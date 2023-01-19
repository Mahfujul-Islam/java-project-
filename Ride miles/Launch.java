import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Launch extends JFrame implements MouseListener, ActionListener
{	
	JLabel l1Text, l1Text6, l1Text2,l1Text5, l1Text3, l1Text4, l1ImgLabel, l1imgLabel2;
	JPanel l1Panel;
	JButton l1LogOut, l1BackBtn, l1ExitBtn, l1BookBtn;
	ImageIcon l1Icon, l1Lout, l1image, l1image2;
	JComboBox l1Combo, l1Combo2, l1Combo3, l1Combo4;
	JRadioButton l1R1, l1R2;
	ButtonGroup l1Bg1;
	JTextField dateTF1;

	public Launch()
	{
		this.setTitle("Ridemiles.com");
		this.setSize(1290, 710);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		l1Panel = new JPanel();
		l1Panel.setBackground(Color.WHITE);
		l1Panel.setLayout(null);

		l1Icon = new ImageIcon("img2.jpg");
		setIconImage(l1Icon.getImage());

		l1Lout = new ImageIcon("lout.png");
		l1LogOut = new JButton(l1Lout);
		l1LogOut.setBounds(1220, 50, 34, 30);
		l1LogOut.setBackground(Color.WHITE);
		l1LogOut.addActionListener(this);
		l1Panel.add(l1LogOut);

		l1Text = new JLabel("                                                                                                                                                                                          You Have Selected Launch Ticket");
		l1Text.setForeground(Color.WHITE);
		l1Text.setBackground(new Color(169,0,0));
		l1Text.setOpaque(true);
		l1Text.setBounds(0, 0, 1300, 30);
		l1Panel.add(l1Text);

		l1Text2 = new JLabel("Select Route :");
		l1Text2.setBounds(100, 100, 200, 30);
		l1Text2.setForeground(new Color(169,0,0));
		l1Panel.add(l1Text2);

		String items[] = {"Dhaka-Gopalganj", "Dhaka-Pirojpur", "Dhaka-Chittagong", "Dhaka-Khulna", "Dhaka-Cox's Bazar", "Dhaka-Rajshahi"};
		l1Combo = new JComboBox<String>(items);
		l1Combo.setBounds(250, 104, 200, 20);
		l1Combo.setForeground(Color.WHITE);
		l1Combo.setBackground(new Color(169,0,0));
		l1Panel.add(l1Combo);

		l1Text3 = new JLabel("Select Your Launch :");
		l1Text3.setBounds(100, 150, 250, 30);
		l1Text3.setForeground(new Color(169,0,0));
		l1Panel.add(l1Text3);

		String items2[] = {"A.R Khan 1", "Bay Cruiser", "Karnaphuli 1", "Karnaphuli 12"};
		l1Combo2 = new JComboBox<String>(items2);
		l1Combo2.setBounds(250, 154, 200, 20);
		l1Combo2.setForeground(Color.WHITE);
		l1Combo2.setBackground(new Color(169,0,0));
		l1Panel.add(l1Combo2);

		l1Text4 = new JLabel("Select Cabin Class :");
		l1Text4.setBounds(100, 200, 250, 30);
		l1Text4.setForeground(new Color(169,0,0));
		l1Panel.add(l1Text4);

		String items3[] = {"Single AC [Seats-1]", "Single Non AC [Seats-1]", "Double AC [Seats-2]", "Double Non AC [Seats-2]"};
		l1Combo3 = new JComboBox<String>(items3);
		l1Combo3.setBounds(250, 204, 200, 20);
		l1Combo3.setForeground(Color.WHITE);
		l1Combo3.setBackground(new Color(169,0,0));
		l1Panel.add(l1Combo3);

		l1Text5 = new JLabel("Date of Journey : ");
		l1Text5.setBounds(100, 250, 500, 30);
		l1Text5.setForeground(new Color(169,0,0));
		l1Panel.add(l1Text5);

		dateTF1 = new JTextField();
		dateTF1.setBounds(250, 254, 100, 20);
		l1Panel.add(dateTF1);

		l1Text6 = new JLabel("Choose Boarding Point :");
		l1Text6.setBounds(100, 300, 200, 30);
		l1Text6.setForeground(new Color(169,0,0));
		l1Panel.add(l1Text6);

		String items4[] = {"Sadarghat (08:00 PM)"};
		l1Combo4 = new JComboBox<String>(items4);
		l1Combo4.setBounds(250, 304, 200, 20);
		l1Combo4.setForeground(Color.WHITE);
		l1Combo4.setBackground(new Color(169,0,0));
		l1Panel.add(l1Combo4);

		l1BookBtn = new JButton("Book Ticket");
		l1BookBtn.setBounds(553, 480, 180, 30);
		l1BookBtn.setForeground(Color.WHITE);
		l1BookBtn.setBackground(new Color(169,0,0));
		l1BookBtn.addActionListener(this);
		l1BookBtn.addMouseListener(this);
		l1Panel.add(l1BookBtn);

		l1BackBtn = new JButton("Back");
		l1BackBtn.setBounds(553, 520, 80, 30);
		l1BackBtn.setForeground(Color.WHITE);
		l1BackBtn.setBackground(new Color(169,0,0));
		l1BackBtn.addActionListener(this);
		l1BackBtn.addMouseListener(this);
		l1Panel.add(l1BackBtn);

		l1ExitBtn = new JButton("Exit");
		l1ExitBtn.setBounds(653, 520, 80, 30);
		l1ExitBtn.setForeground(Color.WHITE);
		l1ExitBtn.setBackground(new Color(169,0,0));
		l1ExitBtn.addActionListener(this);
		l1ExitBtn.addMouseListener(this);
		l1Panel.add(l1ExitBtn);

		l1image2 = new ImageIcon("launchB.jpg");
		l1imgLabel2 = new JLabel(l1image2);
		l1imgLabel2.setBounds(0, 0, 1270, 710);
		l1Panel.add(l1imgLabel2);

		this.add(l1Panel);

	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == l1BookBtn)
		{
			l1BookBtn.setBackground(Color.WHITE);
			l1BookBtn.setForeground(new Color(169,0,0));
		}
		else if(me.getSource() == l1BackBtn)
		{
			l1BackBtn.setBackground(Color.WHITE);
			l1BackBtn.setForeground(new Color(169,0,0));
		}
		else if(me.getSource() == l1ExitBtn)
		{
			l1ExitBtn.setBackground(Color.WHITE);
			l1ExitBtn.setForeground(new Color(169,0,0));
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == l1BookBtn)
		{
			l1BookBtn.setForeground(Color.WHITE);
			l1BookBtn.setBackground(new Color(169,0,0));
		}
		else if(me.getSource() == l1BackBtn)
		{
			l1BackBtn.setForeground(Color.WHITE);
			l1BackBtn.setBackground(new Color(169,0,0));
		}
		else if(me.getSource() == l1ExitBtn)
		{
			l1ExitBtn.setForeground(Color.WHITE);
			l1ExitBtn.setBackground(new Color(169,0,0));
		}
	}
	public void actionPerformed(ActionEvent e3)
	{
		String command = e3.getActionCommand();

		if(l1BackBtn.getText().equals(command))
		{
			Customar2 c3 = new Customar2();
			c3.setVisible(true);
			this.setVisible(false);
		}
		else if (l1LogOut.getText().equals(command))
		{
			Customar c4 = new Customar();
			c4.setVisible(true);
			this.setVisible(false);
		}
		else if(e3.getSource()==l1BookBtn)
		{
			String s4 = dateTF1.getText();

			LaunchPay1 lp1 = new LaunchPay1();
			lp1.setVisible(true);
			this.setVisible(false);

			String s1 = l1Combo.getSelectedItem().toString();
			String s2 = l1Combo2.getSelectedItem().toString();
			String s3 = l1Combo3.getSelectedItem().toString();
			String s5 = l1Combo4.getSelectedItem().toString();

			try
			{
				FileWriter file = new FileWriter("F:\\java fall semester\\Ride miles\\Files\\t3.txt");
				file.write(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5);
				file.close(); 
			}
			catch(IOException io)
			{
				io.printStackTrace();
			}
		}
		else if(l1ExitBtn.getText().equals(command))
		{
			System.exit(0);
		}
	}
}