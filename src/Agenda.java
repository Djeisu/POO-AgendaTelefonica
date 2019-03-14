import java.util.ArrayList;

public class Agenda {
	private User user;
	private ArrayList<Contato> Phones;
	
	Agenda(){
		this.setPhones(new ArrayList<Contato>());
	}
	
	Agenda(User u){
		this.setUser(u);
		this.setPhones(new ArrayList<Contato>());
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ArrayList<Contato> getPhones() {
		return Phones;
	}

	public void setPhones(ArrayList<Contato> phones) {
		Phones = phones;
	}
	
	//M�todos
	public void addAPhoneOfTheList(Contato c) {
		System.out.println(c.getName() + " � um novo amigo");
		this.Phones.add(c);
	}
	
	//Comparar pelo numero de telefone puro
	public void removeAPhoneOfTheList(Contato c) {
		for (int i = 0; i < Phones.size(); i++) {
			if(Phones.get(i).getPhone() == c.getPhone()) {
				System.out.println(Phones.get(i).getName() + " n�o � mais seu amigo");
				Phones.remove(i);
			}			
		}
	}
	
	public void showPhoneList() {
		System.out.println("\n -----Seus amigos s�o:-----");
		for (Contato contato : Phones) {
			System.out.println("Nome: " + contato.getName() + " Endere�o: " + contato.getAddress() + "Phone: " + "(" + contato.getDDD() + ")" + " " + contato.getPhone() + " Email: " + contato.getEmailAddress());
		}
	}
}
