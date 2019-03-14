
public class Contato {
	private String name;
	private String address;
	private int ddd;
	private long phone;
	private String emailAddress;
	
	Contato(){
		
	}
	
	Contato(int d, long p){
		this.setDDD(d);
		this.setPhone(p);
	}
	
	Contato(String n, String a,int d, long p, String ea){
		this.setName(n);
		this.setAddress(a);
		this.setDDD(d);
		this.setPhone(p);
		this.setEmailAddress(ea);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getDDD() {
		return ddd;
	}

	public void setDDD(int ddd) {
		this.ddd = ddd;
	}
}
