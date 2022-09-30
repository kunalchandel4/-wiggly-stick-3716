package com.cims.userCases;

import java.util.List;
import java.util.Scanner;

import com.cims.Dao.CrimeInformationManagementSystemDao;
import com.cims.Dao.CrimeInformationManagementSystemDaoImpl;
import com.cims.model.Crime_files;
import com.cims.model.Criminal;
import com.cimsExceptions.CrimeSystemException;

public class SearchingfacilityUseCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter");
		
		 String n = sc.nextLine() ;
//		
//		System.out.println("ENter 1. if you want to Search by the criminal ");
//		
//		System.out.println("ENter 2. if you want to Search by the crimes ");
//		System.out.println("ENter 3. if you want to changes the status of the crime ");
//		
//		int ch = sc.nextInt();
		
		CrimeInformationManagementSystemDao dao =  new CrimeInformationManagementSystemDaoImpl() ;
		
	try {
		List<Crime_files>   li = dao.searchbyCrimesName(n) ;
		
		li.forEach((e)-> System.out.println(e));
	} catch (CrimeSystemException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
	}

}
