

package com.dev.proj.ARSDTO;

public class UserDTO {

	private int userId;
	private String username ;
	private String password ;
	private String role ;
	private long phoneNumber;
	private String email;
	public UserDTO(int userId, String username, String password, String role, long phoneNumber, String email) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.role = role;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
		
}