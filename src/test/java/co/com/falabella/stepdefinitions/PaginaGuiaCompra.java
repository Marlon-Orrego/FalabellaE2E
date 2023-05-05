package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.falabella.pages.PaginaPrincipalPage.BOTON_FALABELLA_SELL;
import static co.com.falabella.pages.PaginaVendeFalabella.IMAGE_FALABELLA_SELL;
import static co.com.falabella.pages.PaginaPrincipalPage.OK_SALTAR;


public class PaginaGuiaCompra {
    @Cuando("{actor} da click en vende en falabella")
    public void daClickEnFalabellaVender(Actor actor) {
        actor.attemptsTo(
                Click.on(BOTON_FALABELLA_SELL),
                Click.on(OK_SALTAR)
        );
    }
    @Entonces("{actor} esta en la pagina principal de vender en Falabella")
    public void estarEnLaPaginaDeLinio2(Actor actor) {
        actor.attemptsTo(
                Ensure.that(IMAGE_FALABELLA_SELL).isDisplayed()
        );
    }
}

