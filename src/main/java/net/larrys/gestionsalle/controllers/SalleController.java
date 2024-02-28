package net.larrys.gestionsalle.controllers;

import lombok.AllArgsConstructor;
import net.larrys.gestionsalle.models.Salle;
import net.larrys.gestionsalle.repositories.SalleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/salle")
@AllArgsConstructor

public class SalleController {
    private SalleRepository salleRepository;

    @GetMapping(path = "")
    public List<Salle> getallSalle(){
        return salleRepository.findAll();
    }

    @PostMapping(path = "")
    public void save(@RequestBody Salle salle){

    }
}
