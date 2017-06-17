package googleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	@Test
	public void loginTest() throws IOException
	{
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com/?semcmpid=sem_8024046704_brand_goog&tgi=sem,1,G,8024046704,g,search,,112753719400,1t1,e,flipkart,c,,,,,,,&gclid=CPyx6tDVltMCFckPaAodMZ4Mfw");
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Automation\\Sample-Test\\Eclipsescreenshot\\googletest.jpg"));
		wd.quit();
		
		
	}

}
