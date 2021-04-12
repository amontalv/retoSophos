package co.com.prueba.retobanitsmo.stepdefinitions;

import co.com.prueba.banitsmo.question.ValidarReporteGenerado;
import co.com.prueba.banitsmo.task.DescargaDocumento;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class DescargaStepDefinitions {


    @Cuando("^el busca el documento de tratamiento de datos personales$")
    public void elBuscaElDocumentoDeTratamientoDeDatosPersonales() {
        OnStage.theActorInTheSpotlight().attemptsTo(DescargaDocumento.conPagina());
    }

    @Entonces("^el valida que el documento se encuentre descargado$")
    public void elValidaQueElDocumentoSeEncuentreDescargado() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidarReporteGenerado.esCargado())
        );
    }
}
