package com.crudTienda.crudTienda.services;

import com.crudTienda.crudTienda.domain.ProductoDTO;
import com.crudTienda.crudTienda.domain.ProveedorDTO;
import com.crudTienda.crudTienda.domain.UsuarioDTO;
import com.crudTienda.crudTienda.model.Producto;
import com.crudTienda.crudTienda.model.Proveedor;
import com.crudTienda.crudTienda.model.Usuario;
import com.crudTienda.crudTienda.repository.IProveedorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProveedorServiceImpl implements IProveedorService{

    private final IProveedorRepository iProveedorRepository;

    private final ModelMapper modelMapper;

    public ProveedorServiceImpl(IProveedorRepository iProveedorRepository, ModelMapper modelMapper) {
        this.iProveedorRepository = iProveedorRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ProveedorDTO> findAllProveedor() {
        List<Proveedor> proveedors = this.iProveedorRepository.findAll();
        System.out.println("llega aqui?");
        List<ProveedorDTO> proveedorDTOS = proveedors.stream().map(proveedor ->  modelMapper.map(proveedor, ProveedorDTO.class)).collect(Collectors.toList());
        return proveedorDTOS;
    }

    @Override
    public ProveedorDTO findProveedorById(Integer idProveedor) {
        return null;
    }

    @Override
    public ProveedorDTO updateProveedor(Integer idProveedor, ProveedorDTO proveedorDTO) {
        return null;
    }

    @Override
    public ProveedorDTO createProveedor(ProveedorDTO proveedorDTO) {
        Proveedor proveedor = modelMapper.map(proveedorDTO, Proveedor.class);
        ProveedorDTO proveedorDTO1 = modelMapper.map(iProveedorRepository.save(proveedor), ProveedorDTO.class);
        return proveedorDTO1;
    }






    /*
    @Override
    public List<Proveedor> findAllProveedor() {
        return this.iProveedorRepository.findAll();
    }
*/


}
