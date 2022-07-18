package co.com.restapiexample.utilities.Enums;

public enum Excepciones {
    ERROR_CODIGO_ESTATUS("El codigo de respuesta del servicio no es el esperado"),
    ERROR_NOMBRE_ESTATUS("El status de respuesta del servicio no es el esperado"),
    ERROR_NOMBRE_MENSAJE("El mensaje de respuesta del servicio no es el esperado"),
    ERROR_RUNNER("El runner no logro iniciar");

    String excepcion;

    Excepciones(String excepcion) {
        this.excepcion = excepcion;
    }

    public String getExcepcion() {
        return excepcion;
    }
}