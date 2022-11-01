package kodlama.io.Devs.PLangueage.dataAccess.concretes;

import kodlama.io.Devs.PLangueage.dataAccess.abstracts.ProgramLanguageDao;
import kodlama.io.Devs.PLangueage.entities.concretes.ProgramLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProgramLanguageRepository implements ProgramLanguageDao {
    private List<ProgramLanguage> programLanguageList;

    public ProgramLanguageRepository() {
        programLanguageList = new ArrayList<>();
        programLanguageList.add(new ProgramLanguage(1,"Java"));
        programLanguageList.add(new ProgramLanguage(2,"Python"));
        programLanguageList.add(new ProgramLanguage(3,"C#"));

    }

    @Override
    public ProgramLanguage getId(int id) {
        return programLanguageList.get(id - 1);
    }

    @Override
    public void add(ProgramLanguage programLanguage) {
        programLanguageList.add(programLanguage);
    }

    @Override
    public void delete(ProgramLanguage programLanguage) {
        programLanguageList.remove(programLanguage);

    }

    @Override
    public void update(ProgramLanguage programLanguage) {
        programLanguageList.set(programLanguage.getId()-1,programLanguage);

    }

    @Override
    public List<ProgramLanguage> getAll() {
        return programLanguageList;
    }
}
