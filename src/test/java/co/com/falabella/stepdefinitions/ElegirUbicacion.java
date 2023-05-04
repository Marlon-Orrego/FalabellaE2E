package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.Collections;

import static co.com.falabella.pages.DetailLocationPage.INPUT_CIUDAD;
import static co.com.falabella.pages.DetailLocationPage.INPUT_BARRIO;
import static co.com.falabella.pages.DetailLocationPage.INPUT_DEPARTAMENTO;
import static co.com.falabella.pages.DetailLocationPage.BOTON_INGRESAR_UBICACION;
import static co.com.falabella.pages.DetailLocationPage.ETIQUETA_UBICACION;
import static co.com.falabella.pages.DetailLocationPage.MODAL_LOCATION;

import static co.com.falabella.pages.PaginaHorarioTiendas.IFRAME_WAIT;
import static co.com.falabella.pages.PaginaPrincipalPage.OK_SALTAR;
import static co.com.falabella.pages.PaginaPrincipalPage.SECCION_AYUDA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ElegirUbicacion {

    @Dado("{actor} se dirige a elegir ubicacion")
    public void ubicarElegirUbicacion(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(OK_SALTAR),
                MoveMouse.to(BOTON_INGRESAR_UBICACION),
                Click.on(BOTON_INGRESAR_UBICACION)

        );
    }

    @Cuando("{actor} elige como departamento {string}, ciudad {string}, y barrio {string}")
    public void buscarBarra(Actor actor, String departamento, String ciudad, String barrio) {
        actor.attemptsTo(
                Ensure.that(MODAL_LOCATION).isDisplayed(),
                Enter.theValue(departamento).into(INPUT_DEPARTAMENTO),
                Enter.theValue(ciudad).into(INPUT_CIUDAD),
                Enter.theValue(barrio).into(INPUT_BARRIO)
        );
    }

    @Entonces("{actor} visualiza que se {string}")
    public void buscarXCantidadProductosEnElCarrito(Actor actor, String ciudad_entrega) {
        actor.attemptsTo(
                Ensure.that(ETIQUETA_UBICACION).text().isEqualTo(ciudad_entrega)
        );
    }

}
