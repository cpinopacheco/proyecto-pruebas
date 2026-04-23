package com.cristianpino.steps;

import io.cucumber.java.es.*;
import static org.junit.jupiter.api.Assertions.*;

public class LoginSteps {

    private String usuario;
    private String password;
    private boolean acceso;

    @Dado("el usuario está en la página de login")
    public void usuarioEnLogin() {
        // Simulación (no hay UI real)
    }

    @Cuando("ingresa usuario {string} y contraseña {string}")
    public void ingresaCredenciales(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;

        // Lógica simulada
        if ("admin".equals(usuario) && "1234".equals(password)) {
            acceso = true;
        } else if (usuario == null || usuario.isEmpty() || password == null || password.isEmpty()) {
            acceso = false;
        } else {
            acceso = false;
        }
    }

    @Entonces("el sistema permite el acceso")
    public void accesoPermitido() {
        assertTrue(acceso);
    }

    @Entonces("el sistema muestra un mensaje de error")
    public void accesoDenegado() {
        assertFalse(acceso);
    }
}