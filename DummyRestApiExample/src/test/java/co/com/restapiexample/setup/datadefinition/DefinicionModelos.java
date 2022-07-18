package co.com.restapiexample.setup.datadefinition;

import co.com.restapiexample.models.ModeloCrearEmpleado;
import io.cucumber.java.DataTableType;

import java.util.Map;

import static co.com.restapiexample.utilities.Enums.VariablesFeature.*;

public class DefinicionModelos {
    @DataTableType
    public ModeloCrearEmpleado crearEmpleadoEntry(Map<String, String> entry) {
        return new ModeloCrearEmpleado(
                entry.get(NOMBRE.getValor()),
                entry.get(SALARIO.getValor()),
                entry.get(EDAD.getValor())
        );
    }
}