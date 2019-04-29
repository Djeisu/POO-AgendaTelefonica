package Core.Exceptions;

import Core.Person;

public class ContactHasExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContactHasExistException(Person p) {
		super("O contato '" + p.toStringContact() + "' já existe");
	}
}