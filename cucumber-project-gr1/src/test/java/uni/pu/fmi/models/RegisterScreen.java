package uni.pu.fmi.models;

import uni.pu.fmi.sevices.RegisterServoce;

public class RegisterScreen {

	private String username;
	private String password1;
	private String password2;
	private String email;
	private String message;

	public void navigateToMe() {
		System.out.println("Акрана регистрация в системата е отворен.");
	}

	/**
	 * Set user name to the correct screen input field
	 * 
	 * @param username String representation of user name
	 */
	public void setUsername(final String username) {
		this.username = username;
	}

	public void setPassword1(String password) {
		password1 = password;
	}

	public void setPassword2(String password) {
		password2 = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void clickRegisterButton() {
		message = RegisterServoce.register(username, password1, password2, email);

	}

	public String getRegisterMessage() {
		return message;
	}

}
