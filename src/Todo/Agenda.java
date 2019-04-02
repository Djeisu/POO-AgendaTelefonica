package Todo;
import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contact> People;
	
	Agenda(){
		this.setPeople(new ArrayList<Contact>());
	}
	
	Agenda(User u){
		this.setPeople(new ArrayList<Contact>());
	}
	
	public ArrayList<Contact> getPeople() {
		return People;
	}

	public void setPeople(ArrayList<Contact> people) {
		People = people;
	}
	
	//Metodos
	public boolean addAPhoneOfTheList(Contact c) {
		for (int i = 0; i < this.People.size(); i++) {
			if( validInsertPhone(this.People.get(i),c) ){
				this.People.get(i).setPhones(c.getPhones().get(0));
				return true;
			}
		}
		this.People.add(c);
		return true;
	}
	
	public boolean validInsertPhone(Contact c1, Contact c2){
		return c1.getName().equals(c2.getName());
	}
	
	//Comparar pelo nome de telefone puro
	public void removeAContactOfTheList(Contact c) {
		for (int i = 0; i < People.size(); i++) {
			if(People.get(i).getName().equals(c.getName())) {
				System.out.println(People.get(i).getName() + " nao eh mais seu amigo");
				People.remove(i);
			}			
		}
	}
	
	public void showPhoneList() {
		System.out.println("\n -----Seus amigos sao:-----");
		for (Contact contact : People) {
			System.out.println(	"Nome: " + contact.getName() + 
								" Endereco: " + contact.getAddress() + 
								" Telefone: " + contact.getPhoneNumber() +
								" Email: " + contact.getEmailAddress());
		}
	}	
}
