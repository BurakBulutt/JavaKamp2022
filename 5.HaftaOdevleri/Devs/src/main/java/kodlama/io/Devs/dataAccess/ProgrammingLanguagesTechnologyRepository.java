package kodlama.io.Devs.dataAccess;

import kodlama.io.Devs.entities.ProgrammingLanguageTechnology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammingLanguagesTechnologyRepository extends
        JpaRepository<ProgrammingLanguageTechnology,Integer> {
}
