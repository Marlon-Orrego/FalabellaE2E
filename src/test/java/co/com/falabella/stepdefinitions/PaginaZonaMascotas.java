package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.falabella.pages.PaginaPrincipalPage.*;
import static co.com.falabella.pages.PaginaZonaMascotas.ZONA_MASCOTAS;


public class PaginaZonaMascotas {

    @Dado("{actor} se desplaza a la seccion de {string}")
    public void buscarLinkMascotas(Actor actor, String seccion) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(OK_SALTAR),
                Ensure.that(SECCION_MASCOTAS).text().isEqualTo(seccion)
        );
    }
    @Cuando("{actor} da click en el link de la seccion de Alimentos para mascotas")
    public void daClickAlLinkMascotas(Actor actor) {
        actor.attemptsTo(
                Click.on(CLICKEAR_LINK_MASCOTAS)
        );
    }
    @Entonces("{actor} ya esta en zona {string}")
    public void estarEnLaZonaMascotas(Actor actor, String zona) {
         actor.attemptsTo(
            Click.on(OK_SALTAR),
            Ensure.that(ZONA_MASCOTAS).text().isEqualTo(zona)
         );

    }
}
