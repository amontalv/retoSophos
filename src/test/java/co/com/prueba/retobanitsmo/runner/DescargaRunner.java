package co.com.prueba.retobanitsmo.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {
                "src/test/resources/co.com.prueba.retobanitsmo/descarga.feature"
        },
        glue = {"co.com.prueba.retobanitsmo.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class DescargaRunner {
}
