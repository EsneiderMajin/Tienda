package com.crudTienda.crudTienda.repository;

import com.crudTienda.crudTienda.model.Producto;
import com.crudTienda.crudTienda.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository  extends JpaRepository<Usuario, Integer> {
    Usuario findUsuarioById(Integer idUsuario);

}
