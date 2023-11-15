package com.crudTienda.crudTienda.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;
@Data
@NoArgsConstructor
public class ProductoDTO {

    private int idProducto;

    private String nombreProducto;

    private int precio;

    private Date fechaCreacion;

    private ProveedorDTO proveedor;

}
