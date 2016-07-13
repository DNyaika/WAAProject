/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 985072
 */
@Entity
@Table(name = "order")
@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Order1.findAll", query = "SELECT o FROM Order1 o"),
//    @NamedQuery(name = "Order1.findByOrderId", query = "SELECT o FROM Order1 o WHERE o.orderId = :orderId"),
//    @NamedQuery(name = "Order1.findByDate", query = "SELECT o FROM Order1 o WHERE o.date = :date")})
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OrderId",nullable = false, unique = true)
    private Integer orderId;
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderId")
    private Collection<Orderline> orderlineCollection;
    @JoinColumn(name = "PersonId", referencedColumnName = "PersonId")
    @ManyToOne(optional = false)
    private Person personId;

    public Orders() {
    }

    public Orders(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @XmlTransient
    public Collection<Orderline> getOrderlineCollection() {
        return orderlineCollection;
    }

    public void setOrderlineCollection(Collection<Orderline> orderlineCollection) {
        this.orderlineCollection = orderlineCollection;
    }

    public Person getPersonId() {
        return personId;
    }

    public void setPersonId(Person personId) {
        this.personId = personId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.shopart.model.Order1[ orderId=" + orderId + " ]";
    }
    
}
