package edu.mobile.project.platform.pojo;

import javax.persistence.*;

/**
 * Created by gutia on 2017-05-29.
 */
@Entity
@Table(name = "OrderRecord", schema = "dbo", catalog = "AdvertisingPlatform")
public class OrderRecordEntity {
    private int id;
    private int payment;
    private int paymentMethod;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderRecordEntity that = (OrderRecordEntity) o;

        if (id != that.id) return false;
        if (payment != that.payment) return false;
        if (paymentMethod != that.paymentMethod) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + payment;
        result = 31 * result + paymentMethod;
        return result;
    }
}
