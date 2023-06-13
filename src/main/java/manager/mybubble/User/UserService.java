package manager.mybubble.User;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.realm.UserDatabaseRealm;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getById(Long id) {
        return userRepository.getById(id);
    }

    public User add(User user) {
        return userRepository.save(user);
    }

    public User update(User user, Long id) {
        User foundUser = getById(id);
        return userRepository.save(foundUser);
    }

    public void delete(Long id) {userRepository.deleteById(id);
    }

    public User login(String email, String password) {
        User exampleUser = new User();
        exampleUser.setEmail(email);
        exampleUser.setPassword(password);

        Example<User> example = Example.of(exampleUser);
        Optional<User> userOptional = userRepository.findOne(example);
        return userOptional.orElse(null);
    }


    //public User login(String email, String password) {
      //User exampleUser = new User();
    //exampleUser.setEmail(email);
    //exampleUser.setPassword(password);

    //Example<User> example = Example.of(exampleUser);
    //return userRepository.findOne(example);
     //}
}
