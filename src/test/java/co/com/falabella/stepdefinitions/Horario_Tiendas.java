package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.falabella.pages.PaginaHorarioTiendas.*;
import static co.com.falabella.pages.PaginaPrincipalPage.*;
import static co.com.falabella.pages.PaginaPoliticaDePrivacidad.ACCORDEON_POLITICA_DE_PRIVACIDAD;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class Horario_Tiendas {

    @Dado("{actor} ingresa a ayuda y selecciona horario de tiendas")
    public void ScrollHastaTerminosYCondiciones(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(OK_SALTAR),
                MoveMouse.to(SECCION_AYUDA),
                Click.on(BOTON_HORARIO_TIENDA)


        );
    }
    @Cuando("{actor} selecciona tiendas Homecenter")
    public void ClickBotonTYC(Actor actor) {
        actor.attemptsTo(
                Click.on(OK_SALTAR),
                Click.on(BOTON_TIENDAHOMECENTER)
        );
    }
    @Entonces("{actor} verifica que aparezca las 24 tiendas")
    public void Acordion_TYC(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(IFRAME_WAIT, isVisible())
        );
    }
}
