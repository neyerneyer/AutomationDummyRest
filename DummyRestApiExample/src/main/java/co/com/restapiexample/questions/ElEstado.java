package co.com.restapiexample.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("Se verifica en la respuesta del json el status sea success")
public class ElEstado implements Question<String> {
    public static ElEstado esExitoso() {
        return new ElEstado();
    }

    @Override
    public String answeredBy(Actor actor) {
        return SerenityRest.lastResponse().jsonPath().get("status");
    }
}