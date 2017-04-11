import java.awt.*;
import java.awt.event.*;	
import javax.swing.*;	
import java.sql.*;
public class cat2 extends JFrame implements ActionListener
{
	Container c1=getContentPane();
	JComboBox j1,j2;
	String s1[];
	int i=0;
					Connection con;
					Statement st;
					ResultSet rs;
					
					
	public cat2()
	{
		j1=new JComboBox();
		j2=new JComboBox();
		
			try
			{		
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
		j2.setBounds(200,350,100,100);
		
		c1.add(j1);
		c1.add(j2);
		
		j1.addActionListener(this);
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{		
	JComboBox combo=(JComboBox)ae.getSource();
	String cat=(String)combo.getSelectedItem();
	//cat="hindi";
	//System.out.prntln(""+cat);
	System.out.println(" "+cat);
				try
						{
								j2.removeAllItems();
								Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
								//System.out.println("error place 1");
								con=DriverManager.getConnection("jdbc:odbc:music_app");
								//System.out.println("error place 2");
                        		st=con.createStatement();
								rs = st.executeQuery("select sname from music where cname='"+cat+"'");
                        		while(rs.next())
                        		{
									//System.out.println(""+rs.getString("sname"));
									j2.addItem(rs.getString("sname"));
                        		}
								//rs=null;
								rs.close();
								st.close();
								con.close();

                		}
                		catch(Exception e)
                		{
                		}
						
			
	}
	
	
	public static void main(String s[])
	{
		
		cat2 a2=new cat2();
	}
}	