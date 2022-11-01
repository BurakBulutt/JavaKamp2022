package kodlama.io.Devs.PLangueage.business.abstracts;

import kodlama.io.Devs.PLangueage.entities.concretes.ProgramLanguage;

import java.util.List;

public interface ProgramLanguageService {
    ProgramLanguage getId(int id);
    void add(ProgramLanguage programLanguage) throws Exception;
    void delete(ProgramLanguage programLanguage) throws Exception;
    void update(ProgramLanguage programLanguage) throws Exception;
    List<ProgramLanguage> getAll();
}
