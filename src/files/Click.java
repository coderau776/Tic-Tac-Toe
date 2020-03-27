package files;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Click extends JButton implements ActionListener
{
	ImageIcon X,O;
	int value;
	
	int i;
	//0 is nothing 2 is circle 1 is cross
	public Click(int flag,int i)
	{
		X = new ImageIcon("close.png");
		O = new ImageIcon("circ.png");
		//f=flag;
		this.i=i;
		this.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(Fis.a[i]==5||Fis.a[i]==10)
		{
			JOptionPane.showMessageDialog(null, "Already marked","Heyaa!!",JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
			if(Fis.f%2==1)
			{
				Fis.f++;
				value=1;
			}
			else
			{
				Fis.f++;
				value=2;
			}
//			System.out.println("value is "+value);
			switch(value)
			{
				case 0:
					setIcon(null);
					break;
				case 1:
					setIcon(X);
					Fis.a[i]=5;
					break;
				case 2:
					setIcon(O);
					Fis.a[i]=10;
					break;
			}
			
			Fis.trigger();

		}
			
		
	}
	
	
}
