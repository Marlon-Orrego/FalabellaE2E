package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipalPage {
    public static Target CLICKEAR_LINK_DEPORTES = Target.the("Clickear link").locatedBy("//div[@id=\"main-CollapsedCards-8e7c2335-e558-40db-b15f-aebc1eb55240-desktop-card-2\"]//a[@data-testid=\"card-link\"]");
    public static Target OK_SALTAR = Target.the("Saltar").located(By.id("testId-onboarding-desktop-skip"));

    public static Target SECCION_DEPORTES = Target.the("Busca el link de Deportes").locatedBy("//div[@id=\"main-CollapsedCards-8e7c2335-e558-40db-b15f-aebc1eb55240-desktop-card-2\"]//a//div//div[@class=\"w-100 Card-module_title__Hv8yR Card-module_title-16__KDT3e\"]");

    public static Target BOTON_FALABELLA = Target.the("Boton de Falabella").locatedBy("//a[@href=\"https://tienda.falabella.com.co/falabella-co\"]");

    public static Target  BOTON_POLITICA_DE_PRIVACIDAD= Target.the("Boton de Política de Privacidad").locatedBy("//a[@href=\"https://www.falabella.com.co/falabella-co/page/politica-de-tratamientos-de-datos-personales\"]");

    public static Target  SECCION_AYUDA= Target.the("Seccion de ayuda").located(By.id("testId-extra-links-dropdown-4"));

    public static Target  BOTON_HORARIO_TIENDA= Target.the("Boton de horario de las tiendas").located(By.id("testId-bottom-header-links-4-2"));


}