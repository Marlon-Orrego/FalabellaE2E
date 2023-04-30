package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaCarrito {

    public static Target SCREEN_CARRITO = Target.the("Screen del Carrito Vacio").locatedBy("//div[@class=\"jsx-1224700360 main\"]//div//div//section[@class=\"jsx-2216020937 section-cart empty-cart\"]");

    public static Target BOTON_LOGIN = Target.the("Boton de Login en el Carrito Vacio").locatedBy("//div[@class=\"jsx-1224700360 main\"]//div//div//section[@class=\"jsx-2216020937 section-cart empty-cart\"]//div//button[@data-testid=\"redirect-user-to-login-button\"]");

    public static Target FORMULARIO_LOGIN= Target.the("Formulario del Login en el Carrito Vacio").locatedBy("//div[@id=\"loginWizard-guest-user-content-login-form\"]");



}


