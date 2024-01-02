package güneşbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class veritabanı<Statment> {
	
	Connection conn = null ;
	Statment stmt = null;
	ResultSet rs = null ; 
	
	private String database_HESAP_ID = "" ;
	private String database_password = "";
	private String query = "";
	
	private String database_name = "";
	private String database_table_name = "";
	
	public veritabanı(String database_HESAP_ID,String database_password,String database_name,String database_table_name) {
		this.database_HESAP_ID = database_HESAP_ID ;
		this.database_password = database_password ; 
		
		this.database_name = database_name ; 
		this.database_table_name = database_table_name ; 
		
	
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost/"+database_HESAP_ID,database_password,database_name);
		System.err.println("Bağlandı ->" +database_name);
		stmt = (Statment) conn.createStatement(); 
		
		
		
	}catch (ClassNotFoundException e) { 
		System.out.println("Connector Bulunamadı.");
		System.err.println("Bağlantı Başarısız\nClassNotFoundException");
		
	}
	catch (SQLException e) {
		
		System.err.println("Bağlantı Başarısız\nSql Exception");
		
	}
	
	
	
	}
}	