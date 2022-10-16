package DataAccess.concrete;

import DataAccess.abstracts.EducatorDao;
import Entity.concrete.Educator;

import java.util.ArrayList;
import java.util.List;

public class HibernateEducatorDao implements EducatorDao {
    List<Educator> educators = new ArrayList<>();

    @Override
    public List<Educator> getEducators() {
        return educators;
    }

    @Override
    public void add(Educator educator) {
        System.out.println("Eğitimci eklendi : " + educator.getFirstName());
        educators.add(educator);
    }

}
