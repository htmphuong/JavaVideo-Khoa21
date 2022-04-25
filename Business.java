import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Business {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	public void ConnectDB() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-NU4VCB7\\SQLEXPRESS;database=ATMTCP;username=sa;password=123456");
			System.out.println("Connectd");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//thao tac voi du lieu
	public int executeDB(String sql) {
		int n=0;		
		try {
			ConnectDB();
			stmt = conn.createStatement();
			n = stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return n;
	}
	//truy van du lieu
	public ResultSet queryDB(String sql) {
		try {
			ConnectDB();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rs;
	}
}
