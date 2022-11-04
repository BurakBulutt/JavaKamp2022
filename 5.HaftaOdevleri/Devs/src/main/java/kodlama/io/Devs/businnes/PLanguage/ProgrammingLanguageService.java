package kodlama.io.Devs.businnes.PLanguage;

import kodlama.io.Devs.businnes.request.CreateProgrammingLanguageRequest;
import kodlama.io.Devs.businnes.request.UpdateProgrammingLanguageRequest;
import kodlama.io.Devs.businnes.response.FindAllProgrammingLanguageResponse;
import kodlama.io.Devs.businnes.response.FindByIdProgrammingLanguageResponse;
import kodlama.io.Devs.entities.ProgrammingLanguage;
import java.util.List;

public interface ProgrammingLanguageService {
    List<FindAllProgrammingLanguageResponse> findAll();
    FindByIdProgrammingLanguageResponse findById(int id) throws Exception;
    void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception;
    void deleteById(int id);
    void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest, int id);


}
