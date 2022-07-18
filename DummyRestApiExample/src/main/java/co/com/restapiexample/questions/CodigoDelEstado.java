package co.com.restapiexample.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("Se verifica que el estado sea exitoso con codigo 200")
public class CodigoDelEstado implements Question<Integer> {

    public static CodigoDelEstado es() {
        return new CodigoDelEstado();
    }

    @Override
    public Integer answeredBy(Actor actor) {
        return SerenityRest.lastResponse().getStatusCode();
    }
}