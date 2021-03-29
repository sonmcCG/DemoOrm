package services;

import entities.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserService implements IUserService {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> get() {
        String queryGet = "SELECT c FROM User AS c";
        TypedQuery<User> query = entityManager.createQuery(queryGet, User.class);
        List<User> users = query.getResultList();
        return users;
    }

    @Override
    public boolean delete(int id) {
        String queryDel = "DELETE FROM User u WHERE u.id=:id";
        Query query = entityManager.createQuery(queryDel);
        query.setParameter("id", id);
        return query.executeUpdate() > 1 ? false : true;
    }

    @Override
    public boolean create(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }
}
