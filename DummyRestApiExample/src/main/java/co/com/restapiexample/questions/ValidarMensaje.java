package co.com.restapiexample.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarMensaje implements Question<String> {
    public static ValidarMensaje deBorrado() {
        return new ValidarMensaje();
    }

    @Override
    public String answeredBy(Actor actor) {
        return SerenityRest.lastResponse().jsonPath().get("message");
    }
}