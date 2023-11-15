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
@Table(name = "proveedor")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproveedor")
    private int id;
    private String nombreProveedor;
    private Date fechaCreacion;

    @OneToMany(mappedBy = "proveedor")
    private List<Producto> productos;
}
