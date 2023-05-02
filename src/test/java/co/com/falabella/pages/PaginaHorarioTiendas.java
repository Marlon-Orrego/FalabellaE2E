package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaHorarioTiendas {

    public static Target BOTON_TIENDAHOMECENTER = Target.the("Boton de horarios de las tiendas de homecenter").locatedBy("//a[@href=\"https://homecenter.falabella.com.co/homecenter-co/page/NuestrasTiendas\"]");

    public static Target IFRAME_WAIT = Target.the("Esperar el iframe").located(By.id("__next"));


}
