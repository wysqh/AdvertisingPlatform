package edu.mobile.project.platform.service.impl;

import edu.mobile.project.platform.dao.OrderRecordDao;
import edu.mobile.project.platform.dao.ProductDao;
import edu.mobile.project.platform.pojo.OrderRecordEntity;
import edu.mobile.project.platform.pojo.ProductsEntity;
import edu.mobile.project.platform.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by gutia on 2017-06-16.
 */
@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;
    @Autowired
    OrderRecordDao orderRecordDao;

    public List<ProductsEntity> getProducts() {
        return productDao.findAllProductInfo();
    }

    public ProductsEntity getProductByTitle(String title) {
        return productDao.findProductByName(title);
    }

    public List<OrderRecordEntity> getRecordByUserId(String id) {
        return orderRecordDao.findOrderByUserId(Integer.parseInt(id));
    }
}
