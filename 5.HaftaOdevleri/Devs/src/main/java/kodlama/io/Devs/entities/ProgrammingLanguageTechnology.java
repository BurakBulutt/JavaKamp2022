package kodlama.io.Devs.entities;

import lombok.*;
import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class ProgrammingLanguageTechnology {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "programminglanguage_id",referencedColumnName = "id")
    private ProgrammingLanguage programmingLanguage;
}
