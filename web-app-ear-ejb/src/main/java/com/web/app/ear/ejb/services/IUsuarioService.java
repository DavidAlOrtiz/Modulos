package com.web.app.ear.ejb.services;

import com.web.app.ear.ejb.entity.Usuario;
import jakarta.ejb.Local;
import java.util.List;

@Local
public interface IUsuarioService {
    List<Usuario> getUsuarios();
}
