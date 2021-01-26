package uni.pu.fmi.sevices;

import java.util.ArrayList;
import java.util.List;

import uni.pu.fmi.User;

public class LoginService {

	public static String login(String username, String password) {
		if (username == null && password == null) {
			return "Въведете потребителско име и парола";
		}
		
		if (password == null) {
			return "Въведете парола12";
		}
		
		if (username == null) {
			return "Въведете потребителско име";
		}
		
		List<User> users = getUsers();
		
		boolean isUserExist = users.stream().anyMatch(user -> 
								(user.getUsername().equals(username) 
								&& user.getPassword().equals(password)));
		return isUserExist?"OK":"грешни потребителски данни";
	}

	public static List<User> getUsers() {
		User user = new User();
		user.setUsername("Иван");
		user.setPassword("Pass12343");
		ArrayList<User> users = new ArrayList<User>();
		users.add(user);
		return users;
	}

}
