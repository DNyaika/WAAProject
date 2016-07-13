/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 985072
 */
@Entity
@Table(name = "shoppingcart")
@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Shoppingcart.findAll", query = "SELECT s FROM Shoppingcart s"),
//    @NamedQuery(name = "Shoppingcart.findByCartId", query = "SELECT s FROM Shoppingcart s WHERE s.cartId = :cartId"),
//    @NamedQuery(name = "Shoppingcart.findByProductQuantity", query = "SELECT s FROM Shoppingcart s WHERE s.productQuantity = :productQuantity")})
public class Shoppingcart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CartId")
    private Integer cartId;
    @Column(name = "ProductQuantity")
    private Integer productQuantity;
    @JoinColumn(name = "PersonId", referencedColumnName = "PersonId")
    @ManyToOne(optional = false)
    private Person personId;
    @JoinColumn(name = "ProductId", referencedColumnName = "ProductId")
    @ManyToOne
    private Product productId;

    public Shoppingcart() {
    }

    public Shoppingcart(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Person getPersonId() {
        return personId;
    }

    public void setPersonId(Person personId) {
        this.personId = personId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cartId != null ? cartId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shoppingcart)) {
            return false;
        }
        Shoppingcart other = (Shoppingcart) object;
        if ((this.cartId == null && other.cartId != null) || (this.cartId != null && !this.cartId.equals(other.cartId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.shopart.model.Shoppingcart[ cartId=" + cartId + " ]";
    }
    
}
