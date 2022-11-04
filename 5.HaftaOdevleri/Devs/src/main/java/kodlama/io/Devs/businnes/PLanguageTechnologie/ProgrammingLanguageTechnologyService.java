package kodlama.io.Devs.businnes.PLanguageTechnologie;


import kodlama.io.Devs.businnes.request.CreateProgrammingLanguageTecnhologyRequest;
import kodlama.io.Devs.businnes.request.UpdateProgrammingLanguageTechnologyRequest;
import kodlama.io.Devs.businnes.response.FindAllProgrammingLanguageTechnologyResponse;
import kodlama.io.Devs.businnes.response.FindByIdProgrammingLanguageTechnologyResponse;

import java.util.List;

public interface ProgrammingLanguageTechnologyService {
    List<FindAllProgrammingLanguageTechnologyResponse> findAll();
    FindByIdProgrammingLanguageTechnologyResponse findById(int id) throws Exception;
    void add(CreateProgrammingLanguageTecnhologyRequest createProgrammingLanguageTecnhologieRequest);
    void deleteById(int id);
    void update(UpdateProgrammingLanguageTechnologyRequest updateProgrammingLanguageTechnologieRequest, int id);
}
