package Business.concrete;

import Business.abstracts.EducatorService;
import DataAccess.abstracts.EducatorDao;
import Entity.concrete.Educator;

import java.util.List;

public class EducatorManager implements EducatorService {
    private EducatorDao educatorDao;

    public EducatorManager(EducatorDao educatorDao) {
        this.educatorDao = educatorDao;
    }

    @Override
    public void addEducator(Educator educator) {
        boolean check = true;
        List<Educator> educators = educatorDao.getEducators();
        for(Educator educatorDB : educators){
            if(educatorDB.getID() == educator.getID()){
                check = false;
            }
        }
        if (check){
            educatorDao.add(educator);
        }
        else{
            System.out.println("Kullanıcı zaten ekli");

        }
    }
}
