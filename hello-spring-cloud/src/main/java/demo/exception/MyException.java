package demo.exception;

public class MyException extends RuntimeException{

	private static final long serialVersionUID = -862708951896309344L;
	
	private String errCode;
	private String errMsg;
	
    public MyException(String errCode, String errMsg){
    	super(errCode+":"+errMsg);
    	this.errCode=errCode;
    	this.errMsg=errMsg;
    }
    
    public String toString(){
    	return errCode+","+errMsg;
    }
}
