
public class DTO {       
	/* 1) DTO---->> Data Transfer Object
	 * 2) It use to transfer the data from database to helper
	 * 3) DTO basically use for Setters and Getters
	 */
	String userName;
	String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
