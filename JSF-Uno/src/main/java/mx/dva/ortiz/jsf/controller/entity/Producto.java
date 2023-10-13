package mx.dva.ortiz.jsf.controller.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "producto")
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty
    private String nombre;
    
    @NotNull
    @Min(10)
    @Max(100000)
    private double precio;
    
    @NotNull
    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;
    
    @NotNull
    @Size(min = 2, max = 10)
    private String sku;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_categoria")
    private Categoria categoria;
    
    
    public Producto() {
    }

    public Producto(String nombre) {
        this.nombre = nombre;
    }

//    @PrePersist
//    public void prePerist(){
//        this.fechaCreacion = LocalDate.now();
//    }
//    
    public Producto(String nombre, String sku) {
        this.nombre = nombre;
        this.sku = sku;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fechaCreacion=" + fechaCreacion + ", sku=" + sku + '}';
    }
    
    
}
