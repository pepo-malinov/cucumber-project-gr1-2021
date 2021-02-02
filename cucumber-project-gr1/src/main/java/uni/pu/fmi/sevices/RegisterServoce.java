package uni.pu.fmi.sevices;

import java.util.ArrayList;
import java.util.List;

import uni.pu.fmi.User;

public class RegisterServoce {

	public static String register(String username, String password1, String password2, String email) {

		if (null == email || "".equals(email)) {
			return "Веведете електронна поща";
		}

		if (null == username || username.isEmpty()) {
			return "Веведете потребителско име";
		}

		if ((password1 == null || password1.isEmpty()) && (password2 == null || password2.isEmpty())) {
			return "Въведете парола";
		}
		
		if (password1 != password2) {
			return "Въведете еднакви пароли";
		}

		final List<User> users = getUsers();

		boolean isUsernameExists = users.stream().anyMatch(u -> u.getUsername().equals(username));
		if (isUsernameExists) {
			return "Потребителското име е заето";
		}

		final User newUser = new User(username, password1, email);
		users.add(newUser);
		return users.contains(newUser) ? "Успешна регистрация" : "";
	}

	public static List<User> getUsers() {
		final User user = new User("name2", "ttt", "email@test.com");
		ArrayList<User> users = new ArrayList<User>();
		users.add(user);
		return users;
	}

}
