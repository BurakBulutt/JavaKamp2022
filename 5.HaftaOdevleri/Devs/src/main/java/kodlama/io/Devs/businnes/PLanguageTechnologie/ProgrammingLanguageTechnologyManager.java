package kodlama.io.Devs.businnes.PLanguageTechnologie;

import kodlama.io.Devs.businnes.request.CreateProgrammingLanguageTecnhologyRequest;
import kodlama.io.Devs.businnes.request.UpdateProgrammingLanguageTechnologyRequest;
import kodlama.io.Devs.businnes.response.FindAllProgrammingLanguageTechnologyResponse;
import kodlama.io.Devs.dataAccess.ProgrammingLanguagesTechnologyRepository;
import kodlama.io.Devs.entities.ProgrammingLanguageTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammingLanguageTechnologyManager implements ProgrammingLanguageTechnologyService {

    private ProgrammingLanguagesTechnologyRepository programmingLanguagesTechnologieRepository;

    @Autowired
    public ProgrammingLanguageTechnologyManager
            (ProgrammingLanguagesTechnologyRepository programmingLanguagesTechnologieRepository) {
        this.programmingLanguagesTechnologieRepository = programmingLanguagesTechnologieRepository;
    }

    @Override
    public List<FindAllProgrammingLanguageTechnologyResponse> findAll() {
        List<ProgrammingLanguageTechnology> programmingLanguageTechnologies
                = programmingLanguagesTechnologieRepository.findAll();
        List<FindAllProgrammingLanguageTechnologyResponse> findAllProgrammingLanguageTechnologieResponseList
                = new ArrayList<>();
        for (ProgrammingLanguageTechnology programmingLanguageTechnologieTemp : programmingLanguageTechnologies) {
            FindAllProgrammingLanguageTechnologyResponse findAllProgrammingLanguageTechnologieResponse
                    = new FindAllProgrammingLanguageTechnologyResponse();
            findAllProgrammingLanguageTechnologieResponse.setId(programmingLanguageTechnologieTemp.getId());
            findAllProgrammingLanguageTechnologieResponse.setName(programmingLanguageTechnologieTemp.getName());
            findAllProgrammingLanguageTechnologieResponseList.add(findAllProgrammingLanguageTechnologieResponse);
        }
        return findAllProgrammingLanguageTechnologieResponseList;
    }

    @Override
    public void add(CreateProgrammingLanguageTecnhologyRequest createProgrammingLanguageTecnhologieRequest) {
        ProgrammingLanguageTechnology programmingLanguageTechnologie = new ProgrammingLanguageTechnology();
        programmingLanguageTechnologie.setName(createProgrammingLanguageTecnhologieRequest.getName());
        programmingLanguageTechnologie.setProgrammingLanguage(createProgrammingLanguageTecnhologieRequest.getProgrammingLanguage());
        programmingLanguagesTechnologieRepository.save(programmingLanguageTechnologie);
    }

    @Override
    public void deleteById(int id) {
        programmingLanguagesTechnologieRepository.deleteById(id);
    }

    @Override
    public void update(UpdateProgrammingLanguageTechnologyRequest updateProgrammingLanguageTechnologieRequest, int id) {
        ProgrammingLanguageTechnology programmingLanguageTechnologie = programmingLanguagesTechnologieRepository.getById(id);
        programmingLanguageTechnologie.setName(updateProgrammingLanguageTechnologieRequest.getName());
        programmingLanguageTechnologie.setProgrammingLanguage(updateProgrammingLanguageTechnologieRequest.getProgrammingLanguage());
        programmingLanguagesTechnologieRepository.save(programmingLanguageTechnologie);
    }
}
