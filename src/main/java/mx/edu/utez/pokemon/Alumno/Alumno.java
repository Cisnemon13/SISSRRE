package mx.edu.utez.pokemon.Alumno;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.pokemon.Asesor.Asesor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "alumno")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAlumno;
    @Column(nullable = false, length = 150)
    private String matricula;
    @Column(nullable = false, length = 150)
    private String divicion;
    @Column(nullable = false, length = 150)
    private String nombre;
    @Column(nullable = false, length = 150)
    private String apellidoP;
    @Column(nullable = false, length = 150)
    private String apellidoM;
    @Column(nullable = false, length = 150)
    private String usuario;
    @Column(nullable = false, length = 150)
    private String password;

    @OneToMany(mappedBy = "alumno")
    @JsonIgnore
    private List<Asesor> asesor;

    //hello suckers
    //hello Jesus
    //Hello Yex
}
