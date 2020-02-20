package driverScript;

import CommonFunLibrary.ERP_Functions;
import utilities.ExcelFileUtil;

public class DriverScript {

	public static void main(String[] args) throws Exception {
		 ERP_Functions erp=new  ERP_Functions();
		 ExcelFileUtil  exl=new ExcelFileUtil ();
		 
		 int rowCount=exl.rowCount("supplier");
		 for(int i=1;i<=rowCount;i++){
			 String sname=exl.getData("supplier", i, 0);
			 String address=exl.getData("supplier", i, 1);
			 String city=exl.getData("supplier", i, 2);
			 String country=exl.getData("supplier", i, 3);
			 String cperson=exl.getData("supplier", i, 4);
			 String pnumber=exl.getData("supplier", i, 5);
			 String mail=exl.getData("supplier", i, 6);
			 String mnumber=exl.getData("supplier", i, 7);
			 String note=exl.getData("supplier", i, 8);
			 
			 erp.launchApp("http://webapp.qedge.com/login.php");
			 erp.login("admin", "master");
			  String result=erp.supplier(sname,address,city,country,cperson,pnumber,mail,mnumber,note);
			  exl.setData("supplier", i, 9, result);
			  erp.closebrw();
			 
		 }
		 
		
		

	}

}
