package sectani.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sectani.userservice.entity.User;
import sectani.userservice.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id){
        return service.findById(id);
    }

    @GetMapping("/interest/{genre}")
    public List<User> getUsersByInterest(@PathVariable String genre){
        return service.findByInterest(genre);
    }
}
