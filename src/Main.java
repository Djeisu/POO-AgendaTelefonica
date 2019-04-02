
public class Main {
	public static void main(String[] args) {
		Agenda a = new Agenda(new User(1,"Djheyson"));
		
		a.addAPhoneOfTheList(new Contato("Djheyson","Rua 123",new Phone(84,999887788),"djheyson@gmail.com"));
		a.addAPhoneOfTheList(new Contato("Djheyson","Rua 123",new Phone(81,999887788),"djheyson@gmail.com"));
		a.addAPhoneOfTheList(new Contato("Ticianna","Rua Ali Da cula",new Phone(85,999887788),"ticianna@gmail.com"));
		a.addAPhoneOfTheList(new Contato("Erivan","Rua da lua",new Phone(86,999887788),"erivan@gmail.com"));
		a.addAPhoneOfTheList(new Contato("Leonardo","Rua boa que so",new Phone(87,999887788),"Leonardo@gmail.com"));
		
		
		a.removeAContactOfTheList(new Contato("Djheyson", new Phone(85,981525671)) );
		
		a.showPhoneList();
	}
}
