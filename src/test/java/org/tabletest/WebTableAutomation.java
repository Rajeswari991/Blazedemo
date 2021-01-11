package org.tabletest;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebTableAutomation extends BaseClass {

	@BeforeClass
	private void systemLoad() {
		sysLoad();
		url("https://blazedemo.com/");
    }
	
	@AfterClass
	private void close() {
		System.out.println("close");
		quit();
    }
	
	@BeforeMethod
	private void beforeExecutionDate() {
		Date d=new Date();
		System.out.println("Before execution date :"+d);
    }
	
	@AfterMethod
	private void afterExecutionDate() {
		Date d1=new Date();
		System.out.println("AfterExecution date :"+d1);
    }
	@Parameters({"departurecity","destinationcity","customername","customeraddress","customercity","customerstate","customerzipcode","cardtype","cardno","cardmonth","cardyear","nameoncard"})
	@Test
	public void tableTesting(@Optional("Paris") String deptcity,@Optional("London") String destcity,@Optional("Sneha.R") String name,@Optional("5/513 B5 Krishnanagar") String address,@Optional("Tuticorin") String city,@Optional("Tamilnadu") String state,@Optional("628503") String zipcode,@Optional("American Express") String cardtype,@Optional("7894561237894562") String cardno,@Optional("07") String cardmonth,@Optional("2023") String cardyear,@Optional("sneha") String nameoncard) throws InterruptedException {
		PojoClass p=new PojoClass();
		p.automateTable(deptcity, destcity, name, address, city, state, zipcode, cardtype, cardno, cardmonth, cardyear, nameoncard);

	}
}
