package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

import java.time.Duration;

public class LoginSteps extends CommonMethods {

    //public WebDriver driver;

    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() throws InterruptedException {
        //driver = new ChromeDriver();
        //driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        openBrowserAndLaunchingBrowser();
    }

    @When("user enters admin username and password")
    public void user_enters_admin_username_and_password() throws InterruptedException {
        //object of the login class to access all the elements
        //LoginPage lp=new LoginPage();
        //WebElement usernameTextField = driver.findElement(By.xpath("//*[@id='txtUsername']"));
        //usernameTextField.sendKeys("admin");
        sendText(loginPage.usernameTextField, ConfigReader.getPropertyValue("username"));
        //Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //WebElement passwordTextField = driver.findElement(By.cssSelector("input#txtPassword"));
        //passwordTextField.sendKeys("Hum@nhrm123");
        sendText(loginPage.passwordTextField, ConfigReader.getPropertyValue("password"));
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
        //LoginPage lp=new LoginPage();
        //WebElement loginButton = driver.findElement(By.xpath("//*[@value='LOGIN']"));
        click(loginPage.loginBtn);
        //loginButton.click();
        //Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        //System.out.println(1/0);
        System.out.println("Test passed.");

        //assertions to check if the element exists
        //the moment assertion finds an error, it stops the execution
        //assert true, it is a boolean condition we write to check if it is true or false
        Assert.assertTrue(dashboardPage.welcomeAdminLogin.isDisplayed());
        //Assert.assertEquals();

    }

}
