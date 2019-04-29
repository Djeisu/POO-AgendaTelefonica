package Core;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello");
		Phone p1 = new Phone(84, 991472138);
		Person person1 = new Person("Djheyson",p1);
		
		Phone p2 = new Phone(85, 981525671);
		Person person2 = new Person("Shirley",p2);
		Phone p3 = new Phone(84, 994718884);
		Person person3 = new Person("Francisco",p3);
		
		Phone p4 = new Phone(84, 994711111);
		Person person4 = new Person("Ticiana",p4);
		
		try {
			person1.getPhonebook().addContact(person2);
			person1.getPhonebook().addContact(person3);
			person1.getPhonebook().removeContact(person2);
			person1.getPhonebook().removeContact(person4);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println(person1.toString());
	}
}
