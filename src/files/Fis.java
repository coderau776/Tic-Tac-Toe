package files;

import javax.swing.JFrame;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.*;

public class Fis extends JFrame
{
	JPanel p = new JPanel();
	Click c[] = new Click[9];
	static int a[]=new int[9];
	static int[] c1= {0,3,6},c2= {0,1,2};
	static int f=0;
	public static void main(String[] args) {
		
		new Fis();
		
	}

	public Fis()
	{
		
		super("Tic Tac Toe");
		for(int i=0;i<9;i++)
		{
			
			a[i]=(int)(Math.random()*10000);

		}
		int flag=0;
		setSize(600,600);
		setLocation(500, 100);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLayout(new GridLayout(3,3));
		for(int i=0;i<9;i++)
		{
			
			c[i]=new Click(flag,i);
			p.add(c[i]);
			
		}
		add(p);
		setVisible(true);
		
	}
	
	
	public static void trigger()
	{
		
		int i;
		for(int var:c1)
		{
			
			if(a[var]==a[++var])
			{	
				if(a[var]==a[++var])
				{
					System.out.println("im here r");
					d(a[var]);
					return;
				}
			}
		}
		for(int var:c2)
		{
			
			if(a[var]==a[var+=3])
			{
				if(a[var]==a[var+=3])
				{
					//System.out.println("im here c");
					d(a[var]);
					return;
				}
			}
		}
		if(a[0]==a[4])
		{
			
			if(a[4]==a[8])
			{
				//System.out.println("im here d1");
				d(a[0]);
				return;
			}
		}
		if(a[2]==a[4])
		{
			if(a[4]==a[6])
			{
				//System.out.println("im here d2");
				d(a[2]);
				return;
			}
		}
		if(f==9)
		{
			JOptionPane.showMessageDialog(null, "Shit!! Its a TIE","Heyaa!!",JOptionPane.INFORMATION_MESSAGE);
		}
		
		
	}
	public static void d(int check)
	{
	
		if(check==5)
		{
			JOptionPane.showMessageDialog(null, "Player X Wins","Heyaa!!",JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Player O Wins","Heyaa!!",JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
