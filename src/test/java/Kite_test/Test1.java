package Kite_test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base_class;
import POM_Classes.Pom1;
import POM_Classes.Pom2;
import POM_Classes.Pom3;
import utilitya.utility_class;

public class Test1 extends Base_class {
	Pom1 a;
	Pom2 b;
	Pom3 c;
	
@BeforeClass
public void open() throws Throwable {
	openbrowser();
	 a=new Pom1(driver);
	 b=new Pom2(driver);
	 c=new Pom3(driver);
	
	
}
@BeforeMethod
public void appl() throws Throwable {
	 a.enterUN(utility_class.getID(0, 0));
	 a.enterPWD(utility_class.getID(0, 1));
	 a.clickLOGINBTN();
	 
	 b.EnterPIN(utility_class.getID(0, 2));
	 b.clickcntBtn();
	
}
@Test
public void veryf() throws Throwable {
	
	String expt=c.verifyID();
	String act=utility_class.getID(0, 0);
	Assert.assertEquals(act, expt);
}
@AfterMethod
public void closapp() {
	Reporter.log("close the application",true);
}
@AfterClass
public void closeb() {
	Reporter.log("close the application",true);
}
}
