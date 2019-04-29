package Core.Exceptions;

import Core.Person;

public class ContactNotExistException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContactNotExistException(Person p) {
		super("O contato '" + p.toStringContact() + "' não existe na usa agenda");
	}
}
