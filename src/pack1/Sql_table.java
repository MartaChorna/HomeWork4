package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Sql_table {
	public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
   
        get();
       
 
    }
    public static ArrayList<String> get() throws Exception{
        try{
            Connection con = getConnection();
            PreparedStatement statement = con.prepareStatement("SELECT * FROM different_shops");
           
            ResultSet result = statement.executeQuery();
           
            ArrayList<String> array = new ArrayList<String>();
            while(result.next()){
            	
            	
            	
            	int id = result.getInt("s_Id");
            	String str1 = result.getString("Name");
            	String str2 = result.getString("shop_assistant_name");
            	String str3 = result.getString("Address");
            	String str4 = result.getString("City");
            	
            	System.out.format("%s, %s, %s, %s, %s\n", id, str1, str2, str3, str4);

            }
            System.out.println("All records have been selected!");
            return array;
           
        }catch(Exception e){System.out.println(e);}
        return null;
       
    }
    public static Connection getConnection() throws Exception{
        try{
        	String url = "jdbc:mysql://localhost:3306/mrt_db";
    		String username = "root";
    		String password = "*********";
    		
    		
    		Connection conn = DriverManager.getConnection(url, username, password);
    		System.out.println("Connected");
    		return conn;
    	}catch (Exception e) {System.err.println(e);}
    	
    	
    	return null;
    	
    	}


}
