import java.awt.*;
import java.awt.event.*;	
import javax.swing.*;	
public class admin1 extends JFrame implements ActionListener 
{
	Container c1=getContentPane();
	JButton b1,b2,b3,b4,b5,b6;
	public admin1()
	{
		b1=new JButton("ADD NEW SONG CATEGORY");
		b2=new JButton("DISPLAY SONG CATEGORY");
		b3=new JButton("UPDATE SONG CATEGORY");
		b4=new JButton("DELETE SONG CATEGORY");
		b5=new JButton("ADD NEW SONG");
		b6=new JButton("REMOVE SONNG");
		
		b1.setBounds(350,150,200,50);
		b2.setBounds(350,220,200,50);
		b3.setBounds(350,290,200,50);
		b4.setBounds(350,360,200,50);
		b5.setBounds(350,430,200,50);
		b6.setBounds(350,500,200,50);
		
		c1.add(b1);
		c1.add(b2);
		c1.add(b3);
		c1.add(b4);
		c1.add(b5);
		c1.add(b6);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
			
			if(ae.getSource()==b1)
			{
				cat1 a1=new cat1;
				a1.setVisible(true);
				this.dispose
			}
			else if(ae.getSource()==b2)
			{
				cat2 a2=new cat2;
				a2.setVisible(true);
				this.dispose
			}
			else if(ae.getSource()==b3)
			{
				cat3 a3=new cat3;
				a3.setVisible(true);
				this.dispose
			}
			if(ae.getSource()==b4)
			{
				cat1 a4=new cat4;
				a4.setVisible(true);
				this.dispose
			}
			if(ae.getSource()==b5)
			{
				cat1 a5=new cat5;
				a5.setVisible(true);
				this.dispose
			}
			if(ae.getSource()==b6)
			{
				cat1 a6=new cat6;
				a1.setVisible(true);
				this.dispose
			}
			else
			{
				
			}
			
			
	}
	public static void main(String s[])
	{
		
		admin1 a1=new admin1();
	}
}