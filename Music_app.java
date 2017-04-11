import java.awt.*;
import java.awt.event.*;	
import javax.swing.*;	
import java.sql.*;


public class Music_app extends JFrame implements ActionListener 
{
	Container c1=getContentPane();
	JLabel l1,l2;
	JPasswordField p1;
	JTextField t1;
	JButton b1;
	public Music_app()
	{
		l1=new JLabel("Enter Username :");
		l2=new JLabel("Password");
		t1=new JTextField(20);
		p1=new JPasswordField();
		b1=new JButton("SUBMIT");
		
		l1.setBounds(50,150,100,100);
		l2.setBounds(50,300,100,100);
		t1.setBounds(150,150,150,50);
		p1.setBounds(150,300,150,50);
		b1.setBounds(150,450,100,100);
		
		
		c1.add(l1);
		c1.add(l2);
		c1.add(t1);
		c1.add(p1);
		c1.add(b1);
		
		b1.addActionListener(this);
		
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
		//actionPerformed(null);
	}
	public void actionPerformed(ActionEvent ae)
	{
			
			if(ae.getSource()==b1)
			{
				//System.out.println(" "+t1.getText());
				//System.out.println(" "+p1.getText());
				//System.out.println(p1);
				
			}
			
			
	}
	public static void main(String s[])
	{
		
		Music_app m1=new Music_app();
	}
}