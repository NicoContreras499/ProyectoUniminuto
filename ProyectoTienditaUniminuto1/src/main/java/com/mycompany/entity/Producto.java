
package com.mycompany.entity;

public class Producto {
    private int productoid;
    private String productoNombre;
    private String productoDescripcion;
    private int productoStatus;

    public Producto() {
    }

    public Producto(String productoNombre, String productoDescripcion, int productoStatus) {
        this.productoNombre = productoNombre;
        this.productoDescripcion = productoDescripcion;
        this.productoStatus = productoStatus;
    }

    public Producto(int productoid, String productoNombre, String productoDescripcion, int productoStatus) {
        this.productoid = productoid;
        this.productoNombre = productoNombre;
        this.productoDescripcion = productoDescripcion;
        this.productoStatus = productoStatus;
    }

    public int getProductoid() {
        return productoid;
    }

    public void setProductoid(int productoid) {
        this.productoid = productoid;
    }

    public String getProductoNombre() {
        return productoNombre;
    }

    public void setProductoNombre(String productoNombre) {
        this.productoNombre = productoNombre;
    }

    public String getProductoDescripcion() {
        return productoDescripcion;
    }

    public void setProductoDescripcion(String productoDescripcion) {
        this.productoDescripcion = productoDescripcion;
    }

    public int getProductoStatus() {
        return productoStatus;
    }

    public void setProductoStatus(int productoStatus) {
        this.productoStatus = productoStatus;
    }
    
     
    
}
