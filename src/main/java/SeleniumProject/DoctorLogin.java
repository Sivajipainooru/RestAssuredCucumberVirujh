package SeleniumProject;

	
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DoctorLogin {

		public static WebDriver driver;
		public static String url;

		//public static void main(String []args) throws InterruptedException
		//{

		
	    By DoctorOption= By.xpath("(//span[@class='MuiButton-label'])[2]");
	    By EmailId     = By.xpath("//input[@placeholder='Email ID *']");
	    By Password    = By.xpath("//input[@placeholder='Password']");
	    By Signin      = By.xpath("//span[text()='Sign In']");
	    By Setting     = By.xpath("//i[@class='icon-settings']");
	    By HospitalUrl = By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input Mui-disabled Mui-disabled MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd']");
		By HeadingText = By.xpath("//h5[@class='MuiTypography-root jss4 MuiTypography-h5']");
		@BeforeTest
		public void BaseVirujh() throws InterruptedException
		{ 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\softsuave\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://dev.virujh.com/app");
		WebElement doctOption=driver.findElement(DoctorOption);
		doctOption.click();
		WebElement Email     = driver.findElement(EmailId);
		Email.sendKeys("banana@gmail.com");
		WebElement pwd       = driver.findElement(Password);
		pwd.sendKeys("Banana@1990");
		WebElement signinbtn = driver.findElement(Signin);
		signinbtn.click();
		
		driver.wait(4000);
		WebElement settingbtn= driver.findElement(Setting);
		settingbtn.click();
		driver.wait(3000);
		WebElement hospUrl   = driver.findElement(HospitalUrl);
		url=hospUrl.getText();
		System.out.println(url);
		}
	@Test
		public void getHospitalId()
		{
	       driver.get(url);
			boolean s=driver.findElement(HeadingText).isDisplayed();
			if(s==true)
			{
				System.out.println("Heading is Displayes We are redirecting the correct Page");
			}
			else
			{
				System.out.println("Heading is not there You can re-check the code");
			}
			String urltext = driver.getCurrentUrl();
			System.out.println(urltext);
			String urldata=urltext.split("app")[1];
			System.out.println(urldata);
		}
		
		



}
