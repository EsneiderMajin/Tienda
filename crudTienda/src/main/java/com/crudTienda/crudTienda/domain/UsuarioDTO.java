package com.crudTienda.crudTienda.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsuarioDTO {
    private int idUsuario;
    private String nombreUsuario;
    private String clave;
    private String username;

}
