package Todo.Exceptions;
public class ScheduleException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3154682415876985355L;
	
	private String msg;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public ScheduleException(String msg){
		super(msg);
	}
	
	public ScheduleException(String msg, Throwable cause){
		super(msg,cause);
	}
	
}