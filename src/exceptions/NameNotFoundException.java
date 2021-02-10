package exceptions;

public class NameNotFoundException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public NameNotFoundException(String msg){
        super(msg);
    }
    
}
