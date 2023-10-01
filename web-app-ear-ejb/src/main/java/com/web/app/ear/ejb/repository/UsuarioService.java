package com.web.app.ear.ejb.repository;

import com.web.app.ear.ejb.ProducerResources;
import com.web.app.ear.ejb.entity.Usuario;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import java.util.List;

//Registrando en el contenedor para poder inyectar los registros

@RequestScoped
public class UsuarioService implements IUsuariosRespository {

    @Inject
    private ProducerResources em;
    
    @Override
    public List<Usuario> listUsuario() {
        return em.beanEntityManager()
                .createQuery("SELECT u FROM Usuario u", Usuario.class)
                .getResultList();
    }
    
}
