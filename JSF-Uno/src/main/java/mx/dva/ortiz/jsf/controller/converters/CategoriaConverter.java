package mx.dva.ortiz.jsf.controller.converters;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.inject.Inject;
import java.util.Optional;
import jakarta.inject.Named;
import mx.dva.ortiz.jsf.controller.Service.IProductoService;
import mx.dva.ortiz.jsf.controller.entity.Categoria;

@RequestScoped
@Named("Conver")
public class CategoriaConverter implements Converter<Categoria> {

    @Inject
    private IProductoService p;
    
    @Override
    public Categoria getAsObject(FacesContext context, UIComponent component, String value) {
        if(value == null){
            return null;
        }
        System.err.println("Valor ---> "+ value);

        Optional<Categoria> categoria = Optional.of(p.categoriaPorId(Long.valueOf(value)));
        if(categoria.isPresent()){
            return categoria.orElse(null);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Categoria value) {
        if(value == null){
            return "0";
        }
        return value.getId().toString();
    }
    
}
