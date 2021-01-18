package uni.pu.fmi;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	@Given("^Потребителя отваря страницата за вход в ситстемата\\.$")
	public void openLoginScreen() throws Throwable {

	}

	@When("^Въвежда потребителско име \"([^\"]*)\"$")
	public void addUsername(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^Въвежда парола \"([^\"]*)\"$")
	public void addPassword(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^Натиска върху бутона за вход в системата\\.$")
	public void clickLoginButton() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Вижда съобщение успех\\.$")
	public void checkLoginMessage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
