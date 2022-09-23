package model.exeptions;

public class BusinessExecption extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public BusinessExecption(String msg) {
		super(msg);
	}
}
