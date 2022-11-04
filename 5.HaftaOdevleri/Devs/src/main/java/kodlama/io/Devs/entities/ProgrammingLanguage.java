package kodlama.io.Devs.entities;

import lombok.*;
import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class ProgrammingLanguage {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

}
