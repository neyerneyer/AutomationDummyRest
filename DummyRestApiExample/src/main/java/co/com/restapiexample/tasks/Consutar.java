package co.com.restapiexample.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.restapiexample.utilities.Enums.Endpoints.ENDPOINT_GET_EMPLOYEES;

public class Consutar implements Task {
    public static Consutar losEmpleados() {
        return Tasks.instrumented(Consutar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(ENDPOINT_GET_EMPLOYEES.getUri()));
    }
}