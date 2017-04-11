import java.awt.*;
import java.awt.event.*;	
import javax.swing.*;	
import java.sql.*;
public class cat1 extends JFrame implements ActionListener 
{
	Container c1=getContentPane();
	JButton b1;
	JLabel l1;
	JTextField t1;
	public cat1()
	{
		b1=new JButton("SAVE");
		l1=new JLabel("ADD NEW CATEGORY");
		t1=new JTextField(20);
		
		l1.setBounds(220,150,200,50);
		t1.setBounds(350,150,200,50);
		b1.setBounds(360,250,80,50);
		
		c1.add(l1);
		c1.add(t1);
		c1.add(b1);
		
		b1.addActionListener(this);
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
			String s;
			if(ae.getSource()==b1)
			{
				s=t1.getText();
				try
			{
                        		Connection con;
                        		PreparedStatement ps = null;

                        		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                        	con = DriverManager.getConnection("jdbc:odbc:music_app");
ps = con.prepareStatement("insert into category values('"+s+"')");
	                        	ps.executeUpdate();

	                        	ps.close();
                        		con.close();
                		}
                		catch(Exception e)
                		{
                		}
				
			}
	}
	public static void main(String s[])
	{
		
		cat1 a1=new cat1();
	}
}	