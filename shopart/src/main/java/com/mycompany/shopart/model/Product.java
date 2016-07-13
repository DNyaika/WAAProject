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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "product")
@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p"),
//    @NamedQuery(name = "Product.findByProductId", query = "SELECT p FROM Product p WHERE p.productId = :productId"),
//    @NamedQuery(name = "Product.findByProductName", query = "SELECT p FROM Product p WHERE p.productName = :productName"),
//    @NamedQuery(name = "Product.findByModel", query = "SELECT p FROM Product p WHERE p.model = :model"),
//    @NamedQuery(name = "Product.findByPrice", query = "SELECT p FROM Product p WHERE p.price = :price"),
//    @NamedQuery(name = "Product.findByProductImage", query = "SELECT p FROM Product p WHERE p.productImage = :productImage")})
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductId")
    private Integer productId;
    @Size(max = 45)
    @Column(name = "ProductName")
    private String productName;
    @Size(max = 45)
    @Column(name = "Model")
    private String model;
    @Column(name = "Price")
    private Integer price;
    @Size(max = 100)
    @Column(name = "ProductImage")
    private String productImage;
    @OneToMany(mappedBy = "productId")
    private Collection<Orderline> orderlineCollection;
    @JoinColumn(name = "Manufacturer", referencedColumnName = "ManufacturerId")
    @ManyToOne
    private Manufacturer manufacturer;
    @JoinColumn(name = "ProductCategory", referencedColumnName = "CategoryId")
    @ManyToOne(optional = false)
    private Category productCategory;
    @OneToMany(mappedBy = "productId")
    private Collection<Shoppingcart> shoppingcartCollection;
    @OneToMany(mappedBy = "productId")
    private Collection<Inventory> inventoryCollection;

    public Product() {
    }

    public Product(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    @XmlTransient
    public Collection<Orderline> getOrderlineCollection() {
        return orderlineCollection;
    }

    public void setOrderlineCollection(Collection<Orderline> orderlineCollection) {
        this.orderlineCollection = orderlineCollection;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Category getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Category productCategory) {
        this.productCategory = productCategory;
    }

    @XmlTransient
    public Collection<Shoppingcart> getShoppingcartCollection() {
        return shoppingcartCollection;
    }

    public void setShoppingcartCollection(Collection<Shoppingcart> shoppingcartCollection) {
        this.shoppingcartCollection = shoppingcartCollection;
    }

    @XmlTransient
    public Collection<Inventory> getInventoryCollection() {
        return inventoryCollection;
    }

    public void setInventoryCollection(Collection<Inventory> inventoryCollection) {
        this.inventoryCollection = inventoryCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.shopart.model.Product[ productId=" + productId + " ]";
    }
    
}
