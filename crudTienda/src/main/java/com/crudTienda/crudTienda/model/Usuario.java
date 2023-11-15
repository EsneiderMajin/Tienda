package com.crudTienda.crudTienda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario")
    private int id;
    private String nombreUsuario;
    private String clave;
    private String username;

    @OneToMany(mappedBy = "usuario")
    private List<ListaCompras> listaCompras;


}
