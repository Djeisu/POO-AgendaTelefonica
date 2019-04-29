package Core;

public class Phone {
	private int ddd;
	private long number;
	
	public Phone() {}
	
	public Phone(int d, long n) {
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
	
	public String toString() {
		return "(" + this.ddd + ") " + this.number;
	}
	
	public boolean equals(Phone p) {
		return (this.toString()).equalsIgnoreCase(p.toString());
	}
}
