package DataAccess.abstracts;

import Entity.concrete.Educator;
import java.util.List;

public interface EducatorDao {
    List<Educator> getEducators();
    void add(Educator educator);
}
