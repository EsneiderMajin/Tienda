import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Producto } from '../dto/producto';
import { LoginClientService } from '../client/login-client.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  listaProductos: Producto[] = [];
  formularioProducto: FormGroup;
  userName : any;

  constructor(private router: Router,public loginClient : LoginClientService, private fb: FormBuilder) { 
    this.formularioProducto = this.fb.group({
      nombre: ['', Validators.required]
    }); 
  }

  ngOnInit() {
    this.userName = localStorage.getItem("userName");
    this.obtenerProductos();
  }

  logout() {
    localStorage.removeItem("isLoggedIn");
    localStorage.removeItem("userName");
    this.router.navigate(["/login"]);
  }


  obtenerProductos() {
    this.loginClient.getProductosAll().subscribe({
      next: (resp: any) => {
        this.listaProductos = resp;
        console.log("---------productos:", this.listaProductos);
      },
      error: (error) => {
        console.log(error);
      },
    }); 
  }

  agregarProducto(){
    console.log("agregar producto");
  }

  }



