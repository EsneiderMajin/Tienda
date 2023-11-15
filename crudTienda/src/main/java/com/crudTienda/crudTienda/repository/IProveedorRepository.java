package com.crudTienda.crudTienda.repository;

import com.crudTienda.crudTienda.model.Producto;
import com.crudTienda.crudTienda.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProveedorRepository  extends JpaRepository<Proveedor, Integer> {
    Proveedor findProveedorById(Integer idProveedor);
}
