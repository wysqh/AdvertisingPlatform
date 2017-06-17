package edu.mobile.project.platform.dao;

import edu.mobile.project.platform.pojo.OrderRecordEntity;

import java.util.List;

/**
 * Created by gutia on 2017-06-17.
 */
public interface OrderRecordDao  {
    public  boolean saveProduct(String name, String address, String phone, int money, int payMethod,  int userId, int proId);
    public List<OrderRecordEntity> findOrderByUserId(int userId);
}
