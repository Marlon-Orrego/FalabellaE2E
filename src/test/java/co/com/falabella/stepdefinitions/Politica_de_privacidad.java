package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.falabella.pages.PaginaPrincipalPage.*;
import static co.com.falabella.pages.PaginaPoliticaDePrivacidad.ACCORDEON_POLITICA_DE_PRIVACIDAD;


public class Politica_de_privacidad {

    @Dado("{actor} se dirige haciendo scroll hasta el botón de Política de privacidad")
    public void ScrollHastaPolíticaDePrivacidad(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(OK_SALTAR),
                Scroll.to(BOTON_POLITICA_DE_PRIVACIDAD)

        );
    }
    @Cuando("{actor} da click a Política de privacidad")
    public void ClickBotonPolíticaDePrivacidad(Actor actor) {
        actor.attemptsTo(
                Click.on(BOTON_POLITICA_DE_PRIVACIDAD)
        );
    }
    @Entonces("{actor} deben de estar todas las Política de Privacidad")
    public void Acordion_PolíticaDePrivacidad(Actor actor) {
        actor.attemptsTo(
                Click.on(OK_SALTAR),
                Ensure.that(ACCORDEON_POLITICA_DE_PRIVACIDAD).textValues().hasSizeGreaterThanOrEqualTo(23)
        );
    }
}

