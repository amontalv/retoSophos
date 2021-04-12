package co.com.prueba.banitsmo.task;

import co.com.prueba.banitsmo.interaction.CambiarVentana;
import co.com.prueba.banitsmo.userinterface.DescargaUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class DescargaDocumento implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(DescargaUser.BTN_ACERCA_NOSOTROS, WebElementStateMatchers.isPresent()),Click.on(DescargaUser.BTN_ACERCA_NOSOTROS),
                Click.on(DescargaUser.INFORMACION_CORPORATIVA),
                Click.on(DescargaUser.BTN_PROVEEDORES),
                Scroll.to(DescargaUser.BTN_DESCARGAR_DOCUMENTO),
                Click.on(DescargaUser.BTN_DESCARGAR_DOCUMENTO));
        actor.attemptsTo(CambiarVentana.deNavegador());
    }

    public static DescargaDocumento conPagina(){
        return Tasks.instrumented(DescargaDocumento.class);
    }
}
