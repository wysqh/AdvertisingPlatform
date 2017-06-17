package edu.mobile.project.platform.controller;

import com.fasterxml.jackson.databind.deser.Deserializers;
import edu.mobile.project.platform.pojo.OrderRecordEntity;
import edu.mobile.project.platform.pojo.ProductsEntity;
import edu.mobile.project.platform.service.ProductService;
import edu.mobile.project.platform.utils.ConstUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by gutia on 2017-06-16.
 */
@Controller
@RequestMapping(ConstUtil.PRODUCT)
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(ConstUtil.GET_PRODUCT)
    @ResponseBody
    List<ProductsEntity> getProducts(){
        return productService.getProducts();
    }

    @RequestMapping(ConstUtil.GET_PRODUCT_BY_TILE)
    @ResponseBody
    ProductsEntity getProductByTitle(String title) {
        return productService.getProductByTitle(title);
    }

    @RequestMapping(ConstUtil.GET_PRODUCT_BY_USER)
    @ResponseBody
    List<OrderRecordEntity> getProductbyUser(String id) {
        return productService.getRecordByUserId(id);
    }
}
