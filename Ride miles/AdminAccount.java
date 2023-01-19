import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class AdminAccount 
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public AdminAccount()
	{

	}
	public AdminAccount(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public int getAccountNumber(){return accountNumber;}
	public String getAccountHolderName(){return accountHolderName;}
	public double getBalance(){return balance;}
	
}