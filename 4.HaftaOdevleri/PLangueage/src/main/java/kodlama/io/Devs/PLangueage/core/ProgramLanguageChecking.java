package kodlama.io.Devs.PLangueage.core;

import kodlama.io.Devs.PLangueage.entities.concretes.ProgramLanguage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramLanguageChecking {
    public static boolean checkName(ProgramLanguage programLanguage, List<ProgramLanguage> programLanguageList){
        for(ProgramLanguage programLanguageDB : programLanguageList){
            if (programLanguageDB.getName().equals(programLanguage.getName())){
                return false;
            }
            if (programLanguageDB.getName().isEmpty()){
                return false;
            }
        }
        return true;
    }

}
