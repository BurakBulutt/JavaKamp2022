package kodlama.io.Devs.PLangueage.dataAccess.abstracts;

import kodlama.io.Devs.PLangueage.entities.concretes.ProgramLanguage;

import java.util.List;

public interface ProgramLanguageDao {
    ProgramLanguage getId(int id);
    void add(ProgramLanguage programLanguage);
    void delete(ProgramLanguage programLanguage);
    void update(ProgramLanguage programLanguage);
    List<ProgramLanguage> getAll();

}
