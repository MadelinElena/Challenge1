package conversordemoneda.excepcion;

public class ErrorEnConversionDeTasaException extends RuntimeException {
    private String mensaje;

    public ErrorEnConversionDeTasaException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
