package edu.mobile.project.platform.dao.impl;

import edu.mobile.project.platform.dao.UsersDao;
import edu.mobile.project.platform.pojo.OrderRecordEntity;
import edu.mobile.project.platform.pojo.UsersEntity;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
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

    public boolean saveUserInfo(String account, String password, String name, String emailAddr, String phone) {
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setAccount(account);
        usersEntity.setName(name);
        usersEntity.setPassword(password);
        usersEntity.setEmailAddr(emailAddr);
        usersEntity.setPhoneNum(phone);
        try {
            save(usersEntity);
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
