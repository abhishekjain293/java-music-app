import java.awt.*;
import java.awt.event.*;	
import javax.swing.*;	
import java.sql.*;
public class cat3 extends JFrame implements ActionListener
{
	Container c1=getContentPane();
	JComboBox j1;
	JTextField t1;
	JButton b1;
	String cat;
	String s1[];
	int i=0;
					Connection con;
					Statement st;
					ResultSet rs;
					PreparedStatement ps = null;
					
					
	public cat3()
	{
		j1=new JComboBox();
		t1=new JTextField();
		b1=new JButton("Submit");
		//j2=new JComboBox();
		
			try
			{		
					Connection con;
					Statement st;
					ResultSet rs;
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					//System.out.println("error place 1");
					con=DriverManager.getConnection("jdbc:odbc:music_app");
					//System.out.println("error place 2");
                    st=con.createStatement();
					rs=st.executeQuery("Select * from category");
					while(rs.next())
					{	
						
						//Sytem.out.println(rs.getString()
						j1.addItem(rs.getString("cname"));
							
					}
					
					rs.close();
					st.close();
					con.close();
					
            }
                		catch(Exception e)
                		{
                		}
		
		j1.setBounds(200,200,100,100);
		t1.setBounds(200,350,100,100);
		b1.setBounds(360,480,80,50);
		
		c1.add(j1);
		c1.add(t1);
		c1.add(b1);
		
		j1.addActionListener(this);
		b1.addActionListener(this);
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
			
	if(ae.getSource()==j1)
	{
	JComboBox combo=(JComboBox)ae.getSource();
	cat=(String)combo.getSelectedItem();
	}
	else if(ae.getSource()==b1)
	{
	//cat="hindi";
	//System.out.prntln(""+cat);
	//System.out.println(" "+cat);
				try
						{
								Connection con;
								//Statement st;
								//ResultSet rs;
								PreparedStatement ps = null;
								//j2.removeAllItems();
								Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
								//System.out.println("error place 1");
								con=DriverManager.getConnection("jdbc:odbc:music_app");
								//System.out.println("error place 2");
                        		//st=con.createStatement();
								ps = con.prepareStatement("update category set cname='"+t1.getText()+"' where cname='"+cat+"'");
                        		ps.executeUpdate();
								//rs=null;
								ps.close();
								//st.close();
								con.close();

                		}
                		catch(Exception e)
                		{
                		}
	}
	else
	{
		
	}
	
						
			
	}
	
	
	public static void main(String s[])
	{
		
		cat3 a3=new cat3();
	}
}	