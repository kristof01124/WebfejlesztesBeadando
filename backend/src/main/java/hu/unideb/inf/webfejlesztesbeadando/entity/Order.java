package hu.unideb.inf.webfejlesztesbeadando.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ORDERS")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORDER_ID")
    private Long orderId;

    @Column(name = "ORDER_NAME")
    private String orderName;

    public Order() {

    }

    public void setOrderId(Long id) {
        this.orderId = id;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSiteUserDto(SiteUser siteUser) {
        this.siteUser = siteUser;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public double getPrice() {
        return price;
    }

    public SiteUser getSiteUserDto() {
        return siteUser;
    }

    @Column(name = "ORDER_PRICE")
    private double price;

    public Order(Long orderId, String orderName, double price, SiteUser siteUser) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.price = price;
        this.siteUser = siteUser;
    }

    @ManyToOne
    @JoinColumn(name = "SITE_USER")
    private SiteUser siteUser;
}
