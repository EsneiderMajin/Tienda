package com.crudTienda.crudTienda.controllers;

import com.crudTienda.crudTienda.domain.ProductoDTO;
import com.crudTienda.crudTienda.domain.ProveedorDTO;
import com.crudTienda.crudTienda.model.Proveedor;
import com.crudTienda.crudTienda.services.IProductoService;
import com.crudTienda.crudTienda.services.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proveedor")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProveedorController {

    private final IProveedorService iProveedorService;

    public ProveedorController(IProveedorService iProductoService) {
        this.iProveedorService = iProductoService;
    }

    /*
    @GetMapping("/getAllProveedor")
    public ResponseEntity<List<Proveedor>> getAllProveedor() {
        return ResponseEntity.status(HttpStatus.OK).body(this.iProveedorService.findAllProveedor());
    }

*/
    @PostMapping("/postProveedor")
    public ProveedorDTO createProveedor(@RequestBody ProveedorDTO proveedorDTO) {
        return this.iProveedorService.createProveedor(proveedorDTO);
    }

    @GetMapping("/getProductoById")
    public ProveedorDTO findProductoById(@RequestParam Integer  idProveedor) {
        return this.iProveedorService.findProveedorById(idProveedor);
    }

    @GetMapping("/getAllProveedor")
    public ResponseEntity<List<ProveedorDTO>> getAllProveedor() {
        return ResponseEntity.status(HttpStatus.OK).body(this.iProveedorService.findAllProveedor());
    }

}
