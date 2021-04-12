package co.com.prueba.banitsmo.question;

import co.com.prueba.banitsmo.userinterface.DescargaUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarReporteGenerado implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return DescargaUser.PAG_REPORTE.resolveFor(actor).isDisplayed();
    }

    public static ValidarReporteGenerado esCargado() {
        return new ValidarReporteGenerado();
    }
}
