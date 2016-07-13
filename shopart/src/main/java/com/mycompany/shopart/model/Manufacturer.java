/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 985072
 */
@Entity
@Table(name = "manufacturer")
@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Manufacturer.findAll", query = "SELECT m FROM Manufacturer m"),
//    @NamedQuery(name = "Manufacturer.findByManufacturerId", query = "SELECT m FROM Manufacturer m WHERE m.manufacturerId = :manufacturerId"),
//    @NamedQuery(name = "Manufacturer.findByManufacturerName", query = "SELECT m FROM Manufacturer m WHERE m.manufacturerName = :manufacturerName"),
//    @NamedQuery(name = "Manufacturer.findByManufacturerLogo", query = "SELECT m FROM Manufacturer m WHERE m.manufacturerLogo = :manufacturerLogo")})
public class Manufacturer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ManufacturerId", nullable = false, unique = true)
    private Integer manufacturerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ManufacturerName")
    private String manufacturerName;
    @Size(max = 100)
    @Column(name = "ManufacturerLogo")
    private String manufacturerLogo;
    @OneToMany(mappedBy = "manufacturer")
    private Collection<Product> productCollection;

    public Manufacturer() {
    }

    public Manufacturer(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public Manufacturer(Integer manufacturerId, String manufacturerName) {
        this.manufacturerId = manufacturerId;
        this.manufacturerName = manufacturerName;
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerLogo() {
        return manufacturerLogo;
    }

    public void setManufacturerLogo(String manufacturerLogo) {
        this.manufacturerLogo = manufacturerLogo;
    }

    @XmlTransient
    public Collection<Product> getProductCollection() {
        return productCollection;
    }

    public void setProductCollection(Collection<Product> productCollection) {
        this.productCollection = productCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (manufacturerId != null ? manufacturerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Manufacturer)) {
            return false;
        }
        Manufacturer other = (Manufacturer) object;
        if ((this.manufacturerId == null && other.manufacturerId != null) || (this.manufacturerId != null && !this.manufacturerId.equals(other.manufacturerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.shopart.model.Manufacturer[ manufacturerId=" + manufacturerId + " ]";
    }

}
