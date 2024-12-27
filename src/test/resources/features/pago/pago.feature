
@Pago
Feature: Feature: Realizar transacciones en Wompi usando diferentes métodos de pago
  # Format - HU
  Yo como un cliente del sistema de pagos Wompi
  Necesito realizar transacciones utilizando diferentes métodos de pago
  Para poder completar pagos de forma exitosa o manejar errores, dependiendo del saldo y la transacción.


  @HP
  @Regression
  @ID-01
  Scenario Outline: Crear una transacción exitosa
    Given que el usuario se conecta al sistema
    When el usuario consulta los negocios
      | negocio.publica |
      | <llave_publica> |
    And el usuario realiza una transacion
      | negocio.integracion | pago.valor   | pago.moneda   | pago.email   | pago.referencia   | pago.cliente.documento | pago.cliente.nombre-completo | pago.cliente.telefono | pago.cliente.tipo-documento | pago.metodo.tipo   | pago.metodo.telefono   |
      | <llave_integracion> | <valor_pago> | <moneda_pago> | <email_pago> | <referencia_pago> | <documento_pago>       | <nombres_pago>               | <telefono_pago>       | <tipo_documento_pago>       | <tipo_metodo_pago> | <telefono_metodo_pago> |
    And el usuario confirma el estado de la transacción
      | negocio.privada |
      | <llave_privada> |
    #Then he should see "<text>"
    Examples:
      | llave_publica                                 | llave_integracion                                   | llave_privada                                 | valor_pago | moneda_pago | email_pago                | referencia_pago          | documento_pago | nombres_pago     | telefono_pago | tipo_documento_pago | tipo_metodo_pago | telefono_metodo_pago |
      | pub_stagtest_g2u0HQd3ZMh05hsSgTS2lUV8t3s4mOt7 | stagtest_integrity_nAIBuqayW70XpUqJS4qf4STYiISd89Fp | prv_stagtest_5i0ZGIGiFcDQifYsXxvsny7Y37tKqFWg | 2490000    | COP         | yeseniavillamil@gmail.com | {yyMMdd}-{HHmmss}-{###}A | 1144132574     | yesenia villamil | 3128845562    | CC                  | NEQUI            | 3107654321           |


  @HP
  @ID-02
  Scenario: Validar llave publica de autenticación exitosamente
    Given que el usuario se conecta al sistema
    When el usuario consulta los negocios
    Then debería recibirse respuesta exitosa

  @AP
  @ID-03
  Scenario: Validar con una llave publica no exitosa
    Given que el usuario se conecta al sistema
    When el usuario intenta consultar los negocios
    Then no debería recibirse respuesta exitosa


