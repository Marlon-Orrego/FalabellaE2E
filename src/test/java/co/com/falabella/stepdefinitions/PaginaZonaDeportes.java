package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.falabella.pages.PaginaPrincipalPage.*;
import static co.com.falabella.pages.PaginaZonaDeportes.ZONA_DEPORTES;



public class PaginaZonaDeportes {

    @Dado("{actor} busca la sección de {string}")
    public void buscarLinkDeportes(Actor actor, String seccion) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(OK_SALTAR),
                Ensure.that(SECCION_DEPORTES).text().isEqualTo(seccion)
        );
    }
    @Cuando("{actor} da click en el link de la sección de Deportes")
    public void daClickAlLink(Actor actor) {
        actor.attemptsTo(
                Click.on(CLICKEAR_LINK_DEPORTES)
        );
    }
    @Entonces("{actor} esta en la {string}")
    public void estarEnLaZonaDeportes(Actor actor, String zona) {
         actor.attemptsTo(
            Click.on(OK_SALTAR),
            Ensure.that(ZONA_DEPORTES).text().isEqualTo(zona)
         );

    }
}

// throw new io.cucumber.java.PendingException();
