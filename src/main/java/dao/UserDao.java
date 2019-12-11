package dao;

import entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
import java.util.List;

public class UserDao {

    public User findById(int id) {
        return HibernateUtil.getSessionFactory().openSession().get(User.class, id);
    }

    public void save(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void update(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    public void delete(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }
    public boolean deleteUserById(int id) {
        User user = findById(id);
        if (user != null) {
            delete(user);
            return true;
        }
        return false;
    }

    public List<User> findAll() {
        List<User> users = (List<User>)  HibernateUtil.getSessionFactory().openSession().createQuery("from User").list();
        return users;
    }
}