package services;

import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.IUserRepository;

import java.util.List;

public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<User> get() {
        List<User> users = userRepository.get();
        return users;
    }

    @Override
    public boolean delete(int id) {
        return false;
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
