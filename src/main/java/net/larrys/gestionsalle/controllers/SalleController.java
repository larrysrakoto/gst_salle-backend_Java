package net.larrys.gestionsalle.controllers;

import lombok.AllArgsConstructor;
import net.larrys.gestionsalle.models.Prof;
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
    @GetMapping(path = "/{codeSalle}")
    public Salle getSalle(@PathVariable(name = "codeSalle") String codeSalle){
        return salleRepository.findById(codeSalle).orElse(null);
    }
    @PostMapping(path = "")
    public void save(@RequestBody Salle salle){
    }
    @PutMapping(path = "")
    public void update(@RequestBody Salle salle){
        salleRepository.findById(salle.getCodeSalle()).ifPresent(p -> salleRepository.save(salle));
    }
    @DeleteMapping(path = "/{codeSalle}")
    public void delete(@PathVariable(name = "codeSalle") String codeProf){
        salleRepository.findById(codeProf).ifPresent(p -> salleRepository.delete(p));
    }
}
