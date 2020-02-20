package utilities;

import CommonFunLibrary.ERP_Functions;

public class Dummy {

	public static void main(String[] args) throws Exception {
		ExcelFileUtil ex=new ExcelFileUtil();
		ERP_Functions erp=new ERP_Functions();
	int totalrows=ex.rowCount("supplier");
	System.out.println("total no of rows are"+totalrows);
	int totalcols=ex.colCount("supplier");
	System.out.println("total no of col are"+totalcols);
	String cdata=ex.getData("supplier",3,4);
	System.out.println("data in 3,4 are"+cdata);
	ex.setData("supplier",1,9,"pass");
	System.out.println("write data in 1,9");
	
	ex.setData("supplier",2,9,"fail");
	
	ex.setData("supplier",3,9,"not executed");

	ex.setData("supplier",4,9,"pass");
	ex.setData("supplier",5,9,"fail");
erp.launchApp("http://webapp.qedge.com/login.php");
erp.login("admin", "master");



	
	
	}


}
