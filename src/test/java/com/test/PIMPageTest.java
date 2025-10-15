package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.PIMPage;

public class PIMPageTest extends BaseTest {
	private PIMPage pim ;
	
	@BeforeClass
	public void setUp() {
		pim = new PIMPage();
	}
	
	@Test
	public void addEmployee() {
		pim.addEmpoyee("ABC", "PQR", "XYZ", "143");
	}
}
