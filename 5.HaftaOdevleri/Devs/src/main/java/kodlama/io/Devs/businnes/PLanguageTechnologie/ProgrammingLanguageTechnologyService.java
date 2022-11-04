package kodlama.io.Devs.businnes.PLanguageTechnologie;


import kodlama.io.Devs.businnes.request.CreateProgrammingLanguageTecnhologyRequest;
import kodlama.io.Devs.businnes.request.UpdateProgrammingLanguageTechnologyRequest;
import kodlama.io.Devs.businnes.response.FindAllProgrammingLanguageTechnologyResponse;

import java.util.List;

public interface ProgrammingLanguageTechnologyService {
    List<FindAllProgrammingLanguageTechnologyResponse> findAll();
    void add(CreateProgrammingLanguageTecnhologyRequest createProgrammingLanguageTecnhologieRequest);
    void deleteById(int id);
    void update(UpdateProgrammingLanguageTechnologyRequest updateProgrammingLanguageTechnologieRequest, int id);
}
