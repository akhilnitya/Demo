package TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Akmaven.genericLib.BaseClass;



public class AlertpopTest extends BaseClass {

			// TODO Auto-generated method stub
	
		 @Test()
		  public void alertpopup()  {
		 		driver.findElement(By.className("popup_menu_button_settings")).click();
		 		driver.findElement(By.linkText("Types of Work")).click();
		 		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		 		driver.findElement(By.id("name")).sendKeys("Ak");
		 		driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
		 		Akmaven.genericLib.CommonUtility cu = new Akmaven.genericLib.CommonUtility();
		 		String msg=cu.getAlertPopmsg(driver);
		 		System.out.println(msg);
		 		cu.alertAccept(driver);
		 	  
		 	  


		   }

	}


