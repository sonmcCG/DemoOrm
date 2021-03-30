package repositories;

import entities.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserRepository implements IUserRepository{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<User> get() {
        Query query = entityManager.createQuery("SELECT u FROM User u");
        List<User> users = query.getResultList();
        return users;
    }
}
