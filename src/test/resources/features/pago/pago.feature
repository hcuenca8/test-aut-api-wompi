
@Pago
Feature: Pago
  # Format - HU

  @HP
  @Regression
  @ID-XXX
  Scenario Outline: Full Flow Automated Consult
    Given Customer is entering automated consult
    When he carry out the consultation process
      | negocio.publica |
      | <llave_publica> |
    And he carry out the realizar el pago
      | negocio.integracion | pago.valor   | pago.moneda   | pago.email   | pago.referencia   | pago.cliente.documento | pago.cliente.nombre-completo | pago.cliente.telefono | pago.cliente.tipo-documento | pago.metodo.tipo   | pago.metodo.telefono   |
      | <llave_integracion> | <valor_pago> | <moneda_pago> | <email_pago> | <referencia_pago> | <documento_pago>       | <nombres_pago>               | <telefono_pago>       | <tipo_documento_pago>       | <tipo_metodo_pago> | <telefono_metodo_pago> |
    And he carry out the confirmar el pago
      | negocio.privada |
      | <llave_privada> |
    #Then he should see "<text>"
    Examples:
      | llave_publica                                 | llave_integracion                                   | llave_privada                                 | valor_pago | moneda_pago | email_pago                | referencia_pago          | documento_pago | nombres_pago     | telefono_pago | tipo_documento_pago | tipo_metodo_pago | telefono_metodo_pago |
      | pub_stagtest_g2u0HQd3ZMh05hsSgTS2lUV8t3s4mOt7 | stagtest_integrity_nAIBuqayW70XpUqJS4qf4STYiISd89Fp | prv_stagtest_5i0ZGIGiFcDQifYsXxvsny7Y37tKqFWg | 2490000    | COP         | yeseniavillamil@gmail.com | {yyMMdd}-{HHmmss}-{###}A | 1144132574     | yesenia villamil | 3128845562    | CC                  | NEQUI            | 3107654321           |
