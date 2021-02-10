package exceptions;

public class NameNotAddedException extends RuntimeException{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    

    public NameNotAddedException(String msg){
        super(msg);
    }
}
