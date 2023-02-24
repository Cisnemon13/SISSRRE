package mx.edu.utez.pokemon.Controller;

import mx.edu.utez.pokemon.Asesor.Asesor;
import mx.edu.utez.pokemon.Service.Pokemon.AsesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api-sisrre/asesor")
@CrossOrigin(origins = {"*"})

public class Asesor_controller {
    @Autowired
    private AsesorService service;


    @GetMapping("/")
    public ResponseEntity<List<Asesor>> getAll(){
        return this.service.getAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getOne(@PathVariable("id") Long id){
        return this.service.getOne(id);
    }

    @PostMapping("/")
    public Asesor savePoke(
            @Valid @RequestBody Asesor pokemon)
    {
        return service.savePoke(pokemon);
    }
    @PutMapping("/{id}")
    public Asesor
    update(@RequestBody Asesor pokemon,
           @PathVariable("id") Long Id)
    {
        return service.updatePoke(
                pokemon, Id);
    }

    // Delete operation
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id")
                             Long Id)
    {
        service.deleteById(
                Id);
        return "Deleted Successfully";
    }
}
