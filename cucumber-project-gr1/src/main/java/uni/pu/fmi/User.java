package uni.pu.fmi;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class User {

	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private Set<Order> orders = new HashSet<Order>();

	/**
	 * Default constructor
	 */
	public User() {
	}

	/**
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param usernaem
	 * @return
	 */
	public void setUsername(String usernaem) {
		this.username = usernaem;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param pass
	 * @return
	 */
	public void setPassword(String pass) {
		password = pass;
	}

	/**
	 * @return
	 */
	public Set<Order> getOrders() {
		return orders;
	}

	/**
	 * 
	 * @param orders not NULL instance of {@link Set}
	 */
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	/**
	 * @param orders not NULL {@link Order}
	 */
	public void addOrders(Order order) {
		orders.add(order);
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}