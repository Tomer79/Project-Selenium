package Tomer_Project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Tomer_Project {

	WebDriver driver;

	@BeforeEach
	void setUp() {
		System.setProperty("webdriver.chrom.driver","C:\\Users\\User\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("file:///C:/Users/User/Desktop/Project%20QA%20-%20basketball/Israel%20basketball%20league-main%20page.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	void Fill_form() {
		driver.get("file:///C:/Users/User/Desktop/Project%20QA%20-%20basketball/The%20basketball%20quiz.html");
		Project_page Project_page = new Project_page(driver);
		Project_page.clickanswer1();
		Project_page.clickanswer2();
		Project_page.clickanswer3();
		Project_page.clickanswer4();
		Project_page.clickanswer5();
		Project_page.clickanswer6();
		Project_page.clickanswer7();
		Project_page.clickanswer8();
		Project_page.typefirstname("Tomer");
		Project_page.typelastname("Meir");
		Project_page.typeid("036314623");
		Project_page.choosecity(2);
		
	}
	
	@Test
	void check_amount_radiobutton() {
		driver.get("file:///C:/Users/User/Desktop/Project%20QA%20-%20basketball/The%20basketball%20quiz.html");
		Project_page Project_page = new Project_page(driver);
		assertEquals(32, Project_page.radioSize());
		Project_page.noradiobutton();
		
	}
	
	//Go to Macabi Tel Aviv page and return to the main page
	@Test
	void Macabi_tel_aviv_page() {
		driver.get("file:///C:/Users/User/Desktop/Project%20QA%20-%20basketball/Israel%20basketball%20league-main%20page.html");
		Project_page Project_page = new Project_page(driver);
		Project_page.clickMTA();
		Project_page.clickBTM();
	}
	
	@Test
	void check_text() {
		driver.get("file:///C:/Users/User/Desktop/Project%20QA%20-%20basketball/Israel%20basketball%20league-main%20page.html");
		Project_page Project_page = new Project_page(driver);
		assertEquals("Teams Photo", Project_page.checkmisphattext());
		System.out.println(Project_page.checkmisphattext());
	
	}
	

	@AfterEach
	void tearDown() throws Exception {
//		driver.quit();
	}

}
