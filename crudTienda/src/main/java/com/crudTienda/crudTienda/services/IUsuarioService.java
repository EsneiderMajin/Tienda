package com.crudTienda.crudTienda.services;

import com.crudTienda.crudTienda.domain.ProductoDTO;
import com.crudTienda.crudTienda.domain.UsuarioDTO;

import java.util.List;

public interface IUsuarioService {

    public UsuarioDTO findUsuarioById(Integer  idUsuario);

    List<UsuarioDTO> findAllUsuario();

    public UsuarioDTO updateUsuario(Integer  idUsuario,UsuarioDTO usuarioDTO);

    public UsuarioDTO createUsuario(UsuarioDTO usuarioDTO);
}
