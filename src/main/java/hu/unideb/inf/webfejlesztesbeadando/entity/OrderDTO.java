package hu.unideb.inf.webfejlesztesbeadando.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ORDERS")
public class OrderDTO implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "ORDER_NAME")
    private String orderName;

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSiteUserDto(SiteUserDTO siteUserDto) {
        this.siteUserDto = siteUserDto;
    }

    public Long getId() {
        return id;
    }

    public String getOrderName() {
        return orderName;
    }

    public double getPrice() {
        return price;
    }

    public SiteUserDTO getSiteUserDto() {
        return siteUserDto;
    }

    @Column(name = "ORDER_PRICE")
    private double price;

    @ManyToOne
    @JoinColumn(name = "SITE_USER")
    private SiteUserDTO siteUserDto;
}
