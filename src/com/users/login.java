package com.users;

import java.util.ArrayList;
import java.util.List;

public class login {
    private List<User> usuarios;

    public login() {
        this.usuarios = new ArrayList<>();
    }

    public void registrar(User usuario) {
        usuarios.add(usuario);
    }

    public boolean iniciarSesion(String apodo, String correo) {
        for (User usuario : usuarios) {
            if (usuario.getNickname().equals(apodo) && usuario.getEmail().equals(correo)) {
                return true;
            }
        }
        return false;
    }
}