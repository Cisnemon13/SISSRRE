package mx.edu.utez.pokemon.Asesor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.pokemon.Alumno.Alumno;

import javax.persistence.*;

@Entity
@Table(name = "asesor")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Asesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAsesor;
    @Column(nullable = false, length = 150)
    private String name;
    @Column(nullable = false, length = 150)
    private String apellidoP;
    @Column(nullable = false, length = 150)
    private String apellidoM;
    @Column(nullable = false, length = 150)
    private String usuario;
    @Column(nullable = false, length = 150)
    private String password;

    @ManyToOne
    @JoinColumn(name = "alumnofk_id", nullable = false)
    private Alumno alumno;
}
