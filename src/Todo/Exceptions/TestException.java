package Todo.Exceptions;

public class TestException  {
	public void MaxNumberPhones(int n) throws MaxNumberPhones{
		if(n >= 4)
			throw new MaxNumberPhones();
	}
}
