package mx.edu.utez.pokemon.Controller;

import mx.edu.utez.pokemon.Alumno.Alumno;
import mx.edu.utez.pokemon.Service.Entrenador.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api-sisrre/alumnos")
@CrossOrigin(origins = {"*"})
public class Alumno_controller {
    @Autowired
    private AlumnoService service;


    @GetMapping("/")
    public ResponseEntity<List<Alumno>> getAll(){
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOne(@PathVariable("id") Long id){
        return this.service.getOne(id);
    }

    @PostMapping("/")
    public Alumno saveAlumno(
            @Valid @RequestBody Alumno entrenador)
    {
        return service.saveAlumno(entrenador);
    }
    @PutMapping("/{id}")
    public Alumno
    update(@RequestBody Alumno entrenador,
                     @PathVariable("id") Long Id)
    {
        return service.updateAlumno(
                entrenador, Id);
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
