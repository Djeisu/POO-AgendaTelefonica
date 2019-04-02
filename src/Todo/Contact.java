package Todo;
import java.util.ArrayList;
import Todo.Exceptions.TestException;

public class Contact {
	private String name;
	private String address;
	private ArrayList<Phone> phones;
	private String emailAddress;
	private TestException ex;
	
	Contact(){
		this.ex = new TestException();
		this.phones = new ArrayList<Phone>();
	}
	
	Contact(String n){
		this.ex = new TestException();
		this.setName(n);
	}
	
	Contact(Phone p){
		this.ex = new TestException();
		this.phones = new ArrayList<Phone>();
		this.setPhones(p);
	}
	
	Contact(String n, Phone p){
		this.ex = new TestException();
		this.name = n;
		this.phones = new ArrayList<Phone>();
		this.setPhones(p);
	}
	
	Contact(String n, String a,Phone p, String ea){
		this.ex = new TestException();
		this.phones = new ArrayList<Phone>();
		this.setName(n);
		this.setAddress(a);
		this.setEmailAddress(ea);		
		this.setPhones(p);
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
		try{
			this.ex.MaxNumberPhones(this.getPhones().size());
			Phone tPhone = new Phone(p.getDDD(),p.getNumber());
			this.phones.add(tPhone);			
		}catch(Exception e){
			System.out.println(e);
		}
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
