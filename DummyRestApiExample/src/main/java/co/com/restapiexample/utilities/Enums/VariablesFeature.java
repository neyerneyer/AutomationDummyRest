package co.com.restapiexample.utilities.Enums;

public enum VariablesFeature {
    NOMBRE("name"),
    SALARIO("salary"),
    EDAD("age");

    private final String valor;

    VariablesFeature(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}