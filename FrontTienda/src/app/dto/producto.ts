export class Producto{
    idProducto: number;
    nombreProducto: string;
    precio: number;
    fechaCreacion: string;
    proveedor:Proveedor
}

export class Proveedor {
    idProveedor: number;
    nombreProveedor: string;
    fechaCreacion: string;
    productos:[]
}