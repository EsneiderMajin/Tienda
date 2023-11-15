package com.crudTienda.crudTienda.repository;

import com.crudTienda.crudTienda.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {
    Producto findProductoById(Integer idProducto);
}
