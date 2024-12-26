
@Pago
Feature: Pago
  # Format - HU

  @HP
  @Regression
  @ID-XXX
  Scenario Outline: Full Flow Automated Consult
    Given Customer is entering automated consult
    When he carry out the consultation process
      | negocio.publica | negocio.integracion |
      | <llave_publica> | <llave_integracion> |
    And he carry out the realizar el pago
      | pago.valor   | pago.moneda   | pago.email   | pago.referencia   | pago.cliente.documento | pago.cliente.nombre-completo | pago.cliente.telefono | pago.cliente.tipo-documento | pago.metodo.tipo   | pago.metodo.telefono   |
      | <valor_pago> | <moneda_pago> | <email_pago> | <referencia_pago> | <documento_pago>       | <nombres_pago>               | <telefono_pago>       | <tipo_documento_pago>       | <tipo_metodo_pago> | <telefono_metodo_pago> |
    Then he should see "<text>"
    Examples:
      | llave_publica                                 | llave_integracion    | valor_pago | moneda_pago | email_pago                | referencia_pago | documento_pago | nombres_pago | telefono_pago | tipo_documento_pago | tipo_metodo_pago | telefono_metodo_pago |
      | pub_stagtest_g2u0HQd3ZMh05hsSgTS2lUV8t3s4mOt7 | a4oRK000000nnnJmAYAW | 2490000    | COP         | yeseniavillamil@gmail.com | prueba1a        |1144132574      |yesenia villamil|3128845562   |CC                   |NEQUI             |3107654321            |
