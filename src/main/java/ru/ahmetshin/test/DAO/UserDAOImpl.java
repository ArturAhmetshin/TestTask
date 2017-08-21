package ru.ahmetshin.test.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Repository;
import ru.ahmetshin.test.domain.Users;

import javax.persistence.PostRemove;
import java.util.List;
@Repository
public class UserDAOImpl implements UserDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Users> listUsers() {
        Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        List<Users> userList = session.createQuery("FROM User").list();
        session.beginTransaction().commit();
        session.close();
        return userList;
    }

    @Override
    public Users getUserById(long id) {
        Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        Users user = (Users) session.get(Users.class, id);
        session.getTransaction().commit();
        session.close();
        return user;
    }

    @Override
    public void removeUser(long id) {
        Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        Users user = (Users) session.get(Users.class, id);
        if (user != null) {
            session.delete(user);
        }
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void addUser(Users user) {
        Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void updateUser(Users user) {
        Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        session.update(user);
        session.getTransaction().commit();
        session.close();
    }
}
