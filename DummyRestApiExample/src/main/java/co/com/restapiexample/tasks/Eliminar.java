package co.com.restapiexample.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import static co.com.restapiexample.utilities.Enums.Endpoints.ENDPOINT_DELETE_EMPLOYEE;
import static co.com.restapiexample.utilities.NumeroAleatorio.generarNumero;

public class Eliminar implements Task {
    public static Eliminar unEmpleado() {
        return Tasks.instrumented(Eliminar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Delete.from(ENDPOINT_DELETE_EMPLOYEE.getUri())
                .with(
                        request -> request
                                .pathParam("id", generarNumero())
                )
        );
    }
}