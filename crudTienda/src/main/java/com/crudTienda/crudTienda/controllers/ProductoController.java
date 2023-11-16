package com.crudTienda.crudTienda.controllers;

import com.crudTienda.crudTienda.domain.ProductoDTO;
import com.crudTienda.crudTienda.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductoController {

    private final IProductoService iProductoService;

    @Autowired
    public ProductoController(IProductoService iProductoService) {
        this.iProductoService = iProductoService;
    }

    @PostMapping("/postProducto")
    public ProductoDTO createProducto(@RequestBody ProductoDTO productoDTO) {
        return this.iProductoService.createProducto(productoDTO);
    }

    @GetMapping("/getProductoById")
    public ProductoDTO findProductoById(@RequestParam Integer  idProducto) {
        return this.iProductoService.findProductoById(idProducto);
    }

    @GetMapping("/getAllProducto")
    public ResponseEntity<List<ProductoDTO>> getAllProducto() {
        return ResponseEntity.status(HttpStatus.OK).body(this.iProductoService.findAllProducto());
    }

    @DeleteMapping("/deleteProducto")
    public ResponseEntity<String> deleteProductoById(@RequestParam Integer idProducto) {
        this.iProductoService.deleteProducto(idProducto);
        return ResponseEntity.status(HttpStatus.OK).body("eliminado");
    }

}



