package com.hrms.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
public class Global {
    public WebDriver driver;
    public Actions ac;
    //TestData
	public String url = "http://127.0.0.1/orangehrm-2.6/login.php";
	public String username = "admin";
	public String password = "admin";
	public String proinfo = "Luton362";
	//Objects
	public String txt_loginname = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout = "Logout";
	public String mouse_admin = "Admin";
	public String mouse_cinfo = "Company Info";
	public String link_comprop = "Company Property";
	public String btn_add="addbutton";
	public String txt_pro_info = "txtPropertyName";
	public String btn_save = "saveBtn";

}
