package mx.edu.utez.pokemon.Alumno;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoReposity extends JpaRepository<Alumno,Long> {
}
