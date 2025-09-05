package exceptions;

public class LibroYaDisponibleException extends RuntimeException {

    public LibroYaDisponibleException(String mensaje) {
        super(mensaje);
    }

}