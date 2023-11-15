package com.crudTienda.crudTienda.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@Data
@NoArgsConstructor
public class ListaComprasDTO {
    private int idListaCompras;
    private Date fechaLista;
    private String nombreLista;
    private UsuarioDTO Usuario;
}
