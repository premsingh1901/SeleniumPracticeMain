package AllConcepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Screenshot extends LaunchDriver {

	public static void main(String[] args) throws IOException {

		init("chrome", "https://facebook.com");
		
		File fileSrc= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fileSrc, new File(screenshotPath));
		
	}

}
