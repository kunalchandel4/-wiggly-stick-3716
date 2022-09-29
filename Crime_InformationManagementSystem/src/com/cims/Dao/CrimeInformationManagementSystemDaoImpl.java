package com.cims.Dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.cims.utility.CimsUtility;

public class CrimeInformationManagementSystemDaoImpl  implements CrimeInformationManagementSystemDao{


	@Override
	public String registerStudent() {
		// TODO Auto-generated method stub
		
		String msg ="Not Inser" ;
		
		
		try(Connection con =CimsUtility.proviedConnection()){
		
			con.prepareStatement("insert into () values (?,?,?,?)");
			
			
		}catch(SQLException e) {
			
		}
		
		
		return msg;
	}

}
