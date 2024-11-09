package sectani.userservice.service;

import org.springframework.stereotype.Service;
import sectani.userservice.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class UserService {
    public List<User> findAll(){
        List<User> users = new ArrayList<>();
        users.add(new User("1", "Aymane Houri","houri.aymane03@gmail.com","+212 642","Science"));
        users.add(new User("2", "Abdesselam Sectani","a.sectani2019@gmail.com", "+212 650561884", "Comedy"));
        users.add(new User("3", "Abdesselam Sectani","abdesselam.sectani@etu.uae.ac.ma", "+212 650561884", "Comedy"));
        return users;
    }

    public User findById(String id){
        final User[] user = {new User()};
        findAll().forEach(u -> {
            if (Objects.equals(u.getId(), id))
                user[0] = u;
        });
        return user[0];
    }

    public List<User> findByInterest(String genre){
        List<User> users = new ArrayList<>();
        findAll().forEach(u -> {
            if (Objects.equals(u.getInterest(), genre))
                users.add(u);
        });
        return users;
    }

}
