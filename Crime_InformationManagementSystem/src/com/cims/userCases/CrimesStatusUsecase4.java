package com.cims.userCases;

import java.util.Scanner;

import com.cims.Dao.CrimeInformationManagementSystemDao;
import com.cims.Dao.CrimeInformationManagementSystemDaoImpl;
import com.cimsExceptions.CrimeSystemException;

public class CrimesStatusUsecase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		String value=null;

		System.out.println("ENter case_no of crime - file ");
		int n = sc.nextInt();
		System.out.println("change to solved enter 1");
		System.out.println("change to unsolved enter 2");
		int st = sc.nextInt();
		
		if(st == 1) {
			value = "Solved" ;
		}else if(st==2) {
			value = "Unsolved";
		}
		
		
		CrimeInformationManagementSystemDao dao =  new CrimeInformationManagementSystemDaoImpl() ;
		
		try {
			String res= dao.CrimebychangeStatus(n, value);
			System.out.println(res);
		} catch (CrimeSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		

	}

}
