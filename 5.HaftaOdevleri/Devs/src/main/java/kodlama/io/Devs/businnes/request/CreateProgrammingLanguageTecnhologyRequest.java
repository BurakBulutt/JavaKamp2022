package kodlama.io.Devs.businnes.request;

import kodlama.io.Devs.entities.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProgrammingLanguageTecnhologyRequest {
    private String name;

    private ProgrammingLanguage programmingLanguage;
}
