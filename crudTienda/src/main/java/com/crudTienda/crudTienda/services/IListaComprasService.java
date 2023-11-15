package com.crudTienda.crudTienda.services;

import com.crudTienda.crudTienda.domain.ListaComprasDTO;
import com.crudTienda.crudTienda.domain.UsuarioDTO;

import java.util.List;

public interface IListaComprasService {
    public ListaComprasDTO findListaComprasById(Integer  idListaCompras);

    List<ListaComprasDTO> findAllListaCompras();

    public ListaComprasDTO updateListaCompras(Integer  idListaCompras,ListaComprasDTO listaComprasDTO);

    public ListaComprasDTO createListaCompras(ListaComprasDTO listaComprasDTO);
}
