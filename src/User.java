
public class User {
	private int id;
	private String name;
	
	public User(int i, String n) {
		this.setId(i);
		this.setNome(n);
	}
	
	public String getNome() {
		return name;
	}
	public void setNome(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
