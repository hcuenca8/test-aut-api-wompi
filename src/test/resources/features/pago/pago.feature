
@Pago
Feature: Pago
  # Format - HU

  @HP
  @Regression
  @ID-XXX
  Scenario Outline: Full Flow Automated Consult
    Given Customer is entering automated consult
      | customer.id   | customer.checkpoint.step |
      | <id_customer> | Home                     |
    When he carry out the consultation process
      | header.language | meet.name       | meet.location   | meet.important                   | customer.mail                      |
      | <language>      | <name_customer> | <meet_location> | <meet_important> <name_customer> | hector.cuenca@abogadaalexandra.com |
    Then he should see "<text>"
    Examples:
      | id_customer        | name_customer  | mail_customer                      | language | meet_location | meet_important                     | text                           |
      | a4oRK000000AJmAYAW | Cliente OK    | hector.cuenca@abogadaalexandra.com | SPA      | Seattle       | Test Calendly - Automated Consult: | ¡Estamos listos para servirle!     |
      #| a4oRK000000AI8XYAW | Cliente OK    | hector.cuenca@abogadaalexandra.com | SPA      | Seattle       | Test Calendly - Automated Consult: | ¡Estamos listos para servirle!     |
      #| a4oRK000000AIJpYAO | Cliente OK    | hector.cuenca@abogadaalexandra.com | SPA      | Seattle       | Test Calendly - Automated Consult: | ¡Estamos listos para servirle!     |
      #| a4oRK0000009vblYAA | Cliente OK    | hector.cuenca@abogadaalexandra.com | SPA      | Seattle       | Test Calendly - Automated Consult: | ¡Estamos listos para servirle!     |