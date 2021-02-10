package exceptions;

public class EmptyNameException extends RuntimeException{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    public EmptyNameException(String msg){
        super(msg);
    }
}
