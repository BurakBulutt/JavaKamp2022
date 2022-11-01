package kodlama.io.Devs.PLangueage.business.concretes;

import kodlama.io.Devs.PLangueage.business.abstracts.ProgramLanguageService;
import kodlama.io.Devs.PLangueage.core.ProgramLanguageChecking;
import kodlama.io.Devs.PLangueage.dataAccess.abstracts.ProgramLanguageDao;
import kodlama.io.Devs.PLangueage.entities.concretes.ProgramLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramLanguageManager implements ProgramLanguageService {
    ProgramLanguageDao programLanguageDao;
    List<ProgramLanguage> programLanguageList;

    @Autowired
    public ProgramLanguageManager(ProgramLanguageDao programLanguageDao) {
        this.programLanguageDao = programLanguageDao;
        this.programLanguageList = programLanguageDao.getAll();
    }

    @Override
    public ProgramLanguage getId(int id) {
       return programLanguageDao.getId(id);
    }

    @Override
    public void add(ProgramLanguage programLanguage) throws Exception {
        if(ProgramLanguageChecking.checkName(programLanguage,programLanguageDao.getAll())){
            programLanguageDao.add(programLanguage);
        }else {
            throw new Exception("Programming Language did not add");
        }
    }

    @Override
    public void delete(ProgramLanguage programLanguage) throws Exception {
        boolean ifAvaible = false;
        for(ProgramLanguage programLanguageDb :programLanguageList){
            if(programLanguageDb.getId()== programLanguage.getId()){
                ifAvaible = true;
            }
        }
        if (ifAvaible){
            programLanguageDao.delete(programLanguage);
        }else {
            throw new Exception("Programming Language not avaible");
        }
    }

    @Override
    public void update(ProgramLanguage programLanguage) throws Exception {
        boolean ifAvaible = false;
        for(ProgramLanguage programLanguageDb : programLanguageList){
            if(programLanguageDb.getId()== programLanguage.getId()){
                ifAvaible = true;
            }
        }
        if (ifAvaible){
            programLanguageDao.update(programLanguage);
        }else {
            throw new Exception("Programming Language not avaible");
        }

    }
    @Override
    public List<ProgramLanguage> getAll() {
        return programLanguageDao.getAll();
    }
}
