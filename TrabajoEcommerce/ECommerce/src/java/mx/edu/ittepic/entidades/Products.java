/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ittepic.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author arlet
 */
@Entity
@Table(name = "products")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p")
    , @NamedQuery(name = "Products.findByProductid", query = "SELECT p FROM Products p WHERE p.productid = :productid")
    , @NamedQuery(name = "Products.findByCode", query = "SELECT p FROM Products p WHERE p.code = :code")
    , @NamedQuery(name = "Products.findByProductname", query = "SELECT p FROM Products p WHERE p.productname = :productname")
    , @NamedQuery(name = "Products.findByBrand", query = "SELECT p FROM Products p WHERE p.brand = :brand")
    , @NamedQuery(name = "Products.findByPurchprice", query = "SELECT p FROM Products p WHERE p.purchprice = :purchprice")
    , @NamedQuery(name = "Products.findByStock", query = "SELECT p FROM Products p WHERE p.stock = :stock")
    , @NamedQuery(name = "Products.findBySalepricemin", query = "SELECT p FROM Products p WHERE p.salepricemin = :salepricemin")
    , @NamedQuery(name = "Products.findByReorderpoint", query = "SELECT p FROM Products p WHERE p.reorderpoint = :reorderpoint")
    , @NamedQuery(name = "Products.findByCurrency", query = "SELECT p FROM Products p WHERE p.currency = :currency")
    , @NamedQuery(name = "Products.findByCategoryid", query = "SELECT p FROM Products p WHERE p.categoryid = :categoryid")
    , @NamedQuery(name = "Products.findBySalepricemay", query = "SELECT p FROM Products p WHERE p.salepricemay = :salepricemay")
    , @NamedQuery(name = "Products.findByImage", query = "SELECT p FROM Products p WHERE p.image = :image")})
public class Products implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "productid")
    private Integer productid;
    @Size(max = 50)
    @Column(name = "code")
    private String code;
    @Size(max = 50)
    @Column(name = "productname")
    private String productname;
    @Size(max = 50)
    @Column(name = "brand")
    private String brand;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "purchprice")
    private Double purchprice;
    @Column(name = "stock")
    private Integer stock;
    @Column(name = "salepricemin")
    private Integer salepricemin;
    @Column(name = "reorderpoint")
    private Integer reorderpoint;
    @Size(max = 50)
    @Column(name = "currency")
    private String currency;
    @Column(name = "categoryid")
    private Integer categoryid;
    @Column(name = "salepricemay")
    private Integer salepricemay;
    @Size(max = 500)
    @Column(name = "image")
    private String image;

    public Products() {
    }

    public Products(Integer productid) {
        this.productid = productid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPurchprice() {
        return purchprice;
    }

    public void setPurchprice(Double purchprice) {
        this.purchprice = purchprice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSalepricemin() {
        return salepricemin;
    }

    public void setSalepricemin(Integer salepricemin) {
        this.salepricemin = salepricemin;
    }

    public Integer getReorderpoint() {
        return reorderpoint;
    }

    public void setReorderpoint(Integer reorderpoint) {
        this.reorderpoint = reorderpoint;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public Integer getSalepricemay() {
        return salepricemay;
    }

    public void setSalepricemay(Integer salepricemay) {
        this.salepricemay = salepricemay;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productid != null ? productid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.productid == null && other.productid != null) || (this.productid != null && !this.productid.equals(other.productid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.ittepic.entidades.Products[ productid=" + productid + " ]";
    }
    
}
