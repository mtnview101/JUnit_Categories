package core;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;


import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AppTest {

	@BeforeClass
	public static void BeforeClass02(){System.out.println("@BeforeClass");}
	@AfterClass
	public static void AfterClass02(){System.out.println("@AfterClass");}
	
	@Before
	public void Before(){System.out.println("@Before");}
	@After
	public void After(){System.out.println("@After");}
	
	
	@Category(AcceptanceTest.class)
	@Test
	public void test_01() {System.out.println("Test_01");}
	
	@Category(RegressionTest.class)
	@Test
	public void test_02() {System.out.println("Test_02");}
	
	@Category({AcceptanceTest.class, RegressionTest.class})
	@Test
	public void test_03() {System.out.println("Test_03");}
	
	@Test
	public void test_04() {System.out.println("Test_04");}
}



