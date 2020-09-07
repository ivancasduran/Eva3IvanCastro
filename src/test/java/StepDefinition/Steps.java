package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Steps {
	
	WebDriver driver;
	
	/* [ LOGIN SUCCESSFUL   ]  ────────────────────────────────────────────────────────────────────────────────────────── */
	@Given("Abrir Chrome Login Successful")
	 public void chromeLoginSuccesfull() {
		 System.out.println("Ejecucion del navegador google chrome | Login Successful");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ivan Castro\\Downloads\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://localhost:8080/Login/index.jsp");
	}
	 
	 @When("Ingresar usuario {string} y contraseña {string} validos")
	 public void loginSuccessful(String string, String string2) {
		 System.out.println("Ingreso de credenciales de usuario validas");
		 driver.findElement(By.name("usuario")).sendKeys(string);
		 driver.findElement(By.name("contraseña")).sendKeys(string2);
	 }

	 @Then("Inicio sesion satisfactiriamente")
	 public void submitLoginSuccessful() {
		 System.out.println("Submit con la data de archivo TestLoginSuccessful.feature");
		 driver.findElement(By.id("submit")).click();
	 }


	 /* [ LOGIN FAILED       ]  ────────────────────────────────────────────────────────────────────────────────────────── */	 
	 @Given("Abrir Chrome Login Failed")
	 public void chromeLoginFailed() {
		 System.out.println("Ejecucion del navegador google chrome | Login Failed");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ivan Castro\\Downloads\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://localhost:8080/Login/index.jsp");
	}
	 
	 @When("Ingresar usuario {string} y contraseña {string} invalidos")
	 public void loginFailed(String string, String string2) {
		 System.out.println("Ingreso de credenciales de usuario invalidas");
		 driver.findElement(By.name("usuario")).sendKeys(string);
		 driver.findElement(By.name("contraseña")).sendKeys(string2);
	 }

	 @Then("Inicio sesion incorrecto")
	 public void submitLoginFailed() {
		 System.out.println("Submit con la data de archivo TestLoginFailed.feature");
		 driver.findElement(By.id("submit")).click();
	 }
	
	/* [ LOGIN DATA REQUIRED]  ────────────────────────────────────────────────────────────────────────────────────────── */	
	 @Given("Abrir Chrome Login Data Required")
	 public void chromeLoginDataRequired() {
		 System.out.println("Ejecucion del navegador google chrome | Login Data Required");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ivan Castro\\Downloads\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://localhost:8080/Login/index.jsp");
	 }
	 
	 @When("Ingresar usuario {string} y contraseña {string} vacios")
	 public void fieldsEmpty(String string, String string2) {
		 System.out.println("Submit con campos vacios");
		 driver.findElement(By.name("usuario")).sendKeys(string);
		 driver.findElement(By.name("contraseña")).sendKeys(string2);
	 }

	 @Then("Inicio sesion no valido")
	 public void submitEmptyField() {
		 System.out.println("Submit con la data de archivo TestLoginDataRequired.feature");
		 driver.findElement(By.id("submit")).click();
	 }
}