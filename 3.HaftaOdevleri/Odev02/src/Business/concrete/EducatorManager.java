package Business.concrete;

import Business.abstracts.EducatorService;
import Core.Logger;
import DataAccess.abstracts.EducatorDao;
import Entity.concrete.Educator;

import java.util.List;

public class EducatorManager implements EducatorService {
    List<Logger> loggers;
    private EducatorDao educatorDao;

    public EducatorManager(EducatorDao educatorDao,List<Logger> loggers) {
        this.loggers = loggers;
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
        for (Logger logger : loggers){
            logger.log(educator.getFirstName());
        }
    }
}
