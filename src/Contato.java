import java.util.ArrayList;

public class Contato {
	private String name;
	private String address;
	private ArrayList<Phone> phones;
	private String emailAddress;
	
	Contato(){
		this.phones = new ArrayList<Phone>();
	}
	
	Contato(Phone p){
		this.phones = new ArrayList<Phone>();
		this.setPhones(p);
	}
	
	Contato(String n, Phone p){
		this.name = n;
		this.phones = new ArrayList<Phone>();
		this.setPhones(p);
	}
	
	Contato(String n, String a,Phone p, String ea){
		this.phones = new ArrayList<Phone>();
		this.setName(n);
		this.setAddress(a);
		this.setPhones(p);
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

	public void setPhones(Phone p){
		Phone tPhone = new Phone(p.getDdd(),p.getNumber());
		this.phones.add(tPhone);			
	}
	
	public String getPhoneNumber(){
		String p = "";
		for (Phone ph : this.phones) {
			p += ph.getFullNumber() + " ";
		}
		return p;
	}
	
	public ArrayList<Phone> getPhones() {
		return this.phones;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
