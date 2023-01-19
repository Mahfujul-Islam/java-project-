import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Customar2 extends JFrame implements MouseListener, ActionListener
{	
	JLabel c2Text,c2Login,c2ImgLabel1,c2ImgLabel2,label;
	JPasswordField c2PassPF;
	JButton c2ExitBtn, c2BackBtn, c2LogOut, c2Bus, c2Train, c2Air, c2Launch;
	JPanel c2Panel;
	ImageIcon c2Icon, c2image, c2image2, c2Lout, c2B1, c2T1, c2A1, c2L1;
	JComboBox c2Combo;

	public Customar2()
	{
		this.setTitle("Ridemiles.com");
		this.setSize(1290, 710);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		c2Panel = new JPanel();
		c2Panel.setLayout(null);

		c2Icon = new ImageIcon("img2.jpg");
		setIconImage(c2Icon.getImage());
		
		c2Login = new JLabel("Choose Your Option");
		c2Login.setBounds(590, 180, 250, 30);
		c2Login.setForeground(new Color(169,0,0));
		c2Panel.add(c2Login);

		c2ExitBtn = new JButton("Exit");
		c2ExitBtn.setBounds(653, 420, 80, 30);
		c2ExitBtn.setForeground(Color.WHITE);
		c2ExitBtn.setBackground(new Color(169,0,0));
		c2ExitBtn.addActionListener(this);
		c2ExitBtn.addMouseListener(this);
		c2Panel.add(c2ExitBtn);

		c2BackBtn = new JButton("Back");
		c2BackBtn.setBounds(553, 420, 80, 30);
		c2BackBtn.setForeground(Color.WHITE);
		c2BackBtn.setBackground(new Color(169,0,0));
		c2BackBtn.addActionListener(this);
		c2BackBtn.addMouseListener(this);
		c2Panel.add(c2BackBtn);

		c2B1= new ImageIcon("bus.png");
		c2Bus = new JButton(c2B1);
		c2Bus.setBounds(280, 250, 128, 128);
		c2Bus.setBackground(Color.WHITE);
		c2Bus.addActionListener(this);
		c2Panel.add(c2Bus);

		c2L1= new ImageIcon("launch.png");
		c2Launch = new JButton(c2L1);
		c2Launch.setBounds(480, 250, 128, 128);
		c2Launch.setBackground(Color.WHITE);
		c2Launch.addActionListener(this);
		c2Panel.add(c2Launch);

		c2T1= new ImageIcon("train.png");
		c2Train = new JButton(c2T1);
		c2Train.setBounds(680, 250, 128, 128);
		c2Train.setBackground(Color.WHITE);
		c2Train.addActionListener(this);
		c2Panel.add(c2Train);

		c2A1= new ImageIcon("air.png");
		c2Air = new JButton(c2A1);
		c2Air.setBounds(880, 250, 128, 128);
		c2Air.setBackground(Color.WHITE);
		c2Air.addActionListener(this);
		c2Panel.add(c2Air);

		c2Lout = new ImageIcon("lout.png");
		c2LogOut = new JButton(c2Lout);
		c2LogOut.setBounds(1220, 50, 34, 30);
		c2LogOut.setBackground(Color.WHITE);
		c2LogOut.addActionListener(this);
		c2Panel.add(c2LogOut);

		c2image2 = new ImageIcon("S.gif");
		c2ImgLabel2 = new JLabel(c2image2);
		c2ImgLabel2.setBounds(0, 10, 600, 600);
		c2Panel.add(c2ImgLabel2);

		c2image = new ImageIcon("3.jpg");
		c2ImgLabel1 = new JLabel(c2image);
		c2ImgLabel1.setBounds(0, 0, 1270, 710);
		c2Panel.add(c2ImgLabel1);

		this.add(c2Panel);

	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == c2ExitBtn)
		{
			c2ExitBtn.setBackground(Color.WHITE);
			c2ExitBtn.setForeground(new Color(169,0,0));
		}
		else if(me.getSource() == c2BackBtn)
		{
			c2BackBtn.setBackground(Color.WHITE);
			c2BackBtn.setForeground(new Color(169,0,0));
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == c2ExitBtn)
		{
			c2ExitBtn.setForeground(Color.WHITE);
			c2ExitBtn.setBackground(new Color(169,0,0));
		}
		else if(me.getSource() == c2BackBtn)
		{
			c2BackBtn.setForeground(Color.WHITE);
			c2BackBtn.setBackground(new Color(169,0,0));
		}
	}
	@Override
	public void actionPerformed(ActionEvent e2)
	{
		
		String command = e2.getActionCommand();

		if(c2BackBtn.getText().equals(command))
		{
			Customar c3 = new Customar();
			c3.setVisible(true);
			this.setVisible(false);
		}
		if(e2.getSource()==c2Bus)
		{
			Bus b = new Bus();
			b.setVisible(true);
			this.setVisible(false);
		}
		else if(e2.getSource()==c2Launch)
		{
			Launch l = new Launch();
			l.setVisible(true);
			this.setVisible(false);
		}
		else if(e2.getSource()==c2Train)
		{
			Train t = new Train();
			t.setVisible(true);
			this.setVisible(false);
		}
		else if(e2.getSource()==c2Air)
		{
			Air a = new Air();
			a.setVisible(true);
			this.setVisible(false);
		}
		else if (c2LogOut.getText().equals(command))
		{
			Customar c4 = new Customar();
			c4.setVisible(true);
			this.setVisible(false);
		}
		else if(c2ExitBtn.getText().equals(command))
		{
			System.exit(0);
		}
	}
}