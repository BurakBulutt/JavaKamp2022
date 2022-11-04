package kodlama.io.Devs.businnes.PLanguage;

import kodlama.io.Devs.businnes.request.CreateProgrammingLanguageRequest;
import kodlama.io.Devs.businnes.request.UpdateProgrammingLanguageRequest;
import kodlama.io.Devs.businnes.response.FindAllProgrammingLanguageResponse;
import kodlama.io.Devs.businnes.response.FindByIdProgrammingLanguageResponse;
import kodlama.io.Devs.core.ProgrammingLanguageCheckService;
import kodlama.io.Devs.dataAccess.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    private ProgrammingLanguageRepository programmingLanguageRepository;
    private ProgrammingLanguageCheckService programmingLanguageCheckService;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository,
                                      ProgrammingLanguageCheckService programmingLanguageCheckService) {
        this.programmingLanguageRepository = programmingLanguageRepository;
        this.programmingLanguageCheckService = programmingLanguageCheckService;
    }

    @Override
    public List<FindAllProgrammingLanguageResponse> findAll() {
        List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
        List<FindAllProgrammingLanguageResponse> findAllProgrammingLanguageResponses = new ArrayList<>();

        for (ProgrammingLanguage programmingLanguageDB : programmingLanguages){
            FindAllProgrammingLanguageResponse findAllProgrammingLanguageResponse
                    = new FindAllProgrammingLanguageResponse();
            findAllProgrammingLanguageResponse.setName(programmingLanguageDB.getName());
            findAllProgrammingLanguageResponses.add(findAllProgrammingLanguageResponse);
        }

        return findAllProgrammingLanguageResponses;
    }

    @Override
    public FindByIdProgrammingLanguageResponse findById(int id) throws Exception {
        List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
        FindByIdProgrammingLanguageResponse findByIdProgrammingLanguageResponse = null;

        for (ProgrammingLanguage programmingLanguageTemp : programmingLanguages){
            if (programmingLanguageTemp.getId() == id){
                findByIdProgrammingLanguageResponse = new FindByIdProgrammingLanguageResponse();
                findByIdProgrammingLanguageResponse.setName(programmingLanguageTemp.getName());
                findByIdProgrammingLanguageResponse.setId(programmingLanguageTemp.getId());
            }
        }

        if (findByIdProgrammingLanguageResponse == null){
            throw  new Exception("Seçili id numarasına ait programlama dili bulunamadı");
        }
        return findByIdProgrammingLanguageResponse;
    }

    @Override
    public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.setName(createProgrammingLanguageRequest.getName());
        if (programmingLanguageCheckService.checkName(programmingLanguage)){
            programmingLanguageRepository.save(programmingLanguage);
        }else{
            throw new Exception("Isim aynı olamaz veya bos gecilemez");
        }
    }

    @Override
    public void deleteById(int id) {
        programmingLanguageRepository.deleteById(id);
    }

    @Override
    public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest, int id) {
        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.getById(id);
        programmingLanguage.setName(updateProgrammingLanguageRequest.getName());
        programmingLanguageRepository.save(programmingLanguage);
    }
}
