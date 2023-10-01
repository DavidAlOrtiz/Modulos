package com.web.app.ear.ejb.services;

import com.web.app.ear.ejb.entity.Usuario;
import com.web.app.ear.ejb.repository.IUsuariosRespository;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import java.util.List;

//Definiendo el EJB
@Stateless
public class UsuarioServiceImp implements IUsuarioService{

    @Inject
    private IUsuariosRespository repositorio;
    
    @Override
    public List<Usuario> getUsuarios() {
        return repositorio.listUsuario();
    }
    
}
