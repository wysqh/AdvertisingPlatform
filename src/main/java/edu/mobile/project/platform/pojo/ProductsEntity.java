package edu.mobile.project.platform.pojo;

import javax.persistence.*;

/**
 * Created by gutia on 2017-06-17.
 */
@Entity
@Table(name = "Products", schema = "dbo", catalog = "AdvertisingPlatform")
public class ProductsEntity {
    private String title;
    private String image;
    private String briefIntro;
    private Integer price;
    private int id;
    private String detailImage;
    private String companyInfo;
    private int productType;

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "brief_intro")
    public String getBriefIntro() {
        return briefIntro;
    }

    public void setBriefIntro(String briefIntro) {
        this.briefIntro = briefIntro;
    }

    @Basic
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "detail_image")
    public String getDetailImage() {
        return detailImage;
    }

    public void setDetailImage(String detailImage) {
        this.detailImage = detailImage;
    }

    @Basic
    @Column(name = "company_info")
    public String getCompanyInfo() {
        return companyInfo;
    }

    public void setCompanyInfo(String companyInfo) {
        this.companyInfo = companyInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductsEntity that = (ProductsEntity) o;

        if (id != that.id) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (briefIntro != null ? !briefIntro.equals(that.briefIntro) : that.briefIntro != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (detailImage != null ? !detailImage.equals(that.detailImage) : that.detailImage != null) return false;
        if (companyInfo != null ? !companyInfo.equals(that.companyInfo) : that.companyInfo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (briefIntro != null ? briefIntro.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + (detailImage != null ? detailImage.hashCode() : 0);
        result = 31 * result + (companyInfo != null ? companyInfo.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "product_type")
    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }
}
