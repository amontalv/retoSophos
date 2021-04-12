package co.com.prueba.retobanitsmo.stepdefinitions;

import co.com.prueba.banitsmo.utils.Constantes;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class Hook {

    @Before
    public static void inicializarActor(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el (.*) ingresa en la aplicacion$")
    public void queElUsuarioIngresaEnLaAplicacion(String actor) {
        OnStage.theActorCalled(actor).wasAbleTo(Open.url(Constantes.URL));
    }
}
