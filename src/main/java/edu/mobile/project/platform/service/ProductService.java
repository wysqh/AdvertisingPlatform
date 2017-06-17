package edu.mobile.project.platform.service;

import edu.mobile.project.platform.pojo.OrderRecordEntity;
import edu.mobile.project.platform.pojo.ProductsEntity;

import java.util.List;

/**
 * Created by gutia on 2017-06-16.
 */
public interface ProductService {
    List<ProductsEntity> getProducts();
    ProductsEntity getProductByTitle(String title);
    List<OrderRecordEntity> getRecordByUserId(String id);
}
