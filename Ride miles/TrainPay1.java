import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class TrainPay1 extends JFrame implements MouseListener, ActionListener
{
	JLabel p1Text, p1imgLabel1, p1Text2;
	JPanel p1Panel;
	ImageIcon p1Icon, p1image1, p1b1, p1n1;
	JButton p1bkash, p1nagad, p1BackBtn, p1ExitBtn;

	public TrainPay1()
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

		p1Text = new JLabel("                                                                                                                                                                                       Ridemiles Online Payment");
		p1Text.setForeground(Color.WHITE);
		p1Text.setBackground(new Color(169,0,0));
		p1Text.setOpaque(true);
		p1Text.setBounds(0, 0, 1300, 30);
		p1Panel.add(p1Text);

		p1Text2 = new JLabel("Select Payment Option");
		p1Text2.setBounds(570, 180, 250, 30);
		p1Text2.setForeground(new Color(169,0,0));
		p1Panel.add(p1Text2);

		p1b1 = new ImageIcon("CKash.png");
		p1bkash = new JButton(p1b1);
		p1bkash.setBounds(350, 250, 256, 121);
		p1bkash.setBackground(Color.WHITE);
		p1bkash.addActionListener(this);
		p1Panel.add(p1bkash);

		p1n1 = new ImageIcon("baki.png");
		p1nagad = new JButton(p1n1);
		p1nagad.setBounds(660, 250, 256, 121);
		p1nagad.setBackground(Color.WHITE);
		p1nagad.addActionListener(this);
		p1Panel.add(p1nagad);

		p1BackBtn = new JButton("Back");
		p1BackBtn.setBounds(540, 520, 80, 30);
		p1BackBtn.setForeground(Color.WHITE);
		p1BackBtn.setBackground(new Color(169,0,0));
		p1BackBtn.addActionListener(this);
		p1BackBtn.addMouseListener(this);
		p1Panel.add(p1BackBtn);

		p1ExitBtn = new JButton("Exit");
		p1ExitBtn.setBounds(640, 520, 80, 30);
		p1ExitBtn.setForeground(Color.WHITE);
		p1ExitBtn.setBackground(new Color(169,0,0));
		p1ExitBtn.addActionListener(this);
		p1ExitBtn.addMouseListener(this);
		p1Panel.add(p1ExitBtn);


		p1image1 = new ImageIcon("payment.jpg");
		p1imgLabel1 = new JLabel(p1image1);
		p1imgLabel1.setBounds(0, 0, 1270, 710);
		p1Panel.add(p1imgLabel1);

		this.add(p1Panel);
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == p1BackBtn)
		{
			p1BackBtn.setBackground(Color.WHITE);
			p1BackBtn.setForeground(new Color(169,0,0));
		}
		else if(me.getSource() == p1ExitBtn)
		{
			p1ExitBtn.setBackground(Color.WHITE);
			p1ExitBtn.setForeground(new Color(169,0,0));
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == p1BackBtn)
		{
			p1BackBtn.setForeground(Color.WHITE);
			p1BackBtn.setBackground(new Color(169,0,0));
		}
		else if(me.getSource() == p1ExitBtn)
		{
			p1ExitBtn.setForeground(Color.WHITE);
			p1ExitBtn.setBackground(new Color(169,0,0));
		}
	}
	public void actionPerformed(ActionEvent pe1)
	{
		if(pe1.getSource()==p1BackBtn)
		{
			Train t2 = new Train();
			t2.setVisible(true);
			this.setVisible(false);
		}
		if(pe1.getSource()==p1bkash)
		{
			TrainBkash t = new TrainBkash();
			t.setVisible(true);
			this.setVisible(false);
		}
		if(pe1.getSource()==p1nagad)
		{
			showMessageDialog(null, "Nagad payment is currently unavailable");
		}
		else if(pe1.getSource()==p1ExitBtn)
		{
			System.exit(0);
		}
	}
	
}