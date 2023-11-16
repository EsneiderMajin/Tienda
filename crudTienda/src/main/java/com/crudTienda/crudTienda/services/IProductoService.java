package com.crudTienda.crudTienda.services;

import com.crudTienda.crudTienda.domain.ProductoDTO;

import java.util.List;

public interface IProductoService {

    public ProductoDTO findProductoById(Integer  idProducto);

    List<ProductoDTO> findAllProducto();

    public ProductoDTO updateProducto(Integer  idProducto,ProductoDTO productoDTO);

    public ProductoDTO createProducto(ProductoDTO productoDTO);

    Boolean deleteProducto(Integer idProducto);
}
