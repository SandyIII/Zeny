/**
 * 
 */
package utils;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



/**   
 * @author hassane_djoudi
 *     
 */
 
public class ScreenShot  {
 private static	WebDriver driver  ;
	

	
	 
	 public  static void   TakeScreenShot(String TestMethodName  )  {
		
	
		 
		 File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 try {
		 FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\Screen_Shots\\"+TestMethodName + ".png"));}
		 catch(IOException e) {
			 e.printStackTrace();
		 }
		
	
		 

		 }
}
