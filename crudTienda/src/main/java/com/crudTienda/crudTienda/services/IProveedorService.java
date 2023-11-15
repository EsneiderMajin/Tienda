package com.crudTienda.crudTienda.services;

import com.crudTienda.crudTienda.domain.ProductoDTO;
import com.crudTienda.crudTienda.domain.ProveedorDTO;
import com.crudTienda.crudTienda.model.Proveedor;

import java.util.List;

public interface IProveedorService {

    List<ProveedorDTO> findAllProveedor();

    public ProveedorDTO findProveedorById(Integer idProveedor);

    public ProveedorDTO updateProveedor(Integer  idProveedor,ProveedorDTO proveedorDTO);

    public ProveedorDTO createProveedor(ProveedorDTO proveedorDTO);

}
