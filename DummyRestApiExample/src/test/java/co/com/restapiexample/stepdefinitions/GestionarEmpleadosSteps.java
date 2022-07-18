package co.com.restapiexample.stepdefinitions;

import co.com.restapiexample.exceptions.ExcepcionGeneral;
import co.com.restapiexample.models.ModeloCrearEmpleado;
import co.com.restapiexample.questions.CodigoDelEstado;
import co.com.restapiexample.questions.ElEstado;
import co.com.restapiexample.questions.LosEmpleados;
import co.com.restapiexample.questions.ValidarMensaje;
import co.com.restapiexample.tasks.Consuta;
import co.com.restapiexample.tasks.Consutar;
import co.com.restapiexample.tasks.CrearEmpleado;
import co.com.restapiexample.tasks.Eliminar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.hamcrest.Matchers;

import java.util.List;

import static co.com.restapiexample.utilities.Enums.Endpoints.ENDPOINT_BASE;
import static co.com.restapiexample.utilities.Enums.Excepciones.*;
import static co.com.restapiexample.utilities.Enums.Numeros.CERO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GestionarEmpleadosSteps {

    @Dado("que {string} consume el dummy rest para gestionar empleados")
    public void queConsumeElDummyRestParaGestionarEmpleados(String actor) {
        theActorCalled(actor).whoCan(CallAnApi.at(ENDPOINT_BASE.getUri()));
    }

    @Cuando("Brandon consulta todos los empleados en el sistema")
    public void brandonConsultaTodosLosEmpleadosEnElSistema() {
        theActorInTheSpotlight().attemptsTo(Consutar.losEmpleados());
    }

    @Entonces("el verifica que el status code es {int} en la respuesta de la peticion")
    public void elVerificaQueElStatusCodeEsEnLaRespuestaDeLaPeticion(Integer exitoso) {
        theActorInTheSpotlight().should(seeThat(CodigoDelEstado.es(), Matchers.comparesEqualTo(exitoso))
                .orComplainWith(ExcepcionGeneral.class, ERROR_CODIGO_ESTATUS.getExcepcion()));
    }

    @Entonces("el observa que los empleados son consultados exitosamente {string}")
    public void elObservaQueLosEmpleadosSonConsultadosExitosamente(String string) {
        theActorInTheSpotlight().should(seeThat(LosEmpleados.sonConsultadosExitosamente(), Matchers.comparesEqualTo(string))
                .orComplainWith(ExcepcionGeneral.class, ERROR_NOMBRE_MENSAJE.getExcepcion()));

    }

    @Cuando("Brandon realiza la creacion de un empleado")
    public void brandonRealizaLaCreacionDeUnEmpleado(List<ModeloCrearEmpleado> datos) {
        theActorInTheSpotlight().attemptsTo(CrearEmpleado.conLos(datos.get(CERO.getNumero())));
    }

    @Entonces("el observa que el status es {string}")
    public void elObservaQueElStatusEs(String string) {
        theActorInTheSpotlight().should(seeThat(ElEstado.esExitoso(), Matchers.comparesEqualTo(string))
                .orComplainWith(ExcepcionGeneral.class, ERROR_NOMBRE_ESTATUS.getExcepcion()));
    }

    @Cuando("Brandon consulta un empleado en el sistema con id {string}")
    public void brandonConsultaUnEmpleadoEnElSistemaConId(String id) {
        theActorInTheSpotlight().attemptsTo(Consuta.empleadoCon(id));
    }

    @Cuando("Brandon elimina un empleado en el sistema")
    public void brandonEliminaUnEmpleadoEnElSistema() {
        theActorInTheSpotlight().attemptsTo(Eliminar.unEmpleado());
    }

    @Entonces("el observa que el mensaje es {string}")
    public void elObservaQueElMensajeEs(String string) {
        theActorInTheSpotlight().should(seeThat(ValidarMensaje.deBorrado(), Matchers.comparesEqualTo(string))
                .orComplainWith(ExcepcionGeneral.class, ERROR_NOMBRE_MENSAJE.getExcepcion()));
    }
}