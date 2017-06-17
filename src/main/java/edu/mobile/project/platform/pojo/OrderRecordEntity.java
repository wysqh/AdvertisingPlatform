package edu.mobile.project.platform.pojo;

import javax.persistence.*;

/**
 * Created by gutia on 2017-06-17.
 */
@Entity
@Table(name = "OrderRecord", schema = "dbo", catalog = "AdvertisingPlatform")
public class OrderRecordEntity {
    private int payment;
    private int paymentMethod;
    private int id;
    private String paymentName;
    private String paymentAddress;
    private String paymentPhone;
    private int userId;
    private int productId;

    @Basic
    @Column(name = "payment")
    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    @Basic
    @Column(name = "payment_method")
    public int getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(int paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "payment_name")
    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    @Basic
    @Column(name = "payment_address")
    public String getPaymentAddress() {
        return paymentAddress;
    }

    public void setPaymentAddress(String paymentAddress) {
        this.paymentAddress = paymentAddress;
    }

    @Basic
    @Column(name = "payment_phone")
    public String getPaymentPhone() {
        return paymentPhone;
    }

    public void setPaymentPhone(String paymentPhone) {
        this.paymentPhone = paymentPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderRecordEntity that = (OrderRecordEntity) o;

        if (payment != that.payment) return false;
        if (paymentMethod != that.paymentMethod) return false;
        if (id != that.id) return false;
        if (paymentName != null ? !paymentName.equals(that.paymentName) : that.paymentName != null) return false;
        if (paymentAddress != null ? !paymentAddress.equals(that.paymentAddress) : that.paymentAddress != null)
            return false;
        if (paymentPhone != null ? !paymentPhone.equals(that.paymentPhone) : that.paymentPhone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = payment;
        result = 31 * result + paymentMethod;
        result = 31 * result + id;
        result = 31 * result + (paymentName != null ? paymentName.hashCode() : 0);
        result = 31 * result + (paymentAddress != null ? paymentAddress.hashCode() : 0);
        result = 31 * result + (paymentPhone != null ? paymentPhone.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "product_id")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
