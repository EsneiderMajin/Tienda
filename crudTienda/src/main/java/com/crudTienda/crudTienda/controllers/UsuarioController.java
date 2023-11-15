package com.crudTienda.crudTienda.controllers;

import com.crudTienda.crudTienda.domain.ProductoDTO;
import com.crudTienda.crudTienda.domain.UsuarioDTO;
import com.crudTienda.crudTienda.services.IProductoService;
import com.crudTienda.crudTienda.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {

    private final IUsuarioService iUsuarioService;

    @Autowired
    public UsuarioController(IUsuarioService iUsuarioService) {
        this.iUsuarioService = iUsuarioService;
    }

    @PostMapping("/postUsuario")
    public UsuarioDTO createUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        return this.iUsuarioService.createUsuario(usuarioDTO);
    }

    @GetMapping("/getUsuarioById")
    public UsuarioDTO findUsuarioById(@RequestParam Integer  idUsuario) {
        return this.iUsuarioService.findUsuarioById(idUsuario);
    }

    @GetMapping("/getAllUsuario")
    public ResponseEntity<List<UsuarioDTO>> getAllUsuario() {
        return ResponseEntity.status(HttpStatus.OK).body(this.iUsuarioService.findAllUsuario());
    }

}
