package Todo;

public class Phone {
	private int ddd;
	private long number;
	
	Phone(){}
	
	Phone(int d, long n){
		this.setDDD(d);
		this.setNumber(n);
	}

	public int getDDD() {
		return ddd;
	}

	public void setDDD(int ddd) {
		this.ddd = ddd;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}
	
	public String getFullNumber(){
		return "("+this.ddd+")" + " " + this.number + ",";
	}
}
