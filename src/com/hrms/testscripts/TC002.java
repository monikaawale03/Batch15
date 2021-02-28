package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
	@Test
	public void tc002() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General obj1 = new General();
		obj1.openApplication();
		obj1.login();
		obj1.admin_comppro();
		obj1.logout();
	    obj1.closeApplication();
		}
	}


