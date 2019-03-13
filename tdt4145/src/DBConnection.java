package javaServerside;

import java.sql.*;

public class DBConnection {
	
	public static void main(String [] args) {
		Connection myConn; 
		Statement myStmt;
		ResultSet myRs;
		String db_url = "jdbc:mysql://10.22.33.244:3306/treningsdatabase";
		String username = "admin";
		String password = "admin";
		
		try {
			// 1. Koble til databasen
			myConn = DriverManager.getConnection(db_url, username, password );
			
			// 2. Sette opp statement
			myStmt = myConn.createStatement();
			
			// 3. Kjøre SQL spørring
				//String med kall for å oppdatere databasen
			/*String sql = " update students "
					+ " set fornavn='Petter', etternavn='Solberg' "
					+ " where student_id=2";
			myStmt.executeUpdate(sql);
			*/
				//Få resultat fra en MySql spørring
			myRs = myStmt.executeQuery("select * from notat");
			
			//4. Bearbeide resultatet som ble returnert fra databasen.
			while (myRs.next()) {
				System.out.println(myRs.getString("opplevelse_av_trening"));
			}
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}
	
}
