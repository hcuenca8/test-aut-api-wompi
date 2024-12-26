//package com.arreglatech.autoconsult.tasks.services.checkpoint;
//
//import com.arreglatech.autoconsult.models.params.features.negocio.NegocioParams;
//import lombok.AllArgsConstructor;
//import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Task;
//import net.serenitybdd.screenplay.Tasks;
//import net.serenitybdd.screenplay.rest.interactions.Patch;
//@AllArgsConstructor
//public class UpdateCheckpoint implements Task {
//
//    private NegocioParams params;
//    private static final String ENDPOINT = "/api/automated-client";
//
//    public <T extends Actor> void performAs(T actor)
//    {
////        APIsEnum.APIS_AUTOMATED_CONSULT.executeCurl("checkpoint.patch",
////                this.params.getId(),
////                this.params.getParamsCheckpoint().getStep()
////        );
//
//        actor.attemptsTo(
//                Patch.to(ENDPOINT)
//                        .with(request -> request
//                                .header(
//                                        "accept", "*/*",
//                                        "Content-Type","application/json"
//                                )
//                                .body("{ " +
//                                        "    \"id\": \""+this.params.getId()+"\", " +
//                                        "    \"checkpoint\": \""+this.params.getParamsCheckpoint().getStep()+"\" " +
//                                        "}")
//                                //.queryParam("id", this.params.getId())
//                                //.queryParam("checkpoint",this.params.getParamsCheckpoint().getStep())
//                        )
//        );
//    }
//
//    public static UpdateCheckpoint forStep(NegocioParams params){
//        return Tasks.instrumented(
//                UpdateCheckpoint.class,
//                params
//        );
//    }
//}