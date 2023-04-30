package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.falabella.pages.PaginaFalabella.IMAGE_FALABELLA;
import static co.com.falabella.pages.PaginaPrincipalPage.*;


public class PaginaFalabella {

    @Dado("{actor} comprueba que el boton Falabella aparezca en la pagina principal")
    public void buscarElMenu(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(OK_SALTAR),
                Ensure.that(BOTON_FALABELLA).isDisplayed()

        );
    }
    @Cuando("{actor} da click en el Falabella")
    public void daClickEnLinio(Actor actor) {
        actor.attemptsTo(
                Click.on(BOTON_FALABELLA),
                Click.on(OK_SALTAR)
        );
    }
    @Entonces("{actor} esta en la pagina principal de Falabella")
    public void estarEnLaPaginaDeLinio(Actor actor) {
        actor.attemptsTo(
                Ensure.that(IMAGE_FALABELLA).isDisplayed()
        );
    }
}

