import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class LoginDb {
String dbUrl="jdbc:mysql://localhost:3307/hope_haven";
String dbUname="root";
String dbPassword="";
String dbDriver="com.mysql.cj.jdbc.Driver";
String username,password;
int flag=0;
    LoginDb(String username,String password){
    this.username=username;
    this.password=password;
    }
    void signin() {
    	Connection con = null;
	    try {
//	    	System.out.println("email1="+email1);
	    	Class.forName(dbDriver);  //class not found exception
			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword); 
			String sql = "SELECT * FROM login WHERE username = '" + username + "' AND password = '" + password + "'";
			Statement s = con.createStatement();
		   	ResultSet rs= s.executeQuery(sql);
		   	System.out.println(sql);
//			PreparedStatement s = con.prepareStatement(sql);
//			s.setString(1,email1);
			if(rs.next()) {
				System.out.println("LOGGED IN");
//				return true;
				flag=1;
			}
			else {
				System.out.println("ACC NOT FOUND");
//				return false;
				flag=0;
			}
	    }
	    catch(Exception e){
	    	e.printStackTrace();
	    	System.out.println("exception");
//	    	return false;
	    	
	    }
    }
    public int getflag() {
    	return flag;
    }
}

