package com.crudTienda.crudTienda.services;

import com.crudTienda.crudTienda.domain.ProductoDTO;
import com.crudTienda.crudTienda.domain.UsuarioDTO;
import com.crudTienda.crudTienda.model.Producto;
import com.crudTienda.crudTienda.model.Usuario;
import com.crudTienda.crudTienda.repository.IProductoRepository;
import com.crudTienda.crudTienda.repository.IUsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

    private final IUsuarioRepository iUsuarioRepository;
    @Autowired
    private ModelMapper modelMapper;

    public UsuarioServiceImpl(IUsuarioRepository iUsuarioRepository,ModelMapper modelMapper) {
        this.iUsuarioRepository = iUsuarioRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public UsuarioDTO findUsuarioById(Integer idUsuario) {

        return null;
    }

    @Override
    public List<UsuarioDTO> findAllUsuario() {
        List<Usuario> usuarios = this.iUsuarioRepository.findAll();
        System.out.println("llega aqui?");
        List<UsuarioDTO> usuarioDTOS = usuarios.stream().map(usuario ->  modelMapper.map(usuario, UsuarioDTO.class)).collect(Collectors.toList());
        return usuarioDTOS;
    }

    @Override
    public UsuarioDTO updateUsuario(Integer idUsuario, UsuarioDTO usuarioDTO) {
        return null;
    }

    @Override
    public UsuarioDTO createUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = modelMapper.map(usuarioDTO, Usuario.class);
        UsuarioDTO usuarioDTO1 = modelMapper.map(iUsuarioRepository.save(usuario), UsuarioDTO.class);
        return usuarioDTO1;
    }
}
