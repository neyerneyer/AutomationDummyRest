package co.com.restapiexample.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static co.com.restapiexample.utilities.Enums.Excepciones.ERROR_RUNNER;

@CucumberOptions(
        features = "src/test/resources/features/gestionar_empleados.feature",
        glue = {"co.com.restapiexample.stepdefinitions","co.com.restapiexample.setup"},
        tags = "@E2E",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
@RunWith(CucumberWithSerenity.class)
public class GestionarEmpleados {
    private GestionarEmpleados() {
        throw new IllegalStateException(ERROR_RUNNER.getExcepcion());
    }
}