package by.htp.part03.block11.criteria.task01.service;

public class ServiceException extends Exception {

	public ServiceException() {
		super();
	}
	
	public ServiceException(Exception e) {
		super(e);
	}
	
	public ServiceException(String s) {
		super(s);
	}
}
