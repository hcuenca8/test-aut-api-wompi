package com.wompi.api.stepdefinitions.features;


import com.wompi.api.constans.enums.config.SerenityConf;
import com.wompi.api.models.scena.NoteBook;
import com.wompi.api.models.scena.Protagonist;
import com.wompi.api.tasks.ConfirmarPago;
import com.wompi.api.tasks.ConsultarNegocio;
import com.wompi.api.tasks.RealizarPago;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;


public class PagoStepDefinitions {

    @Given("que el {actor} se conecta al sistema")
    public void elUsuarioSeConectaAlSistema(Actor actor) {

        actor.whoCan(CallAnApi.at(SerenityConf.URL_API_WOMPI.getValue()));
    }

    @When("el {actor} consulta los negocios")
    public void elUsuarioConsultaLosNegocios(Actor actor, NoteBook noteBook) {

        actor.attemptsTo(
                ConsultarNegocio.aliado(noteBook.getParamsNegocio())
        );
    }

    @When("el {actor} realiza una transacion")
    public void elUsuarioRealizaUnaTransacion(Actor actor, NoteBook noteBook) {

        actor.attemptsTo(
                RealizarPago.aliado(noteBook.getParamsPago())
        );
    }

    @When("el {actor} confirma el estado de la transacción")
    public void elUsuarioConfirmaElEstadoDeLaTransacción(Actor actor, NoteBook noteBook) {

        actor.attemptsTo(
                ConfirmarPago.aliado(noteBook.getParamsPago())
        );
    }

    @Then("{actor} should see {string}")
    public void shouldSee(Actor actor, String text) {
        System.out.println("fsdfds");
        Protagonist.review().hisNotebook();

    }
}
