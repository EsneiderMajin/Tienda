package com.crudTienda.crudTienda.services;

import com.crudTienda.crudTienda.domain.ProductoDTO;
import com.crudTienda.crudTienda.domain.UsuarioDTO;
import com.crudTienda.crudTienda.model.Producto;
import com.crudTienda.crudTienda.model.Usuario;
import com.crudTienda.crudTienda.repository.IProductoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoServiceImpl implements IProductoService{

    private final IProductoRepository iProductoRepository;
    @Autowired
    private ModelMapper modelMapper;

    public ProductoServiceImpl(IProductoRepository iProductoRepository,ModelMapper modelMapper) {
        this.iProductoRepository = iProductoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ProductoDTO findProductoById(Integer idProducto) {
        Producto producto = this.iProductoRepository.findProductoById(idProducto);
        ProductoDTO ProductoDTO1 = modelMapper.map(producto, ProductoDTO.class);
        return ProductoDTO1;
    }

    @Override
    public List<ProductoDTO> findAllProducto() {
        System.out.println("ProgramServiceImpl.findAllProgram");
        List<Producto> productos = this.iProductoRepository.findAll();
        System.out.println("llega aqui?");
        List<ProductoDTO> productoDTOS = productos.stream().map(producto ->  modelMapper.map(producto, ProductoDTO.class)).collect(Collectors.toList());
        return productoDTOS;
    }

    @Override
    public ProductoDTO updateProducto(Integer id, ProductoDTO productoDTO) {
        return null;
    }


    @Override
    public ProductoDTO createProducto(ProductoDTO productoDTO) {
        Producto producto = modelMapper.map(productoDTO, Producto.class);
        ProductoDTO productoDTO1 = modelMapper.map(iProductoRepository.save(producto), ProductoDTO.class);
        return productoDTO1;
    }
}
