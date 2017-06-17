package edu.mobile.project.platform.dao;

import edu.mobile.project.platform.pojo.ProductsEntity;

import java.util.List;

/**
 * Created by gutia on 2017-06-16.
 */
public interface ProductDao {
    List<ProductsEntity> findAllProductInfo();
    ProductsEntity findProductByName(String name);
}
