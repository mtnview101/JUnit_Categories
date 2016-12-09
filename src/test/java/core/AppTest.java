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

/*package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@BeforeClass
	public static void BeforeClass02() throws Exception {System.out.println("@BeforeClass");}
	@AfterClass
	public static void AfterClass02() throws Exception {System.out.println("@AfterClass");}
	
	@Before
	public void setUp() throws Exception {System.out.println("@Before");}
	@After
	public void After02() throws Exception {System.out.println("@After");}
	
	@Test
	public void test_05_AssertSame_Negative() {
	       System.out.println("Test_05_AssertSame_Negative");}
	
@BeforeClass
public static void setUpBeforeClass() throws Exception {
System.out.println("BeforeClass method will be executed Before first test method starts");}

@AfterClass
public static void tearDownAfterClass() throws Exception {
System.out.println("AfterClass method will be executed tearDown last test method completed");}

@Before
public void setUp() throws Exception {
       System.out.println("Before method will execute Before every test method");}

@After
public void tearDown() throws Exception {
       System.out.println("After method will execute After every test method");}

@Test 
public void test_01_assertEquals_Positive() {
       System.out.println("Test_01_assertEquals_Positive");}

@Test
public void test_02_assertEquals_Negative() {
       System.out.println("Test_02_assertEquals_Negative");}


}

*/

