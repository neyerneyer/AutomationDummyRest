package co.com.restapiexample.exceptions;

public class ExcepcionGeneral extends Error {
    private static final long serialVersionUID = 1L;

    public ExcepcionGeneral(String message, Throwable cause) {
        super(message, cause);
    }
}