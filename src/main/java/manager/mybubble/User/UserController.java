package manager.mybubble.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAll() {return userService.getAll();
    }
    @GetMapping("/{id}")
    public User getById(@PathVariable("id") Long id) {
        return userService.getById(id);
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.add(user);
    }

//    @PostMapping("/login")
//    public User login(@RequestBody String email, String password) {
//        return userService.login(email,password);
//    }

    @PutMapping("/update/{id}")
    public User update(@RequestBody User user, @PathVariable("id") Long id) {return userService.update(user, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userService.delete(id);
    }
}

