package com.crudTienda.crudTienda.domain;

import com.crudTienda.crudTienda.model.Producto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class ProveedorDTO {

    private int idProveedor;
    private String nombreProveedor;
    private Date fechaCreacion;

    private List<Producto> Productos;
}
