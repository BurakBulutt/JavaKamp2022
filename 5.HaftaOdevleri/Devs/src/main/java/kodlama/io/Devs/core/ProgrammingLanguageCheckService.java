package kodlama.io.Devs.core;

import kodlama.io.Devs.dataAccess.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageCheckService {
    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgrammingLanguageCheckService(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    public boolean checkName(ProgrammingLanguage programmingLanguage){
        List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();

        for (ProgrammingLanguage programmingLanguageDB : programmingLanguages){
            if (programmingLanguageDB.getName().equals(programmingLanguage.getName())){
                return false;
            }
        }
        if (programmingLanguage.getName().isEmpty()){
            return false;
        }
        return true;
    }
}
