package co.com.restapiexample.tasks;

import co.com.restapiexample.interactions.Post;
import co.com.restapiexample.models.ModeloCrearEmpleado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.restapiexample.utilities.Enums.Endpoints.ENDPOINT_POST_CREATE_EMPLOYEE;

public class CrearEmpleado implements Task {
    ModeloCrearEmpleado modeloCrearEmpleado;

    public CrearEmpleado(ModeloCrearEmpleado modeloCrearEmpleado) {
        this.modeloCrearEmpleado = modeloCrearEmpleado;
    }

    public static CrearEmpleado conLos(ModeloCrearEmpleado modeloCrearEmpleado) {
        return Tasks.instrumented(CrearEmpleado.class, modeloCrearEmpleado);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.conBody(ENDPOINT_POST_CREATE_EMPLOYEE.getUri(), modeloCrearEmpleado.body()));
    }
}