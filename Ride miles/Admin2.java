import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class Admin2 extends JFrame implements MouseListener, ActionListener
{	
	JLabel a2Text, a1Text, a1ImgLabel1, search, a2ImgLabel1, a2ImgLabel2, insertiontext, deletiontext;
	JButton a2ExitBtn, a2BackBtn, a2LogOut, insert, delete, searchAcc;
	JPanel a2Panel;
	JTextField insertTF, removeTF, searchTF;
	ImageIcon a2Icon, a2image, a2image2, a2Lout, a1image;
	AdminAccount accounts[];
	AdminAccount acc;
	Color myColor;

	public Admin2()
	{
		this.setTitle("Ridemiles.com");
		this.setSize(1290, 710);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		
		myColor = Color.WHITE;
		a2Panel = new JPanel();
		a2Panel.setLayout(null);
		a2Panel.setBackground(Color.WHITE);

		a2Icon = new ImageIcon("img2.jpg");
		setIconImage(a2Icon.getImage());

		a1Text = new JLabel("Admin panel");
		a1Text.setForeground(Color.WHITE);
		a1Text.setBackground(new Color(169,0,0));
		a1Text.setOpaque(true);
		a1Text.setBounds(0, 0, 1300, 30);
		a2Panel.add(a1Text);

		a2ExitBtn = new JButton("Exit");
		a2ExitBtn.setBounds(650, 600, 80, 30);
		a2ExitBtn.setForeground(Color.WHITE);
		a2ExitBtn.setBackground(new Color(169,0,0));
		a2ExitBtn.addActionListener(this);
		a2Panel.add(a2ExitBtn);

		a2BackBtn = new JButton("Back");
		a2BackBtn.setBounds(550, 600, 80, 30);
		a2BackBtn.setForeground(Color.WHITE);
		a2BackBtn.setBackground(new Color(169,0,0));
		a2BackBtn.addActionListener(this);
		a2Panel.add(a2BackBtn);
		
		a2Lout = new ImageIcon("lout.png");
		a2LogOut = new JButton(a2Lout);
		a2LogOut.setBounds(1220, 50, 34, 30);
		a2LogOut.setBackground(Color.WHITE);
		a2LogOut.addActionListener(this);
		a2Panel.add(a2LogOut);

		accounts = new AdminAccount[10];

		insertiontext = new JLabel("Insert Account");
		insertiontext.setBounds(100, 50, 160, 30);
		insertiontext.setForeground(new Color(169,0,0));
		a2Panel.add(insertiontext);

		insertTF = new JTextField("");
		insertTF.setBounds(100, 80, 300, 40);
		a2Panel.add(insertTF);

		insert = new JButton("Insert");
		insert.setBounds(100, 120, 300, 40);
		insert.setForeground(Color.WHITE);
		insert.setBackground(new Color(169,0,0));
		a2Panel.add(insert);

		deletiontext = new JLabel("Delete Account");
		deletiontext.setBounds(100, 200, 160, 30);
		deletiontext.setForeground(new Color(169,0,0));
		a2Panel.add(deletiontext);

		removeTF = new JTextField("");
		removeTF.setBounds(100, 230, 300, 40);
		a2Panel.add(removeTF);

		delete = new JButton("Delete");
		delete.setBounds(100, 270, 300, 40);
		delete.setForeground(Color.WHITE);
		delete.setBackground(new Color(169,0,0));
		a2Panel.add(delete);

		search = new JLabel("Search Account.");
		search.setBounds(100, 350, 160, 30);
		search.setForeground(new Color(169,0,0));
		a2Panel.add(search);

		searchTF = new JTextField("");
		searchTF.setBounds(100, 380, 300, 40);
		a2Panel.add(searchTF);

		searchAcc = new JButton("Search");
		searchAcc.setBounds(100, 420, 300, 40);
		searchAcc.setForeground(Color.WHITE);
		searchAcc.setBackground(new Color(169,0,0));
		a2Panel.add(searchAcc);

		a1image = new ImageIcon("adminop.jpg");
		a1ImgLabel1 = new JLabel(a1image);
		a1ImgLabel1.setBounds(700, 100, 400, 400);
		a2Panel.add(a1ImgLabel1);

		a2BackBtn.addMouseListener(this);
		a2ExitBtn.addMouseListener(this);
		delete.addMouseListener(this);
		insert.addMouseListener(this);
		searchAcc.addMouseListener(this);
		
		insert.addActionListener(this);
		delete.addActionListener(this);
		searchAcc.addActionListener(this);
		this.add(a2Panel);

	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == a2BackBtn)
		{
			a2BackBtn.setBackground(Color.WHITE);
			a2BackBtn.setForeground(new Color(169,0,0));
		}
		if(me.getSource() == a2ExitBtn)
		{
			a2ExitBtn.setBackground(Color.WHITE);
			a2ExitBtn.setForeground(new Color(169,0,0));
		}
		if(me.getSource() == insert)
		{
			insert.setBackground(Color.WHITE);
			insert.setForeground(new Color(169,0,0));
		}
		if(me.getSource() == delete)
		{
			delete.setBackground(Color.WHITE);
			delete.setForeground(new Color(169,0,0));
		}
		if(me.getSource() == searchAcc)
		{
			searchAcc.setBackground(Color.WHITE);
			searchAcc.setForeground(new Color(169,0,0));
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == a2BackBtn)
		{
			a2BackBtn.setForeground(Color.WHITE);
			a2BackBtn.setBackground(new Color(169,0,0));
		}
		if(me.getSource() == a2ExitBtn)
		{
			a2ExitBtn.setForeground(Color.WHITE);
			a2ExitBtn.setBackground(new Color(169,0,0));
		}
		if(me.getSource() == insert)
		{
			insert.setForeground(Color.WHITE);
			insert.setBackground(new Color(169,0,0));
		}
		if(me.getSource() == delete)
		{
			delete.setForeground(Color.WHITE);
			delete.setBackground(new Color(169,0,0));
		}
		if(me.getSource() == searchAcc)
		{
			searchAcc.setForeground(Color.WHITE);
			searchAcc.setBackground(new Color(169,0,0));
		}
	}
	public void insertAccount(String a)
	{
		int flag = 0;
		acc = new AdminAccount(a);
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = acc;
				flag = 1;
				break;
			}
		}
		if(flag == 1){showMessageDialog(null, "Interstion Successful!");}
	}
	public void removeAccount(String a)
	{
		try
		{
			int flag = 0;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i].getAccountHolderName().equals(a))
			{
				accounts[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){JOptionPane.showMessageDialog(null, "deletion Successful!");}
		}
		catch(NullPointerException npe)
		{
			JOptionPane.showMessageDialog(null, "Account Not Found.");
		}
	}
	public void searchAccount(String a)
	{
		try
		{
			int flag = 0;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i].getAccountHolderName().equals(a))
			{
				flag = 1;
				break;
			}
		}
		if(flag == 1){JOptionPane.showMessageDialog(null, "Account Found.\n Account Name :"+a);}
		}
		catch(NullPointerException npe)
		{
			JOptionPane.showMessageDialog(null, "Account Not Found.");
		}
	}
	@Override
	public void actionPerformed(ActionEvent e5)
	{
		String command = e5.getActionCommand();
		String s1 = insertTF.getText();
		String s2 = removeTF.getText();
		String s3 = searchTF.getText();

		if(insert.getText().equals(command))
		{
			insertAccount(s1);
		}
		else if(delete.getText().equals(command))
		{
			removeAccount(s2);
		}
		else if(searchAcc.getText().equals(command))
		{
			searchAccount(s3);
		}
		if(a2BackBtn.getText().equals(command))
		{
			Admin a1 = new Admin();
			a1.setVisible(true);
			this.setVisible(false);
		}
		else if (a2LogOut.getText().equals(command))
		{
			Customar c4 = new Customar();
			c4.setVisible(true);
			this.setVisible(false);
		}
		else if(a2ExitBtn.getText().equals(command))
		{
			System.exit(0);
		}

	}
}