package edu.mobile.project.platform.dao.impl;

import edu.mobile.project.platform.dao.ProductDao;
import edu.mobile.project.platform.pojo.ProductsEntity;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gutia on 2017-06-16.
 */
@Repository
public class ProductDaoImpl extends HibernateBaseDaoImpl<ProductsEntity, Integer> implements ProductDao{
    public List<ProductsEntity> findAllProductInfo() {
        String hql = "from ProductsEntity";
        Query query  = sessionFactory.getCurrentSession().createQuery(hql);
        return query.list();
    }

    public ProductsEntity findProductByName(String name) {
        String hql = "from ProductsEntity as P where P.title = ?";
        Query query = getSession().createQuery(hql).setParameter(0, name);
        return query.list().size() == 0 ? null : (ProductsEntity) query.list().get(0);
    }
}
