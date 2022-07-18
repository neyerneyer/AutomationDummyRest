package co.com.restapiexample.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.restapiexample.utilities.Enums.Endpoints.ENDPOINT_GET_EMPLOYEE;

public class Consuta implements Task {
    private final String id;

    public Consuta(String id) {
        this.id = id;
    }

    public static Consuta empleadoCon(String id) {
        return Tasks.instrumented(Consuta.class, id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(ENDPOINT_GET_EMPLOYEE.getUri())
                        .with(
                                request -> request
                                        .pathParam("id", id)
                        ));
    }
}