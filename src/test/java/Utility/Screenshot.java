package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends TestClasses.BaseClass{

	public static void failedTestCaseScreenshot(String name) {
		TakesScreenshot ss=(TakesScreenshot)driver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		
		File save=new File(System.getProperty("user.dir")+"\\MavenScreenshot\\"+name+".png");
		
		try {
			FileHandler.copy(source, save);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot Taken");
		
	}

}
