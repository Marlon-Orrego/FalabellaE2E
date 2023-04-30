package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.falabella.pages.PaginaCarrito.*;
import static co.com.falabella.pages.PaginaPrincipalPage.*;


public class Login_Carro_Vacio {

    @Dado("{actor} comprueba que el boton de Carrito de Compras en la Pagina Inicial")
    public void ComprobarCarrito(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(OK_SALTAR),
                Ensure.that(BOTON_Carrito).isDisplayed(),
                Click.on(BOTON_Carrito)
        );
    }
    @Cuando("{actor} da click al Carrito y te lleva al boton de Iniciar Sesion")
    public void ClickCarrito(Actor actor) {
        actor.attemptsTo(
                Click.on(OK_SALTAR),
                Ensure.that(SCREEN_CARRITO).isDisplayed(),
                Click.on(BOTON_LOGIN)
        );
    }
    @Entonces("{actor} comprueba el boton y sale el formulario")
    public void EstarEnLaPaginaDeLinio(Actor actor) {
        actor.attemptsTo(
                Ensure.that(FORMULARIO_LOGIN).isDisplayed()
        );
    }
}

