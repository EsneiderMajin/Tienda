package com.crudTienda.crudTienda.model;

import com.crudTienda.crudTienda.domain.UsuarioDTO;
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
@Table(name = "listacompras")
public class ListaCompras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlistacompras")
    private int id;
    private Date fechaLista;
    private String nombreLista;

    @JsonIgnore()
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idusuario")
    private Usuario usuario;

    @OneToMany(mappedBy = "listaCompras")
    private List<ListaCompraProducto> listaCompraProducto;



}
