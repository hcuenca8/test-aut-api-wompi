package com.arreglatech.autoconsult.tasks.services.client;

import com.arreglatech.autoconsult.interactions.waits.Stop;
import com.arreglatech.autoconsult.models.params.features.customer.CustomerParams;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;

@AllArgsConstructor
public class DeleteClient implements Task {

    private CustomerParams params;
    private static final String ENDPOINT = "/api/automated-client";

    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Stop.forA(2).seconds(),

                Delete.from(ENDPOINT)
                        .with(request -> request
                                .header("accept", "*/*")
                                .queryParam("id", this.params.getId())
                        )
        );
    }

    public static DeleteClient user(CustomerParams params){
        return Tasks.instrumented(
                DeleteClient.class,
                params
        );
    }
}