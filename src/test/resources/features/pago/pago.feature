
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
    And he carry out the consultation process
      | negocio.publica | negocio.integracion |
      | <llave_publica> | <llave_integracion> |
    Then he should see "<text>"
    Examples:
      | llave_publica        | llave_integracion  |
      | pub_stagtest_g2u0HQd3ZMh05hsSgTS2lUV8t3s4mOt7   | a4oRK000000nnnJmAYAW   |
