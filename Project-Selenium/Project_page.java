package Tomer_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Project_page {

	WebDriver driver;
	
	Project_page (WebDriver driver){
		this.driver = driver;
	}
	//Find the element of the link to Macabi Tel Aviv page
	WebElement MacabiTelAviv() {
		return driver.findElement(By.linkText("מכבי תל אביב"));
	}

	//Click on Macabi Tel Aviv link element
	void clickMTA() {
		MacabiTelAviv().click();
	}

	//Return to the main page
	WebElement BackToMain() {
		return driver.findElement(By.linkText("חזרה לדף ראשי - ליגת העל"));
	}
	
	//Click on Back to main page link element
	void clickBTM() {
		BackToMain().click();
	}

	//Find the element of the link to Quiz page
	WebElement Quiz() {
		return driver.findElement(By.cssSelector("#second > a:nth-child(1) > img:nth-child(1)"));
	}
	
	//Click on Quiz link element
	void clickQuiz() {
		Quiz().click();
	}

	//Find the element of First name
	WebElement Firstname() {
		return driver.findElement(By.name("Firstname"));
	}
	
	//Fill the first name 
	void typefirstname(String name) {
		Firstname().sendKeys(name);
	}
	String FirstNameValue() {
		return Firstname().getAttribute("Value");
	}

	//Find the element of Last name
	WebElement Lastname() {
		return driver.findElement(By.cssSelector("[name=\"Lastname\"]"));
	}
	//Fill the last name
	void typelastname(String name) {
		Lastname().sendKeys(name);
	}
	String LastNameValue() {
		return Lastname().getAttribute("Value");
	}

	//Find the element of ID
	WebElement idnumber() {
		return driver.findElement(By.name("id_number"));
	}
	
	//Fill the ID number
	void typeid(String number) {
		idnumber().sendKeys(number);
	}
	String idnumberValue() {
		return idnumber().getAttribute("Value");
	}

	//find the element of choose the city
	WebElement city() {
		return driver.findElement(By.name("city"));
	}
	
	//Choose the city 
	void choosecity(int i) {
		Select cityDropDown = new Select(city());
		cityDropDown.selectByIndex(i);
	}

	//Find the element of Send button
	WebElement send() {
		return driver.findElement(By.cssSelector("[type='submit']"));
	}
	
	//Click on Send element
	void clickSend() {
		send().click();
	}

	//count number of radio buttons
	int radioSize() {
		return driver.findElements(By.cssSelector("input[type=radio]")).size();
	}
	
	//find the element of one question1 with radio button
	WebElement answer1() {
		return driver.findElement(By.cssSelector("[value='Doron']"));
	}

	//Click on question1 element
	void clickanswer1() {
		answer1().click();
	}
	
	//find the element of one question2 with radio button
	WebElement answer2() {
		return driver.findElement(By.cssSelector("[value='8']"));
	}

	//Click on question2 element
	void clickanswer2() {
		answer2().click();
	}

	//find the element of one question3 with radio button
	WebElement answer3() {
		return driver.findElement(By.cssSelector("[value='Lavan & Tomer']"));
	}

	//Click on question3 element
	void clickanswer3() {
		answer3().click();
	}

	//find the element of one question4 with radio button
	WebElement answer4() {
		return driver.findElement(By.cssSelector("[value='Shimon']"));
	}

	//Click on question4 element
	void clickanswer4() {
		answer4().click();
	}
	
	//find the element of one question5 with radio button
	WebElement answer5() {
		return driver.findElement(By.cssSelector("[value='Erez']"));
	}

	//Click on question5 element
	void clickanswer5() {
		answer5().click();
	}

	//find the element of one question6 with radio button
	WebElement answer6() {
		return driver.findElement(By.cssSelector("[value='Tal']"));
	}

	//Click on question6 element
	void clickanswer6() {
		answer6().click();
	}
	
	//find the element of one question7 with radio button
	WebElement answer7() {
		return driver.findElement(By.cssSelector("[value='Arena']"));
	}

	//Click on question7 element
	void clickanswer7() {
		answer7().click();
	}

	//find the element of one question8 with radio button
	WebElement answer8() {
		return driver.findElement(By.cssSelector("[value='1932']"));
	}

	//Click on question8 element
	void clickanswer8() {
		answer8().click();
	}

	//Check radiobutoon no checked
	WebElement noradiobutton() {
		return driver.findElement(By.cssSelector("[value='1931']"));
	}
	
	boolean noradiobuttonvalue() {
		return noradiobutton().isSelected();
	}
	
	//line in mainpage
	WebElement checkmishpat() {
		return driver.findElement(By.className("Team"));
	}
	
	String checkmisphattext() {
		return checkmishpat().getText();
	}
		
 
	}

