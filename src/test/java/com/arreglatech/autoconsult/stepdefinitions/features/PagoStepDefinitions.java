package com.arreglatech.autoconsult.stepdefinitions.features;


import com.arreglatech.autoconsult.constans.enums.config.SerenityConf;
import com.arreglatech.autoconsult.models.scena.NoteBook;
import com.arreglatech.autoconsult.tasks.services.client.DeleteClient;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;


public class PagoStepDefinitions {

    @Given("{actor} is entering automated consult")
    public void identifiedByIsEnteringAutomatedConsult(Actor actor, NoteBook noteBook) {
        actor.whoCan(CallAnApi.at(SerenityConf.URL_API_AUTOMATED_CONSULT.getValue()));
    }

    @When("{actor} carry out the consultation process")
    public void carryOutTheConsultationProcess(Actor actor, NoteBook noteBook) {

        actor.attemptsTo(
                DeleteClient.user(noteBook.getParamsCustomer())
        );
    }

    @Then("{actor} should see {string}")
    public void shouldSee(Actor actor, String text) {
        System.out.println("fsdfds");

    }
}
