package model;

public class Author {

	private String name;
	private String nickname;
	private String email;

	public Author() {
		name = "Ewerton Coimbra";
		nickname = "Coimbra";
		email = "Ecoimbra@gmail.com";
	}

	public String getname() {
		return name;
	}

	public String getnickname() {
		return nickname;
	}

	public String getEmail() {
		return email;
	}
}
