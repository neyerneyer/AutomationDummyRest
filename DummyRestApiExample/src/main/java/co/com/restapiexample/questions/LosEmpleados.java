package co.com.restapiexample.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("Se valida el mensaje que fueron consultados exitosamente")
public class LosEmpleados implements Question<String> {
    public static Question<String> sonConsultadosExitosamente() {
        return new LosEmpleados();
    }

    @Override
    public String answeredBy(Actor actor) {
        return SerenityRest.lastResponse().jsonPath().get("message");
    }
}