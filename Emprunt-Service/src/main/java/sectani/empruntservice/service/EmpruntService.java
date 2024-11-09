package sectani.empruntservice.service;

import org.springframework.stereotype.Service;
import sectani.empruntservice.model.Emprunt;
import sectani.empruntservice.model.Livre;
import sectani.empruntservice.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class EmpruntService {

    User user1 = new User(1L,"Aymane Houri","houri.aymane03@gmail.com","+212 642","Mystery");
    User user2 = new User(2L,"Abdesselam Sectani","a.sectani2019@gmail.com", "+212 650561884", "Comedy");
    User user3 = new User(3L,"Abdesselam Sectani","abdesselam.sectani@etu.uae.ac.ma", "+212 650561884", "Comedy");

    Livre livre1 = new Livre(1L,"Book 1", "Author 1", "Fiction", "Description of Book 1", "DISPONIBLE");
    Livre livre2 = new Livre(2L,"Book 2", "Author 2", "Comedy", "Description of Book 2", "EMPRUNTÉ");
    Livre livre3 = (new Livre(3L,"Book 3", "Author 3", "Comedy", "Description of Book 3", "DISPONIBLE"));

    public List<Emprunt> findAll(){
        List<Emprunt> emprunts = new ArrayList<>();
        emprunts.add(new Emprunt("1", new Date(), new Date(), false, user1, livre1));
        emprunts.add(new Emprunt("2", new Date(), new Date(), false, user2, livre2));
        emprunts.add(new Emprunt("3", new Date(), new Date(), false, user3, livre3));
        emprunts.add(new Emprunt("4", new Date(), new Date(), false, user2, livre1));
        emprunts.add(new Emprunt("5", new Date(), new Date(), false, user2, livre1));
        emprunts.add(new Emprunt("6", new Date(), new Date(), false, user2, livre1));
        return emprunts;
    }

    public Emprunt findById(String id){
        final Emprunt[] emprunt = {new Emprunt()};
        findAll().forEach(em -> {
            if (Objects.equals(em.getEmpruntId(), id))
                emprunt[0] = em;
        });
        return emprunt[0];
    }
}
