package core;



import java.io.BufferedReader;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	/**
	 * This is parent class of all classes in this framework We define the
	 * properties of Webdriver, Log4J, Properties class so every class in this
	 * framework can inherit the property of this class and that is implementation
	 * of Inheritance concept of OOPS.
	 */
	public static WebDriver driver;
	public static Properties properties; // This class will help us read data from .properties files
	public static Logger logger; // this class will help us to log each step of our execution
	private String propertyPath = "C:\\Users\\sabzi\\eclipse-workspace\\us.tekschool.capstone.bdd2\\src\\test\\resources\\input\\config.properties"; // this is path to config file
	private String log4jPath = "C:\\Users\\sabzi\\eclipse-workspace\\us.tekschool.capstone.bdd2\\src\\test\\resources\\input\\log4j.properties"; // this is path to log4j file 
	
	/**
	 * we create a constructor to initialize the variables values from the 
	 * config.properties and log4jproperties files.
	 */
	@SuppressWarnings("static-access")
	public Base() {
	try {
	BufferedReader reader = new BufferedReader(new FileReader(propertyPath));
	properties = new Properties();
	properties.load(reader);
	} catch (FileNotFoundException e) {
	e.printStackTrace();
	} catch (IOException e) {
	e.printStackTrace();
	}
	logger = logger.getLogger("logger_File");
	PropertyConfigurator.configure(log4jPath);
	}
	public static String getUrl() {
	String url = properties.getProperty("url");
	return url;
	}
	public static String getBrowser() {
	String browser = properties.getProperty("browser");
	return browser;
	}
	public static void openBrowser() {
	driver.get(getUrl());
	}
	public static void tearDown() {
	driver.close();
	driver.quit();
	}
	public static void browser() {
	String browserName = getBrowser();
	switch (browserName) {
	case "chrome":
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	break;
	case "firefox":
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	break;
	case "edge":
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	break;
	default:
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	}
	}

