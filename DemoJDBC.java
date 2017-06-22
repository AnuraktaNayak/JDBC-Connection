import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DemoJDBC {
	public static void main(String[] args) {
		try {
			String query = "Select * from students";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Root@2015");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			//rs.next();
			//String sname = rs.getString(1);
			//int count=1;
			while(rs.next()){
				int rollNo=rs.getInt("sRollNo");
				String studentName=rs.getString("sName");
				//System.out.println(count++ + " record of the student table");
				System.out.println("====================================");
				System.out.println("Student Roll No: " + rollNo); 
				System.out.println("Student Name: " + studentName);
				System.out.println("*************************************");
			}
			//System.out.println(rs.);
			con.close();

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
