package com.affiliate.websites.service.image;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

	public void takeScreenshotOf(String url, String fileName) {
		String dirPath = "D:\\work\\surse\\springboot-app-aff\\"
				+ "websites\\src\\main\\resources\\screenshots\\";
		
		final File screenShot = new File(dirPath + fileName + ".jpg").getAbsoluteFile();

		System.setProperty("webdriver.gecko.driver", "D:\\work\\surse\\springboot-app-aff\\"
				+ "websites\\src\\main\\resources\\" + "geckodriver-v0.20.0-win64\\geckodriver.exe");

		final WebDriver driver = new FirefoxDriver();
		try {
			driver.get(url);

			TimeUnit.SECONDS.sleep(5);

			final File outputFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(outputFile, screenShot);
		} catch (InterruptedException iee) {
			// TODO Auto-generated catch block
			iee.printStackTrace();
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		} finally {
			driver.close();
		}
	}
}
