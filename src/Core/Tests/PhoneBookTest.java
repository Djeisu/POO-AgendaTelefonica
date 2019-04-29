package Core.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;

import Core.Person;
import Core.Phone;
import Core.Exceptions.ContactHasExistException;
import Core.Exceptions.ContactNotExistException;

class PhoneBookTest {
	
	@Rule
    public Person person = new Person("person", new Phone(99,999999999));
	public Person person2 = new Person("person2", new Phone(99,999999999));
	public Person person3 = new Person("person3", new Phone(99,999999999));
	
	@Test
	void testAddContact() {
		try {
			person.getPhonebook().addContact(person2);			
		}catch (Exception e) {
		}
		assertThrows(ContactHasExistException.class, () -> person.getPhonebook().addContact(person2));
	}

	@Test
	void testRemoveContact() {
		try {
			person.getPhonebook().addContact(person2);			
		}catch (Exception e) {
		}
		assertThrows(ContactNotExistException.class, () -> person.getPhonebook().removeContact(person3));
	}
}
