package com.arreglatech.autoconsult.tasks.general;

import com.arreglatech.autoconsult.constans.enums.config.SerenityConf;
import com.arreglatech.autoconsult.models.params.features.customer.CustomerParams;
import com.arreglatech.autoconsult.tasks.services.client.DeleteClient;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

@AllArgsConstructor
public class StarterApp implements Task {

    private CustomerParams params;

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.whoCan(CallAnApi.at(SerenityConf.URL_API_AUTOMATED_CONSULT.getValue()));

        actor.attemptsTo(
                //UpdateCheckpoint.forStep(this.params),
                DeleteClient.user(this.params)

                //Stop.forA(this.waitLoadPage).milliseconds()
        );
    }


    public static StarterApp automatedConsult(CustomerParams params)
    {
       return Tasks.instrumented(
               StarterApp.class,
               params

       );
    }
}
