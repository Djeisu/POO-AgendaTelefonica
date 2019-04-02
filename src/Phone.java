
public class Phone {
	private int ddd;
	private long number;
	
	Phone(){
		
	}
	
	Phone(int d, long n){
		this.setDdd(d);
		this.setNumber(n);
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}
	
	public String getFullNumber(){
		return "("+this.ddd+")" + " " + this.number;
	}
}
