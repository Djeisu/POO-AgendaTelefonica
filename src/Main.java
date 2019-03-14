
public class Main {
	public static void main(String[] args) {
		Agenda a = new Agenda(new User(1,"Djheyson"));
		
		a.addAPhoneOfTheList(new Contato("Djheyson","Rua 123",85,981525671,"djheyson@gmail.com"));
		a.addAPhoneOfTheList(new Contato("Ticianna","Rua Ali Da cula",85,999887788,"ticianna@gmail.com"));
		a.addAPhoneOfTheList(new Contato("Erivan","Rua da lua",85,981005650,"erivan@gmail.com"));
		a.addAPhoneOfTheList(new Contato("Leonardo","Rua boa que só",85,985520670,"Leonardo@gmail.com"));
		a.removeAPhoneOfTheList(new Contato(85,981525671));
		
		
		a.showPhoneList();
	}
}
