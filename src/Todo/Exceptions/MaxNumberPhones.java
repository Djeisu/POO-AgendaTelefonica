package Todo.Exceptions;

public class MaxNumberPhones extends ScheduleException{
	public MaxNumberPhones() {
		super("Nao eh possivel adicionar mais telefones");
	}
}