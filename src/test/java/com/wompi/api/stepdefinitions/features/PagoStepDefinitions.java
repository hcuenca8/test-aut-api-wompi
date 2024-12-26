package com.wompi.api.stepdefinitions.features;


import com.wompi.api.constans.enums.config.SerenityConf;
import com.wompi.api.models.scena.NoteBook;
import com.wompi.api.models.scena.Protagonist;
import com.wompi.api.tasks.ConsultarNegocio;
import com.wompi.api.tasks.RealizarPago;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;


public class PagoStepDefinitions {

    @Given("{actor} is entering automated consult")
    public void identifiedByIsEnteringAutomatedConsult(Actor actor) {

        actor.whoCan(CallAnApi.at(SerenityConf.URL_API_WOMPI.getValue()));
    }

    @When("{actor} carry out the consultation process")
    public void carryOutTheConsultationProcess(Actor actor, NoteBook noteBook) {

        actor.attemptsTo(
                ConsultarNegocio.aliado(noteBook.getParamsNegocio())
        );
    }

    @When("{actor} carry out the realizar el pago")
    public void carryOutThjgfhheConsultationProcess(Actor actor, NoteBook noteBook) {

        actor.attemptsTo(
                RealizarPago.aliado(noteBook.getParamsPago())
        );
    }

    @Then("{actor} should see {string}")
    public void shouldSee(Actor actor, String text) {
        System.out.println("fsdfds");
        Protagonist.review().hisNotebook();

    }
}
