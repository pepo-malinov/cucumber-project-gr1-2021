package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.LoginScreenModel;

public class LoginSteps {

	LoginScreenModel loginScreen = new LoginScreenModel();

	@Given("^Потребителя отваря страницата за вход в ситстемата\\.$")
	public void openLoginScreen() throws Throwable {
		loginScreen.navigateToMe();
	}

	@When("^Въвежда потребителско име \"([^\"]*)\"$")
	public void addUsername(final String username) throws Throwable {
		loginScreen.setUsername(username);
	}

	@When("^Въвежда парола \"([^\"]*)\"$")
	public void addPassword(final String password) throws Throwable {
		loginScreen.setPassword(password);
	}

	@When("^Натиска върху бутона за вход в системата\\.$")
	public void clickLoginButton() throws Throwable {
		loginScreen.clickLoginButton();
	}

	@Then("^Вижда съобщение \"([^\"]*)\"\\.$")
	public void checkLoginMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, loginScreen.getLogingMessage());
	}
	
}
