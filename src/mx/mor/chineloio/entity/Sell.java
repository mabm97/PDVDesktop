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
public class Sell {

    private String id;
    private String folio;
    private String totalLetra;
    private String folioVerificador;
    private String customerId;
    private String createdAt;
    private String updatedAt;

    public Sell(String id, String folio, String totalLetra, String folioVerificador, String customerId, String createdAt, String updatedAt) {
        this.id = id;
        this.folio = folio;
        this.totalLetra = totalLetra;
        this.folioVerificador = folioVerificador;
        this.customerId = customerId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Sell() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getTotalLetra() {
        return totalLetra;
    }

    public void setTotalLetra(String totalLetra) {
        this.totalLetra = totalLetra;
    }

    public String getFolioVerificador() {
        return folioVerificador;
    }

    public void setFolioVerificador(String folioVerificador) {
        this.folioVerificador = folioVerificador;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
