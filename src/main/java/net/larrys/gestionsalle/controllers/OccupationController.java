package net.larrys.gestionsalle.controllers;

import lombok.AllArgsConstructor;
import net.larrys.gestionsalle.models.Occupation;
import net.larrys.gestionsalle.models.Prof;
import net.larrys.gestionsalle.repositories.OccupationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/occupation")
@AllArgsConstructor
public class OccupationController {
    private OccupationRepository occupationRepository;
    @GetMapping(path = "")
    public List<Occupation> getAllOccupation(){
        return occupationRepository.findAll();
    }

    @PostMapping(path = "")
    public void save(@RequestBody Occupation occupation){occupationRepository.save(occupation);}

    @PutMapping(path = "")
     public void update(@RequestBody Occupation occupation){
    occupationRepository.findById(occupation.getId()).ifPresent(p -> occupationRepository.save(occupation));
  }
    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable(name = "id") String id){
        occupationRepository.findById(id).ifPresent(occupation -> occupationRepository.delete(occupation));
    }
}
