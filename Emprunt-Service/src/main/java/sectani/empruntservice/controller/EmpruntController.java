package sectani.empruntservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sectani.empruntservice.model.Emprunt;
import sectani.empruntservice.model.Livre;
import sectani.empruntservice.model.User;
import sectani.empruntservice.service.EmpruntService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/emprunts")
public class EmpruntController {
    private final EmpruntService service;

    public EmpruntController(EmpruntService service) {
        this.service = service;
    }

    @GetMapping
    public List<Emprunt> getAllemprunts(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Emprunt getempruntById(@PathVariable String id){
        return service.findById(id);
    }
}
