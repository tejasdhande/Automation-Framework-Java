package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.LeavePage;

public class LeavePageTest extends BaseTest {
	
	LeavePage leavePage;
	@BeforeClass
	public void setUp() {
		
		leavePage = new LeavePage();
	}
	
	@Test
	public void applyLeavebySelectingValidInput() {
		leavePage.applyforLeave();
	}
	

}
