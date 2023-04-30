package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.Console;

import static co.com.falabella.pages.CarritoPage.LIST_CARRITO;
import static co.com.falabella.pages.PaginaPrincipalPage.*;
import static co.com.falabella.pages.PaginaZonaGamer.ZONA_GAMER;


public class PaginaZonaGamer {

    @Dado("{actor} busca la seccion de {string}")
    public void buscarLinkGaming(Actor actor, String seccion) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(OK_SALTAR),
                Ensure.that(SECCION_GAMING).text().isEqualTo(seccion)
        );
    }
    @Cuando("{actor} da click en el link de la seccion de gaming")
    public void daClickAlLink(Actor actor) {
        actor.attemptsTo(
                Click.on(CLICKEAR_LINK_GAMING)
        );
    }
    @Entonces("{actor} esta en la {string}")
    public void estarEnLaZonaGamer(Actor actor, String zona) {
         actor.attemptsTo(
            Click.on(OK_SALTAR),
            Ensure.that(ZONA_GAMER).text().isEqualTo(zona)
         );

    }
}

// throw new io.cucumber.java.PendingException();
