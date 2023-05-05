package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetailLocationPage {
    public static Target BOTON_INGRESAR_UBICACION = Target.the("Boton ingresar ubicacion").located(By.id("geofinder-button-open"));

    public static Target INPUT_DEPARTAMENTO = Target.the("Input Departamento").located(By.id("//input[@id='geofinder-input-level1']"));
    public static Target INPUT_CIUDAD = Target.the("Input Ciudad").located(By.id("//input[@id='geofinder-input-level2']"));
    public static Target INPUT_BARRIO = Target.the("Input Barrio").located(By.id("//input[@id='geofinder-input-level1']"));
    public static Target ETIQUETA_UBICACION = Target.the("Etiqueta Ubicacion").locatedBy("//p[@class='Zone-module_zone-lable__25mlT Zone-module_marketplace__2q8h5']");
    public static Target INPUT_DEPARTAMENTO_SELECTED = Target.the("Input Departamento").locatedBy("//li[@class=\"Autocomplete-module_suggestion__3t35l Autocomplete-module_marketplace__2aSi7\" and contains(text(), \"Antioquia\")]");
    public static Target INPUT_CIUDAD_SELECTED = Target.the("Input Ciudad").locatedBy("//li[@class=\"Autocomplete-module_suggestion__3t35l Autocomplete-module_marketplace__2aSi7\" and contains(text(), \"Medellín\")]");
    public static Target INPUT_BARRIO_SELECTED = Target.the("Input Barrio").locatedBy("//li[@class=\"Autocomplete-module_suggestion__3t35l Autocomplete-module_marketplace__2aSi7\" and contains(text(), \"Medellín\")]");

    public static Target BOTON_GUARDAR = Target.the("Input Departamento").located(By.id("geofinder-button-save"));


    public static Target MODAL_LOCATION = Target.the("Input Barrio").located(By.id("//div[@id='zone_modal_wrap']"));


}