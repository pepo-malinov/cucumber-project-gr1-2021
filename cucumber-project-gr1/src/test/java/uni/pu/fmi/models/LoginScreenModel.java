package uni.pu.fmi.models;

import uni.pu.fmi.sevices.LoginService;

public class LoginScreenModel {

	private String username;
	private String password;
	private String message;

	public void navigateToMe() {
		System.out.println("Акрана на вход в системата е отворен.");
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void clickLoginButton() {
		message = LoginService.login(username, password);
	}

	public String getLogingMessage() {
		return message;
	}

}
