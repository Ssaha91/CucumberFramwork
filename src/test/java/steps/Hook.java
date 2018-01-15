package steps;

import base.BaseUtil;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hook  {
    private BaseUtil base;

    public Hook(BaseUtil base){
        this.base = base;
    }
    @Before
    public  void setUp(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\driver\\chromedriver.exe");
        base.driver = new ChromeDriver();
        base.driver.manage().window().maximize();
    }
    @After
    public  void teadDown(){
    base.driver.quit();
    }

}
