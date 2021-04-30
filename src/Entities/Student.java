package Entities;

public class Student extends User {
	private String password;
	private String address;
	private String cardInfo;

	public Student() {

	}

	public Student(String password, String address, String cardInfo) {
		this.password = password;
		this.address = address;
		this.cardInfo = cardInfo;

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCardInfo() {
		return cardInfo;
	}

	public void setCardInfo(String cardInfo) {
		this.cardInfo = cardInfo;
	}

}
