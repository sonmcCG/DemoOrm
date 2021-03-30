package repositories;
import entities.User;
import java.util.List;

public interface IUserRepository  {
    List<User> get();
}
