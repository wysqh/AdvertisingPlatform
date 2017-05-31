package edu.mobile.project.platform.dao.impl;

import edu.mobile.project.platform.commom.utils.QueryParameterSetter;
import edu.mobile.project.platform.commom.utils.Sorter;
import edu.mobile.project.platform.dao.UsersDao;
import edu.mobile.project.platform.pojo.UsersEntity;
import org.hibernate.Query;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gutia on 2017-05-29.
 */
@Repository
public class UsersDaoImpl extends HibernateBaseDaoImpl<UsersEntity, Integer> implements UsersDao {
   public List<UsersEntity> getAllUsers() {
       String hql = "from UsersEntity";
       Query query = sessionFactory.getCurrentSession().createQuery(hql);
       return query.list();
   }

    public UsersEntity findUserByAccount(final String account) {
        String hql = "from UsersEntity as U where U.account=?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter(0, account);
        return query.list().size() == 0 ? null : (UsersEntity) query.list().get(0);
//        return findUnique(new QueryParameterSetter() {
//            public void setParameters(DetachedCriteria criteria) {
//                criteria.add(Restrictions.eq("account", account));
//            }
//        });
    }
}
