package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.RegisterScreen;

public class RegisterSteps {
	
	private RegisterScreen registerScreen = new RegisterScreen();
	
	@Given("^Потребителя отваря екрана за регистрация на потребител$")
	public void openRegisterScreen() throws Throwable {
		registerScreen.navigateToMe();
	}

	@When("^Въведе потребителско име \"([^\"]*)\"$")
	public void addUsername(String username) throws Throwable {
		registerScreen.setUsername(username);
	}

	@When("^Въведе парола \"([^\"]*)\"$")
	public void addPassword(String password) throws Throwable {
		registerScreen.setPassword1(password);
	}

	@When("^Въведе втора парола \"([^\"]*)\"$")
	public void addPassword2(String password) throws Throwable {
		registerScreen.setPassword2(password);
	}

	@When("^Въведе email \"([^\"]*)\"$")
	public void addEmail(String email) throws Throwable {
		registerScreen.setEmail(email);
	}

	@When("^Натиска върху бутона за регистрация$")
	public void натиска_върху_бутона_за_регистрация() throws Throwable {
		registerScreen.clickRegisterButton();
	}

	@Then("^Вижда съобщение\"([^\"]*)\"$")
	public void checkMessage(String expectedMessage) throws Throwable {
	    assertEquals(expectedMessage, registerScreen.getRegisterMessage());
	}
}
