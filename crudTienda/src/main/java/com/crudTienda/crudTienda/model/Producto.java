package com.crudTienda.crudTienda.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproducto")
    private int id;

    private String nombreProducto;

    private int precio;

    private Date fechaCreacion;
    @JsonIgnore()
    @OneToMany(mappedBy = "producto")
    private List<ListaCompraProducto> listaCompraProducto;

    @JsonIgnore()
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idproveedor")
    private Proveedor proveedor;
}
