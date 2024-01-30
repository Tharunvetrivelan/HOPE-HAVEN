
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class RegDb {
		String dbUrl="jdbc:mysql://localhost:3307/hope_haven";
		String dbUname="root";
		String dbPassword="";
		String dbDriver="com.mysql.cj.jdbc.Driver";
        String fullname,email1,phone_no1,dob,username,password,address,interest;
        RegDb(String fullname,String email1,String phone_no1,String dob,String username,String password,String address,String interest){
        	this.fullname=fullname;
        	this.email1=email1;
        	this.phone_no1=phone_no1;
        	this.dob=dob;
        	this.username=username;
        	this.password=password;
        	this.address=password;
        	this.interest=interest;
        }
         boolean store(){
        	Connection con = null;
    		try {
    			Class.forName(dbDriver);  //class not found exception
    			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception
    			String sql="select * from login where email1='"+email1+"'";
    			Statement s = con.createStatement();
    			ResultSet rs =s.executeQuery(sql);
    			if(rs.next()) {
    				return true;
    			}else {
    			String sql1 ="insert into login (fullname,email1,phone_no1,dob,username,password,address,interested)"
    					+ "values('"+fullname+"','"+email1+"','"+phone_no1+"','"+dob+"','"+username+"','"+password+"','"+address+"','"+interest+"')";
	    		    s = con.createStatement();
	     		    s.execute(sql1);
	     		    return false;
    		    }
//			   	con.close();
    		} catch (Exception e){
    			e.printStackTrace();
    		}
    		return false;
        }

        

}
