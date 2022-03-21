package springMVCQ4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Service;


@Service()
public class DataBaseService {
	private Connection connection;
	
	public DataBaseService() {
		
		Connection connection = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
   	    this.connection =  DriverManager.getConnection("jdbc:mysql://localhost/crudapi", "root", "");
		}catch (Exception e) {
			
		}
	}
	
	public void insertData(UserModel user) throws Exception {
		 String password = user.getPassword();
    	 String username = user.getUsername();
    	 String email = user.getEmail();
    	 
    	 PreparedStatement preparedStatement = connection.prepareStatement("insert into user values(?,?,?)");
    	 preparedStatement.setString(1, username);
    	 preparedStatement.setString(2, email);
    	 preparedStatement.setNString(3, password);
    	 
    	 preparedStatement.executeUpdate();
    	 
	}
	
	public boolean  getData(UserModel user) throws Exception {
		 PreparedStatement pst=connection.prepareStatement("select * from user where username=?");
    	 pst.setString(1, user.getUsername());
    	 
		 ResultSet resultSet = pst.executeQuery();
		 if(resultSet.next()==false) {
				return false;
			}
			String username="";
			String password="";
			while(resultSet.next()){
				username=resultSet.getString(1);
				password=resultSet.getString(3);
			}
			
			if(username.equals(user.getUsername()) && password.equals(user.getPassword()))
				return true;
			else 
			  return false;
		
	}
		

}