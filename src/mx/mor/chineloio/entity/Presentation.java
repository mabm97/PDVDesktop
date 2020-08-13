/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.mor.chineloio.entity;

/**
 *
 * @author MarcoABM
 */
public class Presentation {

    private String id;
    private String nombre;
    private String costo;
    private String precioSinImpuestos;
    private String precioConImpuestos;
    private String nombreNormalizado;
    private String estatus;
    private String productId;
    private String createdAt;
    private String updatedAt;

    public Presentation() {
    }

    public Presentation(String id, String nombre, String costo, String precioSinImpuestos, String precioConImpuestos, String nombreNormalizado, String estatus, String productId, String createdAt, String updatedAt) {
        this.id = id;
        this.nombre = nombre;
        this.costo = costo;
        this.precioSinImpuestos = precioSinImpuestos;
        this.precioConImpuestos = precioConImpuestos;
        this.nombreNormalizado = nombreNormalizado;
        this.estatus = estatus;
        this.productId = productId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getPrecioSinImpuestos() {
        return precioSinImpuestos;
    }

    public void setPrecioSinImpuestos(String precioSinImpuestos) {
        this.precioSinImpuestos = precioSinImpuestos;
    }

    public String getPrecioConImpuestos() {
        return precioConImpuestos;
    }

    public void setPrecioConImpuestos(String precioConImpuestos) {
        this.precioConImpuestos = precioConImpuestos;
    }

    public String getNombreNormalizado() {
        return nombreNormalizado;
    }

    public void setNombreNormalizado(String nombreNormalizado) {
        this.nombreNormalizado = nombreNormalizado;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}
