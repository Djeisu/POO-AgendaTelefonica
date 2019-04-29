package Core;

import java.util.ArrayList;
import java.util.List;

import Core.Exceptions.ContactHasExistException;
import Core.Exceptions.ContactNotExistException;

public class PhoneBook {
	private List<Person> persons;
	
	public PhoneBook() {
		this.persons = new ArrayList<Person>();
	}
	
	public PhoneBook(List<Person> per) {
		this.persons = per;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
	public void addContact(Person p) throws ContactHasExistException{
		if(this.contactExist(p) != null)
			throw new ContactHasExistException(p);
		
		this.persons.add(p);
	}
	
	public void removeContact(Person p) throws ContactNotExistException{
		if(!this.persons.remove(this.contactExist(p)))
			throw new ContactNotExistException(p);
	}
	
	public Person contactExist(Person p) {
		for (int i = 0; i < this.persons.size(); i++)
			if(this.persons.get(i).equals(p))
				return this.persons.get(i);
		
		return null;
	}
	
	public String toString() {
		String temp = "";
		for (Person person : this.persons) {
			temp += person.toStringContact() + "; ";
		}
		return temp;
	}
}
