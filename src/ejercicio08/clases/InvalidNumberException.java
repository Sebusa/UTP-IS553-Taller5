package ejercicio08.clases;

public class InvalidNumberException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public InvalidNumberException(){}
    public InvalidNumberException(String texto){
        super(texto);
    }
}
