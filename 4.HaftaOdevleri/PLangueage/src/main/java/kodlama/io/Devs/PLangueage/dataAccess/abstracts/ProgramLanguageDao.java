package kodlama.io.Devs.PLangueage.dataAccess.abstracts;

import kodlama.io.Devs.PLangueage.entities.concretes.ProgramLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProgramLanguageDao extends JpaRepository<ProgramLanguage,Integer> {


}
