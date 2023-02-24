package mx.edu.utez.pokemon.Service.Pokemon;


import mx.edu.utez.pokemon.Asesor.Asesor;
import mx.edu.utez.pokemon.Asesor.AsesorReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Transactional
@Service
public class AsesorService {
    @Autowired
    private AsesorReposity repository_ase;

    @Transactional(readOnly = true)
    public ResponseEntity<List<Asesor>> getAll(){
        return new ResponseEntity<>(this.repository_ase.findAll(),HttpStatus.OK);
    }
    @Transactional(readOnly = true)
    public ResponseEntity getOne(Long id){
        return new ResponseEntity<Object>(this.repository_ase.findById(id), HttpStatus.OK);
    }

    @Transactional
        public Asesor savePoke(Asesor asesor)
        {
            return repository_ase.save(asesor);
        }

        @Transactional
        public Asesor
        updatePoke(Asesor asesor,
                   Long Id)
        {
            Asesor depDB
                    = repository_ase.findById(Id)
                    .get();

            if (Objects.nonNull(asesor.getName())
                    && !"".equalsIgnoreCase(
                    asesor.getName())) {
                depDB.setName(
                        asesor.getName());
            }

            if (Objects.nonNull(
                    asesor.getUsuario())
                    && !"".equalsIgnoreCase(
                    asesor.getUsuario())) {
                depDB.setUsuario(
                        asesor.getUsuario());
            }



            return repository_ase.save(depDB);
        }

        // Delete operation
        @Transactional
        public void deleteById(Long Id)
        {
            repository_ase.deleteById(Id);
        }

    }

