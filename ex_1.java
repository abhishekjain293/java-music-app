import java.awt.*;
import java.awt.event.*;	
import javax.swing.*;	
import java.sql.*;
public class ex_1 extends JFrame implements ActionListener 
{
	Container c1=getContentPane();
	JComboBox j1;
	String[] s1={"Bird","Cat","Rabbit"};
	public ex_1()
	{
		j1=new JComboBox(s1);
		
		j1.setBounds(200,200,100,100);
		
		c1.add(j1);
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		
	}
	public static void main(String s[])
	{
		
		ex_1 a1=new ex_1();
	}
}