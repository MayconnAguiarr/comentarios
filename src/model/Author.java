package model;

public class Author {

	private String name;
	private String nickname;
	private String email;

	public Author(String name, String nickname, String email) {
		this.name = name;
		this.nickname = nickname;
		this.email = email;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getnickname() {
		return nickname;
	}

	public void setnickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
}
