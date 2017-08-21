package ru.ahmetshin.test.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ru.ahmetshin.test.domain.Roles;

@Repository
public class RoleDAOImpl implements RoleDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Roles getRoleById(long id) {
        Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        Roles role = (Roles) session.get(Roles.class, id);
        session.getTransaction().commit();
        session.close();
        return role;

    }

    @Override
    public void addRole(Roles role) {
        Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        session.save(role);
        session.getTransaction().commit();
        session.close();
    }
}
