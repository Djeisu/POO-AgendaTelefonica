package Core;

public class Person {
	private String name;
	private Phone phone;
	private PhoneBook phonebook;
	
	public Person() {
		this.init();
	}
	
	public Person(String n, Phone p) {
		this.init();
		this.setName(n);
		this.setPhone(p);
	}
	
	public void init() {
		this.phone = new Phone();
		this.phonebook = new PhoneBook();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public PhoneBook getPhonebook() {
		return phonebook;
	}

	public void setPhonebook(PhoneBook phonebook) {
		this.phonebook = phonebook;
	}
	
	public String toString() {
		return " Name: " + this.name + ",\n Phone: " + this.phone.toString() + ",\n PhoneBook: " + this.phonebook.toString();
	}
	
	public String toStringContact() {
		return "Name: " + this.name + ", Phone: " + this.phone.toString();
	}
	
	public boolean equals(Person p) {
		return (this.getName()).equalsIgnoreCase(p.getName()) && (this.getPhone()).equals(p.getPhone());
	}
}
