/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites.PrestaZone;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author 21509311
 */
@Entity
public class Produit implements Serializable {
    //Propriétés privées
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int qteStock;
    private String libele;
    private String description;
    private float pxUnit;
    private Type leType;
    
    
    //Attributs publics
    public enum Type {
        alimentation, hygiene, ameublement, electromenager, HT 
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
        public int getQteStock() {
        return qteStock;
    }
    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }
    public String getLibele() {
        return libele;
    }
    public void setLibele(String libele) {
        this.libele = libele;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public float getPxUnit() {
        return pxUnit;
    }
    public void setPxUnit(float pxUnit) {
        this.pxUnit = pxUnit;
    }
    public Type getLeType() {
        return leType;
    }
    public void setLeType(Type leType) {
        this.leType = leType;
    }

    //Constructeur(s)
    public Produit(){};
    public Produit(int p_qteStock, String p_lib, String p_descr, float p_pxUnit, Type p_type ){
        qteStock = p_qteStock;
        libele = p_lib;
        description = p_descr;
        pxUnit = p_pxUnit;
        leType = p_type;
    }
    
    //Méthodes & Fonctions
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entites.PrestaZone.Produit[ id=" + id + " ]";
    }
    
}
