package com.crudTienda.crudTienda.model;

import com.crudTienda.crudTienda.domain.ListaComprasDTO;
import com.crudTienda.crudTienda.domain.ProductoDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "listacompraproducto")
public class ListaCompraProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlistacompraprodcto")
    private int id;

    @JsonIgnore()
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idlistacompras")
    private ListaCompras listaCompras;

    @JsonIgnore()
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idproducto")
    private Producto producto;

    private String estado;
}
