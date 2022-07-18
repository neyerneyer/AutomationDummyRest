package co.com.restapiexample.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import static net.serenitybdd.rest.SerenityRest.rest;

public class Post implements Interaction {
    private final String resource;
    private final Object body;

    public Post(String resource, Object body) {
        this.resource = resource;
        this.body = body;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        rest()
                .log()
                .all()
                .relaxedHTTPSValidation()
                .body(body)
                .when()
                .post(resource)
                .then()
                .log()
                .all();
    }
    public static Post conBody(String resource, Object body){
        return Tasks.instrumented(Post.class, resource,body);
    }
}