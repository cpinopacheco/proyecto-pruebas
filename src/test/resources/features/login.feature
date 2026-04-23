Feature: Login de usuario

  Scenario: Login exitoso con credenciales válidas
    Given el usuario está en la página de login
    When ingresa usuario "admin" y contraseña "1234"
    Then el sistema permite el acceso

  Scenario Outline: Login inválido con diferentes credenciales
    Given el usuario está en la página de login
    When ingresa usuario "<usuario>" y contraseña "<password>"
    Then el sistema muestra un mensaje de error

    Examples:
      | usuario | password |
      | admin   | 0000     |
      |         | 1234     |
      | admin   |          |