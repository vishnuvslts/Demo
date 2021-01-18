package TestPage;

import org.testng.annotations.Test;

import Base.BaseClassDemo;
import PageObject.InputForm;

public class DemoTest extends BaseClassDemo {
  @Test
  public void InputFormTest() {
	  InputForm obj= new InputForm(driver);
	  obj.fnameField();
	  obj.lnameField();
	  obj.emailField();
	  obj.phField();
	  obj.adField();
	  obj.cityField();
	  obj.siteField();
	  obj.zipField();
	  obj.siteField();
	  obj.cmmntField();
	  
  }
}
