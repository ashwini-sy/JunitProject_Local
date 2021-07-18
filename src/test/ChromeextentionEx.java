package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;

@ExtendWith(ParameterProviderEx.class)
public class ChromeextentionEx {
	
	@Test
	public void testlaunch(ChromeDriver driver)
	{
		driver.get("https://www.simplilearn.com/");
	}
	

}
