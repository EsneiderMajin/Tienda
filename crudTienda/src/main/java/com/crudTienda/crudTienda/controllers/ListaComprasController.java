package com.crudTienda.crudTienda.controllers;

import com.crudTienda.crudTienda.domain.ListaComprasDTO;
import com.crudTienda.crudTienda.domain.ProductoDTO;
import com.crudTienda.crudTienda.services.IListaComprasService;
import com.crudTienda.crudTienda.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/listaCompras")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ListaComprasController {

    private final IListaComprasService iListaComprasService;

    @Autowired
    public ListaComprasController(IListaComprasService iListaComprasService) {
        this.iListaComprasService = iListaComprasService;
    }

    @PostMapping("/postListaCompras")
    public ListaComprasDTO createListaCompras(@RequestBody ListaComprasDTO listaComprasDTO) {
        return this.iListaComprasService.createListaCompras(listaComprasDTO);
    }

    @GetMapping("/getListaComprasById")
    public ListaComprasDTO findListaComprasById(@RequestParam Integer  idListaCompras) {
        return this.iListaComprasService.findListaComprasById(idListaCompras);
    }

    @GetMapping("/getAllListaCompras")
    public ResponseEntity<List<ListaComprasDTO>> getAllListaCompras() {
        return ResponseEntity.status(HttpStatus.OK).body(this.iListaComprasService.findAllListaCompras());
    }



}
