package net.larrys.gestionsalle.controllers;

import lombok.AllArgsConstructor;
import net.larrys.gestionsalle.models.Prof;
import net.larrys.gestionsalle.repositories.ProfRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/prof")
@AllArgsConstructor
public class ProfController {
    private ProfRepository profRepository;
    @GetMapping(path = "")
    public List<Prof> getallProf(){
        return profRepository.findAll();
    }
    @GetMapping(path = "/{codeProf}")
    public Prof getProf(@PathVariable(name = "codeProf") String codeProf){
        return profRepository.findById(codeProf).orElse(null);
    }
    @PostMapping(path = "")
    public void save(@RequestBody Prof prof){
        profRepository.save(prof);
    }
    @PutMapping(path = "")
    public void update(@RequestBody Prof prof){
        profRepository.findById(prof.getCodeProf()).ifPresent(p -> profRepository.save(prof));
    }
    @DeleteMapping(path = "/{codeProf}")
    public void delete(@PathVariable(name = "codeProf") String codeProf){
        profRepository.findById(codeProf).ifPresent(p -> profRepository.delete(p));
    }

    @GetMapping(path = "/search/{search}")
    public List<Prof> searchProf(@PathVariable(name = "search") String search){
        return profRepository.search(search) ;
    }

}
