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
public class Contact {

    private String id;
    private String estatus;
    private String createdAt;
    private String updatedAt;
    private String nombre;
    private String valor;

    public Contact(String id, String estatus, String createdAt, String updatedAt, String nombre, String valor) {
        this.id = id;
        this.estatus = estatus;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.nombre = nombre;
        this.valor = valor;
    }

    public Contact() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
