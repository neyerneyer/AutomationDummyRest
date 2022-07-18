package co.com.restapiexample.setup.hook;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class PrepararEscenario {
    @Before
    public void prepararEscenario() {
        setTheStage(new OnlineCast());
    }
}