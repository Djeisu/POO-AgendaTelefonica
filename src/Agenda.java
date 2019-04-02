import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contato> People;
	
	Agenda(){
		this.setPeople(new ArrayList<Contato>());
	}
	
	Agenda(User u){
		this.setPeople(new ArrayList<Contato>());
	}
	
	public ArrayList<Contato> getPeople() {
		return People;
	}

	public void setPeople(ArrayList<Contato> people) {
		People = people;
	}
	
	//Metodos
	public boolean addAPhoneOfTheList(Contato c) {
		for (int i = 0; i < this.People.size(); i++) {
			Contato tPeople = this.People.get(i);
			if(tPeople.getName().equals(c.getName())){
				this.People.get(i).setPhones(c.getPhones().get(0));
				return true;
			}
		}
		this.People.add(c);
		return true;
	}
	
	//Comparar pelo numero de telefone puro
	public void removeAContactOfTheList(Contato c) {
		for (int i = 0; i < People.size(); i++) {
			if(People.get(i).getName() == c.getName()) {
				System.out.println(People.get(i).getName() + " nao eh mais seu amigo");
				People.remove(i);
			}			
		}
	}
	
	public void showPhoneList() {
		System.out.println("\n -----Seus amigos sao:-----");
		for (Contato contato : People) {
			System.out.println(	"Nome: " + contato.getName() + 
								" Endereco: " + contato.getAddress() + 
								" Telefone: " + contato.getPhoneNumber() +
								" Email: " + contato.getEmailAddress());
		}
	}	
}
