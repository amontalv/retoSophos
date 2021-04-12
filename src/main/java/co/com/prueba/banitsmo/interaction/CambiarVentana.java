package co.com.prueba.banitsmo.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.ArrayList;

public class CambiarVentana implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        ArrayList<String> pestanasNavegador = new ArrayList<String>(BrowseTheWeb.as(actor).getDriver().getWindowHandles());
        BrowseTheWeb.as(actor).getDriver().switchTo().window(pestanasNavegador.get(1));
    }

    public static CambiarVentana deNavegador() {
        return Tasks.instrumented(CambiarVentana.class);
    }
}
