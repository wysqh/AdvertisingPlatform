package edu.mobile.project.platform.dao.impl;

import edu.mobile.project.platform.dao.OrderRecordDao;
import edu.mobile.project.platform.pojo.OrderRecordEntity;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gutia on 2017-06-17.
 */
@Repository
public class OrderRecordDaoImpl extends HibernateBaseDaoImpl<OrderRecordEntity, Integer> implements OrderRecordDao{
    public  boolean saveProduct(String name, String address, String phone, int money, int payMethod,  int userId, int proId){
        OrderRecordEntity orderRecordEntity = new OrderRecordEntity();
        orderRecordEntity.setPaymentName(name);
        orderRecordEntity.setPayment(money);
        orderRecordEntity.setPaymentMethod(payMethod);
        orderRecordEntity.setPaymentAddress(address);
        orderRecordEntity.setPaymentPhone(phone);
        orderRecordEntity.setUserId(userId);
        orderRecordEntity.setProductId(proId);
        try {
            save(orderRecordEntity);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public List<OrderRecordEntity> findOrderByUserId(int userId) {
        String hql = "from OrderRecordEntity as R where R.userId=?";
        Query query = getSession().createQuery(hql).setParameter(0, userId);

        return query.list();
    }
}
