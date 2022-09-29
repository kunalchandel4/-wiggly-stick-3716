package com.cims.utility;

import java.sql.*;

public class CimsUtil {
	
	
	public static  Connection provideConnection() {
		
		Connection con = null ;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	
	
		return con ;
	}

}
