package com.crudTienda.crudTienda.repository;

import com.crudTienda.crudTienda.model.ListaCompras;
import com.crudTienda.crudTienda.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IListaComprasRepository  extends JpaRepository<ListaCompras, Integer> {
    ListaCompras findListaComprasById(Integer idListaCompras);
}
